package typings.loopback.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `RoleMapping` model extends from the built in `loopback.Model` type.
  * @property {string} id Generated ID.
  * @property {string} name Name of the role.
  * @property {string} Description Text description.
  * @class RoleMapping
  * @inherits {PersistedModel}
  */
@JSImport("loopback", "RoleMapping")
@js.native
class RoleMapping protected () extends PersistedModel {
  def this(data: js.Any) = this()
  
  /**
    * Get the application principal
    * @callback {() => void} callback
    * @param {Error} err
    * @param {Application} application
    */
  def application(callback: js.Function2[/* err */ Error, /* application */ Application, Unit]): Unit = js.native
  
  /**
    * Get the child role principal
    * @callback {() => void} callback
    * @param {Error} err
    * @param {User} childUser
    */
  def childRole(callback: js.Function2[/* err */ Error, /* childUser */ User, Unit]): Unit = js.native
  
  /** Description Text description. */
  var description: String = js.native
  
  /** Generated ID. */
  var id: String = js.native
  
  /** Name of the role. */
  var name: String = js.native
  
  /**
    * Get the user principal
    * @callback {() => void} callback
    * @param {Error} err
    * @param {User} user
    */
  def user(callback: js.Function2[/* err */ Error, /* user */ User, Unit]): Unit = js.native
}
