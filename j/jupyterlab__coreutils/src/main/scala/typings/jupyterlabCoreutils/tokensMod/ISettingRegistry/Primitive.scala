package typings.jupyterlabCoreutils.tokensMod.ISettingRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The primitive types available in a JSON schema.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.array
  - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.boolean
  - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`null`
  - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.number
  - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`object`
  - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.string
*/
trait Primitive extends js.Object

object Primitive {
  @scala.inline
  def array: typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.array = this.cast("array")
  @scala.inline
  def boolean: typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `null`: typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`null` = this.cast("null")
  @scala.inline
  def number: typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.number = this.cast("number")
  @scala.inline
  def `object`: typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`object` = this.cast("object")
  @scala.inline
  def string: typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.string = this.cast("string")
}

