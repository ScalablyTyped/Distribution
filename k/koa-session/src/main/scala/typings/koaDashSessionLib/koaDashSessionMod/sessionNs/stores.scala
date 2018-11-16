package typings
package koaDashSessionLib.koaDashSessionMod.sessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait stores extends js.Object {
  /**
           * destroy session for key
           */
  def destroy(key: java.lang.String): js.Any = js.native
  /**
           * get session object by key
           */
  def get(
    key: java.lang.String,
    maxAge: js.UndefOr[scala.Nothing],
    data: koaDashSessionLib.Anon_RollingBoolean
  ): js.Any = js.native
  /**
           * get session object by key
           */
  def get(key: java.lang.String, maxAge: scala.Double, data: koaDashSessionLib.Anon_RollingBoolean): js.Any = js.native
  /**
           * get session object by key
           */
  @JSName("get")
  def get_session(
    key: java.lang.String,
    maxAge: koaDashSessionLib.koaDashSessionLibStrings.session,
    data: koaDashSessionLib.Anon_RollingBoolean
  ): js.Any = js.native
  /**
           * set session object for key, with a maxAge (in ms)
           */
  def set(
    key: java.lang.String,
    sess: stdLib.Partial[Session] with koaDashSessionLib.Anon_MaxAge,
    maxAge: js.UndefOr[scala.Nothing],
    data: koaDashSessionLib.Anon_Rolling
  ): js.Any = js.native
  /**
           * set session object for key, with a maxAge (in ms)
           */
  def set(
    key: java.lang.String,
    sess: stdLib.Partial[Session] with koaDashSessionLib.Anon_MaxAge,
    maxAge: scala.Double,
    data: koaDashSessionLib.Anon_Rolling
  ): js.Any = js.native
  /**
           * set session object for key, with a maxAge (in ms)
           */
  @JSName("set")
  def set_session(
    key: java.lang.String,
    sess: stdLib.Partial[Session] with koaDashSessionLib.Anon_MaxAge,
    maxAge: koaDashSessionLib.koaDashSessionLibStrings.session,
    data: koaDashSessionLib.Anon_Rolling
  ): js.Any = js.native
}

