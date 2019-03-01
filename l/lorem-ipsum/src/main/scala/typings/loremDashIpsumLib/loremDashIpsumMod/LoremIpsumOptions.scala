package typings
package loremDashIpsumLib.loremDashIpsumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoremIpsumOptions extends js.Object {
  /**
    * Number of words, sentences, or paragraphs to generate.
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    * Plain text or html.
    */
  var format: js.UndefOr[
    loremDashIpsumLib.loremDashIpsumLibStrings.plain | loremDashIpsumLib.loremDashIpsumLibStrings.html
  ] = js.undefined
  /**
    * Minimum sentences per paragraph.
    */
  var paragraphLowerBound: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum sentences per paragraph.
    */
  var paragraphUpperBound: js.UndefOr[scala.Double] = js.undefined
  /**
    * A PRNG function. Uses Math.random by default.
    */
  var random: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /**
    * Minimum words per sentence.
    */
  var sentenceLowerBound: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum words per sentence.
    */
  var sentenceUpperBound: js.UndefOr[scala.Double] = js.undefined
  /**
    * The character to insert between paragraphs. Defaults to default EOL.
    */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Generate words, sentences, or paragraphs.
    */
  var units: js.UndefOr[
    loremDashIpsumLib.loremDashIpsumLibStrings.words | loremDashIpsumLib.loremDashIpsumLibStrings.sentences | loremDashIpsumLib.loremDashIpsumLibStrings.paragraphs
  ] = js.undefined
  /**
    * Custom word dictionary.
    */
  var words: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object LoremIpsumOptions {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    format: loremDashIpsumLib.loremDashIpsumLibStrings.plain | loremDashIpsumLib.loremDashIpsumLibStrings.html = null,
    paragraphLowerBound: scala.Int | scala.Double = null,
    paragraphUpperBound: scala.Int | scala.Double = null,
    random: js.Function0[scala.Double] = null,
    sentenceLowerBound: scala.Int | scala.Double = null,
    sentenceUpperBound: scala.Int | scala.Double = null,
    suffix: java.lang.String = null,
    units: loremDashIpsumLib.loremDashIpsumLibStrings.words | loremDashIpsumLib.loremDashIpsumLibStrings.sentences | loremDashIpsumLib.loremDashIpsumLibStrings.paragraphs = null,
    words: js.Array[java.lang.String] = null
  ): LoremIpsumOptions = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (paragraphLowerBound != null) __obj.updateDynamic("paragraphLowerBound")(paragraphLowerBound.asInstanceOf[js.Any])
    if (paragraphUpperBound != null) __obj.updateDynamic("paragraphUpperBound")(paragraphUpperBound.asInstanceOf[js.Any])
    if (random != null) __obj.updateDynamic("random")(random)
    if (sentenceLowerBound != null) __obj.updateDynamic("sentenceLowerBound")(sentenceLowerBound.asInstanceOf[js.Any])
    if (sentenceUpperBound != null) __obj.updateDynamic("sentenceUpperBound")(sentenceUpperBound.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[LoremIpsumOptions]
  }
}

