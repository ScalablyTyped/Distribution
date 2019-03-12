package typings
package k6Lib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hasher extends js.Object {
  def digest(outputEncoding: OutputEncoding): java.lang.String
  def update(input: java.lang.String): scala.Unit
}

object Hasher {
  @scala.inline
  def apply(digest: OutputEncoding => java.lang.String, update: java.lang.String => scala.Unit): Hasher = {
    val __obj = js.Dynamic.literal(digest = js.Any.fromFunction1(digest), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Hasher]
  }
}

