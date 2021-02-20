package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ndbRedis {
  
  @JSGlobal("KSR.ndb_redis.redis_cmd")
  @js.native
  def redisCmd(srv: String, rcmd: String, sres: String): Double = js.native
  
  @JSGlobal("KSR.ndb_redis.redis_cmd_p1")
  @js.native
  def redisCmdP1(srv: String, rcmd: String, p1: String, sres: String): Double = js.native
  
  @JSGlobal("KSR.ndb_redis.redis_cmd_p2")
  @js.native
  def redisCmdP2(srv: String, rcmd: String, p1: String, p2: String, sres: String): Double = js.native
  
  @JSGlobal("KSR.ndb_redis.redis_cmd_p3")
  @js.native
  def redisCmdP3(srv: String, rcmd: String, p1: String, p2: String, p3: String, sres: String): Double = js.native
  
  @JSGlobal("KSR.ndb_redis.redis_free")
  @js.native
  def redisFree(name: String): Double = js.native
}
