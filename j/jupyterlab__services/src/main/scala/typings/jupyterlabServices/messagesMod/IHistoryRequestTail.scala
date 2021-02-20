package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHistoryRequestTail extends StObject {
  
  var hist_access_type: tail = js.native
  
  var n: Double = js.native
  
  var output: Boolean = js.native
  
  var raw: Boolean = js.native
}
object IHistoryRequestTail {
  
  @scala.inline
  def apply(hist_access_type: tail, n: Double, output: Boolean, raw: Boolean): IHistoryRequestTail = {
    val __obj = js.Dynamic.literal(hist_access_type = hist_access_type.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryRequestTail]
  }
  
  @scala.inline
  implicit class IHistoryRequestTailMutableBuilder[Self <: IHistoryRequestTail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHist_access_type(value: tail): Self = StObject.set(x, "hist_access_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
