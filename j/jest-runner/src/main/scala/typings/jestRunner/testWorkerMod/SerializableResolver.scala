package typings.jestRunner.testWorkerMod

import typings.jestHasteMap.mod.SerializableModuleMap
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializableResolver extends js.Object {
  
  var config: ProjectConfig = js.native
  
  var serializableModuleMap: SerializableModuleMap = js.native
}
object SerializableResolver {
  
  @scala.inline
  def apply(config: ProjectConfig, serializableModuleMap: SerializableModuleMap): SerializableResolver = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], serializableModuleMap = serializableModuleMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableResolver]
  }
  
  @scala.inline
  implicit class SerializableResolverOps[Self <: SerializableResolver] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: ProjectConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializableModuleMap(value: SerializableModuleMap): Self = this.set("serializableModuleMap", value.asInstanceOf[js.Any])
  }
}
