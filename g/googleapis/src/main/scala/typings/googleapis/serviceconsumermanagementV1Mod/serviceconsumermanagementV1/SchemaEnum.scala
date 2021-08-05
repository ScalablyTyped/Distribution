package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum type definition.
  */
trait SchemaEnum extends StObject {
  
  /**
    * Enum value definitions.
    */
  var enumvalue: js.UndefOr[js.Array[SchemaEnumValue]] = js.undefined
  
  /**
    * Enum type name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Protocol buffer options.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.undefined
  
  /**
    * The source context.
    */
  var sourceContext: js.UndefOr[SchemaSourceContext] = js.undefined
  
  /**
    * The source syntax.
    */
  var syntax: js.UndefOr[String] = js.undefined
}
object SchemaEnum {
  
  inline def apply(): SchemaEnum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnum]
  }
  
  extension [Self <: SchemaEnum](x: Self) {
    
    inline def setEnumvalue(value: js.Array[SchemaEnumValue]): Self = StObject.set(x, "enumvalue", value.asInstanceOf[js.Any])
    
    inline def setEnumvalueUndefined: Self = StObject.set(x, "enumvalue", js.undefined)
    
    inline def setEnumvalueVarargs(value: SchemaEnumValue*): Self = StObject.set(x, "enumvalue", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: js.Array[SchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: SchemaOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    inline def setSourceContext(value: SchemaSourceContext): Self = StObject.set(x, "sourceContext", value.asInstanceOf[js.Any])
    
    inline def setSourceContextUndefined: Self = StObject.set(x, "sourceContext", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
