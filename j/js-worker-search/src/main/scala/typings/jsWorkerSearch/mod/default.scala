package typings.jsWorkerSearch.mod

import typings.jsWorkerSearch.AnonCaseSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-worker-search", JSImport.Default)
@js.native
class default () extends SearchApi {
  def this(someParam: AnonCaseSensitive) = this()
  /* CompleteClass */
  override def indexDocument(uid: String, text: String): Unit = js.native
  /* CompleteClass */
  override def search(query: String): js.Promise[js.Array[String]] = js.native
}

