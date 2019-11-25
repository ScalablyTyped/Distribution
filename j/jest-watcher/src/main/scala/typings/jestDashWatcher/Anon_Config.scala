package typings.jestDashWatcher

import typings.atJestTypes.buildConfigMod.Path
import typings.atJestTypes.buildConfigMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: ProjectConfig
  var testPaths: js.Array[Path]
}

object Anon_Config {
  @scala.inline
  def apply(config: ProjectConfig, testPaths: js.Array[Path]): Anon_Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Config]
  }
}

