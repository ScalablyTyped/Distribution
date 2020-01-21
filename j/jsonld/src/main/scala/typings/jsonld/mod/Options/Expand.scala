package typings.jsonld.mod.Options

import typings.jsonld.jsonldSpecMod.Context
import typings.jsonld.jsonldSpecMod.RemoteDocument
import typings.jsonld.jsonldSpecMod.Url
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expand
  extends Common
     with ExpMap {
  var keepFreeFloatingNodes: js.UndefOr[Boolean] = js.undefined
}

object Expand {
  @scala.inline
  def apply(
    base: String = null,
    documentLoader: (/* url */ Url, /* callback */ js.Function2[/* err */ Error, /* remoteDoc */ RemoteDocument, Unit]) => js.Promise[RemoteDocument] = null,
    expandContext: Context = null,
    expansionMap: /* info */ js.Any => _ = null,
    keepFreeFloatingNodes: js.UndefOr[Boolean] = js.undefined
  ): Expand = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2(documentLoader))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    if (expansionMap != null) __obj.updateDynamic("expansionMap")(js.Any.fromFunction1(expansionMap))
    if (!js.isUndefined(keepFreeFloatingNodes)) __obj.updateDynamic("keepFreeFloatingNodes")(keepFreeFloatingNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expand]
  }
}

