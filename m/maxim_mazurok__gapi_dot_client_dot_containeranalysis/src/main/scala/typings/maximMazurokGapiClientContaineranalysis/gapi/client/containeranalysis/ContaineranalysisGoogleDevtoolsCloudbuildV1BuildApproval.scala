package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContaineranalysisGoogleDevtoolsCloudbuildV1BuildApproval extends StObject {
  
  /** Output only. Configuration for manual approval of this build. */
  var config: js.UndefOr[ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig] = js.undefined
  
  /** Output only. Result of manual approval for this Build. */
  var result: js.UndefOr[ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult] = js.undefined
  
  /** Output only. The state of this build's approval. */
  var state: js.UndefOr[String] = js.undefined
}
object ContaineranalysisGoogleDevtoolsCloudbuildV1BuildApproval {
  
  inline def apply(): ContaineranalysisGoogleDevtoolsCloudbuildV1BuildApproval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContaineranalysisGoogleDevtoolsCloudbuildV1BuildApproval]
  }
  
  extension [Self <: ContaineranalysisGoogleDevtoolsCloudbuildV1BuildApproval](x: Self) {
    
    inline def setConfig(value: ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setResult(value: ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
