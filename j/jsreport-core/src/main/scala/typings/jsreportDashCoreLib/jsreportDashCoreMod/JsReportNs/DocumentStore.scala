package typings
package jsreportDashCoreLib.jsreportDashCoreMod.JsReportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentStore extends js.Object {
  def collection(name: java.lang.String): Collection
}

object DocumentStore {
  @scala.inline
  def apply(collection: java.lang.String => Collection): DocumentStore = {
    val __obj = js.Dynamic.literal(collection = js.Any.fromFunction1(collection))
  
    __obj.asInstanceOf[DocumentStore]
  }
}

