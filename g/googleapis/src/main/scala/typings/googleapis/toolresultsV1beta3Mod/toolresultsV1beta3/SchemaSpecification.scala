package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The details about how to run the execution.
  */
@js.native
trait SchemaSpecification extends js.Object {
  /**
    * An Android mobile test execution specification.
    */
  var androidTest: js.UndefOr[SchemaAndroidTest] = js.native
}

object SchemaSpecification {
  @scala.inline
  def apply(androidTest: SchemaAndroidTest = null): SchemaSpecification = {
    val __obj = js.Dynamic.literal()
    if (androidTest != null) __obj.updateDynamic("androidTest")(androidTest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpecification]
  }
}

