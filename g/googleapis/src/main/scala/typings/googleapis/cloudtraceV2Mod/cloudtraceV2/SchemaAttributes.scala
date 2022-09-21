package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttributes extends StObject {
  
  /**
    * A set of attributes. Each attribute's key can be up to 128 bytes long. The value can be a string up to 256 bytes, a signed 64-bit integer, or the boolean values `true` or `false`. For example: "/instance_id": { "string_value": { "value": "my-instance" \} \} "/http/request_bytes": { "int_value": 300 \} "abc.com/myattribute": { "bool_value": false \}
    */
  var attributeMap: js.UndefOr[StringDictionary[SchemaAttributeValue] | Null] = js.undefined
  
  /**
    * The number of attributes that were discarded. Attributes can be discarded because their keys are too long or because there are too many attributes. If this value is 0 then all attributes are valid.
    */
  var droppedAttributesCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAttributes {
  
  inline def apply(): SchemaAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttributes]
  }
  
  extension [Self <: SchemaAttributes](x: Self) {
    
    inline def setAttributeMap(value: StringDictionary[SchemaAttributeValue]): Self = StObject.set(x, "attributeMap", value.asInstanceOf[js.Any])
    
    inline def setAttributeMapNull: Self = StObject.set(x, "attributeMap", null)
    
    inline def setAttributeMapUndefined: Self = StObject.set(x, "attributeMap", js.undefined)
    
    inline def setDroppedAttributesCount(value: Double): Self = StObject.set(x, "droppedAttributesCount", value.asInstanceOf[js.Any])
    
    inline def setDroppedAttributesCountNull: Self = StObject.set(x, "droppedAttributesCount", null)
    
    inline def setDroppedAttributesCountUndefined: Self = StObject.set(x, "droppedAttributesCount", js.undefined)
  }
}
