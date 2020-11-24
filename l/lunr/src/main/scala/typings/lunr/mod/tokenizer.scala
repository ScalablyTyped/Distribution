package typings.lunr.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lunr", "tokenizer")
@js.native
object tokenizer extends js.Object {
  
  /**
    * A function for splitting a string into tokens ready to be inserted into
    * the search index. Uses `lunr.tokenizer.separator` to split strings, change
    * the value of this property to change how strings are split into tokens.
    *
    * This tokenizer will convert its parameter to a string by calling `toString` and
    * then will split this string on the character in `lunr.tokenizer.separator`.
    * Arrays will have their elements converted to strings and wrapped in a lunr.Token.
    *
    * @param obj - The object to convert into tokens
    */
  def apply(): js.Array[Token] = js.native
  def apply(obj: String): js.Array[Token] = js.native
  def apply(obj: js.Array[js.Object]): js.Array[Token] = js.native
  def apply(obj: js.Object): js.Array[Token] = js.native
  
  /**
    * The separator used to split a string into tokens. Override this property to change the behaviour of
    * `lunr.tokenizer` behaviour when tokenizing strings. By default this splits on whitespace and hyphens.
    *
    * @see lunr.tokenizer
    */
  var separator: RegExp = js.native
}
