package typings.ibmUnderscoreDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: js.Array[_]
  var sql: String
}

object Anon_Params {
  @scala.inline
  def apply(params: js.Array[_], sql: String): Anon_Params = {
    val __obj = js.Dynamic.literal(params = params, sql = sql)
  
    __obj.asInstanceOf[Anon_Params]
  }
}

