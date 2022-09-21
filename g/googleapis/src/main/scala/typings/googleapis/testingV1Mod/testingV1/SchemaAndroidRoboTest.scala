package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAndroidRoboTest extends StObject {
  
  /**
    * The APK for the application under test.
    */
  var appApk: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * A multi-apk app bundle for the application under test.
    */
  var appBundle: js.UndefOr[SchemaAppBundle] = js.undefined
  
  /**
    * The initial activity that should be used to start the app.
    */
  var appInitialActivity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The java package for the application under test. The default value is determined by examining the application's manifest.
    */
  var appPackageId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The max depth of the traversal stack Robo can explore. Needs to be at least 2 to make Robo explore the app beyond the first activity. Default is 50.
    */
  var maxDepth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The max number of steps Robo can execute. Default is no limit.
    */
  var maxSteps: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A set of directives Robo should apply during the crawl. This allows users to customize the crawl. For example, the username and password for a test account can be provided.
    */
  var roboDirectives: js.UndefOr[js.Array[SchemaRoboDirective]] = js.undefined
  
  /**
    * The mode in which Robo should run. Most clients should allow the server to populate this field automatically.
    */
  var roboMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A JSON file with a sequence of actions Robo should perform as a prologue for the crawl.
    */
  var roboScript: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * The intents used to launch the app for the crawl. If none are provided, then the main launcher activity is launched. If some are provided, then only those provided are launched (the main launcher activity must be provided explicitly).
    */
  var startingIntents: js.UndefOr[js.Array[SchemaRoboStartingIntent]] = js.undefined
}
object SchemaAndroidRoboTest {
  
  inline def apply(): SchemaAndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidRoboTest]
  }
  
  extension [Self <: SchemaAndroidRoboTest](x: Self) {
    
    inline def setAppApk(value: SchemaFileReference): Self = StObject.set(x, "appApk", value.asInstanceOf[js.Any])
    
    inline def setAppApkUndefined: Self = StObject.set(x, "appApk", js.undefined)
    
    inline def setAppBundle(value: SchemaAppBundle): Self = StObject.set(x, "appBundle", value.asInstanceOf[js.Any])
    
    inline def setAppBundleUndefined: Self = StObject.set(x, "appBundle", js.undefined)
    
    inline def setAppInitialActivity(value: String): Self = StObject.set(x, "appInitialActivity", value.asInstanceOf[js.Any])
    
    inline def setAppInitialActivityNull: Self = StObject.set(x, "appInitialActivity", null)
    
    inline def setAppInitialActivityUndefined: Self = StObject.set(x, "appInitialActivity", js.undefined)
    
    inline def setAppPackageId(value: String): Self = StObject.set(x, "appPackageId", value.asInstanceOf[js.Any])
    
    inline def setAppPackageIdNull: Self = StObject.set(x, "appPackageId", null)
    
    inline def setAppPackageIdUndefined: Self = StObject.set(x, "appPackageId", js.undefined)
    
    inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxDepthNull: Self = StObject.set(x, "maxDepth", null)
    
    inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    
    inline def setMaxSteps(value: Double): Self = StObject.set(x, "maxSteps", value.asInstanceOf[js.Any])
    
    inline def setMaxStepsNull: Self = StObject.set(x, "maxSteps", null)
    
    inline def setMaxStepsUndefined: Self = StObject.set(x, "maxSteps", js.undefined)
    
    inline def setRoboDirectives(value: js.Array[SchemaRoboDirective]): Self = StObject.set(x, "roboDirectives", value.asInstanceOf[js.Any])
    
    inline def setRoboDirectivesUndefined: Self = StObject.set(x, "roboDirectives", js.undefined)
    
    inline def setRoboDirectivesVarargs(value: SchemaRoboDirective*): Self = StObject.set(x, "roboDirectives", js.Array(value*))
    
    inline def setRoboMode(value: String): Self = StObject.set(x, "roboMode", value.asInstanceOf[js.Any])
    
    inline def setRoboModeNull: Self = StObject.set(x, "roboMode", null)
    
    inline def setRoboModeUndefined: Self = StObject.set(x, "roboMode", js.undefined)
    
    inline def setRoboScript(value: SchemaFileReference): Self = StObject.set(x, "roboScript", value.asInstanceOf[js.Any])
    
    inline def setRoboScriptUndefined: Self = StObject.set(x, "roboScript", js.undefined)
    
    inline def setStartingIntents(value: js.Array[SchemaRoboStartingIntent]): Self = StObject.set(x, "startingIntents", value.asInstanceOf[js.Any])
    
    inline def setStartingIntentsUndefined: Self = StObject.set(x, "startingIntents", js.undefined)
    
    inline def setStartingIntentsVarargs(value: SchemaRoboStartingIntent*): Self = StObject.set(x, "startingIntents", js.Array(value*))
  }
}
