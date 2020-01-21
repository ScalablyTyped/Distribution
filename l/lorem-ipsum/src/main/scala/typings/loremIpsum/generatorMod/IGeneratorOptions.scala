package typings.loremIpsum.generatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeneratorOptions extends js.Object {
  var random: js.UndefOr[IPrng] = js.undefined
  var seed: js.UndefOr[String] = js.undefined
  var sentencesPerParagraph: js.UndefOr[IBounds] = js.undefined
  var words: js.UndefOr[js.Array[String]] = js.undefined
  var wordsPerSentence: js.UndefOr[IBounds] = js.undefined
}

object IGeneratorOptions {
  @scala.inline
  def apply(
    random: () => Double = null,
    seed: String = null,
    sentencesPerParagraph: IBounds = null,
    words: js.Array[String] = null,
    wordsPerSentence: IBounds = null
  ): IGeneratorOptions = {
    val __obj = js.Dynamic.literal()
    if (random != null) __obj.updateDynamic("random")(js.Any.fromFunction0(random))
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (sentencesPerParagraph != null) __obj.updateDynamic("sentencesPerParagraph")(sentencesPerParagraph.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    if (wordsPerSentence != null) __obj.updateDynamic("wordsPerSentence")(wordsPerSentence.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeneratorOptions]
  }
}

