package typings.greekUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("greek-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sanitizeDiacritics(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeDiacritics")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sanitizeDiacritics(text: String, ignore: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeDiacritics")(text.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toGreek(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toGreek")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toGreek(text: String, ignore: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toGreek")(text.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toGreeklish(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toGreeklish")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toGreeklish(text: String, ignore: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toGreeklish")(text.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toPhoneticLatin(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPhoneticLatin")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toPhoneticLatin(text: String, ignore: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toPhoneticLatin")(text.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toTransliteratedLatin(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTransliteratedLatin")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toTransliteratedLatin(text: String, ignore: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toTransliteratedLatin")(text.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[String]
}
