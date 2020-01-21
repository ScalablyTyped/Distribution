package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The currently provided software environment on the devices under test.
  */
@js.native
trait SchemaProvidedSoftwareCatalog extends js.Object {
  /**
    * A string representing the current version of Android Test Orchestrator
    * that is provided by TestExecutionService. Example: &quot;1.0.2
    * beta&quot;.
    */
  var orchestratorVersion: js.UndefOr[String] = js.native
}

object SchemaProvidedSoftwareCatalog {
  @scala.inline
  def apply(orchestratorVersion: String = null): SchemaProvidedSoftwareCatalog = {
    val __obj = js.Dynamic.literal()
    if (orchestratorVersion != null) __obj.updateDynamic("orchestratorVersion")(orchestratorVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProvidedSoftwareCatalog]
  }
}

