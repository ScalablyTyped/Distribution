package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHistoryRequestRange extends StObject {
  
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
  implicit class IHistoryRequestRangeMutableBuilder[Self <: IHistoryRequestRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHist_access_type(value: range): Self = StObject.set(x, "hist_access_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: Double): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
