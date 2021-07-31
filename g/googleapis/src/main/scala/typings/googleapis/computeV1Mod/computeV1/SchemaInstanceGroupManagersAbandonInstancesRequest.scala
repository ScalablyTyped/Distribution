package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagersAbandonInstancesRequest extends StObject {
  
  /**
    * The URLs of one or more instances to abandon. This can be a full URL or a
    * partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
    */
  var instances: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaInstanceGroupManagersAbandonInstancesRequest {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagersAbandonInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersAbandonInstancesRequest]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagersAbandonInstancesRequestMutableBuilder[Self <: SchemaInstanceGroupManagersAbandonInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
