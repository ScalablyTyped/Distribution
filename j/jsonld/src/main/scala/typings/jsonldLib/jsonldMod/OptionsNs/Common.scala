package typings
package jsonldLib.jsonldMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Common extends DocLoader {
  var base: js.UndefOr[java.lang.String] = js.undefined
  var expandContext: js.UndefOr[jsonldLib.jsonldDashSpecMod.Context] = js.undefined
}

object Common {
  @scala.inline
  def apply(
    base: java.lang.String = null,
    documentLoader: (/* url */ jsonldLib.jsonldDashSpecMod.Url, /* callback */ js.Function2[
      /* err */ stdLib.Error, 
      /* remoteDoc */ jsonldLib.jsonldDashSpecMod.RemoteDocument, 
      scala.Unit
    ]) => js.Promise[jsonldLib.jsonldDashSpecMod.RemoteDocument] = null,
    expandContext: jsonldLib.jsonldDashSpecMod.Context = null
  ): Common = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2(documentLoader))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Common]
  }
}

