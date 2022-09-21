package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIosRuntimeConfiguration extends StObject {
  
  /**
    * The set of available locales.
    */
  var locales: js.UndefOr[js.Array[SchemaLocale]] = js.undefined
  
  /**
    * The set of available orientations.
    */
  var orientations: js.UndefOr[js.Array[SchemaOrientation]] = js.undefined
}
object SchemaIosRuntimeConfiguration {
  
  inline def apply(): SchemaIosRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosRuntimeConfiguration]
  }
  
  extension [Self <: SchemaIosRuntimeConfiguration](x: Self) {
    
    inline def setLocales(value: js.Array[SchemaLocale]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setLocalesVarargs(value: SchemaLocale*): Self = StObject.set(x, "locales", js.Array(value*))
    
    inline def setOrientations(value: js.Array[SchemaOrientation]): Self = StObject.set(x, "orientations", value.asInstanceOf[js.Any])
    
    inline def setOrientationsUndefined: Self = StObject.set(x, "orientations", js.undefined)
    
    inline def setOrientationsVarargs(value: SchemaOrientation*): Self = StObject.set(x, "orientations", js.Array(value*))
  }
}
