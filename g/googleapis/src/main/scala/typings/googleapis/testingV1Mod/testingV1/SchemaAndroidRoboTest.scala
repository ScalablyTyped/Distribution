package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A test of an android application that explores the application on a virtual
  * or physical Android Device, finding culprits and crashes as it goes.
  */
@js.native
trait SchemaAndroidRoboTest extends StObject {
  
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
  implicit class SchemaAndroidRoboTestMutableBuilder[Self <: SchemaAndroidRoboTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppApk(value: SchemaFileReference): Self = StObject.set(x, "appApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppApkUndefined: Self = StObject.set(x, "appApk", js.undefined)
    
    @scala.inline
    def setAppBundle(value: SchemaAppBundle): Self = StObject.set(x, "appBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppBundleUndefined: Self = StObject.set(x, "appBundle", js.undefined)
    
    @scala.inline
    def setAppInitialActivity(value: String): Self = StObject.set(x, "appInitialActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInitialActivityUndefined: Self = StObject.set(x, "appInitialActivity", js.undefined)
    
    @scala.inline
    def setAppPackageId(value: String): Self = StObject.set(x, "appPackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppPackageIdUndefined: Self = StObject.set(x, "appPackageId", js.undefined)
    
    @scala.inline
    def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    
    @scala.inline
    def setMaxSteps(value: Double): Self = StObject.set(x, "maxSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxStepsUndefined: Self = StObject.set(x, "maxSteps", js.undefined)
    
    @scala.inline
    def setRoboDirectives(value: js.Array[SchemaRoboDirective]): Self = StObject.set(x, "roboDirectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoboDirectivesUndefined: Self = StObject.set(x, "roboDirectives", js.undefined)
    
    @scala.inline
    def setRoboDirectivesVarargs(value: SchemaRoboDirective*): Self = StObject.set(x, "roboDirectives", js.Array(value :_*))
    
    @scala.inline
    def setRoboScript(value: SchemaFileReference): Self = StObject.set(x, "roboScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoboScriptUndefined: Self = StObject.set(x, "roboScript", js.undefined)
    
    @scala.inline
    def setStartingIntents(value: js.Array[SchemaRoboStartingIntent]): Self = StObject.set(x, "startingIntents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingIntentsUndefined: Self = StObject.set(x, "startingIntents", js.undefined)
    
    @scala.inline
    def setStartingIntentsVarargs(value: SchemaRoboStartingIntent*): Self = StObject.set(x, "startingIntents", js.Array(value :_*))
  }
}
