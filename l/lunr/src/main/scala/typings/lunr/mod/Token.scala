package typings.lunr.mod

import typings.lunr.mod.Token.UpdateFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A token wraps a string representation of a token
  * as it is passed through the text processing pipeline.
  */
@JSImport("lunr", "Token")
@js.native
class Token protected () extends js.Object {
  /**
    * @param [str=''] - The string token being wrapped.
    * @param [metadata={}] - Metadata associated with this token.
    */
  def this(str: String, metadata: js.Object) = this()
  def clone(fn: UpdateFunction): Token = js.native
  /**
    * Applies the given function to the wrapped string token.
    *
    * @example
    * token.update(function (str, metadata) {
    *   return str.toUpperCase()
    * })
    *
    * @param fn - A function to apply to the token string.
    */
  def update(fn: UpdateFunction): Token = js.native
}

@JSImport("lunr", "Token")
@js.native
object Token extends js.Object {
  /**
    * A token update function is used when updating or optionally
    * when cloning a token.
    *
    * @param str - The string representation of the token.
    * @param metadata - All metadata associated with this token.
    */
  type UpdateFunction = js.Function2[/* str */ String, /* metadata */ js.Object, Unit]
}

