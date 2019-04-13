package typings
package jsontoxmlLib.jsontoxmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonToXmlOptions extends js.Object {
  var docType: js.UndefOr[java.lang.String] = js.undefined
  var escape: js.UndefOr[scala.Boolean] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var indent: js.UndefOr[java.lang.String] = js.undefined
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  var removeIllegalNameCharacters: js.UndefOr[scala.Boolean] = js.undefined
  var xmlHeader: js.UndefOr[scala.Boolean | jsontoxmlLib.Anon_Standalone] = js.undefined
}

object JsonToXmlOptions {
  @scala.inline
  def apply(
    docType: java.lang.String = null,
    escape: js.UndefOr[scala.Boolean] = js.undefined,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    indent: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    removeIllegalNameCharacters: js.UndefOr[scala.Boolean] = js.undefined,
    xmlHeader: scala.Boolean | jsontoxmlLib.Anon_Standalone = null
  ): JsonToXmlOptions = {
    val __obj = js.Dynamic.literal()
    if (docType != null) __obj.updateDynamic("docType")(docType)
    if (!js.isUndefined(escape)) __obj.updateDynamic("escape")(escape)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (!js.isUndefined(removeIllegalNameCharacters)) __obj.updateDynamic("removeIllegalNameCharacters")(removeIllegalNameCharacters)
    if (xmlHeader != null) __obj.updateDynamic("xmlHeader")(xmlHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonToXmlOptions]
  }
}

