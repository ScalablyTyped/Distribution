package typings
package jsDashSha512Lib.jsDashSha512Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSSha512Static extends HashStatic {
  @JSName("sha384")
  var sha384_Original: HashStatic = js.native
  @JSName("sha512_224")
  var sha512_224_Original: HashStatic = js.native
  @JSName("sha512_256")
  var sha512_256_Original: HashStatic = js.native
  @JSName("sha512")
  var sha512_Original: HashStatic = js.native
  def sha384(messageToHash: java.lang.String): java.lang.String = js.native
  def sha512(messageToHash: java.lang.String): java.lang.String = js.native
  def sha512_224(messageToHash: java.lang.String): java.lang.String = js.native
  def sha512_256(messageToHash: java.lang.String): java.lang.String = js.native
}

