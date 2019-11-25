package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsrsasign.jsrsasignStrings.`DES-CBC`
  - typings.jsrsasign.jsrsasignStrings.`DES-EDE3-CBC`
  - typings.jsrsasign.jsrsasignStrings.`AES-128-CBC`
  - typings.jsrsasign.jsrsasignStrings.`AES-192-CBC`
  - typings.jsrsasign.jsrsasignStrings.`AES-256-CBC`
*/
trait EncryptionAlgorithms extends js.Object

object EncryptionAlgorithms {
  @scala.inline
  def `AES-128-CBC`: typings.jsrsasign.jsrsasignStrings.`AES-128-CBC` = this.cast("AES-128-CBC")
  @scala.inline
  def `AES-192-CBC`: typings.jsrsasign.jsrsasignStrings.`AES-192-CBC` = this.cast("AES-192-CBC")
  @scala.inline
  def `AES-256-CBC`: typings.jsrsasign.jsrsasignStrings.`AES-256-CBC` = this.cast("AES-256-CBC")
  @scala.inline
  def `DES-CBC`: typings.jsrsasign.jsrsasignStrings.`DES-CBC` = this.cast("DES-CBC")
  @scala.inline
  def `DES-EDE3-CBC`: typings.jsrsasign.jsrsasignStrings.`DES-EDE3-CBC` = this.cast("DES-EDE3-CBC")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

