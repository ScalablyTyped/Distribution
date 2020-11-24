package typings.jestCore.anon

import typings.jestTestResult.typesMod.AggregatedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalConfig extends js.Object {
  
  var globalConfig: typings.jestTypes.configMod.GlobalConfig = js.native
  
  var results: AggregatedResult = js.native
}
object GlobalConfig {
  
  @scala.inline
  def apply(globalConfig: typings.jestTypes.configMod.GlobalConfig, results: AggregatedResult): GlobalConfig = {
    val __obj = js.Dynamic.literal(globalConfig = globalConfig.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfig]
  }
  
  @scala.inline
  implicit class GlobalConfigOps[Self <: GlobalConfig] (val x: Self) extends AnyVal {
    
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
    def setGlobalConfig(value: typings.jestTypes.configMod.GlobalConfig): Self = this.set("globalConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: AggregatedResult): Self = this.set("results", value.asInstanceOf[js.Any])
  }
}
