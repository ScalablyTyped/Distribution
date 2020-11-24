package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database demote master request.
  */
@js.native
trait SchemaInstancesDemoteMasterRequest extends js.Object {
  
  /**
    * Contains details about the demoteMaster operation.
    */
  var demoteMasterContext: js.UndefOr[SchemaDemoteMasterContext] = js.native
}
object SchemaInstancesDemoteMasterRequest {
  
  @scala.inline
  def apply(): SchemaInstancesDemoteMasterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesDemoteMasterRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesDemoteMasterRequestOps[Self <: SchemaInstancesDemoteMasterRequest] (val x: Self) extends AnyVal {
    
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
    def setDemoteMasterContext(value: SchemaDemoteMasterContext): Self = this.set("demoteMasterContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDemoteMasterContext: Self = this.set("demoteMasterContext", js.undefined)
  }
}
