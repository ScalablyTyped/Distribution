package typings.markdownTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * One style for all columns (`string`), or styles for their respective columns (`string[]`).
    * Each style is either `'l'` (left), `'r'` (right), or `'c'` (center).
    * Other values are treated as `''`, which doesn't place the colon in the alignment row but does align left.
    * Only the lowercased first character is used, so `'Right'` is fine.
    */
  var align: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Whether to align the delimiters.
    *
    * By default, they are aligned:
    * ```
    * | Alpha | B     |
    * | ----- | ----- |
    * | C     | Delta |
    * ```
    *
    * Pass `false` to make them staggered:
    * ```
    * | Alpha | B |
    * | - | - |
    * | C | Delta |
    * ```
    *
    * @default true
    */
  var alignDelimiters: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to end each row with the delimiter.
    * Note: please don't use this: it could create fragile structures that aren't understandable to some Markdown parsers.
    *
    * When `true`, there are ending delimiters:
    * ```
    * | Alpha | B     |
    * | ----- | ----- |
    * | C     | Delta |
    * ```
    *
    * When `false`, there are no ending delimiters:
    * ```
    * | Alpha | B
    * | ----- | -----
    * | C     | Delta
    * ```
    *
    * @default true
    */
  var delimiterEnd: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to begin each row with the delimiter.
    * Note: please don't use this: it could create fragile structures that aren't understandable to some Markdown parsers.
    *
    * When `true`, there are starting delimiters:
    * ```
    * | Alpha | B     |
    * | ----- | ----- |
    * | C     | Delta |
    * ```
    *
    * When `false`, there are no starting delimiters:
    * ```
    * Alpha | B     |
    * ----- | ----- |
    * C     | Delta |
    * ```
    *
    * @default true
    */
  var delimiterStart: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to add a space of padding between delimiters and cells.
    *
    * When `true`, there is padding:
    * ```
    * | Alpha | B     |
    * | ----- | ----- |
    * | C     | Delta |
    * ```
    *
    * When `false`, there is no padding:
    * ```
    * |Alpha|B    |
    * |-----|-----|
    * |C    |Delta|
    * ```
    *
    * @default true
    */
  var padding: js.UndefOr[Boolean] = js.undefined
  /**
    * Method to detect the length of a cell.
    *
    * Full-width characters and ANSI-sequences all mess up delimiter alignment when viewing the Markdown source.
    * To fix this, you have to pass in a `stringLength` option to detect the “visible” length of a cell
    * (note that what is and isn’t visible depends on your editor).
    *
    * Without such a function, the following:
    * ```
    * table([
    *   ['Alpha', 'Bravo'],
    *   ['中文', 'Charlie'],
    *   ['👩‍❤️‍👩', 'Delta']
    * ])
    * ```
    * Yields:
    * ```
    * | Alpha | Bravo |
    * | - | - |
    * | 中文 | Charlie |
    * | 👩‍❤️‍👩 | Delta |
    * ```
    *
    * With [`string-width`]{@link https://github.com/sindresorhus/string-width}:
    * ```
    * import width from 'string-width'
    *
    * table(
    *   [
    *     ['Alpha', 'Bravo'],
    *     ['中文', 'Charlie'],
    *     ['👩‍❤️‍👩', 'Delta']
    *   ],
    *   {stringLength: width}
    * )
    * ```
    * Yields:
    * ```
    * | Alpha | Bravo   |
    * | ----- | ------- |
    * | 中文  | Charlie |
    * | 👩‍❤️‍👩    | Delta   |
    * ```
    * @default s => s.length
    */
  var stringLength: js.UndefOr[js.Function1[/* s */ String, Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    align: String | js.Array[String] = null,
    alignDelimiters: js.UndefOr[Boolean] = js.undefined,
    delimiterEnd: js.UndefOr[Boolean] = js.undefined,
    delimiterStart: js.UndefOr[Boolean] = js.undefined,
    padding: js.UndefOr[Boolean] = js.undefined,
    stringLength: /* s */ String => Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(alignDelimiters)) __obj.updateDynamic("alignDelimiters")(alignDelimiters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delimiterEnd)) __obj.updateDynamic("delimiterEnd")(delimiterEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delimiterStart)) __obj.updateDynamic("delimiterStart")(delimiterStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (stringLength != null) __obj.updateDynamic("stringLength")(js.Any.fromFunction1(stringLength))
    __obj.asInstanceOf[Options]
  }
}

