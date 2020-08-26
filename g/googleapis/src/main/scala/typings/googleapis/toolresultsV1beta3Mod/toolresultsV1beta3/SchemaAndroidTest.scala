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
  def apply(): SchemaAndroidTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidTest]
  }
  @scala.inline
  implicit class SchemaAndroidTestOps[Self <: SchemaAndroidTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAndroidAppInfo(value: SchemaAndroidAppInfo): Self = this.set("androidAppInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidAppInfo: Self = this.set("androidAppInfo", js.undefined)
    @scala.inline
    def setAndroidInstrumentationTest(value: SchemaAndroidInstrumentationTest): Self = this.set("androidInstrumentationTest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidInstrumentationTest: Self = this.set("androidInstrumentationTest", js.undefined)
    @scala.inline
    def setAndroidRoboTest(value: SchemaAndroidRoboTest): Self = this.set("androidRoboTest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidRoboTest: Self = this.set("androidRoboTest", js.undefined)
    @scala.inline
    def setTestTimeout(value: SchemaDuration): Self = this.set("testTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestTimeout: Self = this.set("testTimeout", js.undefined)
  }
  
}

