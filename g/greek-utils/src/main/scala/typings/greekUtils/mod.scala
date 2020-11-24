package typings.greekUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("greek-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def sanitizeDiacritics(text: String): String = js.native
  def sanitizeDiacritics(text: String, ignore: String): String = js.native
  
  def toGreek(text: String): String = js.native
  def toGreek(text: String, ignore: String): String = js.native
  
  def toGreeklish(text: String): String = js.native
  def toGreeklish(text: String, ignore: String): String = js.native
  
  def toPhoneticLatin(text: String): String = js.native
  def toPhoneticLatin(text: String, ignore: String): String = js.native
  
  def toTransliteratedLatin(text: String): String = js.native
  def toTransliteratedLatin(text: String, ignore: String): String = js.native
}
