package typings.jsonld.jsonldMod.Options

import typings.jsonld.jsonldDashSpecMod.Context
import typings.jsonld.jsonldDashSpecMod.RemoteDocument
import typings.jsonld.jsonldDashSpecMod.Url
import typings.jsonld.jsonldMod.MimeNQuad
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToRdf extends Common {
  var format: js.UndefOr[MimeNQuad] = js.undefined
  var produceGeneralizedRdf: js.UndefOr[Boolean] = js.undefined
  var skipExpansion: js.UndefOr[Boolean] = js.undefined
}

object ToRdf {
  @scala.inline
  def apply(
    base: String = null,
    documentLoader: (/* url */ Url, /* callback */ js.Function2[/* err */ Error, /* remoteDoc */ RemoteDocument, Unit]) => js.Promise[RemoteDocument] = null,
    expandContext: Context = null,
    format: MimeNQuad = null,
    produceGeneralizedRdf: js.UndefOr[Boolean] = js.undefined,
    skipExpansion: js.UndefOr[Boolean] = js.undefined
  ): ToRdf = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2(documentLoader))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(produceGeneralizedRdf)) __obj.updateDynamic("produceGeneralizedRdf")(produceGeneralizedRdf)
    if (!js.isUndefined(skipExpansion)) __obj.updateDynamic("skipExpansion")(skipExpansion)
    __obj.asInstanceOf[ToRdf]
  }
}

