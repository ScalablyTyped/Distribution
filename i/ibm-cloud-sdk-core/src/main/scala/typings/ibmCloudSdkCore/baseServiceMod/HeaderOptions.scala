package typings.ibmCloudSdkCore.baseServiceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var `X-Watson-Learning-Opt-Out`: js.UndefOr[Boolean] = js.native
}
object HeaderOptions {
  
  @scala.inline
  def apply(): HeaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderOptions]
  }
  
  @scala.inline
  implicit class HeaderOptionsOps[Self <: HeaderOptions] (val x: Self) extends AnyVal {
    
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
    def `setX-Watson-Learning-Opt-Out`(value: Boolean): Self = this.set("X-Watson-Learning-Opt-Out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-Watson-Learning-Opt-Out`: Self = this.set("X-Watson-Learning-Opt-Out", js.undefined)
  }
}
