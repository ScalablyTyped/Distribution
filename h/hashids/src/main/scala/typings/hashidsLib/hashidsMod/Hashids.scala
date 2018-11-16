package typings
package hashidsLib.hashidsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hashids extends js.Object {
  var alphabet: js.Array[java.lang.String] = js.native
  var errorAlphabetLength: java.lang.String = js.native
  var errorAlphabetSpace: java.lang.String = js.native
  var guardDiv: scala.Double = js.native
  var minAlphabetLength: scala.Double = js.native
  var minHashLength: scala.Double = js.native
  var salt: java.lang.String = js.native
  var sepDiv: scala.Double = js.native
  var seps: java.lang.String = js.native
  var version: java.lang.String = js.native
  def decode(hash: java.lang.String): js.Array[scala.Double] = js.native
  def decodeHex(hash: java.lang.String): java.lang.String = js.native
  def encode(arg: js.Array[scala.Double]): java.lang.String = js.native
  def encode(args: scala.Double*): java.lang.String = js.native
  def encode(arg: scala.Double): java.lang.String = js.native
  def encodeHex(str: java.lang.String): java.lang.String = js.native
  def hash(input: scala.Double, alphabet: java.lang.String): java.lang.String = js.native
  def unhash(input: js.Array[java.lang.String], alphabet: java.lang.String): scala.Double = js.native
}

