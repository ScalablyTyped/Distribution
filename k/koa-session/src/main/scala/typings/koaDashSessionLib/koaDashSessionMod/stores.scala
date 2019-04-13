package typings
package koaDashSessionLib.koaDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait stores extends js.Object {
  /**
    * destroy session for key
    */
  def destroy(key: java.lang.String): js.Any = js.native
  def get(key: java.lang.String, maxAge: js.UndefOr[scala.Nothing], data: koaDashSessionLib.Anon_Rolling): js.Any = js.native
  /**
    * get session object by key
    */
  def get(key: java.lang.String, maxAge: scala.Double, data: koaDashSessionLib.Anon_Rolling): js.Any = js.native
  @JSName("get")
  def get_session(
    key: java.lang.String,
    maxAge: koaDashSessionLib.koaDashSessionLibStrings.session,
    data: koaDashSessionLib.Anon_Rolling
  ): js.Any = js.native
  def set(
    key: java.lang.String,
    sess: stdLib.Partial[Session] with koaDashSessionLib.Anon_Expire,
    maxAge: js.UndefOr[scala.Nothing],
    data: koaDashSessionLib.Anon_Changed
  ): js.Any = js.native
  /**
    * set session object for key, with a maxAge (in ms)
    */
  def set(
    key: java.lang.String,
    sess: stdLib.Partial[Session] with koaDashSessionLib.Anon_Expire,
    maxAge: scala.Double,
    data: koaDashSessionLib.Anon_Changed
  ): js.Any = js.native
  @JSName("set")
  def set_session(
    key: java.lang.String,
    sess: stdLib.Partial[Session] with koaDashSessionLib.Anon_Expire,
    maxAge: koaDashSessionLib.koaDashSessionLibStrings.session,
    data: koaDashSessionLib.Anon_Changed
  ): js.Any = js.native
}

