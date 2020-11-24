package typings.hjson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeserializeOptions extends js.Object {
  
  /**
    * keep white space and comments. This is useful if
    * you want to edit an hjson file and save it while preserving comments (default false)
    */
  var keepWsc: js.UndefOr[Boolean] = js.native
  
  /**
    * Turn off legacy support for omitting root braces (defaults true)
    */
  var legacyRoot: js.UndefOr[Boolean] = js.native
}
object DeserializeOptions {
  
  @scala.inline
  def apply(): DeserializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeserializeOptions]
  }
  
  @scala.inline
  implicit class DeserializeOptionsOps[Self <: DeserializeOptions] (val x: Self) extends AnyVal {
    
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
    def setKeepWsc(value: Boolean): Self = this.set("keepWsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepWsc: Self = this.set("keepWsc", js.undefined)
    
    @scala.inline
    def setLegacyRoot(value: Boolean): Self = this.set("legacyRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacyRoot: Self = this.set("legacyRoot", js.undefined)
  }
}
