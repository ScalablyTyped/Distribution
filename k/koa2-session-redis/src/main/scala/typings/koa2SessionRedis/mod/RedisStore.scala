package typings.koa2SessionRedis.mod

import typings.koa2SessionRedis.AnonExpire
import typings.koa2SessionRedis.koa2SessionRedisStrings.session
import typings.koaSession.mod.Session
import typings.koaSession.mod.stores
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisStore extends stores {
  /**
    * get session object by key
    */
  def get(key: String): js.Any = js.native
  /**
    * sends the quit command to the redis server and ends cleanly right after all running commands were properly handled
    */
  def quit(): Unit = js.native
  def set(key: String, sess: Partial[Session] with AnonExpire): js.Any = js.native
  /**
    * set session object for key, with a maxAge (in ms)
    */
  def set(key: String, sess: Partial[Session] with AnonExpire, maxAge: Double): js.Any = js.native
  @JSName("set")
  def set_session(key: String, sess: Partial[Session] with AnonExpire, maxAge: session): js.Any = js.native
}

