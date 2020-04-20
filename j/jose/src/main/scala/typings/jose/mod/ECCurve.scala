package typings.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jose.joseStrings.`P-256`
  - typings.jose.joseStrings.secp256k1
  - typings.jose.joseStrings.`P-384`
  - typings.jose.joseStrings.`P-521`
*/
trait ECCurve extends js.Object

object ECCurve {
  @scala.inline
  def `P-256`: typings.jose.joseStrings.`P-256` = "P-256".asInstanceOf[typings.jose.joseStrings.`P-256`]
  @scala.inline
  def `P-384`: typings.jose.joseStrings.`P-384` = "P-384".asInstanceOf[typings.jose.joseStrings.`P-384`]
  @scala.inline
  def `P-521`: typings.jose.joseStrings.`P-521` = "P-521".asInstanceOf[typings.jose.joseStrings.`P-521`]
  @scala.inline
  def secp256k1: typings.jose.joseStrings.secp256k1 = "secp256k1".asInstanceOf[typings.jose.joseStrings.secp256k1]
}

