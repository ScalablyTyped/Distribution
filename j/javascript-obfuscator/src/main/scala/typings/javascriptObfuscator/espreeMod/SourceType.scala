package typings.javascriptObfuscator.espreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.javascriptObfuscator.javascriptObfuscatorStrings.script
  - typings.javascriptObfuscator.javascriptObfuscatorStrings.module
*/
trait SourceType extends js.Object

object SourceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def module: typings.javascriptObfuscator.javascriptObfuscatorStrings.module = this.cast("module")
  @scala.inline
  def script: typings.javascriptObfuscator.javascriptObfuscatorStrings.script = this.cast("script")
}

