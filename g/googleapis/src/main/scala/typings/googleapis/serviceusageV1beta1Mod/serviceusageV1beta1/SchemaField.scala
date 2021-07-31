package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single field of a message type.
  */
trait SchemaField extends StObject {
  
  /**
    * The field cardinality.
    */
  var cardinality: js.UndefOr[String] = js.undefined
  
  /**
    * The string value of the default value of this field. Proto2 syntax only.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * The field JSON name.
    */
  var jsonName: js.UndefOr[String] = js.undefined
  
  /**
    * The field type.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The field name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The field number.
    */
  var number: js.UndefOr[Double] = js.undefined
  
  /**
    * The index of the field type in `Type.oneofs`, for message or enumeration
    * types. The first type has index 1; zero means the type is not in the
    * list.
    */
  var oneofIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The protocol buffer options.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.undefined
  
  /**
    * Whether to use alternative packed wire representation.
    */
  var packed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The field type URL, without the scheme, for message or enumeration types.
    * Example: `&quot;type.googleapis.com/google.protobuf.Timestamp&quot;`.
    */
  var typeUrl: js.UndefOr[String] = js.undefined
}
object SchemaField {
  
  @scala.inline
  def apply(): SchemaField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaField]
  }
  
  @scala.inline
  implicit class SchemaFieldMutableBuilder[Self <: SchemaField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardinality(value: String): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardinalityUndefined: Self = StObject.set(x, "cardinality", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setOneofIndex(value: Double): Self = StObject.set(x, "oneofIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneofIndexUndefined: Self = StObject.set(x, "oneofIndex", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[SchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: SchemaOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
    
    @scala.inline
    def setTypeUrl(value: String): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUrlUndefined: Self = StObject.set(x, "typeUrl", js.undefined)
  }
}
