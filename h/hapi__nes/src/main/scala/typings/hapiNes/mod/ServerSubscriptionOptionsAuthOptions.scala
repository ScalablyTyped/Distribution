package typings.hapiNes.mod

import typings.hapiNes.hapiNesStrings.any
import typings.hapiNes.hapiNesStrings.app
import typings.hapiNes.hapiNesStrings.optional
import typings.hapiNes.hapiNesStrings.required
import typings.hapiNes.hapiNesStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerSubscriptionOptionsAuthOptions extends js.Object {
  
  var entity: js.UndefOr[user | app | any] = js.native
  
  var index: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[required | optional] = js.native
  
  var scope: js.UndefOr[String | js.Array[String]] = js.native
}
object ServerSubscriptionOptionsAuthOptions {
  
  @scala.inline
  def apply(): ServerSubscriptionOptionsAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSubscriptionOptionsAuthOptions]
  }
  
  @scala.inline
  implicit class ServerSubscriptionOptionsAuthOptionsOps[Self <: ServerSubscriptionOptionsAuthOptions] (val x: Self) extends AnyVal {
    
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
    def setEntity(value: user | app | any): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setIndex(value: Boolean): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setMode(value: required | optional): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
