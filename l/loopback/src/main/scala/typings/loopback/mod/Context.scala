package typings.loopback.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait Context extends js.Object {
  
  /** The access type */
  var accesType: String = js.native
  
  /** The access token */
  var accessToken: AccessToken = js.native
  
  /** The model method to be invoked */
  var method: String = js.native
  
  /** The model class */
  def model(): Unit = js.native
  
  /** The model id */
  var modelId: String = js.native
  
  /** The model name */
  var modelName: String = js.native
  
  /** An Array of principals */
  var principals: js.Array[Principal] = js.native
  
  /** The model property/method/relation name */
  var property: String = js.native
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
    val __obj = js.Dynamic.literal(accesType = accesType.asInstanceOf[js.Any], accessToken = accessToken.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], model = js.Any.fromFunction0(model), modelId = modelId.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], principals = principals.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccesType(value: String): Self = this.set("accesType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessToken(value: AccessToken): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: () => Unit): Self = this.set("model", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModelId(value: String): Self = this.set("modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalsVarargs(value: Principal*): Self = this.set("principals", js.Array(value :_*))
    
    @scala.inline
    def setPrincipals(value: js.Array[Principal]): Self = this.set("principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
  }
}
