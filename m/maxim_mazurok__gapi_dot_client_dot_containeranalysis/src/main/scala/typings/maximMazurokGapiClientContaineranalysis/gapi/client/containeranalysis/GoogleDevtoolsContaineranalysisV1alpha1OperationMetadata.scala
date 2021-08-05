package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata extends StObject {
  
  /** Output only. The time this operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The time that this operation was marked completed or failed. */
  var endTime: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata {
  
  inline def apply(): GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata]
  }
  
  extension [Self <: GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
  }
}
