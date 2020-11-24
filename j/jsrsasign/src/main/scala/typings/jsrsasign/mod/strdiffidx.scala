package typings.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "strdiffidx")
@js.native
object strdiffidx extends js.Object {
  
  /**
    * find index of string where two string differs
    * @param s1 string to compare
    * @param s2 string to compare
    * @return string index of where character differs. Return -1 if same.
    * @example
    * strdiffidx("abcdefg", "abcd4fg") -> 4
    * strdiffidx("abcdefg", "abcdefg") -> -1
    * strdiffidx("abcdefg", "abcdef") -> 6
    * strdiffidx("abcdefgh", "abcdef") -> 6
    */
  def apply(s1: String, s2: String): Double = js.native
}
