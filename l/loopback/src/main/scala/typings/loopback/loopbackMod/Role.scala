package typings.loopback.loopbackMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Role model
  * @class Role
  * @inherits {PersistedModel}
  * @header Role objec
  */
@JSImport("loopback", "Role")
@js.native
class Role () extends PersistedModel

/* static members */
@JSImport("loopback", "Role")
@js.native
object Role extends js.Object {
  /**
    * List roles for a given principal.
    * @param {any} context The security context.
    * @callback {() => void} callback Callback function.
    * @param {Error} err Error object.
    * @param {string[]} roles An Array of role IDs
    */
  def getRoles(context: js.Any, callback: js.Function2[/* err */ Error, /* roles */ js.Array[String], Unit]): Unit = js.native
  /**
    * Check if the user ID is authenticated
    * @param {any} context The security context.@callback {() => void} callback Callback function.
    * @param {Error} err Error object.
    * @param {boolean} isAuthenticated True if the user is authenticated.
    */
  def isAuthenticated(context: js.Any, callback: js.Function2[/* err */ Error, /* isAuthenticated */ Boolean, Unit]): Unit = js.native
  /**
    * Check if a given principal is in the specified role.
    * @param {string} role The role name.
    * @param {any} context The context object.
    * @callback {() => void} callback Callback function.
    * @param {Error} err Error object.
    * @param {boolean} isInRole True if the principal is in the specified role.
    */
  def isInRole(
    role: String,
    context: js.Any,
    callback: js.Function2[/* err */ Error, /* isInRole */ Boolean, Unit]
  ): Unit = js.native
  /**
    * Check if a given user ID is the owner the model instance.
    * @param {() => void} modelClass The model class
    * @param {*} modelId The model ID
    * @param {*} userId The user ID
    * @param {() => void} callback Callback function
    */
  def isOwner(modelClass: js.Function0[Unit], modelId: js.Any, userId: js.Any, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Add custom handler for roles.
    * @param {string} role Name of role.
    * @param {() => void} resolver () => void that determines
    * if a principal is in the specified role.
    * Should provide a callback or return a promise.
    */
  def registerResolver(
    role: String,
    resolver: js.Function3[
      /* role */ String, 
      /* ctx */ Context, 
      /* callback */ js.UndefOr[js.Function2[/* err */ Error, /* resolved */ Boolean, Unit]], 
      js.Promise[Boolean] | Unit
    ]
  ): Unit = js.native
}

