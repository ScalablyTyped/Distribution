package typings.jskana

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jskana", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hiraganaToKatakana(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hiraganaToKatakana")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isHiragana(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHiragana")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isHiragana(str: String, includePunctuation: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHiragana")(str.asInstanceOf[js.Any], includePunctuation.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isKanji(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKanji")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isKanji(str: String, includePunctuation: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isKanji")(str.asInstanceOf[js.Any], includePunctuation.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isKatakana(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKatakana")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isKatakana(str: String, includePunctuation: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isKatakana")(str.asInstanceOf[js.Any], includePunctuation.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPunctuation(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPunctuation")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRomaji(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRomaji")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isRomaji(str: String, includePunctuation: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRomaji")(str.asInstanceOf[js.Any], includePunctuation.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def kanaToRomaji(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("kanaToRomaji")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def katakanaToHiragana(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("katakanaToHiragana")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def romajiToHiragana(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("romajiToHiragana")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def romajiToKatakana(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("romajiToKatakana")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def splitKanaString(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitKanaString")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
