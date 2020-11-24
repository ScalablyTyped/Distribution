package typings.linkifyjs.htmlMod

import typings.linkifyjs.anon.PartialGlobalEventHandler
import typings.linkifyjs.mod.LinkEntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options
  extends typings.linkifyjs.mod.Options {
  
  /**
    * Add event listeners to newly created link elements.
    * Takes a hash where each key is an standard event name and the value is an event handler.
    *
    * Also accepts a function that takes the unformatted href and the link type (e.g., 'url', 'email', etc.) and returns the hash.
    *
    * @default null
    */
  var events: js.UndefOr[
    PartialGlobalEventHandler | (js.Function2[/* href */ String, /* type */ LinkEntityType, PartialGlobalEventHandler])
  ] = js.native
  
  /**
    *  Prevent linkify from trying to parse links in the specified tags.
    *
    *  This is useful when running linkify on arbitrary HTML.
    *
    *  @default []
    */
  var ignoreTags: js.UndefOr[js.Array[String]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventsFunction2(value: (/* href */ String, /* type */ LinkEntityType) => PartialGlobalEventHandler): Self = this.set("events", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEvents(
      value: PartialGlobalEventHandler | (js.Function2[/* href */ String, /* type */ LinkEntityType, PartialGlobalEventHandler])
    ): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setIgnoreTagsVarargs(value: String*): Self = this.set("ignoreTags", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreTags(value: js.Array[String]): Self = this.set("ignoreTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreTags: Self = this.set("ignoreTags", js.undefined)
  }
}
