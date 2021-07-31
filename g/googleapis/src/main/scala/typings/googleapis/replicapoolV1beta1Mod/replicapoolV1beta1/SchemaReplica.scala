package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An individual Replica within a Pool. Replicas are automatically created by
  * the replica pool, using the template provided by the user. You cannot
  * directly create replicas.
  */
trait SchemaReplica extends StObject {
  
  /**
    * [Output Only] The name of the Replica object.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The self-link of the Replica.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Last known status of the Replica.
    */
  var status: js.UndefOr[SchemaReplicaStatus] = js.undefined
}
object SchemaReplica {
  
  @scala.inline
  def apply(): SchemaReplica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplica]
  }
  
  @scala.inline
  implicit class SchemaReplicaMutableBuilder[Self <: SchemaReplica] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaReplicaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
