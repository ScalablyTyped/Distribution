package typings
package loopbackLib.loopbackMod.lNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `RoleMapping` model extends from the built in `loopback.Model` type.
  * @property {string} id Generated ID.
  * @property {string} name Name of the role.
  * @property {string} Description Text description.
  * @class RoleMapping
  * @inherits {PersistedModel}
  */
@js.native
trait RoleMapping extends PersistedModel {
  /** Description Text description. */
  var description: java.lang.String = js.native
  /** Generated ID. */
  var id: java.lang.String = js.native
  /** Name of the role. */
  var name: java.lang.String = js.native
  /**
    * Get the application principal
    * @callback {() => void} callback
    * @param {Error} err
    * @param {Application} application
    */
  def application(callback: js.Function2[/* err */ nodeLib.Error, /* application */ Application, scala.Unit]): scala.Unit = js.native
  /**
    * Get the child role principal
    * @callback {() => void} callback
    * @param {Error} err
    * @param {User} childUser
    */
  def childRole(callback: js.Function2[/* err */ nodeLib.Error, /* childUser */ User, scala.Unit]): scala.Unit = js.native
  /**
    * Get the user principal
    * @callback {() => void} callback
    * @param {Error} err
    * @param {User} user
    */
  def user(callback: js.Function2[/* err */ nodeLib.Error, /* user */ User, scala.Unit]): scala.Unit = js.native
}

