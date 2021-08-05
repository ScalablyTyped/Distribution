package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The currently provided software environment on the devices under test.
  */
trait SchemaProvidedSoftwareCatalog extends StObject {
  
  /**
    * A string representing the current version of Android Test Orchestrator
    * that is provided by TestExecutionService. Example: &quot;1.0.2
    * beta&quot;.
    */
  var orchestratorVersion: js.UndefOr[String] = js.undefined
}
object SchemaProvidedSoftwareCatalog {
  
  inline def apply(): SchemaProvidedSoftwareCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvidedSoftwareCatalog]
  }
  
  extension [Self <: SchemaProvidedSoftwareCatalog](x: Self) {
    
    inline def setOrchestratorVersion(value: String): Self = StObject.set(x, "orchestratorVersion", value.asInstanceOf[js.Any])
    
    inline def setOrchestratorVersionUndefined: Self = StObject.set(x, "orchestratorVersion", js.undefined)
  }
}
