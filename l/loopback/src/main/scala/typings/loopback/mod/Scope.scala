package typings.loopback.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource owner grants/delegates permissions to client application
  * For a protected resource, does the client application have the authorization
  * from the resource owner (user or system)
  * Scope has many resource access entrie
  * @class scope
  */
@JSImport("loopback", "Scope")
@js.native
class Scope () extends js.Object

/* static members */
@JSImport("loopback", "Scope")
@js.native
object Scope extends js.Object {
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
  def checkPermission(
    scope: String,
    model: String,
    property: String,
    accessType: String,
    callback: js.Function2[/* err */ String | Error, /* result */ AccessRequest, Unit]
  ): Unit = js.native
}

