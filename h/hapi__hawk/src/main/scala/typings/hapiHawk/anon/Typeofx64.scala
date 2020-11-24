package typings.hapiHawk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofx64 extends js.Object {
  
  val Word: `2` = js.native
  
  /**
    * Initializes a newly created word array.
    *
    * @param words (Optional) An array of CryptoJS.x64.Word objects.
    * @param sigBytes (Optional) The number of significant bytes in the words.
    *
    * @example
    *
    *     var wordArray = CryptoJS.x64.WordArray.create();
    *
    *     var wordArray = CryptoJS.x64.WordArray.create([
    *         CryptoJS.x64.Word.create(0x00010203, 0x04050607),
    *         CryptoJS.x64.Word.create(0x18191a1b, 0x1c1d1e1f)
    *     ]);
    *
    *     var wordArray = CryptoJS.x64.WordArray.create([
    *         CryptoJS.x64.Word.create(0x00010203, 0x04050607),
    *         CryptoJS.x64.Word.create(0x18191a1b, 0x1c1d1e1f)
    *     ], 10);
    */
  val WordArray: `3` = js.native
}
object Typeofx64 {
  
  @scala.inline
  def apply(Word: `2`, WordArray: `3`): Typeofx64 = {
    val __obj = js.Dynamic.literal(Word = Word.asInstanceOf[js.Any], WordArray = WordArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofx64]
  }
  
  @scala.inline
  implicit class Typeofx64Ops[Self <: Typeofx64] (val x: Self) extends AnyVal {
    
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
    def setWord(value: `2`): Self = this.set("Word", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordArray(value: `3`): Self = this.set("WordArray", value.asInstanceOf[js.Any])
  }
}
