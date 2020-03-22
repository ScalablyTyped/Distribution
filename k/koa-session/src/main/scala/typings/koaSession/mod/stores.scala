package typings.koaSession.mod

import typings.koaSession.AnonChanged
import typings.koaSession.AnonRolling
import typings.koaSession.PartialSessionexpirenumbe
import typings.koaSession.koaSessionStrings.session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait stores extends js.Object {
  /**
    * destroy session for key
    */
  def destroy(key: String): js.Any = js.native
  def get(key: String, maxAge: js.UndefOr[scala.Nothing], data: AnonRolling): js.Any = js.native
  /**
    * get session object by key
    */
  def get(key: String, maxAge: Double, data: AnonRolling): js.Any = js.native
  @JSName("get")
  def get_session(key: String, maxAge: session, data: AnonRolling): js.Any = js.native
  def set(key: String, sess: PartialSessionexpirenumbe, maxAge: js.UndefOr[scala.Nothing], data: AnonChanged): js.Any = js.native
  /**
    * set session object for key, with a maxAge (in ms)
    */
  def set(key: String, sess: PartialSessionexpirenumbe, maxAge: Double, data: AnonChanged): js.Any = js.native
  @JSName("set")
  def set_session(key: String, sess: PartialSessionexpirenumbe, maxAge: session, data: AnonChanged): js.Any = js.native
}

