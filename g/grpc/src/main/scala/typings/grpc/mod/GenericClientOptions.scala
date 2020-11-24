package typings.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericClientOptions extends js.Object {
  
  /**
    * Indicates that the old argument order should be used for methods, with
    * optional arguments at the end instead of the callback at the end. This
    * option is only a temporary stopgap measure to smooth an API breakage.
    * It is deprecated, and new code should not use it.
    */
  var deprecatedArgumentOrder: js.UndefOr[Boolean] = js.native
}
object GenericClientOptions {
  
  @scala.inline
  def apply(): GenericClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericClientOptions]
  }
  
  @scala.inline
  implicit class GenericClientOptionsOps[Self <: GenericClientOptions] (val x: Self) extends AnyVal {
    
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
    def setDeprecatedArgumentOrder(value: Boolean): Self = this.set("deprecatedArgumentOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecatedArgumentOrder: Self = this.set("deprecatedArgumentOrder", js.undefined)
  }
}
