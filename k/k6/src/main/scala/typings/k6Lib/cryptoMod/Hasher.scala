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
  def apply(
    digest: js.Function1[OutputEncoding, java.lang.String],
    update: js.Function1[java.lang.String, scala.Unit]
  ): Hasher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("digest")(digest)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Hasher]
  }
}

