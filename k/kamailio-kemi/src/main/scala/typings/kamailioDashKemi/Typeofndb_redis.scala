package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofndb_redis extends js.Object {
  def redis_cmd(srv: String, rcmd: String, sres: String): Double
  def redis_cmd_p1(srv: String, rcmd: String, p1: String, sres: String): Double
  def redis_cmd_p2(srv: String, rcmd: String, p1: String, p2: String, sres: String): Double
  def redis_cmd_p3(srv: String, rcmd: String, p1: String, p2: String, p3: String, sres: String): Double
  def redis_free(name: String): Double
}

object Typeofndb_redis {
  @scala.inline
  def apply(
    redis_cmd: (String, String, String) => Double,
    redis_cmd_p1: (String, String, String, String) => Double,
    redis_cmd_p2: (String, String, String, String, String) => Double,
    redis_cmd_p3: (String, String, String, String, String, String) => Double,
    redis_free: String => Double
  ): Typeofndb_redis = {
    val __obj = js.Dynamic.literal(redis_cmd = js.Any.fromFunction3(redis_cmd), redis_cmd_p1 = js.Any.fromFunction4(redis_cmd_p1), redis_cmd_p2 = js.Any.fromFunction5(redis_cmd_p2), redis_cmd_p3 = js.Any.fromFunction6(redis_cmd_p3), redis_free = js.Any.fromFunction1(redis_free))
  
    __obj.asInstanceOf[Typeofndb_redis]
  }
}

