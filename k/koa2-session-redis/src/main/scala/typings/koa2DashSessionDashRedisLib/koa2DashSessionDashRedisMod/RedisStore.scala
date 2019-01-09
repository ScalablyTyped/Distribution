package typings
package koa2DashSessionDashRedisLib.koa2DashSessionDashRedisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisStore
  extends koaDashSessionLib.koaDashSessionMod.sessionNs.stores {
  /**
    * get session object by key
    */
  def get(key: java.lang.String): js.Any = js.native
  /**
    * sends the quit command to the redis server and ends cleanly right after all running commands were properly handled
    */
  def quit(): scala.Unit = js.native
  def set(
    key: java.lang.String,
    sess: stdLib.Partial[koaDashSessionLib.koaDashSessionMod.sessionNs.Session] with koa2DashSessionDashRedisLib.Anon_Expire
  ): js.Any = js.native
  /**
    * set session object for key, with a maxAge (in ms)
    */
  def set(
    key: java.lang.String,
    sess: stdLib.Partial[koaDashSessionLib.koaDashSessionMod.sessionNs.Session] with koa2DashSessionDashRedisLib.Anon_Expire,
    maxAge: scala.Double
  ): js.Any = js.native
  @JSName("set")
  def set_session(
    key: java.lang.String,
    sess: stdLib.Partial[koaDashSessionLib.koaDashSessionMod.sessionNs.Session] with koa2DashSessionDashRedisLib.Anon_Expire,
    maxAge: koa2DashSessionDashRedisLib.koa2DashSessionDashRedisLibStrings.session
  ): js.Any = js.native
}

