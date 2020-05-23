package typings.jsonld.jsonldSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var base: js.UndefOr[DOMString | Null] = js.undefined
  var compactArrays: js.UndefOr[Boolean] = js.undefined
  var documentLoader: js.UndefOr[LoadDocumentCallback | Null] = js.undefined
  var expandContext: js.UndefOr[Context | Null] = js.undefined
  var processingMode: js.UndefOr[DOMString] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    base: js.UndefOr[Null | DOMString] = js.undefined,
    compactArrays: js.UndefOr[Boolean] = js.undefined,
    documentLoader: js.UndefOr[Null | (/* url */ Url => js.Promise[RemoteDocument])] = js.undefined,
    expandContext: js.UndefOr[Null | Context] = js.undefined,
    processingMode: DOMString = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base)) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(compactArrays)) __obj.updateDynamic("compactArrays")(compactArrays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(documentLoader)) __obj.updateDynamic("documentLoader")(if (documentLoader != null) js.Any.fromFunction1(documentLoader.asInstanceOf[/* url */ Url => js.Promise[RemoteDocument]]) else null)
    if (!js.isUndefined(expandContext)) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    if (processingMode != null) __obj.updateDynamic("processingMode")(processingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

