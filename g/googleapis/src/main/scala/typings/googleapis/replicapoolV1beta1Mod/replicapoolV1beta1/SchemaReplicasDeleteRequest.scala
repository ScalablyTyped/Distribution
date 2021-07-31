package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplicasDeleteRequest extends StObject {
  
  /**
    * Whether the instance resource represented by this replica should be
    * deleted or abandoned. If abandoned, the replica will be deleted but the
    * virtual machine instance will remain. By default, this is set to false
    * and the instance will be deleted along with the replica.
    */
  var abandonInstance: js.UndefOr[Boolean] = js.undefined
}
object SchemaReplicasDeleteRequest {
  
  @scala.inline
  def apply(): SchemaReplicasDeleteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplicasDeleteRequest]
  }
  
  @scala.inline
  implicit class SchemaReplicasDeleteRequestMutableBuilder[Self <: SchemaReplicasDeleteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbandonInstance(value: Boolean): Self = StObject.set(x, "abandonInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbandonInstanceUndefined: Self = StObject.set(x, "abandonInstance", js.undefined)
  }
}
