package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaResetSearchApplicationRequest extends js.Object {
  
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.native
}
object SchemaResetSearchApplicationRequest {
  
  @scala.inline
  def apply(): SchemaResetSearchApplicationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResetSearchApplicationRequest]
  }
  
  @scala.inline
  implicit class SchemaResetSearchApplicationRequestOps[Self <: SchemaResetSearchApplicationRequest] (val x: Self) extends AnyVal {
    
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
    def setDebugOptions(value: SchemaDebugOptions): Self = this.set("debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugOptions: Self = this.set("debugOptions", js.undefined)
  }
}
