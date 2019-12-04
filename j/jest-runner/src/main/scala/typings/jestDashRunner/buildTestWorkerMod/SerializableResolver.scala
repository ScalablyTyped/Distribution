package typings.jestDashRunner.buildTestWorkerMod

import typings.atJestTypes.buildConfigMod.ProjectConfig
import typings.jestDashHasteDashMap.jestDashHasteDashMapMod.SerializableModuleMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializableResolver extends js.Object {
  var config: ProjectConfig
  var serializableModuleMap: SerializableModuleMap
}

object SerializableResolver {
  @scala.inline
  def apply(config: ProjectConfig, serializableModuleMap: SerializableModuleMap): SerializableResolver = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], serializableModuleMap = serializableModuleMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SerializableResolver]
  }
}

