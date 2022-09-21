package typings.googleapis.networkconnectivityV1alpha1Mod.networkconnectivityV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHub extends StObject {
  
  /**
    * Time when the Hub was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Short description of the hub resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-defined labels.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Immutable. The name of a Hub resource.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A list of the URIs of all attached spokes. This field is deprecated and will not be included in future API versions. Call ListSpokes on each region instead.
    */
  var spokes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The current lifecycle state of this Hub.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Google-generated UUID for this resource. This is unique across all Hub resources. If a Hub resource is deleted and another with the same name is created, it gets a different unique_id.
    */
  var uniqueId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time when the Hub was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaHub {
  
  inline def apply(): SchemaHub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHub]
  }
  
  extension [Self <: SchemaHub](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSpokes(value: js.Array[String]): Self = StObject.set(x, "spokes", value.asInstanceOf[js.Any])
    
    inline def setSpokesNull: Self = StObject.set(x, "spokes", null)
    
    inline def setSpokesUndefined: Self = StObject.set(x, "spokes", js.undefined)
    
    inline def setSpokesVarargs(value: String*): Self = StObject.set(x, "spokes", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    inline def setUniqueIdNull: Self = StObject.set(x, "uniqueId", null)
    
    inline def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
