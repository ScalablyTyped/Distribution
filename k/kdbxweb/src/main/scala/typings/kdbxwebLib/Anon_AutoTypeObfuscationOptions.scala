package typings
package kdbxwebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoTypeObfuscationOptions extends js.Object {
  var AutoTypeObfuscationOptions: Anon_None
  var CipherId: Anon_Aes
  var CompressionAlgorithm: Anon_GZip
  var CrsAlgorithm: Anon_ArcFourVariant
  var Defaults: Anon_HistoryMaxItems
  var ErrorCodes: Anon_BadSignature
  var Icons: Anon_Apple
  var KdfId: Anon_AesArgon2
  var Signatures: Anon_FileMagic
}

object Anon_AutoTypeObfuscationOptions {
  @scala.inline
  def apply(
    AutoTypeObfuscationOptions: Anon_None,
    CipherId: Anon_Aes,
    CompressionAlgorithm: Anon_GZip,
    CrsAlgorithm: Anon_ArcFourVariant,
    Defaults: Anon_HistoryMaxItems,
    ErrorCodes: Anon_BadSignature,
    Icons: Anon_Apple,
    KdfId: Anon_AesArgon2,
    Signatures: Anon_FileMagic
  ): Anon_AutoTypeObfuscationOptions = {
    val __obj = js.Dynamic.literal(AutoTypeObfuscationOptions = AutoTypeObfuscationOptions, CipherId = CipherId, CompressionAlgorithm = CompressionAlgorithm, CrsAlgorithm = CrsAlgorithm, Defaults = Defaults, ErrorCodes = ErrorCodes, Icons = Icons, KdfId = KdfId, Signatures = Signatures)
  
    __obj.asInstanceOf[Anon_AutoTypeObfuscationOptions]
  }
}

