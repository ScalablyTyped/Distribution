package typings.hepburn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hepburn", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def cleanRomaji(str: String): String = js.native
  
  def containsHiragana(str: String): Boolean = js.native
  
  def containsKana(str: String): Boolean = js.native
  
  def containsKanji(str: String): Boolean = js.native
  
  def containsKatakana(str: String): Boolean = js.native
  
  def fromKana(str: String): String = js.native
  
  def splitKana(str: String): js.Array[String] = js.native
  
  def splitRomaji(str: String): js.Array[String] = js.native
  
  def toHiragana(str: String): String = js.native
  
  def toKatakana(str: String): String = js.native
}
