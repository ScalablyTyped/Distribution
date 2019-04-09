package typings
package jsonldLib.jsonldMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expand
  extends Common
     with ExpMap {
  var keepFreeFloatingNodes: js.UndefOr[scala.Boolean] = js.undefined
}

object Expand {
  @scala.inline
  def apply(
    base: java.lang.String = null,
    documentLoader: (/* url */ jsonldLib.jsonldDashSpecMod.Url, /* callback */ js.Function2[
      /* err */ stdLib.Error, 
      /* remoteDoc */ jsonldLib.jsonldDashSpecMod.RemoteDocument, 
      scala.Unit
    ]) => js.Promise[jsonldLib.jsonldDashSpecMod.RemoteDocument] = null,
    expandContext: jsonldLib.jsonldDashSpecMod.Context = null,
    expansionMap: /* info */ js.Any => _ = null,
    keepFreeFloatingNodes: js.UndefOr[scala.Boolean] = js.undefined
  ): Expand = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2(documentLoader))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    if (expansionMap != null) __obj.updateDynamic("expansionMap")(js.Any.fromFunction1(expansionMap))
    if (!js.isUndefined(keepFreeFloatingNodes)) __obj.updateDynamic("keepFreeFloatingNodes")(keepFreeFloatingNodes)
    __obj.asInstanceOf[Expand]
  }
}

