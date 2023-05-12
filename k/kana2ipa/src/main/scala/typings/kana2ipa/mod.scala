package typings.kana2ipa

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kana2ipa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hiragana2katakana(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hiragana2katakana")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def kana2ipa(inText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("kana2ipa")(inText.asInstanceOf[js.Any]).asInstanceOf[String]
}
