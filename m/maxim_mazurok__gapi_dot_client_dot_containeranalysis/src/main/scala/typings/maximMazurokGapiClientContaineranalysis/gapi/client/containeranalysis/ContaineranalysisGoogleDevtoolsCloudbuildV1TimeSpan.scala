package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan extends StObject {
  
  /** End of time span. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Start of time span. */
  var startTime: js.UndefOr[String] = js.undefined
}
object ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan {
  
  inline def apply(): ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
