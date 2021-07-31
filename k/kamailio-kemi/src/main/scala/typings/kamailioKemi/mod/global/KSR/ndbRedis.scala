package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ndbRedis {
  
  @JSGlobal("KSR.ndb_redis")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def redisCmd(srv: String, rcmd: String, sres: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("redis_cmd")(srv.asInstanceOf[js.Any], rcmd.asInstanceOf[js.Any], sres.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def redisCmdP1(srv: String, rcmd: String, p1: String, sres: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("redis_cmd_p1")(srv.asInstanceOf[js.Any], rcmd.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], sres.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def redisCmdP2(srv: String, rcmd: String, p1: String, p2: String, sres: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("redis_cmd_p2")(srv.asInstanceOf[js.Any], rcmd.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], sres.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def redisCmdP3(srv: String, rcmd: String, p1: String, p2: String, p3: String, sres: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("redis_cmd_p3")(srv.asInstanceOf[js.Any], rcmd.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], sres.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def redisFree(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("redis_free")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
}
