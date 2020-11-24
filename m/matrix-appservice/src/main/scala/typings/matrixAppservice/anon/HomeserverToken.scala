package typings.matrixAppservice.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HomeserverToken extends js.Object {
  
  var homeserverToken: String = js.native
  
  var httpMaxSizeBytes: js.UndefOr[Double] = js.native
}
object HomeserverToken {
  
  @scala.inline
  def apply(homeserverToken: String): HomeserverToken = {
    val __obj = js.Dynamic.literal(homeserverToken = homeserverToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomeserverToken]
  }
  
  @scala.inline
  implicit class HomeserverTokenOps[Self <: HomeserverToken] (val x: Self) extends AnyVal {
    
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
    def setHomeserverToken(value: String): Self = this.set("homeserverToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpMaxSizeBytes(value: Double): Self = this.set("httpMaxSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpMaxSizeBytes: Self = this.set("httpMaxSizeBytes", js.undefined)
  }
}
