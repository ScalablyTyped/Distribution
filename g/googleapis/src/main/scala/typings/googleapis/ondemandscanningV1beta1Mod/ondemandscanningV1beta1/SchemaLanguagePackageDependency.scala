package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLanguagePackageDependency extends StObject {
  
  @JSName("package")
  var _package: js.UndefOr[String | Null] = js.undefined
  
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaLanguagePackageDependency {
  
  inline def apply(): SchemaLanguagePackageDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguagePackageDependency]
  }
  
  extension [Self <: SchemaLanguagePackageDependency](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageNull: Self = StObject.set(x, "package", null)
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
