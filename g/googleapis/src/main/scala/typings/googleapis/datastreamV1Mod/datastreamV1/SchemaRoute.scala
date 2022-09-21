package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoute extends StObject {
  
  /**
    * Output only. The create time of the resource.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Destination address for connection
    */
  var destinationAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Destination port for connection
    */
  var destinationPort: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. Display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The resource's name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The update time of the resource.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaRoute {
  
  inline def apply(): SchemaRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoute]
  }
  
  extension [Self <: SchemaRoute](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDestinationAddress(value: String): Self = StObject.set(x, "destinationAddress", value.asInstanceOf[js.Any])
    
    inline def setDestinationAddressNull: Self = StObject.set(x, "destinationAddress", null)
    
    inline def setDestinationAddressUndefined: Self = StObject.set(x, "destinationAddress", js.undefined)
    
    inline def setDestinationPort(value: Double): Self = StObject.set(x, "destinationPort", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortNull: Self = StObject.set(x, "destinationPort", null)
    
    inline def setDestinationPortUndefined: Self = StObject.set(x, "destinationPort", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
