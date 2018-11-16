package typings
package jsDashSearchLib.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-search", "UnorderedSearchIndex")
@js.native
class UnorderedSearchIndex () extends ISearchIndex {
  /* CompleteClass */
  override def indexDocument(token: java.lang.String, uid: java.lang.String, document: js.Object): scala.Unit = js.native
  /* CompleteClass */
  override def search(tokens: js.Array[java.lang.String], corpus: js.Array[js.Object]): js.Array[js.Object] = js.native
}

