package typings.loremDashIpsum.loremDashIpsumMod

import typings.loremDashIpsum.loremDashIpsumStrings.html
import typings.loremDashIpsum.loremDashIpsumStrings.paragraph
import typings.loremDashIpsum.loremDashIpsumStrings.paragraphs
import typings.loremDashIpsum.loremDashIpsumStrings.plain
import typings.loremDashIpsum.loremDashIpsumStrings.sentence
import typings.loremDashIpsum.loremDashIpsumStrings.sentences
import typings.loremDashIpsum.loremDashIpsumStrings.word
import typings.loremDashIpsum.loremDashIpsumStrings.words
import typings.loremDashIpsum.typesSrcLibGeneratorMod.IPrng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoremIpsumParams extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[plain | html] = js.undefined
  var paragraphLowerBound: js.UndefOr[Double] = js.undefined
  var paragraphUpperBound: js.UndefOr[Double] = js.undefined
  var random: js.UndefOr[IPrng] = js.undefined
  var sentenceLowerBound: js.UndefOr[Double] = js.undefined
  var sentenceUpperBound: js.UndefOr[Double] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var units: js.UndefOr[words | word | sentences | sentence | paragraphs | paragraph] = js.undefined
  var words: js.UndefOr[js.Array[String]] = js.undefined
}

object ILoremIpsumParams {
  @scala.inline
  def apply(
    count: Int | Double = null,
    format: plain | html = null,
    paragraphLowerBound: Int | Double = null,
    paragraphUpperBound: Int | Double = null,
    random: () => Double = null,
    sentenceLowerBound: Int | Double = null,
    sentenceUpperBound: Int | Double = null,
    suffix: String = null,
    units: words | word | sentences | sentence | paragraphs | paragraph = null,
    words: js.Array[String] = null
  ): ILoremIpsumParams = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (paragraphLowerBound != null) __obj.updateDynamic("paragraphLowerBound")(paragraphLowerBound.asInstanceOf[js.Any])
    if (paragraphUpperBound != null) __obj.updateDynamic("paragraphUpperBound")(paragraphUpperBound.asInstanceOf[js.Any])
    if (random != null) __obj.updateDynamic("random")(js.Any.fromFunction0(random))
    if (sentenceLowerBound != null) __obj.updateDynamic("sentenceLowerBound")(sentenceLowerBound.asInstanceOf[js.Any])
    if (sentenceUpperBound != null) __obj.updateDynamic("sentenceUpperBound")(sentenceUpperBound.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoremIpsumParams]
  }
}

