package typings.jsonld.mod.Options

import typings.jsonld.mod.MimeNQuad
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
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (rdfParser != null) __obj.updateDynamic("rdfParser")(rdfParser.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeTypes)) __obj.updateDynamic("useNativeTypes")(useNativeTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(useRdfType)) __obj.updateDynamic("useRdfType")(useRdfType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromRdf]
  }
}

