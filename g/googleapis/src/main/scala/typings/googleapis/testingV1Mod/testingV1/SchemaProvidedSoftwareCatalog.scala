package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProvidedSoftwareCatalog extends StObject {
  
  /**
    * A string representing the current version of AndroidX Test Orchestrator that is used in the environment. The package is available at https://maven.google.com/web/index.html#androidx.test:orchestrator.
    */
  var androidxOrchestratorVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated: Use AndroidX Test Orchestrator going forward. A string representing the current version of Android Test Orchestrator that is used in the environment. The package is available at https://maven.google.com/web/index.html#com.android.support.test:orchestrator.
    */
  var orchestratorVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaProvidedSoftwareCatalog {
  
  inline def apply(): SchemaProvidedSoftwareCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvidedSoftwareCatalog]
  }
  
  extension [Self <: SchemaProvidedSoftwareCatalog](x: Self) {
    
    inline def setAndroidxOrchestratorVersion(value: String): Self = StObject.set(x, "androidxOrchestratorVersion", value.asInstanceOf[js.Any])
    
    inline def setAndroidxOrchestratorVersionNull: Self = StObject.set(x, "androidxOrchestratorVersion", null)
    
    inline def setAndroidxOrchestratorVersionUndefined: Self = StObject.set(x, "androidxOrchestratorVersion", js.undefined)
    
    inline def setOrchestratorVersion(value: String): Self = StObject.set(x, "orchestratorVersion", value.asInstanceOf[js.Any])
    
    inline def setOrchestratorVersionNull: Self = StObject.set(x, "orchestratorVersion", null)
    
    inline def setOrchestratorVersionUndefined: Self = StObject.set(x, "orchestratorVersion", js.undefined)
  }
}
