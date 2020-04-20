package typings.jestTransform.typesMod

import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheKeyOptions extends js.Object {
  var config: ProjectConfig
  var instrument: Boolean
  var rootDir: String
}

object CacheKeyOptions {
  @scala.inline
  def apply(config: ProjectConfig, instrument: Boolean, rootDir: String): CacheKeyOptions = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], instrument = instrument.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheKeyOptions]
  }
}

