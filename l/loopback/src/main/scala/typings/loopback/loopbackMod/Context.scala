package typings.loopback.loopbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Context
  * @interface
  * @property {Principal[]} principals An Array of principals
  * @property {() => void} model The model class
  * @property {string} modelName The model name
  * @property {string} modelId The model id
  * @property {string} property The model property/method/relation name
  * @property {string} method The model method to be invoked
  * @property {string} accessType The access type
  * @property {AccessToken} accessToken The access toke
  * @returns {AccessContext}
  */
trait Context extends js.Object {
  /** The access type */
  var accesType: String
  /** The access token */
  var accessToken: AccessToken
  /** The model method to be invoked */
  var method: String
  /** The model id */
  var modelId: String
  /** The model name */
  var modelName: String
  /** An Array of principals */
  var principals: js.Array[Principal]
  /** The model property/method/relation name */
  var property: String
  /** The model class */
  def model(): Unit
}

object Context {
  @scala.inline
  def apply(
    accesType: String,
    accessToken: AccessToken,
    method: String,
    model: () => Unit,
    modelId: String,
    modelName: String,
    principals: js.Array[Principal],
    property: String
  ): Context = {
    val __obj = js.Dynamic.literal(accesType = accesType, accessToken = accessToken, method = method, model = js.Any.fromFunction0(model), modelId = modelId, modelName = modelName, principals = principals, property = property)
  
    __obj.asInstanceOf[Context]
  }
}

