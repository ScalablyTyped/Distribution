package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.identity
import typings.maplibreMaplibreGlStyleSpec.mod.SourceFunctionSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyType_[T]
  extends StObject
     with SourceFunctionSpecification[T] {
  
  var default: js.UndefOr[T] = js.undefined
  
  var property: String
  
  var `type`: identity
}
object PropertyType_ {
  
  inline def apply[T](property: String): PropertyType_[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identity")
    __obj.asInstanceOf[PropertyType_[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyType_[?], T] (val x: Self & PropertyType_[T]) extends AnyVal {
    
    inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: identity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
