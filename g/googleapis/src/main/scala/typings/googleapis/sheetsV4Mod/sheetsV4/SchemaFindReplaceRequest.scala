package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Finds and replaces data in cells over a range, sheet, or all sheets.
  */
@js.native
trait SchemaFindReplaceRequest extends js.Object {
  /**
    * True to find/replace over all sheets.
    */
  var allSheets: js.UndefOr[Boolean] = js.native
  /**
    * The value to search.
    */
  var find: js.UndefOr[String] = js.native
  /**
    * True if the search should include cells with formulas. False to skip
    * cells with formulas.
    */
  var includeFormulas: js.UndefOr[Boolean] = js.native
  /**
    * True if the search is case sensitive.
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  /**
    * True if the find value should match the entire cell.
    */
  var matchEntireCell: js.UndefOr[Boolean] = js.native
  /**
    * The range to find/replace over.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The value to use as the replacement.
    */
  var replacement: js.UndefOr[String] = js.native
  /**
    * True if the find value is a regex. The regular expression and replacement
    * should follow Java regex rules at
    * https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html.
    * The replacement string is allowed to refer to capturing groups. For
    * example, if one cell has the contents `&quot;Google Sheets&quot;` and
    * another has `&quot;Google Docs&quot;`, then searching for `&quot;o.*
    * (.*)&quot;` with a replacement of `&quot;$1 Rocks&quot;` would change the
    * contents of the cells to `&quot;GSheets Rocks&quot;` and `&quot;GDocs
    * Rocks&quot;` respectively.
    */
  var searchByRegex: js.UndefOr[Boolean] = js.native
  /**
    * The sheet to find/replace over.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object SchemaFindReplaceRequest {
  @scala.inline
  def apply(
    allSheets: js.UndefOr[Boolean] = js.undefined,
    find: String = null,
    includeFormulas: js.UndefOr[Boolean] = js.undefined,
    matchCase: js.UndefOr[Boolean] = js.undefined,
    matchEntireCell: js.UndefOr[Boolean] = js.undefined,
    range: SchemaGridRange = null,
    replacement: String = null,
    searchByRegex: js.UndefOr[Boolean] = js.undefined,
    sheetId: js.UndefOr[Double] = js.undefined
  ): SchemaFindReplaceRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allSheets)) __obj.updateDynamic("allSheets")(allSheets.get.asInstanceOf[js.Any])
    if (find != null) __obj.updateDynamic("find")(find.asInstanceOf[js.Any])
    if (!js.isUndefined(includeFormulas)) __obj.updateDynamic("includeFormulas")(includeFormulas.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchEntireCell)) __obj.updateDynamic("matchEntireCell")(matchEntireCell.get.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (replacement != null) __obj.updateDynamic("replacement")(replacement.asInstanceOf[js.Any])
    if (!js.isUndefined(searchByRegex)) __obj.updateDynamic("searchByRegex")(searchByRegex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFindReplaceRequest]
  }
}

