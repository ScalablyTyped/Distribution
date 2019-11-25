package typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The primitive types available in a JSON schema.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.array
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.boolean
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.`null`
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.number
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.`object`
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.string
*/
trait Primitive extends js.Object

object Primitive {
  @scala.inline
  def array: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.array = this.cast("array")
  @scala.inline
  def boolean: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `null`: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.`null` = this.cast("null")
  @scala.inline
  def number: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.number = this.cast("number")
  @scala.inline
  def `object`: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.`object` = this.cast("object")
  @scala.inline
  def string: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.string = this.cast("string")
}

