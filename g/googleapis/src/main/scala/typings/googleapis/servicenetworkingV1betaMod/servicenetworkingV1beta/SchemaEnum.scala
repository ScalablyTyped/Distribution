package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum type definition.
  */
@js.native
trait SchemaEnum extends StObject {
  
  /**
    * Enum value definitions.
    */
  var enumvalue: js.UndefOr[js.Array[SchemaEnumValue]] = js.native
  
  /**
    * Enum type name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Protocol buffer options.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.native
  
  /**
    * The source context.
    */
  var sourceContext: js.UndefOr[SchemaSourceContext] = js.native
  
  /**
    * The source syntax.
    */
  var syntax: js.UndefOr[String] = js.native
}
object SchemaEnum {
  
  @scala.inline
  def apply(): SchemaEnum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnum]
  }
  
  @scala.inline
  implicit class SchemaEnumMutableBuilder[Self <: SchemaEnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumvalue(value: js.Array[SchemaEnumValue]): Self = StObject.set(x, "enumvalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumvalueUndefined: Self = StObject.set(x, "enumvalue", js.undefined)
    
    @scala.inline
    def setEnumvalueVarargs(value: SchemaEnumValue*): Self = StObject.set(x, "enumvalue", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[SchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: SchemaOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setSourceContext(value: SchemaSourceContext): Self = StObject.set(x, "sourceContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceContextUndefined: Self = StObject.set(x, "sourceContext", js.undefined)
    
    @scala.inline
    def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
