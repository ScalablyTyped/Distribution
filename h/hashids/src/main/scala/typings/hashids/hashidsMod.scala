package typings.hashids

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hashids", JSImport.Namespace)
@js.native
object hashidsMod extends js.Object {
  @js.native
  trait Hashids extends js.Object {
    var alphabet: js.Array[String] = js.native
    var errorAlphabetLength: String = js.native
    var errorAlphabetSpace: String = js.native
    var guardDiv: Double = js.native
    var minAlphabetLength: Double = js.native
    var minHashLength: Double = js.native
    var salt: String = js.native
    var sepDiv: Double = js.native
    var seps: String = js.native
    var version: String = js.native
    def decode(hash: String): js.Array[Double] = js.native
    def decodeHex(hash: String): String = js.native
    def encode(arg: js.Array[Double]): String = js.native
    def encode(args: Double*): String = js.native
    def encode(arg: Double): String = js.native
    def encodeHex(str: String): String = js.native
    def hash(input: Double, alphabet: String): String = js.native
    def unhash(input: js.Array[String], alphabet: String): Double = js.native
  }
  
  @js.native
  class default protected () extends Hashids {
    def this(salt: String) = this()
    def this(salt: String, minHashLength: Double) = this()
    def this(salt: String, minHashLength: Double, alphabet: String) = this()
  }
  
}

