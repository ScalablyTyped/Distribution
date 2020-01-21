package typings.jsSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-search", "TfIdfSearchIndex")
@js.native
class TfIdfSearchIndex protected () extends ISearchIndex {
  def this(uidFieldName: String) = this()
  def this(uidFieldName: js.Array[String]) = this()
  /* CompleteClass */
  override def indexDocument(token: String, uid: String, document: js.Object): Unit = js.native
  /* CompleteClass */
  override def search(tokens: js.Array[String], corpus: js.Array[js.Object]): js.Array[js.Object] = js.native
}

