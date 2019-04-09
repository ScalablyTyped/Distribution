package typings
package jsonldLib.jsonldDashSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteDocument extends js.Object {
  var contextUrl: js.UndefOr[Url] = js.undefined
  var document: JsonLd
  var documentUrl: Url
}

object RemoteDocument {
  @scala.inline
  def apply(document: JsonLd, documentUrl: Url, contextUrl: Url = null): RemoteDocument = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], documentUrl = documentUrl)
    if (contextUrl != null) __obj.updateDynamic("contextUrl")(contextUrl)
    __obj.asInstanceOf[RemoteDocument]
  }
}

