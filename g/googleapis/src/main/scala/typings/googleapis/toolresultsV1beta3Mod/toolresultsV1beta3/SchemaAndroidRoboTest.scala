package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A test of an android application that explores the application on a virtual
  * or physical Android device, finding culprits and crashes as it goes.
  */
@js.native
trait SchemaAndroidRoboTest extends js.Object {
  
  /**
    * The initial activity that should be used to start the app. Optional
    */
  var appInitialActivity: js.UndefOr[String] = js.native
  
  /**
    * The java package for the bootstrap. Optional
    */
  var bootstrapPackageId: js.UndefOr[String] = js.native
  
  /**
    * The runner class for the bootstrap. Optional
    */
  var bootstrapRunnerClass: js.UndefOr[String] = js.native
  
  /**
    * The max depth of the traversal stack Robo can explore. Optional
    */
  var maxDepth: js.UndefOr[Double] = js.native
  
  /**
    * The max number of steps/actions Robo can execute. Default is no limit
    * (0). Optional
    */
  var maxSteps: js.UndefOr[Double] = js.native
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
    def setAppInitialActivity(value: String): Self = this.set("appInitialActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInitialActivity: Self = this.set("appInitialActivity", js.undefined)
    
    @scala.inline
    def setBootstrapPackageId(value: String): Self = this.set("bootstrapPackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrapPackageId: Self = this.set("bootstrapPackageId", js.undefined)
    
    @scala.inline
    def setBootstrapRunnerClass(value: String): Self = this.set("bootstrapRunnerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrapRunnerClass: Self = this.set("bootstrapRunnerClass", js.undefined)
    
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    
    @scala.inline
    def setMaxSteps(value: Double): Self = this.set("maxSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSteps: Self = this.set("maxSteps", js.undefined)
  }
}
