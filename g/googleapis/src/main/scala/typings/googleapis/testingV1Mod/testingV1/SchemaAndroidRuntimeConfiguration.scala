package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Android configuration that can be selected at the time a test is run.
  */
trait SchemaAndroidRuntimeConfiguration extends StObject {
  
  /**
    * The set of available locales.
    */
  var locales: js.UndefOr[js.Array[SchemaLocale]] = js.undefined
  
  /**
    * The set of available orientations.
    */
  var orientations: js.UndefOr[js.Array[SchemaOrientation]] = js.undefined
}
object SchemaAndroidRuntimeConfiguration {
  
  @scala.inline
  def apply(): SchemaAndroidRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidRuntimeConfiguration]
  }
  
  @scala.inline
  implicit class SchemaAndroidRuntimeConfigurationMutableBuilder[Self <: SchemaAndroidRuntimeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocales(value: js.Array[SchemaLocale]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: SchemaLocale*): Self = StObject.set(x, "locales", js.Array(value :_*))
    
    @scala.inline
    def setOrientations(value: js.Array[SchemaOrientation]): Self = StObject.set(x, "orientations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationsUndefined: Self = StObject.set(x, "orientations", js.undefined)
    
    @scala.inline
    def setOrientationsVarargs(value: SchemaOrientation*): Self = StObject.set(x, "orientations", js.Array(value :_*))
  }
}
