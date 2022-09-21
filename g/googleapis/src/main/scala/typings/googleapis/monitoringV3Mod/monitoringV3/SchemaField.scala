package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaField extends StObject {
  
  /**
    * The field cardinality.
    */
  var cardinality: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The string value of the default value of this field. Proto2 syntax only.
    */
  var defaultValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The field JSON name.
    */
  var jsonName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The field type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The field name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The field number.
    */
  var number: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The index of the field type in Type.oneofs, for message or enumeration types. The first type has index 1; zero means the type is not in the list.
    */
  var oneofIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The protocol buffer options.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.undefined
  
  /**
    * Whether to use alternative packed wire representation.
    */
  var packed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The field type URL, without the scheme, for message or enumeration types. Example: "type.googleapis.com/google.protobuf.Timestamp".
    */
  var typeUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaField {
  
  inline def apply(): SchemaField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaField]
  }
  
  extension [Self <: SchemaField](x: Self) {
    
    inline def setCardinality(value: String): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
    
    inline def setCardinalityNull: Self = StObject.set(x, "cardinality", null)
    
    inline def setCardinalityUndefined: Self = StObject.set(x, "cardinality", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    inline def setJsonNameNull: Self = StObject.set(x, "jsonName", null)
    
    inline def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberNull: Self = StObject.set(x, "number", null)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOneofIndex(value: Double): Self = StObject.set(x, "oneofIndex", value.asInstanceOf[js.Any])
    
    inline def setOneofIndexNull: Self = StObject.set(x, "oneofIndex", null)
    
    inline def setOneofIndexUndefined: Self = StObject.set(x, "oneofIndex", js.undefined)
    
    inline def setOptions(value: js.Array[SchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: SchemaOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    inline def setPackedNull: Self = StObject.set(x, "packed", null)
    
    inline def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
    
    inline def setTypeUrl(value: String): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
    
    inline def setTypeUrlNull: Self = StObject.set(x, "typeUrl", null)
    
    inline def setTypeUrlUndefined: Self = StObject.set(x, "typeUrl", js.undefined)
  }
}
