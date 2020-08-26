package typings.loremIpsum.mod

import typings.loremIpsum.generatorMod.IPrng
import typings.loremIpsum.loremIpsumStrings.html
import typings.loremIpsum.loremIpsumStrings.paragraph
import typings.loremIpsum.loremIpsumStrings.paragraphs
import typings.loremIpsum.loremIpsumStrings.plain
import typings.loremIpsum.loremIpsumStrings.sentence
import typings.loremIpsum.loremIpsumStrings.sentences
import typings.loremIpsum.loremIpsumStrings.word
import typings.loremIpsum.loremIpsumStrings.words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoremIpsumParams extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var format: js.UndefOr[plain | html] = js.native
  var paragraphLowerBound: js.UndefOr[Double] = js.native
  var paragraphUpperBound: js.UndefOr[Double] = js.native
  var random: js.UndefOr[IPrng] = js.native
  var sentenceLowerBound: js.UndefOr[Double] = js.native
  var sentenceUpperBound: js.UndefOr[Double] = js.native
  var suffix: js.UndefOr[String] = js.native
  var units: js.UndefOr[words | word | sentences | sentence | paragraphs | paragraph] = js.native
  var words: js.UndefOr[js.Array[String]] = js.native
}

object ILoremIpsumParams {
  @scala.inline
  def apply(): ILoremIpsumParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoremIpsumParams]
  }
  @scala.inline
  implicit class ILoremIpsumParamsOps[Self <: ILoremIpsumParams] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setFormat(value: plain | html): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setParagraphLowerBound(value: Double): Self = this.set("paragraphLowerBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraphLowerBound: Self = this.set("paragraphLowerBound", js.undefined)
    @scala.inline
    def setParagraphUpperBound(value: Double): Self = this.set("paragraphUpperBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraphUpperBound: Self = this.set("paragraphUpperBound", js.undefined)
    @scala.inline
    def setRandom(value: () => Double): Self = this.set("random", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
    @scala.inline
    def setSentenceLowerBound(value: Double): Self = this.set("sentenceLowerBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentenceLowerBound: Self = this.set("sentenceLowerBound", js.undefined)
    @scala.inline
    def setSentenceUpperBound(value: Double): Self = this.set("sentenceUpperBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentenceUpperBound: Self = this.set("sentenceUpperBound", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setUnits(value: words | word | sentences | sentence | paragraphs | paragraph): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
    @scala.inline
    def setWordsVarargs(value: String*): Self = this.set("words", js.Array(value :_*))
    @scala.inline
    def setWords(value: js.Array[String]): Self = this.set("words", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
  
}

