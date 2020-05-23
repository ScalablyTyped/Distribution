package typings.jestWatcher.anon

import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var config: ProjectConfig
  var testPaths: js.Array[Path]
}

object Config {
  @scala.inline
  def apply(config: ProjectConfig, testPaths: js.Array[Path]): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

