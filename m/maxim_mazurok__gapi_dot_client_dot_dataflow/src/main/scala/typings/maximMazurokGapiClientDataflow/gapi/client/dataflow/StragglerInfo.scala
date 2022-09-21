package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StragglerInfo extends StObject {
  
  /** The straggler causes, keyed by the string representation of the StragglerCause enum and contains specialized debugging information for each straggler cause. */
  var causes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.StragglerDebuggingInfo}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.StragglerInfo & TopLevel[Any]
  ] = js.undefined
  
  /** The time when the work item attempt became a straggler. */
  var startTime: js.UndefOr[String] = js.undefined
}
object StragglerInfo {
  
  inline def apply(): StragglerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StragglerInfo]
  }
  
  extension [Self <: StragglerInfo](x: Self) {
    
    inline def setCauses(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.StragglerDebuggingInfo}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.StragglerInfo & TopLevel[Any]
    ): Self = StObject.set(x, "causes", value.asInstanceOf[js.Any])
    
    inline def setCausesUndefined: Self = StObject.set(x, "causes", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
