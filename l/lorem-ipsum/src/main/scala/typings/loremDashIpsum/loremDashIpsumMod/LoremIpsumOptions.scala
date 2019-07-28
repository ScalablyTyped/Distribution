package typings.loremDashIpsum.loremDashIpsumMod

import typings.loremDashIpsum.loremDashIpsumStrings.html
import typings.loremDashIpsum.loremDashIpsumStrings.paragraphs
import typings.loremDashIpsum.loremDashIpsumStrings.plain
import typings.loremDashIpsum.loremDashIpsumStrings.sentences
import typings.loremDashIpsum.loremDashIpsumStrings.words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoremIpsumOptions extends js.Object {
  /**
    * Number of words, sentences, or paragraphs to generate.
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * Plain text or html.
    */
  var format: js.UndefOr[plain | html] = js.undefined
  /**
    * Minimum sentences per paragraph.
    */
  var paragraphLowerBound: js.UndefOr[Double] = js.undefined
  /**
    * Maximum sentences per paragraph.
    */
  var paragraphUpperBound: js.UndefOr[Double] = js.undefined
  /**
    * A PRNG function. Uses Math.random by default.
    */
  var random: js.UndefOr[js.Function0[Double]] = js.undefined
  /**
    * Minimum words per sentence.
    */
  var sentenceLowerBound: js.UndefOr[Double] = js.undefined
  /**
    * Maximum words per sentence.
    */
  var sentenceUpperBound: js.UndefOr[Double] = js.undefined
  /**
    * The character to insert between paragraphs. Defaults to default EOL.
    */
  var suffix: js.UndefOr[String] = js.undefined
  /**
    * Generate words, sentences, or paragraphs.
    */
  var units: js.UndefOr[words | sentences | paragraphs] = js.undefined
  /**
    * Custom word dictionary.
    */
  var words: js.UndefOr[js.Array[String]] = js.undefined
}

object LoremIpsumOptions {
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
    units: words | sentences | paragraphs = null,
    words: js.Array[String] = null
  ): LoremIpsumOptions = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (paragraphLowerBound != null) __obj.updateDynamic("paragraphLowerBound")(paragraphLowerBound.asInstanceOf[js.Any])
    if (paragraphUpperBound != null) __obj.updateDynamic("paragraphUpperBound")(paragraphUpperBound.asInstanceOf[js.Any])
    if (random != null) __obj.updateDynamic("random")(js.Any.fromFunction0(random))
    if (sentenceLowerBound != null) __obj.updateDynamic("sentenceLowerBound")(sentenceLowerBound.asInstanceOf[js.Any])
    if (sentenceUpperBound != null) __obj.updateDynamic("sentenceUpperBound")(sentenceUpperBound.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[LoremIpsumOptions]
  }
}

