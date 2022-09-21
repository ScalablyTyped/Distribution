package typings.loopback.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Role model
  * @class Role
  * @inherits {PersistedModel}
  * @header Role objec
  */
@JSImport("loopback", "Role")
@js.native
open class Role protected () extends PersistedModel {
  def this(data: Any) = this()
}
object Role {
  
  @JSImport("loopback", "Role")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List roles for a given principal.
    * @param {any} context The security context.
    * @callback {() => void} callback Callback function.
    * @param {Error} err Error object.
    * @param {string[]} roles An Array of role IDs
    */
  /* static member */
  inline def getRoles(context: Any, callback: js.Function2[/* err */ js.Error, /* roles */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getRoles")(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Check if the user ID is authenticated
    * @param {any} context The security context.@callback {() => void} callback Callback function.
    * @param {Error} err Error object.
    * @param {boolean} isAuthenticated True if the user is authenticated.
    */
  /* static member */
  inline def isAuthenticated(context: Any, callback: js.Function2[/* err */ js.Error, /* isAuthenticated */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isAuthenticated")(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Check if a given principal is in the specified role.
    * @param {string} role The role name.
    * @param {any} context The context object.
    * @callback {() => void} callback Callback function.
    * @param {Error} err Error object.
    * @param {boolean} isInRole True if the principal is in the specified role.
    */
  /* static member */
  inline def isInRole(
    role: String,
    context: Any,
    callback: js.Function2[/* err */ js.Error, /* isInRole */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isInRole")(role.asInstanceOf[js.Any], context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Check if a given user ID is the owner the model instance.
    * @param {() => void} modelClass The model class
    * @param {*} modelId The model ID
    * @param {*} userId The user ID
    * @param {() => void} callback Callback function
    */
  /* static member */
  inline def isOwner(modelClass: js.Function0[Unit], modelId: Any, userId: Any, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isOwner")(modelClass.asInstanceOf[js.Any], modelId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Add custom handler for roles.
    * @param {string} role Name of role.
    * @param {() => void} resolver () => void that determines
    * if a principal is in the specified role.
    * Should provide a callback or return a promise.
    */
  /* static member */
  inline def registerResolver(
    role: String,
    resolver: js.Function3[
      /* role */ String, 
      /* ctx */ Context, 
      /* callback */ js.UndefOr[js.Function2[/* err */ js.Error, /* resolved */ Boolean, Unit]], 
      js.Promise[Boolean] | Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResolver")(role.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
