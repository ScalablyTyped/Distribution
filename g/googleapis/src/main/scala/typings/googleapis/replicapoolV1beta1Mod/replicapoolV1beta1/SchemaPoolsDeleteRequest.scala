package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPoolsDeleteRequest extends js.Object {
  
  /**
    * If there are instances you would like to keep, you can specify them here.
    * These instances won&#39;t be deleted, but the associated replica objects
    * will be removed.
    */
  var abandonInstances: js.UndefOr[js.Array[String]] = js.native
}
object SchemaPoolsDeleteRequest {
  
  @scala.inline
  def apply(): SchemaPoolsDeleteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoolsDeleteRequest]
  }
  
  @scala.inline
  implicit class SchemaPoolsDeleteRequestOps[Self <: SchemaPoolsDeleteRequest] (val x: Self) extends AnyVal {
    
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
    def setAbandonInstancesVarargs(value: String*): Self = this.set("abandonInstances", js.Array(value :_*))
    
    @scala.inline
    def setAbandonInstances(value: js.Array[String]): Self = this.set("abandonInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbandonInstances: Self = this.set("abandonInstances", js.undefined)
  }
}
