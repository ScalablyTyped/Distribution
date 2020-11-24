package typings.jestCore.anon

import typings.jestCore.jestCoreStrings.globalSetup
import typings.jestCore.jestCoreStrings.globalTeardown
import typings.jestRunner.mod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllTests extends js.Object {
  
  var allTests: js.Array[Test] = js.native
  
  var globalConfig: typings.jestTypes.configMod.GlobalConfig = js.native
  
  var moduleName: globalSetup | globalTeardown = js.native
}
object AllTests {
  
  @scala.inline
  def apply(
    allTests: js.Array[Test],
    globalConfig: typings.jestTypes.configMod.GlobalConfig,
    moduleName: globalSetup | globalTeardown
  ): AllTests = {
    val __obj = js.Dynamic.literal(allTests = allTests.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllTests]
  }
  
  @scala.inline
  implicit class AllTestsOps[Self <: AllTests] (val x: Self) extends AnyVal {
    
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
    def setAllTestsVarargs(value: Test*): Self = this.set("allTests", js.Array(value :_*))
    
    @scala.inline
    def setAllTests(value: js.Array[Test]): Self = this.set("allTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalConfig(value: typings.jestTypes.configMod.GlobalConfig): Self = this.set("globalConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleName(value: globalSetup | globalTeardown): Self = this.set("moduleName", value.asInstanceOf[js.Any])
  }
}
