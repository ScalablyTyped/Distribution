package typings.lusca.mod

import typings.lusca.anon.Options
import typings.lusca.luscaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait csrfOptionsAngular extends csrfOptionsAngularOrNonAngular {
  
  var angular: `true` = js.native
  
  var cookie: js.UndefOr[String | Options] = js.native
}
object csrfOptionsAngular {
  
  @scala.inline
  def apply(angular: `true`): csrfOptionsAngular = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsAngular]
  }
  
  @scala.inline
  implicit class csrfOptionsAngularOps[Self <: csrfOptionsAngular] (val x: Self) extends AnyVal {
    
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
    def setAngular(value: `true`): Self = this.set("angular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookie(value: String | Options): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
  }
}
