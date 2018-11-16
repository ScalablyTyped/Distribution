package typings
package k6Lib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Hasher extends js.Object {
  def digest(outputEncoding: OutputEncoding): java.lang.String
  def update(input: java.lang.String): scala.Unit
}

