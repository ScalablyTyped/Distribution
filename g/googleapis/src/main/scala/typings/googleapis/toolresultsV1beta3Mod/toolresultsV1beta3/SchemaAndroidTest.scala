package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Android mobile test specification.
  */
@js.native
trait SchemaAndroidTest extends js.Object {
  /**
    * Information about the application under test.
    */
  var androidAppInfo: js.UndefOr[SchemaAndroidAppInfo] = js.native
  /**
    * An Android instrumentation test.
    */
  var androidInstrumentationTest: js.UndefOr[SchemaAndroidInstrumentationTest] = js.native
  /**
    * An Android robo test.
    */
  var androidRoboTest: js.UndefOr[SchemaAndroidRoboTest] = js.native
  /**
    * Max time a test is allowed to run before it is automatically cancelled.
    */
  var testTimeout: js.UndefOr[SchemaDuration] = js.native
}

object SchemaAndroidTest {
  @scala.inline
  def apply(
    androidAppInfo: SchemaAndroidAppInfo = null,
    androidInstrumentationTest: SchemaAndroidInstrumentationTest = null,
    androidRoboTest: SchemaAndroidRoboTest = null,
    testTimeout: SchemaDuration = null
  ): SchemaAndroidTest = {
    val __obj = js.Dynamic.literal()
    if (androidAppInfo != null) __obj.updateDynamic("androidAppInfo")(androidAppInfo.asInstanceOf[js.Any])
    if (androidInstrumentationTest != null) __obj.updateDynamic("androidInstrumentationTest")(androidInstrumentationTest.asInstanceOf[js.Any])
    if (androidRoboTest != null) __obj.updateDynamic("androidRoboTest")(androidRoboTest.asInstanceOf[js.Any])
    if (testTimeout != null) __obj.updateDynamic("testTimeout")(testTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAndroidTest]
  }
}

