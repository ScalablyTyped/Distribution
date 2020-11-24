package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugOptions extends js.Object {
  
  /** If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field. */
  var enableDebugging: js.UndefOr[Boolean] = js.native
}
object DebugOptions {
  
  @scala.inline
  def apply(): DebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugOptions]
  }
  
  @scala.inline
  implicit class DebugOptionsOps[Self <: DebugOptions] (val x: Self) extends AnyVal {
    
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
    def setEnableDebugging(value: Boolean): Self = this.set("enableDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDebugging: Self = this.set("enableDebugging", js.undefined)
  }
}
