package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A test of an android application that explores the application on a virtual
  * or physical Android device, finding culprits and crashes as it goes.
  */
trait SchemaAndroidRoboTest extends StObject {
  
  /**
    * The initial activity that should be used to start the app. Optional
    */
  var appInitialActivity: js.UndefOr[String] = js.undefined
  
  /**
    * The java package for the bootstrap. Optional
    */
  var bootstrapPackageId: js.UndefOr[String] = js.undefined
  
  /**
    * The runner class for the bootstrap. Optional
    */
  var bootstrapRunnerClass: js.UndefOr[String] = js.undefined
  
  /**
    * The max depth of the traversal stack Robo can explore. Optional
    */
  var maxDepth: js.UndefOr[Double] = js.undefined
  
  /**
    * The max number of steps/actions Robo can execute. Default is no limit
    * (0). Optional
    */
  var maxSteps: js.UndefOr[Double] = js.undefined
}
object SchemaAndroidRoboTest {
  
  inline def apply(): SchemaAndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidRoboTest]
  }
  
  extension [Self <: SchemaAndroidRoboTest](x: Self) {
    
    inline def setAppInitialActivity(value: String): Self = StObject.set(x, "appInitialActivity", value.asInstanceOf[js.Any])
    
    inline def setAppInitialActivityUndefined: Self = StObject.set(x, "appInitialActivity", js.undefined)
    
    inline def setBootstrapPackageId(value: String): Self = StObject.set(x, "bootstrapPackageId", value.asInstanceOf[js.Any])
    
    inline def setBootstrapPackageIdUndefined: Self = StObject.set(x, "bootstrapPackageId", js.undefined)
    
    inline def setBootstrapRunnerClass(value: String): Self = StObject.set(x, "bootstrapRunnerClass", value.asInstanceOf[js.Any])
    
    inline def setBootstrapRunnerClassUndefined: Self = StObject.set(x, "bootstrapRunnerClass", js.undefined)
    
    inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    
    inline def setMaxSteps(value: Double): Self = StObject.set(x, "maxSteps", value.asInstanceOf[js.Any])
    
    inline def setMaxStepsUndefined: Self = StObject.set(x, "maxSteps", js.undefined)
  }
}
