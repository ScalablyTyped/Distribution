package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContaineranalysisGoogleDevtoolsCloudbuildV1BuildApproval extends StObject {
  
  /**
    * Output only. Configuration for manual approval of this build.
    */
  var config: js.UndefOr[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig] = js.undefined
  
  /**
    * Output only. Result of manual approval for this Build.
    */
  var result: js.UndefOr[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult] = js.undefined
  
  /**
    * Output only. The state of this build's approval.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaContaineranalysisGoogleDevtoolsCloudbuildV1BuildApproval {
  
  inline def apply(): SchemaContaineranalysisGoogleDevtoolsCloudbuildV1BuildApproval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1BuildApproval]
  }
  
  extension [Self <: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1BuildApproval](x: Self) {
    
    inline def setConfig(value: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setResult(value: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
