package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobResolversSupported extends js.Object {
  
  var `resolver-name`: js.UndefOr[String] = js.native
}
object JobResolversSupported {
  
  @scala.inline
  def apply(): JobResolversSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobResolversSupported]
  }
  
  @scala.inline
  implicit class JobResolversSupportedOps[Self <: JobResolversSupported] (val x: Self) extends AnyVal {
    
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
    def `setResolver-name`(value: String): Self = this.set("resolver-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteResolver-name`: Self = this.set("resolver-name", js.undefined)
  }
}
