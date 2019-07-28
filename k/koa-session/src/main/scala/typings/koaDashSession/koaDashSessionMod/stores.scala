package typings.koaDashSession.koaDashSessionMod

import typings.koaDashSession.Anon_Changed
import typings.koaDashSession.Anon_Expire
import typings.koaDashSession.Anon_Rolling
import typings.koaDashSession.koaDashSessionStrings.session
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait stores extends js.Object {
  /**
    * destroy session for key
    */
  def destroy(key: String): js.Any = js.native
  def get(key: String, maxAge: js.UndefOr[scala.Nothing], data: Anon_Rolling): js.Any = js.native
  /**
    * get session object by key
    */
  def get(key: String, maxAge: Double, data: Anon_Rolling): js.Any = js.native
  @JSName("get")
  def get_session(key: String, maxAge: session, data: Anon_Rolling): js.Any = js.native
  def set(
    key: String,
    sess: Partial[Session] with Anon_Expire,
    maxAge: js.UndefOr[scala.Nothing],
    data: Anon_Changed
  ): js.Any = js.native
  /**
    * set session object for key, with a maxAge (in ms)
    */
  def set(key: String, sess: Partial[Session] with Anon_Expire, maxAge: Double, data: Anon_Changed): js.Any = js.native
  @JSName("set")
  def set_session(key: String, sess: Partial[Session] with Anon_Expire, maxAge: session, data: Anon_Changed): js.Any = js.native
}

