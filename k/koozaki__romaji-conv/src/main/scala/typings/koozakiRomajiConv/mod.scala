package typings.koozakiRomajiConv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * RomajiConv のインスタンスを返す
    *
    * @param someString 変換対象の文字列
    * @return のインスタンス
    */
  inline def apply(someString: String): RomajiConv = ^.asInstanceOf[js.Dynamic].apply(someString.asInstanceOf[js.Any]).asInstanceOf[RomajiConv]
  
  @JSImport("@koozaki/romaji-conv", JSImport.Namespace)
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
  
  trait RomajiConv extends StObject {
    
    /**
      * 文字列の変換
      *
      * @param someString ローマ字 or ひらがな or カタカナ
      * @param mapObject マッピングオブジェクト
      * @return ひらがな or カタカナ
      */
    def convert(someString: String, mapObject: js.Object): String
    
    /**
      * 変換前の文字列を返す
      *
      * @return 変換前の文字列
      */
    def string(): String
    
    /**
      * 変換後のひらがなを返す
      *
      * @return 変換後のひらがな
      */
    def toHiragana(): String
    
    /**
      * 変換後のカタカナを返す
      *
      * @return 変換後のカタカナ
      */
    def toKatakana(): String
  }
  object RomajiConv {
    
    inline def apply(
      convert: (String, js.Object) => String,
      string: () => String,
      toHiragana: () => String,
      toKatakana: () => String
    ): RomajiConv = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction2(convert), string = js.Any.fromFunction0(string), toHiragana = js.Any.fromFunction0(toHiragana), toKatakana = js.Any.fromFunction0(toKatakana))
      __obj.asInstanceOf[RomajiConv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RomajiConv] (val x: Self) extends AnyVal {
      
      inline def setConvert(value: (String, js.Object) => String): Self = StObject.set(x, "convert", js.Any.fromFunction2(value))
      
      inline def setString(value: () => String): Self = StObject.set(x, "string", js.Any.fromFunction0(value))
      
      inline def setToHiragana(value: () => String): Self = StObject.set(x, "toHiragana", js.Any.fromFunction0(value))
      
      inline def setToKatakana(value: () => String): Self = StObject.set(x, "toKatakana", js.Any.fromFunction0(value))
    }
  }
}
