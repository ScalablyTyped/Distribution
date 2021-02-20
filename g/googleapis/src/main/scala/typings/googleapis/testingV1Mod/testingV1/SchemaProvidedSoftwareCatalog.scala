package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The currently provided software environment on the devices under test.
  */
@js.native
trait SchemaProvidedSoftwareCatalog extends StObject {
  
  /**
    * A string representing the current version of Android Test Orchestrator
    * that is provided by TestExecutionService. Example: &quot;1.0.2
    * beta&quot;.
    */
  var orchestratorVersion: js.UndefOr[String] = js.native
}
object SchemaProvidedSoftwareCatalog {
  
  @scala.inline
  def apply(): SchemaProvidedSoftwareCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvidedSoftwareCatalog]
  }
  
  @scala.inline
  implicit class SchemaProvidedSoftwareCatalogMutableBuilder[Self <: SchemaProvidedSoftwareCatalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrchestratorVersion(value: String): Self = StObject.set(x, "orchestratorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrchestratorVersionUndefined: Self = StObject.set(x, "orchestratorVersion", js.undefined)
  }
}
