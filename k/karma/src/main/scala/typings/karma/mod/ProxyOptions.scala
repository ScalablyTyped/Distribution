package typings.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyOptions extends js.Object {
  
  /**
    * Whether or not the proxy should override the Host header using the host from the target
    * @defult false
    */
  var changeOrigin: js.UndefOr[Boolean] = js.native
  
  /** The target url or path (mandatory) */
  var target: String = js.native
}
object ProxyOptions {
  
  @scala.inline
  def apply(target: String): ProxyOptions = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyOptions]
  }
  
  @scala.inline
  implicit class ProxyOptionsOps[Self <: ProxyOptions] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeOrigin(value: Boolean): Self = this.set("changeOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeOrigin: Self = this.set("changeOrigin", js.undefined)
  }
}
