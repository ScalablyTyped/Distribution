package typings.googleapis.redisV1beta1Mod.redisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeInfo extends StObject {
  
  /**
    * Output only. Node identifying string. e.g. 'node-0', 'node-1'
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Location of the node.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaNodeInfo {
  
  inline def apply(): SchemaNodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeInfo]
  }
  
  extension [Self <: SchemaNodeInfo](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
