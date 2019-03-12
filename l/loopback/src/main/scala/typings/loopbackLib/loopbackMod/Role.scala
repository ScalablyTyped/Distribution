package typings
package loopbackLib.loopbackMod

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
class Role ()
  extends loopbackLib.loopbackMod.lNs.Role {
  /** Contains additional model settings. */
  /* CompleteClass */
  override var settings: loopbackLib.loopbackMod.lNs.Settings = js.native
  /* CompleteClass */
  override def afterRemote(
    method: java.lang.String,
    callback: js.Function3[
      /* ctx */ loopbackLib.loopbackMod.lNs.Context, 
      /* modelInstanceOrNext */ this.type | expressLib.expressMod.eNs.NextFunction, 
      /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def afterRemoteError(method: java.lang.String, callback: expressLib.expressMod.eNs.NextFunction): scala.Unit = js.native
  /**
    * loopback 3.x Remote hooks
    * http://loopback.io/doc/en/lb3/Remote-hooks.html
    * @param method
    * @param backback
    */
  /* CompleteClass */
  override def beforeRemote(
    method: java.lang.String,
    callback: js.Function3[
      /* ctx */ loopbackLib.loopbackMod.lNs.Context, 
      /* modelInstanceOrNext */ this.type | expressLib.expressMod.eNs.NextFunction, 
      /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

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
  def getRoles(
    context: js.Any,
    callback: js.Function2[/* err */ stdLib.Error, /* roles */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Check if the user ID is authenticated
    * @param {any} context The security context.@callback {() => void} callback Callback function.
    * @param {Error} err Error object.
    * @param {boolean} isAuthenticated True if the user is authenticated.
    */
  def isAuthenticated(
    context: js.Any,
    callback: js.Function2[/* err */ stdLib.Error, /* isAuthenticated */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Check if a given principal is in the specified role.
    * @param {string} role The role name.
    * @param {any} context The context object.
    * @callback {() => void} callback Callback function.
    * @param {Error} err Error object.
    * @param {boolean} isInRole True if the principal is in the specified role.
    */
  def isInRole(
    role: java.lang.String,
    context: js.Any,
    callback: js.Function2[/* err */ stdLib.Error, /* isInRole */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Check if a given user ID is the owner the model instance.
    * @param {() => void} modelClass The model class
    * @param {*} modelId The model ID
    * @param {*} userId The user ID
    * @param {() => void} callback Callback function
    */
  def isOwner(
    modelClass: js.Function0[scala.Unit],
    modelId: js.Any,
    userId: js.Any,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Add custom handler for roles.
    * @param {string} role Name of role.
    * @param {() => void} resolver () => void that determines
    * if a principal is in the specified role.
    * Should provide a callback or return a promise.
    */
  def registerResolver(
    role: java.lang.String,
    resolver: js.Function3[
      /* role */ java.lang.String, 
      /* ctx */ loopbackLib.loopbackMod.lNs.Context, 
      /* callback */ js.UndefOr[js.Function2[/* err */ stdLib.Error, /* resolved */ scala.Boolean, scala.Unit]], 
      js.Promise[scala.Boolean] | scala.Unit
    ]
  ): scala.Unit = js.native
}

