package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofndbMongodb extends js.Object {
  def exec(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double
  def exec_simple(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double
  def find(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double
  def find_one(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double
  def free_reply(name: String): Double
  def next_reply(name: String): Double
}

object TypeofndbMongodb {
  @scala.inline
  def apply(
    exec: (String, String, String, String, String) => Double,
    exec_simple: (String, String, String, String, String) => Double,
    find: (String, String, String, String, String) => Double,
    find_one: (String, String, String, String, String) => Double,
    free_reply: String => Double,
    next_reply: String => Double
  ): TypeofndbMongodb = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction5(exec), exec_simple = js.Any.fromFunction5(exec_simple), find = js.Any.fromFunction5(find), find_one = js.Any.fromFunction5(find_one), free_reply = js.Any.fromFunction1(free_reply), next_reply = js.Any.fromFunction1(next_reply))
    __obj.asInstanceOf[TypeofndbMongodb]
  }
}

