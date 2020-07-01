package typings.itunesconnectanalytics.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestTask extends js.Object {
  var query: String
  def completed(error: Error, body: String): Unit
}

object RequestTask {
  @scala.inline
  def apply(completed: (Error, String) => Unit, query: String): RequestTask = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2(completed), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTask]
  }
}

