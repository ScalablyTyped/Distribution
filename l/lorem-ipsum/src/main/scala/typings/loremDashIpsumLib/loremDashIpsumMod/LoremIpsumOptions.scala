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

