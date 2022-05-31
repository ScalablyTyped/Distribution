package typings.koozakiRomajiConv

import typings.koozakiRomajiConv.mod.RomajiConv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object romajiConv {
    
    /**
      * RomajiConv のインスタンスを返す
      *
      * @param someString 変換対象の文字列
      * @return のインスタンス
      */
    inline def apply(someString: String): RomajiConv = ^.asInstanceOf[js.Dynamic].apply(someString.asInstanceOf[js.Any]).asInstanceOf[RomajiConv]
    
    @JSGlobal("romajiConv")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 変換後のひらがなを返す
      *
      * @param someString 変換対象の文字列
      * @return 変換後のひらがな
      */
    inline def toHiragana(someString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHiragana")(someString.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * 変換後のカタカナを返す
      *
      * @param someString 変換対象の文字列
      * @return 変換後のカタカナ
      */
    inline def toKatakana(someString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKatakana")(someString.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
