package typings.kdbxweb.mod

import typings.kdbxweb.anon.Aes
import typings.kdbxweb.anon.Apple
import typings.kdbxweb.anon.ArcFourVariant
import typings.kdbxweb.anon.Argon2
import typings.kdbxweb.anon.BadSignature
import typings.kdbxweb.anon.FileMagic
import typings.kdbxweb.anon.GZip
import typings.kdbxweb.anon.HistoryMaxItems
import typings.kdbxweb.anon.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Consts")
@js.native
object Consts extends js.Object {
  var AutoTypeObfuscationOptions: None = js.native
  var CipherId: Aes = js.native
  var CompressionAlgorithm: GZip = js.native
  var CrsAlgorithm: ArcFourVariant = js.native
  var Defaults: HistoryMaxItems = js.native
  var ErrorCodes: BadSignature = js.native
  var Icons: Apple = js.native
  var KdfId: Argon2 = js.native
  var Signatures: FileMagic = js.native
}

