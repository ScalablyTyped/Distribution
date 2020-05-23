package typings.ibmDb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var params: js.Array[_]
  var sql: String
}

object Params {
  @scala.inline
  def apply(params: js.Array[_], sql: String): Params = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

