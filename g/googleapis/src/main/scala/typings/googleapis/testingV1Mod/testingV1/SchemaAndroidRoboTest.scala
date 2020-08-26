package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test of an android application that explores the application on a virtual
  * or physical Android Device, finding culprits and crashes as it goes.
  */
@js.native
trait SchemaAndroidRoboTest extends js.Object {
  /**
    * The APK for the application under test.
    */
  var appApk: js.UndefOr[SchemaFileReference] = js.native
  /**
    * A multi-apk app bundle for the application under test.
    */
  var appBundle: js.UndefOr[SchemaAppBundle] = js.native
  /**
    * The initial activity that should be used to start the app.
    */
  var appInitialActivity: js.UndefOr[String] = js.native
  /**
    * The java package for the application under test. The default value is
    * determined by examining the application&#39;s manifest.
    */
  var appPackageId: js.UndefOr[String] = js.native
  /**
    * The max depth of the traversal stack Robo can explore. Needs to be at
    * least 2 to make Robo explore the app beyond the first activity. Default
    * is 50.
    */
  var maxDepth: js.UndefOr[Double] = js.native
  /**
    * The max number of steps Robo can execute. Default is no limit.
    */
  var maxSteps: js.UndefOr[Double] = js.native
  /**
    * A set of directives Robo should apply during the crawl. This allows users
    * to customize the crawl. For example, the username and password for a test
    * account can be provided.
    */
  var roboDirectives: js.UndefOr[js.Array[SchemaRoboDirective]] = js.native
  /**
    * A JSON file with a sequence of actions Robo should perform as a prologue
    * for the crawl.
    */
  var roboScript: js.UndefOr[SchemaFileReference] = js.native
  /**
    * The intents used to launch the app for the crawl. If none are provided,
    * then the main launcher activity is launched. If some are provided, then
    * only those provided are launched (the main launcher activity must be
    * provided explicitly).
    */
  var startingIntents: js.UndefOr[js.Array[SchemaRoboStartingIntent]] = js.native
}

object SchemaAndroidRoboTest {
  @scala.inline
  def apply(): SchemaAndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidRoboTest]
  }
  @scala.inline
  implicit class SchemaAndroidRoboTestOps[Self <: SchemaAndroidRoboTest] (val x: Self) extends AnyVal {
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
    def setAppApk(value: SchemaFileReference): Self = this.set("appApk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppApk: Self = this.set("appApk", js.undefined)
    @scala.inline
    def setAppBundle(value: SchemaAppBundle): Self = this.set("appBundle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppBundle: Self = this.set("appBundle", js.undefined)
    @scala.inline
    def setAppInitialActivity(value: String): Self = this.set("appInitialActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppInitialActivity: Self = this.set("appInitialActivity", js.undefined)
    @scala.inline
    def setAppPackageId(value: String): Self = this.set("appPackageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppPackageId: Self = this.set("appPackageId", js.undefined)
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    @scala.inline
    def setMaxSteps(value: Double): Self = this.set("maxSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSteps: Self = this.set("maxSteps", js.undefined)
    @scala.inline
    def setRoboDirectivesVarargs(value: SchemaRoboDirective*): Self = this.set("roboDirectives", js.Array(value :_*))
    @scala.inline
    def setRoboDirectives(value: js.Array[SchemaRoboDirective]): Self = this.set("roboDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoboDirectives: Self = this.set("roboDirectives", js.undefined)
    @scala.inline
    def setRoboScript(value: SchemaFileReference): Self = this.set("roboScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoboScript: Self = this.set("roboScript", js.undefined)
    @scala.inline
    def setStartingIntentsVarargs(value: SchemaRoboStartingIntent*): Self = this.set("startingIntents", js.Array(value :_*))
    @scala.inline
    def setStartingIntents(value: js.Array[SchemaRoboStartingIntent]): Self = this.set("startingIntents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartingIntents: Self = this.set("startingIntents", js.undefined)
  }
  
}

