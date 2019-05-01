package typings
package jsonldLib.jsonldMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Normalize extends Common {
  var algorithm: js.UndefOr[jsonldLib.jsonldLibStrings.URDNA2015 | jsonldLib.jsonldLibStrings.URGNA2012] = js.undefined
  var expansion: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[jsonldLib.jsonldMod.MimeNQuad] = js.undefined
  var inputFormat: js.UndefOr[jsonldLib.jsonldMod.MimeNQuad] = js.undefined
  var skipExpansion: js.UndefOr[scala.Boolean] = js.undefined
  var useNative: js.UndefOr[scala.Boolean] = js.undefined
}

object Normalize {
  @scala.inline
  def apply(
    algorithm: jsonldLib.jsonldLibStrings.URDNA2015 | jsonldLib.jsonldLibStrings.URGNA2012 = null,
    base: java.lang.String = null,
    documentLoader: (/* url */ jsonldLib.jsonldDashSpecMod.Url, /* callback */ js.Function2[
      /* err */ stdLib.Error, 
      /* remoteDoc */ jsonldLib.jsonldDashSpecMod.RemoteDocument, 
      scala.Unit
    ]) => js.Promise[jsonldLib.jsonldDashSpecMod.RemoteDocument] = null,
    expandContext: jsonldLib.jsonldDashSpecMod.Context = null,
    expansion: js.UndefOr[scala.Boolean] = js.undefined,
    format: jsonldLib.jsonldMod.MimeNQuad = null,
    inputFormat: jsonldLib.jsonldMod.MimeNQuad = null,
    skipExpansion: js.UndefOr[scala.Boolean] = js.undefined,
    useNative: js.UndefOr[scala.Boolean] = js.undefined
  ): Normalize = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base)
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2(documentLoader))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    if (!js.isUndefined(expansion)) __obj.updateDynamic("expansion")(expansion)
    if (format != null) __obj.updateDynamic("format")(format)
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat)
    if (!js.isUndefined(skipExpansion)) __obj.updateDynamic("skipExpansion")(skipExpansion)
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative)
    __obj.asInstanceOf[Normalize]
  }
}

