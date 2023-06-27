package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.assert
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.coerce
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeAnnotation extends StObject {
  
  var typeAnnotation: js.UndefOr[assert | coerce | omit] = js.undefined
}
object TypeAnnotation {
  
  inline def apply(): TypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeAnnotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeAnnotation] (val x: Self) extends AnyVal {
    
    inline def setTypeAnnotation(value: assert | coerce | omit): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
