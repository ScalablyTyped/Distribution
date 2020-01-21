package typings.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The phases during which a transformation may be applied to a plugin.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.compose
  - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.fetch
*/
trait Phase extends js.Object

object Phase {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compose: typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.compose = this.cast("compose")
  @scala.inline
  def fetch: typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.fetch = this.cast("fetch")
}

