package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAndroidMatrix extends StObject {
  
  /**
    * Required. The ids of the set of Android device to be used. Use the TestEnvironmentDiscoveryService to get supported options.
    */
  var androidModelIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The ids of the set of Android OS version to be used. Use the TestEnvironmentDiscoveryService to get supported options.
    */
  var androidVersionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The set of locales the test device will enable for testing. Use the TestEnvironmentDiscoveryService to get supported options.
    */
  var locales: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The set of orientations to test with. Use the TestEnvironmentDiscoveryService to get supported options.
    */
  var orientations: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAndroidMatrix {
  
  inline def apply(): SchemaAndroidMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidMatrix]
  }
  
  extension [Self <: SchemaAndroidMatrix](x: Self) {
    
    inline def setAndroidModelIds(value: js.Array[String]): Self = StObject.set(x, "androidModelIds", value.asInstanceOf[js.Any])
    
    inline def setAndroidModelIdsNull: Self = StObject.set(x, "androidModelIds", null)
    
    inline def setAndroidModelIdsUndefined: Self = StObject.set(x, "androidModelIds", js.undefined)
    
    inline def setAndroidModelIdsVarargs(value: String*): Self = StObject.set(x, "androidModelIds", js.Array(value*))
    
    inline def setAndroidVersionIds(value: js.Array[String]): Self = StObject.set(x, "androidVersionIds", value.asInstanceOf[js.Any])
    
    inline def setAndroidVersionIdsNull: Self = StObject.set(x, "androidVersionIds", null)
    
    inline def setAndroidVersionIdsUndefined: Self = StObject.set(x, "androidVersionIds", js.undefined)
    
    inline def setAndroidVersionIdsVarargs(value: String*): Self = StObject.set(x, "androidVersionIds", js.Array(value*))
    
    inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesNull: Self = StObject.set(x, "locales", null)
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
    
    inline def setOrientations(value: js.Array[String]): Self = StObject.set(x, "orientations", value.asInstanceOf[js.Any])
    
    inline def setOrientationsNull: Self = StObject.set(x, "orientations", null)
    
    inline def setOrientationsUndefined: Self = StObject.set(x, "orientations", js.undefined)
    
    inline def setOrientationsVarargs(value: String*): Self = StObject.set(x, "orientations", js.Array(value*))
  }
}
