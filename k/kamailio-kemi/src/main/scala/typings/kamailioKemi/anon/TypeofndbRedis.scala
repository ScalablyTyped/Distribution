package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofndbRedis extends js.Object {
  def redis_cmd(srv: String, rcmd: String, sres: String): Double
  def redis_cmd_p1(srv: String, rcmd: String, p1: String, sres: String): Double
  def redis_cmd_p2(srv: String, rcmd: String, p1: String, p2: String, sres: String): Double
  def redis_cmd_p3(srv: String, rcmd: String, p1: String, p2: String, p3: String, sres: String): Double
  def redis_free(name: String): Double
}

object TypeofndbRedis {
  @scala.inline
  def apply(
    redis_cmd: (String, String, String) => Double,
    redis_cmd_p1: (String, String, String, String) => Double,
    redis_cmd_p2: (String, String, String, String, String) => Double,
    redis_cmd_p3: (String, String, String, String, String, String) => Double,
    redis_free: String => Double
  ): TypeofndbRedis = {
    val __obj = js.Dynamic.literal(redis_cmd = js.Any.fromFunction3(redis_cmd), redis_cmd_p1 = js.Any.fromFunction4(redis_cmd_p1), redis_cmd_p2 = js.Any.fromFunction5(redis_cmd_p2), redis_cmd_p3 = js.Any.fromFunction6(redis_cmd_p3), redis_free = js.Any.fromFunction1(redis_free))
    __obj.asInstanceOf[TypeofndbRedis]
  }
}

