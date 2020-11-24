package typings.lusca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait csrfOptionsBase extends js.Object {
  
  /**
    * The name of the response header containing the CSRF token
    * @default 'x-csrf-token'
    */
  var header: js.UndefOr[String] = js.native
  
  /**
    *  An object with create/validate methods for custom tokens
    */
  var impl: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * The name of the CSRF token in the model.
    * @default '_csrf'
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * @default '_csrfSecret'
    */
  var secret: js.UndefOr[String] = js.native
}
object csrfOptionsBase {
  
  @scala.inline
  def apply(): csrfOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[csrfOptionsBase]
  }
  
  @scala.inline
  implicit class csrfOptionsBaseOps[Self <: csrfOptionsBase] (val x: Self) extends AnyVal {
    
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
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setImpl(value: () => _): Self = this.set("impl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteImpl: Self = this.set("impl", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
  }
}
