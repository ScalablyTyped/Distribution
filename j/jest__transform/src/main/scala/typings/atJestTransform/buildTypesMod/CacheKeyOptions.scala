package typings.atJestTransform.buildTypesMod

import typings.atJestTypes.buildConfigMod.ProjectConfig
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
    val __obj = js.Dynamic.literal(config = config, instrument = instrument, rootDir = rootDir)
  
    __obj.asInstanceOf[CacheKeyOptions]
  }
}

