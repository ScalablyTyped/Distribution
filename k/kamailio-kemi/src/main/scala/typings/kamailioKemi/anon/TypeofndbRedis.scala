package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofndbRedis extends js.Object {
  def redis_cmd(srv: String, rcmd: String, sres: String): Double = js.native
  def redis_cmd_p1(srv: String, rcmd: String, p1: String, sres: String): Double = js.native
  def redis_cmd_p2(srv: String, rcmd: String, p1: String, p2: String, sres: String): Double = js.native
  def redis_cmd_p3(srv: String, rcmd: String, p1: String, p2: String, p3: String, sres: String): Double = js.native
  def redis_free(name: String): Double = js.native
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
  @scala.inline
  implicit class TypeofndbRedisOps[Self <: TypeofndbRedis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRedis_cmd(value: (String, String, String) => Double): Self = this.set("redis_cmd", js.Any.fromFunction3(value))
    @scala.inline
    def setRedis_cmd_p1(value: (String, String, String, String) => Double): Self = this.set("redis_cmd_p1", js.Any.fromFunction4(value))
    @scala.inline
    def setRedis_cmd_p2(value: (String, String, String, String, String) => Double): Self = this.set("redis_cmd_p2", js.Any.fromFunction5(value))
    @scala.inline
    def setRedis_cmd_p3(value: (String, String, String, String, String, String) => Double): Self = this.set("redis_cmd_p3", js.Any.fromFunction6(value))
    @scala.inline
    def setRedis_free(value: String => Double): Self = this.set("redis_free", js.Any.fromFunction1(value))
  }
  
}

