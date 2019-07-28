package typings.jsDashSearch.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-search", "UnorderedSearchIndex")
@js.native
class UnorderedSearchIndex () extends ISearchIndex {
  /* CompleteClass */
  override def indexDocument(token: String, uid: String, document: js.Object): Unit = js.native
  /* CompleteClass */
  override def search(tokens: js.Array[String], corpus: js.Array[js.Object]): js.Array[js.Object] = js.native
}

