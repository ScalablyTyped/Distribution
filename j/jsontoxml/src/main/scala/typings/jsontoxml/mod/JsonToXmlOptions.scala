package typings.jsontoxml.mod

import typings.jsontoxml.AnonStandalone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonToXmlOptions extends js.Object {
  var docType: js.UndefOr[String] = js.undefined
  var escape: js.UndefOr[Boolean] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var indent: js.UndefOr[String] = js.undefined
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  var removeIllegalNameCharacters: js.UndefOr[Boolean] = js.undefined
  var xmlHeader: js.UndefOr[Boolean | AnonStandalone] = js.undefined
}

object JsonToXmlOptions {
  @scala.inline
  def apply(
    docType: String = null,
    escape: js.UndefOr[Boolean] = js.undefined,
    html: js.UndefOr[Boolean] = js.undefined,
    indent: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    removeIllegalNameCharacters: js.UndefOr[Boolean] = js.undefined,
    xmlHeader: Boolean | AnonStandalone = null
  ): JsonToXmlOptions = {
    val __obj = js.Dynamic.literal()
    if (docType != null) __obj.updateDynamic("docType")(docType.asInstanceOf[js.Any])
    if (!js.isUndefined(escape)) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (!js.isUndefined(removeIllegalNameCharacters)) __obj.updateDynamic("removeIllegalNameCharacters")(removeIllegalNameCharacters.asInstanceOf[js.Any])
    if (xmlHeader != null) __obj.updateDynamic("xmlHeader")(xmlHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonToXmlOptions]
  }
}

