package typings
package markDotJsLib.markDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mark extends js.Object {
  /**
       * highlight custom search terms.
       * @param keyword The keyword to be marked. Can also be an array with multiple keywords.
       * Note that keywords will be escaped. If you need to mark unescaped keywords (e.g. containing a pattern),
       * have a look at the `markRegExp()`
       * @param options Optional options
       */
  def mark(keyword: java.lang.String): scala.Unit = js.native
  /**
       * highlight custom search terms.
       * @param keyword The keyword to be marked. Can also be an array with multiple keywords.
       * Note that keywords will be escaped. If you need to mark unescaped keywords (e.g. containing a pattern),
       * have a look at the `markRegExp()`
       * @param options Optional options
       */
  def mark(keyword: java.lang.String, options: markDotJsLib.markDotJsMod.MarkNs.MarkOptions): scala.Unit = js.native
  /**
       * highlight custom search terms.
       * @param keyword The keyword to be marked. Can also be an array with multiple keywords.
       * Note that keywords will be escaped. If you need to mark unescaped keywords (e.g. containing a pattern),
       * have a look at the `markRegExp()`
       * @param options Optional options
       */
  def mark(keyword: js.Array[java.lang.String]): scala.Unit = js.native
  /**
       * highlight custom search terms.
       * @param keyword The keyword to be marked. Can also be an array with multiple keywords.
       * Note that keywords will be escaped. If you need to mark unescaped keywords (e.g. containing a pattern),
       * have a look at the `markRegExp()`
       * @param options Optional options
       */
  def mark(keyword: js.Array[java.lang.String], options: markDotJsLib.markDotJsMod.MarkNs.MarkOptions): scala.Unit = js.native
  /**
       * A method to mark ranges with a start position and length. They will be applied
       * to text nodes in the specified context.
       * @param ranges An array of objects with a start and length property.
       * Note that the start positions must be specified including whitespace characters.
       * @param options Optional options
       */
  def markRanges(ranges: js.Array[markDotJsLib.markDotJsMod.MarkNs.Range]): scala.Unit = js.native
  /**
       * A method to mark ranges with a start position and length. They will be applied
       * to text nodes in the specified context.
       * @param ranges An array of objects with a start and length property.
       * Note that the start positions must be specified including whitespace characters.
       * @param options Optional options
       */
  def markRanges(
    ranges: js.Array[markDotJsLib.markDotJsMod.MarkNs.Range],
    options: markDotJsLib.markDotJsMod.MarkNs.MarkOptions
  ): scala.Unit = js.native
  /**
       * highlight custom regular expressions.
       * @param regexp The regular expression to be marked. Example: /Lor[^]?m/gmi.
       * Note that groups will be ignored and mark.js will always find all matches, regardless of the g flag.
       * @param options Optional options
       */
  def markRegExp(regexp: stdLib.RegExp): scala.Unit = js.native
  /**
       * highlight custom regular expressions.
       * @param regexp The regular expression to be marked. Example: /Lor[^]?m/gmi.
       * Note that groups will be ignored and mark.js will always find all matches, regardless of the g flag.
       * @param options Optional options
       */
  def markRegExp(regexp: stdLib.RegExp, options: markDotJsLib.markDotJsMod.MarkNs.MarkOptions): scala.Unit = js.native
  /**
       * A method to remove highlights created by mark.js.
       * @param options Optional options
       */
  def unmark(): scala.Unit = js.native
  /**
       * A method to remove highlights created by mark.js.
       * @param options Optional options
       */
  def unmark(options: markDotJsLib.markDotJsMod.MarkNs.MarkOptions): scala.Unit = js.native
}

