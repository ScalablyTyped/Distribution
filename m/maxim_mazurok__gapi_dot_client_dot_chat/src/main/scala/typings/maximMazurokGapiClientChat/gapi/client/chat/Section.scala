package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Section extends js.Object {
  
  /** The header of the section, text formatted supported. */
  var header: js.UndefOr[String] = js.native
  
  /** A section must contain at least 1 widget. */
  var widgets: js.UndefOr[js.Array[WidgetMarkup]] = js.native
}
object Section {
  
  @scala.inline
  def apply(): Section = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Section]
  }
  
  @scala.inline
  implicit class SectionOps[Self <: Section] (val x: Self) extends AnyVal {
    
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
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setWidgetsVarargs(value: WidgetMarkup*): Self = this.set("widgets", js.Array(value :_*))
    
    @scala.inline
    def setWidgets(value: js.Array[WidgetMarkup]): Self = this.set("widgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidgets: Self = this.set("widgets", js.undefined)
  }
}
