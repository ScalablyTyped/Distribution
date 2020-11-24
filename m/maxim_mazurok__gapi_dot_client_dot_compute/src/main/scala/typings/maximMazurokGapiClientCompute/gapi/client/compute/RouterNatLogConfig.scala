package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterNatLogConfig extends js.Object {
  
  /** Indicates whether or not to export logs. This is false by default. */
  var enable: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values:
    * - ERRORS_ONLY: Export logs only for connection failures.
    * - TRANSLATIONS_ONLY: Export logs only for successful connections.
    * - ALL: Export logs for all connections, successful and unsuccessful.
    */
  var filter: js.UndefOr[String] = js.native
}
object RouterNatLogConfig {
  
  @scala.inline
  def apply(): RouterNatLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterNatLogConfig]
  }
  
  @scala.inline
  implicit class RouterNatLogConfigOps[Self <: RouterNatLogConfig] (val x: Self) extends AnyVal {
    
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
}
