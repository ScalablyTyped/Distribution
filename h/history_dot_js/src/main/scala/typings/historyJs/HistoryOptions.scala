package typings.historyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryOptions extends js.Object {
  
  var busyDelay: js.UndefOr[Double] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var delayInit: js.UndefOr[Double] = js.native
  
  var disableSuid: js.UndefOr[Boolean] = js.native
  
  var doubleCheckInterval: js.UndefOr[Double] = js.native
  
  var hashChangeInterval: js.UndefOr[Double] = js.native
  
  var html4Mode: js.UndefOr[Boolean] = js.native
  
  var initialTitle: js.UndefOr[String] = js.native
  
  var safariPollInterval: js.UndefOr[Double] = js.native
  
  var storeInterval: js.UndefOr[Double] = js.native
}
object HistoryOptions {
  
  @scala.inline
  def apply(): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryOptions]
  }
  
  @scala.inline
  implicit class HistoryOptionsOps[Self <: HistoryOptions] (val x: Self) extends AnyVal {
    
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
    def setBusyDelay(value: Double): Self = this.set("busyDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusyDelay: Self = this.set("busyDelay", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDelayInit(value: Double): Self = this.set("delayInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayInit: Self = this.set("delayInit", js.undefined)
    
    @scala.inline
    def setDisableSuid(value: Boolean): Self = this.set("disableSuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSuid: Self = this.set("disableSuid", js.undefined)
    
    @scala.inline
    def setDoubleCheckInterval(value: Double): Self = this.set("doubleCheckInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleCheckInterval: Self = this.set("doubleCheckInterval", js.undefined)
    
    @scala.inline
    def setHashChangeInterval(value: Double): Self = this.set("hashChangeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashChangeInterval: Self = this.set("hashChangeInterval", js.undefined)
    
    @scala.inline
    def setHtml4Mode(value: Boolean): Self = this.set("html4Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml4Mode: Self = this.set("html4Mode", js.undefined)
    
    @scala.inline
    def setInitialTitle(value: String): Self = this.set("initialTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialTitle: Self = this.set("initialTitle", js.undefined)
    
    @scala.inline
    def setSafariPollInterval(value: Double): Self = this.set("safariPollInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafariPollInterval: Self = this.set("safariPollInterval", js.undefined)
    
    @scala.inline
    def setStoreInterval(value: Double): Self = this.set("storeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreInterval: Self = this.set("storeInterval", js.undefined)
  }
}
