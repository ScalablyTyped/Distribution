package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A test of an Android Application with a Test Loop. The intent
  * \&lt;intent-name\&gt; will be implicitly added, since Games is the only
  * user of this api, for the time being.
  */
trait SchemaAndroidTestLoop extends StObject {
  
  /**
    * The APK for the application under test.
    */
  var appApk: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * A multi-apk app bundle for the application under test.
    */
  var appBundle: js.UndefOr[SchemaAppBundle] = js.undefined
  
  /**
    * The java package for the application under test. The default is
    * determined by examining the application&#39;s manifest.
    */
  var appPackageId: js.UndefOr[String] = js.undefined
  
  /**
    * The list of scenario labels that should be run during the test. The
    * scenario labels should map to labels defined in the application&#39;s
    * manifest. For example, player_experience and
    * com.google.test.loops.player_experience add all of the loops labeled in
    * the manifest with the com.google.test.loops.player_experience name to the
    * execution. Scenarios can also be specified in the scenarios field.
    */
  var scenarioLabels: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The list of scenarios that should be run during the test. The default is
    * all test loops, derived from the application&#39;s manifest.
    */
  var scenarios: js.UndefOr[js.Array[Double]] = js.undefined
}
object SchemaAndroidTestLoop {
  
  @scala.inline
  def apply(): SchemaAndroidTestLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidTestLoop]
  }
  
  @scala.inline
  implicit class SchemaAndroidTestLoopMutableBuilder[Self <: SchemaAndroidTestLoop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppApk(value: SchemaFileReference): Self = StObject.set(x, "appApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppApkUndefined: Self = StObject.set(x, "appApk", js.undefined)
    
    @scala.inline
    def setAppBundle(value: SchemaAppBundle): Self = StObject.set(x, "appBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppBundleUndefined: Self = StObject.set(x, "appBundle", js.undefined)
    
    @scala.inline
    def setAppPackageId(value: String): Self = StObject.set(x, "appPackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppPackageIdUndefined: Self = StObject.set(x, "appPackageId", js.undefined)
    
    @scala.inline
    def setScenarioLabels(value: js.Array[String]): Self = StObject.set(x, "scenarioLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenarioLabelsUndefined: Self = StObject.set(x, "scenarioLabels", js.undefined)
    
    @scala.inline
    def setScenarioLabelsVarargs(value: String*): Self = StObject.set(x, "scenarioLabels", js.Array(value :_*))
    
    @scala.inline
    def setScenarios(value: js.Array[Double]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenariosUndefined: Self = StObject.set(x, "scenarios", js.undefined)
    
    @scala.inline
    def setScenariosVarargs(value: Double*): Self = StObject.set(x, "scenarios", js.Array(value :_*))
  }
}
