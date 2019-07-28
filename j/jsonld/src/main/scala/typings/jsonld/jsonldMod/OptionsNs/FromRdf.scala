package typings.jsonld.jsonldMod.OptionsNs

import typings.jsonld.jsonldMod.MimeNQuad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromRdf extends js.Object {
  var format: js.UndefOr[MimeNQuad] = js.undefined
  var rdfParser: js.UndefOr[js.Any] = js.undefined
  var useNativeTypes: js.UndefOr[Boolean] = js.undefined
  var useRdfType: js.UndefOr[Boolean] = js.undefined
}

object FromRdf {
  @scala.inline
  def apply(
    format: MimeNQuad = null,
    rdfParser: js.Any = null,
    useNativeTypes: js.UndefOr[Boolean] = js.undefined,
    useRdfType: js.UndefOr[Boolean] = js.undefined
  ): FromRdf = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (rdfParser != null) __obj.updateDynamic("rdfParser")(rdfParser)
    if (!js.isUndefined(useNativeTypes)) __obj.updateDynamic("useNativeTypes")(useNativeTypes)
    if (!js.isUndefined(useRdfType)) __obj.updateDynamic("useRdfType")(useRdfType)
    __obj.asInstanceOf[FromRdf]
  }
}

