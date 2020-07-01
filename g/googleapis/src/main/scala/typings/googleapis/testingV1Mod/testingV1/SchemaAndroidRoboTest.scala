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
  def apply(
    appApk: SchemaFileReference = null,
    appBundle: SchemaAppBundle = null,
    appInitialActivity: String = null,
    appPackageId: String = null,
    maxDepth: js.UndefOr[Double] = js.undefined,
    maxSteps: js.UndefOr[Double] = js.undefined,
    roboDirectives: js.Array[SchemaRoboDirective] = null,
    roboScript: SchemaFileReference = null,
    startingIntents: js.Array[SchemaRoboStartingIntent] = null
  ): SchemaAndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    if (appApk != null) __obj.updateDynamic("appApk")(appApk.asInstanceOf[js.Any])
    if (appBundle != null) __obj.updateDynamic("appBundle")(appBundle.asInstanceOf[js.Any])
    if (appInitialActivity != null) __obj.updateDynamic("appInitialActivity")(appInitialActivity.asInstanceOf[js.Any])
    if (appPackageId != null) __obj.updateDynamic("appPackageId")(appPackageId.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDepth)) __obj.updateDynamic("maxDepth")(maxDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSteps)) __obj.updateDynamic("maxSteps")(maxSteps.get.asInstanceOf[js.Any])
    if (roboDirectives != null) __obj.updateDynamic("roboDirectives")(roboDirectives.asInstanceOf[js.Any])
    if (roboScript != null) __obj.updateDynamic("roboScript")(roboScript.asInstanceOf[js.Any])
    if (startingIntents != null) __obj.updateDynamic("startingIntents")(startingIntents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAndroidRoboTest]
  }
}

