package typings.loopback.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource owner grants/delegates permissions to client application
  * For a protected resource, does the client application have the authorization
  * from the resource owner (user or system)
  * Scope has many resource access entrie
  * @class scope
  */
@JSImport("loopback", "Scope")
@js.native
open class Scope () extends StObject
object Scope {
  
  @JSImport("loopback", "Scope")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the given scope is allowed to access the model/property
    * @param {string} scope The scope name
    * @param {string} model The model name
    * @param {string} property The property/method/relation name
    * @param {string} accessType The access type
    * @callback {() => void} callback
    * @param {string|Error} err The error object
    * @param {AccessRequest} result The access permission
    */
  /* static member */
  inline def checkPermission(
    scope: String,
    model: String,
    property: String,
    accessType: String,
    callback: js.Function2[/* err */ String | js.Error, /* result */ AccessRequest, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPermission")(scope.asInstanceOf[js.Any], model.asInstanceOf[js.Any], property.asInstanceOf[js.Any], accessType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
