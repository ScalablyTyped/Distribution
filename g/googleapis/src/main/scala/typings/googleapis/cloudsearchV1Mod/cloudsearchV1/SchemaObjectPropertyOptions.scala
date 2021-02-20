package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for object properties.
  */
@js.native
trait SchemaObjectPropertyOptions extends StObject {
  
  /**
    * The properties of the sub-object. These properties represent a nested
    * object. For example, if this property represents a postal address, the
    * subobjectProperties might be named *street*, *city*, and *state*. The
    * maximum number of elements is 1000.
    */
  var subobjectProperties: js.UndefOr[js.Array[SchemaPropertyDefinition]] = js.native
}
object SchemaObjectPropertyOptions {
  
  @scala.inline
  def apply(): SchemaObjectPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectPropertyOptions]
  }
  
  @scala.inline
  implicit class SchemaObjectPropertyOptionsMutableBuilder[Self <: SchemaObjectPropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubobjectProperties(value: js.Array[SchemaPropertyDefinition]): Self = StObject.set(x, "subobjectProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubobjectPropertiesUndefined: Self = StObject.set(x, "subobjectProperties", js.undefined)
    
    @scala.inline
    def setSubobjectPropertiesVarargs(value: SchemaPropertyDefinition*): Self = StObject.set(x, "subobjectProperties", js.Array(value :_*))
  }
}
