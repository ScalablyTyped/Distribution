package typings.hapiMimos.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hapiMimos.anon.MimosOptionsValuepredicat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * @see {@link https://github.com/hapijs/mimos#new-mimosoptions}
  */
@js.native
trait MimosOptions extends js.Object {
  
  /**
    * an object hash that is merged into the built in mime information specified here {@link https://github.com/jshttp/mime-db}.
    * Each key value pair represents a single mime object.
    * Each override value should follow this schema:
    *  * the key is the lower-cased correct mime-type. (Ex. "application/javascript").
    *  * the value should an object @see MimosOptionsValue
    */
  var `override`: StringDictionary[MimosOptionsValuepredicat] = js.native
}
object MimosOptions {
  
  @scala.inline
  def apply(`override`: StringDictionary[MimosOptionsValuepredicat]): MimosOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimosOptions]
  }
  
  @scala.inline
  implicit class MimosOptionsOps[Self <: MimosOptions] (val x: Self) extends AnyVal {
    
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
    def setOverride(value: StringDictionary[MimosOptionsValuepredicat]): Self = this.set("override", value.asInstanceOf[js.Any])
  }
}
