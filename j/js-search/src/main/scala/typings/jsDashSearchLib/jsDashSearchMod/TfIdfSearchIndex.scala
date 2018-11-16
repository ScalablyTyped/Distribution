package typings
package jsDashSearchLib.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-search", "TfIdfSearchIndex")
@js.native
class TfIdfSearchIndex protected () extends ISearchIndex {
  def this(uidFieldName: java.lang.String) = this()
  def this(uidFieldName: js.Array[java.lang.String]) = this()
  /* CompleteClass */
  override def indexDocument(token: java.lang.String, uid: java.lang.String, document: js.Object): scala.Unit = js.native
  /* CompleteClass */
  override def search(tokens: js.Array[java.lang.String], corpus: js.Array[js.Object]): js.Array[js.Object] = js.native
}

