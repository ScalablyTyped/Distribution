package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig extends StObject {
  
  /** Whether or not approval is needed. If this is set on a build, it will become pending when created, and will need to be explicitly approved to start. */
  var approvalRequired: js.UndefOr[Boolean] = js.undefined
}
object ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig {
  
  inline def apply(): ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig]
  }
  
  extension [Self <: ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig](x: Self) {
    
    inline def setApprovalRequired(value: Boolean): Self = StObject.set(x, "approvalRequired", value.asInstanceOf[js.Any])
    
    inline def setApprovalRequiredUndefined: Self = StObject.set(x, "approvalRequired", js.undefined)
  }
}
