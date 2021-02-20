package typings.hlsJs.mod

import typings.hlsJs.anon.Audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait bufferAppendedData extends StObject {
  
  var pending: Double = js.native
  
  var timeRanges: Audio = js.native
}
object bufferAppendedData {
  
  @scala.inline
  def apply(pending: Double, timeRanges: Audio): bufferAppendedData = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], timeRanges = timeRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[bufferAppendedData]
  }
  
  @scala.inline
  implicit class bufferAppendedDataMutableBuilder[Self <: bufferAppendedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRanges(value: Audio): Self = StObject.set(x, "timeRanges", value.asInstanceOf[js.Any])
  }
}
