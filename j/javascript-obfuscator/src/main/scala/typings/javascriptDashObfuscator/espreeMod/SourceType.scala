package typings.javascriptDashObfuscator.espreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.javascriptDashObfuscator.javascriptDashObfuscatorStrings.script
  - typings.javascriptDashObfuscator.javascriptDashObfuscatorStrings.module
*/
trait SourceType extends js.Object

object SourceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def module: typings.javascriptDashObfuscator.javascriptDashObfuscatorStrings.module = this.cast("module")
  @scala.inline
  def script: typings.javascriptDashObfuscator.javascriptDashObfuscatorStrings.script = this.cast("script")
}

