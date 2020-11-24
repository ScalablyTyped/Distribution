package typings.koozakiRomajiConv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RomajiConv extends js.Object {
  
  /**
    * 文字列の変換
    *
    * @param someString ローマ字 or ひらがな or カタカナ
    * @param mapObject マッピングオブジェクト
    * @return ひらがな or カタカナ
    */
  def convert(someString: String, mapObject: js.Object): String = js.native
  
  /**
    * 変換前の文字列を返す
    *
    * @return 変換前の文字列
    */
  def string(): String = js.native
  
  /**
    * 変換後のひらがなを返す
    *
    * @return 変換後のひらがな
    */
  def toHiragana(): String = js.native
  
  /**
    * 変換後のカタカナを返す
    *
    * @return 変換後のカタカナ
    */
  def toKatakana(): String = js.native
}
object RomajiConv {
  
  @scala.inline
  def apply(
    convert: (String, js.Object) => String,
    string: () => String,
    toHiragana: () => String,
    toKatakana: () => String
  ): RomajiConv = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction2(convert), string = js.Any.fromFunction0(string), toHiragana = js.Any.fromFunction0(toHiragana), toKatakana = js.Any.fromFunction0(toKatakana))
    __obj.asInstanceOf[RomajiConv]
  }
  
  @scala.inline
  implicit class RomajiConvOps[Self <: RomajiConv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConvert(value: (String, js.Object) => String): Self = this.set("convert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setString(value: () => String): Self = this.set("string", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToHiragana(value: () => String): Self = this.set("toHiragana", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToKatakana(value: () => String): Self = this.set("toKatakana", js.Any.fromFunction0(value))
  }
}
