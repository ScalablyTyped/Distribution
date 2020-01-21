package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of the find/replace.
  */
@js.native
trait SchemaFindReplaceResponse extends js.Object {
  /**
    * The number of formula cells changed.
    */
  var formulasChanged: js.UndefOr[Double] = js.native
  /**
    * The number of occurrences (possibly multiple within a cell) changed. For
    * example, if replacing `&quot;e&quot;` with `&quot;o&quot;` in
    * `&quot;Google Sheets&quot;`, this would be `&quot;3&quot;` because
    * `&quot;Google Sheets&quot;` -&gt; `&quot;Googlo Shoots&quot;`.
    */
  var occurrencesChanged: js.UndefOr[Double] = js.native
  /**
    * The number of rows changed.
    */
  var rowsChanged: js.UndefOr[Double] = js.native
  /**
    * The number of sheets changed.
    */
  var sheetsChanged: js.UndefOr[Double] = js.native
  /**
    * The number of non-formula cells changed.
    */
  var valuesChanged: js.UndefOr[Double] = js.native
}

object SchemaFindReplaceResponse {
  @scala.inline
  def apply(
    formulasChanged: Int | Double = null,
    occurrencesChanged: Int | Double = null,
    rowsChanged: Int | Double = null,
    sheetsChanged: Int | Double = null,
    valuesChanged: Int | Double = null
  ): SchemaFindReplaceResponse = {
    val __obj = js.Dynamic.literal()
    if (formulasChanged != null) __obj.updateDynamic("formulasChanged")(formulasChanged.asInstanceOf[js.Any])
    if (occurrencesChanged != null) __obj.updateDynamic("occurrencesChanged")(occurrencesChanged.asInstanceOf[js.Any])
    if (rowsChanged != null) __obj.updateDynamic("rowsChanged")(rowsChanged.asInstanceOf[js.Any])
    if (sheetsChanged != null) __obj.updateDynamic("sheetsChanged")(sheetsChanged.asInstanceOf[js.Any])
    if (valuesChanged != null) __obj.updateDynamic("valuesChanged")(valuesChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFindReplaceResponse]
  }
}

