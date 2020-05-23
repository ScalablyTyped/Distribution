package typings.jsonld.mod.Options

import typings.jsonld.jsonldSpecMod.Context
import typings.jsonld.jsonldSpecMod.RemoteDocument
import typings.jsonld.jsonldSpecMod.Url
import typings.jsonld.jsonldStrings.URDNA2015
import typings.jsonld.jsonldStrings.URGNA2012
import typings.jsonld.mod.MimeNQuad
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Normalize extends Common {
  var algorithm: js.UndefOr[URDNA2015 | URGNA2012] = js.undefined
  var expansion: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[MimeNQuad] = js.undefined
  var inputFormat: js.UndefOr[MimeNQuad] = js.undefined
  var skipExpansion: js.UndefOr[Boolean] = js.undefined
  var useNative: js.UndefOr[Boolean] = js.undefined
}

object Normalize {
  @scala.inline
  def apply(
    algorithm: URDNA2015 | URGNA2012 = null,
    base: String = null,
    documentLoader: (/* url */ Url, /* callback */ js.Function2[/* err */ Error, /* remoteDoc */ RemoteDocument, Unit]) => js.Promise[RemoteDocument] = null,
    expandContext: Context = null,
    expansion: js.UndefOr[Boolean] = js.undefined,
    format: MimeNQuad = null,
    inputFormat: MimeNQuad = null,
    skipExpansion: js.UndefOr[Boolean] = js.undefined,
    useNative: js.UndefOr[Boolean] = js.undefined
  ): Normalize = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2(documentLoader))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    if (!js.isUndefined(expansion)) __obj.updateDynamic("expansion")(expansion.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(skipExpansion)) __obj.updateDynamic("skipExpansion")(skipExpansion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Normalize]
  }
}

