package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  def redis_cmd(srv: java.lang.String, rcmd: java.lang.String, sres: java.lang.String): scala.Double
  def redis_cmd_p1(srv: java.lang.String, rcmd: java.lang.String, p1: java.lang.String, sres: java.lang.String): scala.Double
  def redis_cmd_p2(
    srv: java.lang.String,
    rcmd: java.lang.String,
    p1: java.lang.String,
    p2: java.lang.String,
    sres: java.lang.String
  ): scala.Double
  def redis_cmd_p3(
    srv: java.lang.String,
    rcmd: java.lang.String,
    p1: java.lang.String,
    p2: java.lang.String,
    p3: java.lang.String,
    sres: java.lang.String
  ): scala.Double
  def redis_free(name: java.lang.String): scala.Double
}

object Anon_Name {
  @scala.inline
  def apply(
    redis_cmd: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    redis_cmd_p1: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    redis_cmd_p2: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    redis_cmd_p3: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    redis_free: java.lang.String => scala.Double
  ): Anon_Name = {
    val __obj = js.Dynamic.literal(redis_cmd = js.Any.fromFunction3(redis_cmd), redis_cmd_p1 = js.Any.fromFunction4(redis_cmd_p1), redis_cmd_p2 = js.Any.fromFunction5(redis_cmd_p2), redis_cmd_p3 = js.Any.fromFunction6(redis_cmd_p3), redis_free = js.Any.fromFunction1(redis_free))
  
    __obj.asInstanceOf[Anon_Name]
  }
}

