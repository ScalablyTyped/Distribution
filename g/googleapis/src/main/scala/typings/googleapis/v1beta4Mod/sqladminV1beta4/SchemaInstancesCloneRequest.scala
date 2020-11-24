package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance clone request.
  */
@js.native
trait SchemaInstancesCloneRequest extends js.Object {
  
  /**
    * Contains details about the clone operation.
    */
  var cloneContext: js.UndefOr[SchemaCloneContext] = js.native
}
object SchemaInstancesCloneRequest {
  
  @scala.inline
  def apply(): SchemaInstancesCloneRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesCloneRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesCloneRequestOps[Self <: SchemaInstancesCloneRequest] (val x: Self) extends AnyVal {
    
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
    def setCloneContext(value: SchemaCloneContext): Self = this.set("cloneContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloneContext: Self = this.set("cloneContext", js.undefined)
  }
}
