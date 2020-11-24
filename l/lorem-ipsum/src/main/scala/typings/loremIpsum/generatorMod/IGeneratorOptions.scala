package typings.loremIpsum.generatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeneratorOptions extends js.Object {
  
  var random: js.UndefOr[IPrng] = js.native
  
  var seed: js.UndefOr[String] = js.native
  
  var sentencesPerParagraph: js.UndefOr[IBounds] = js.native
  
  var words: js.UndefOr[js.Array[String]] = js.native
  
  var wordsPerSentence: js.UndefOr[IBounds] = js.native
}
object IGeneratorOptions {
  
  @scala.inline
  def apply(): IGeneratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeneratorOptions]
  }
  
  @scala.inline
  implicit class IGeneratorOptionsOps[Self <: IGeneratorOptions] (val x: Self) extends AnyVal {
    
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
    def setRandom(value: () => Double): Self = this.set("random", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
    
    @scala.inline
    def setSeed(value: String): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    
    @scala.inline
    def setSentencesPerParagraph(value: IBounds): Self = this.set("sentencesPerParagraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentencesPerParagraph: Self = this.set("sentencesPerParagraph", js.undefined)
    
    @scala.inline
    def setWordsVarargs(value: String*): Self = this.set("words", js.Array(value :_*))
    
    @scala.inline
    def setWords(value: js.Array[String]): Self = this.set("words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
    
    @scala.inline
    def setWordsPerSentence(value: IBounds): Self = this.set("wordsPerSentence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordsPerSentence: Self = this.set("wordsPerSentence", js.undefined)
  }
}
