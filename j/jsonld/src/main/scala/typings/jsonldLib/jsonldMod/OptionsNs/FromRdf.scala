package typings
package jsonldLib.jsonldMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromRdf extends js.Object {
  var format: js.UndefOr[jsonldLib.jsonldMod.MimeNQuad] = js.undefined
  var rdfParser: js.UndefOr[js.Any] = js.undefined
  var useNativeTypes: js.UndefOr[scala.Boolean] = js.undefined
  var useRdfType: js.UndefOr[scala.Boolean] = js.undefined
}

object FromRdf {
  @scala.inline
  def apply(
    format: jsonldLib.jsonldMod.MimeNQuad = null,
    rdfParser: js.Any = null,
    useNativeTypes: js.UndefOr[scala.Boolean] = js.undefined,
    useRdfType: js.UndefOr[scala.Boolean] = js.undefined
  ): FromRdf = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (rdfParser != null) __obj.updateDynamic("rdfParser")(rdfParser)
    if (!js.isUndefined(useNativeTypes)) __obj.updateDynamic("useNativeTypes")(useNativeTypes)
    if (!js.isUndefined(useRdfType)) __obj.updateDynamic("useRdfType")(useRdfType)
    __obj.asInstanceOf[FromRdf]
  }
}

