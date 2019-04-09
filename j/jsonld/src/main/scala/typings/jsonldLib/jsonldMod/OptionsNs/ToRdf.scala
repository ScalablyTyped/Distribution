package typings
package jsonldLib.jsonldMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToRdf extends Common {
  var format: js.UndefOr[jsonldLib.MimeNQuad] = js.undefined
  var produceGeneralizedRdf: js.UndefOr[scala.Boolean] = js.undefined
  var skipExpansion: js.UndefOr[scala.Boolean] = js.undefined
}

object ToRdf {
  @scala.inline
  def apply(
    base: java.lang.String = null,
    documentLoader: (/* url */ jsonldLib.jsonldDashSpecMod.Url, /* callback */ js.Function2[
      /* err */ stdLib.Error, 
      /* remoteDoc */ jsonldLib.jsonldDashSpecMod.RemoteDocument, 
      scala.Unit
    ]) => js.Promise[jsonldLib.jsonldDashSpecMod.RemoteDocument] = null,
    expandContext: jsonldLib.jsonldDashSpecMod.Context = null,
    format: jsonldLib.MimeNQuad = null,
    produceGeneralizedRdf: js.UndefOr[scala.Boolean] = js.undefined,
    skipExpansion: js.UndefOr[scala.Boolean] = js.undefined
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

