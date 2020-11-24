package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHistoryRequestRange extends js.Object {
  
  var hist_access_type: range = js.native
  
  var output: Boolean = js.native
  
  var raw: Boolean = js.native
  
  var session: Double = js.native
  
  var start: Double = js.native
  
  var stop: Double = js.native
}
object IHistoryRequestRange {
  
  @scala.inline
  def apply(
    hist_access_type: range,
    output: Boolean,
    raw: Boolean,
    session: Double,
    start: Double,
    stop: Double
  ): IHistoryRequestRange = {
    val __obj = js.Dynamic.literal(hist_access_type = hist_access_type.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryRequestRange]
  }
  
  @scala.inline
  implicit class IHistoryRequestRangeOps[Self <: IHistoryRequestRange] (val x: Self) extends AnyVal {
    
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
    def setHist_access_type(value: range): Self = this.set("hist_access_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: Boolean): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: Double): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: Double): Self = this.set("stop", value.asInstanceOf[js.Any])
  }
}
