package typings
package jsonldLib.jsonldDashSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var base: js.UndefOr[DOMString | scala.Null] = js.undefined
  var compactArrays: js.UndefOr[scala.Boolean] = js.undefined
  var documentLoader: js.UndefOr[LoadDocumentCallback | scala.Null] = js.undefined
  var expandContext: js.UndefOr[Context | scala.Null] = js.undefined
  var processingMode: js.UndefOr[DOMString] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    base: DOMString = null,
    compactArrays: js.UndefOr[scala.Boolean] = js.undefined,
    documentLoader: LoadDocumentCallback = null,
    expandContext: Context = null,
    processingMode: DOMString = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (!js.isUndefined(compactArrays)) __obj.updateDynamic("compactArrays")(compactArrays)
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(documentLoader)
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    if (processingMode != null) __obj.updateDynamic("processingMode")(processingMode)
    __obj.asInstanceOf[Options]
  }
}

