package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a test case.  Test case references are canonically ordered
  * lexicographically by these three factors: * First, by test_suite_name. *
  * Second, by class_name. * Third, by name.
  */
@js.native
trait SchemaTestCaseReference extends js.Object {
  /**
    * The name of the class.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * The name of the test case.  Required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The name of the test suite to which this test case belongs.
    */
  var testSuiteName: js.UndefOr[String] = js.native
}

object SchemaTestCaseReference {
  @scala.inline
  def apply(className: String = null, name: String = null, testSuiteName: String = null): SchemaTestCaseReference = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (testSuiteName != null) __obj.updateDynamic("testSuiteName")(testSuiteName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestCaseReference]
  }
}

