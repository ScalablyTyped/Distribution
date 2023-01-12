package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipAttributes extends StObject {
  
  /** The detail of the relationship, e.g. `contains`, `attaches` */
  var action: js.UndefOr[String] = js.undefined
  
  /** The source asset type. Example: `compute.googleapis.com/Instance` */
  var sourceResourceType: js.UndefOr[String] = js.undefined
  
  /** The target asset type. Example: `compute.googleapis.com/Disk` */
  var targetResourceType: js.UndefOr[String] = js.undefined
  
  /** The unique identifier of the relationship type. Example: `INSTANCE_TO_INSTANCEGROUP` */
  var `type`: js.UndefOr[String] = js.undefined
}
object RelationshipAttributes {
  
  inline def apply(): RelationshipAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationshipAttributes] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setSourceResourceType(value: String): Self = StObject.set(x, "sourceResourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceResourceTypeUndefined: Self = StObject.set(x, "sourceResourceType", js.undefined)
    
    inline def setTargetResourceType(value: String): Self = StObject.set(x, "targetResourceType", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceTypeUndefined: Self = StObject.set(x, "targetResourceType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
