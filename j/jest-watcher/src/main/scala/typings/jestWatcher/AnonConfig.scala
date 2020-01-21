package typings.jestWatcher

import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends js.Object {
  var config: ProjectConfig
  var testPaths: js.Array[Path]
}

object AnonConfig {
  @scala.inline
  def apply(config: ProjectConfig, testPaths: js.Array[Path]): AnonConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConfig]
  }
}

