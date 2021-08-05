package typings.hepburn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hepburn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanRomaji(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanRomaji")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def containsHiragana(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsHiragana")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def containsKana(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKana")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def containsKanji(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKanji")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def containsKatakana(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKatakana")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def fromKana(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKana")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def splitKana(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitKana")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def splitRomaji(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitRomaji")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def toHiragana(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHiragana")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toKatakana(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKatakana")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
