package typings.jsonld.mod.Options

import typings.jsonld.jsonldSpecMod.Context
import typings.jsonld.jsonldSpecMod.RemoteDocument
import typings.jsonld.jsonldSpecMod.Url
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Common extends DocLoader {
  var base: js.UndefOr[String] = js.undefined
  var expandContext: js.UndefOr[Context] = js.undefined
}

object Common {
  @scala.inline
  def apply(
    base: String = null,
    documentLoader: (/* url */ Url, /* callback */ js.Function2[/* err */ Error, /* remoteDoc */ RemoteDocument, Unit]) => js.Promise[RemoteDocument] = null,
    expandContext: Context = null
  ): Common = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2(documentLoader))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Common]
  }
}

