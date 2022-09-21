package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaType extends StObject {
  
  /**
    * The list of fields.
    */
  var fields: js.UndefOr[js.Array[SchemaField]] = js.undefined
  
  /**
    * The fully qualified message name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of types appearing in `oneof` definitions in this type.
    */
  var oneofs: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The protocol buffer options.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.undefined
  
  /**
    * The source context.
    */
  var sourceContext: js.UndefOr[SchemaSourceContext] = js.undefined
  
  /**
    * The source syntax.
    */
  var syntax: js.UndefOr[String | Null] = js.undefined
}
object SchemaType {
  
  inline def apply(): SchemaType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaType]
  }
  
  extension [Self <: SchemaType](x: Self) {
    
    inline def setFields(value: js.Array[SchemaField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOneofs(value: js.Array[String]): Self = StObject.set(x, "oneofs", value.asInstanceOf[js.Any])
    
    inline def setOneofsNull: Self = StObject.set(x, "oneofs", null)
    
    inline def setOneofsUndefined: Self = StObject.set(x, "oneofs", js.undefined)
    
    inline def setOneofsVarargs(value: String*): Self = StObject.set(x, "oneofs", js.Array(value*))
    
    inline def setOptions(value: js.Array[SchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: SchemaOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setSourceContext(value: SchemaSourceContext): Self = StObject.set(x, "sourceContext", value.asInstanceOf[js.Any])
    
    inline def setSourceContextUndefined: Self = StObject.set(x, "sourceContext", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxNull: Self = StObject.set(x, "syntax", null)
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
