package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildApproval extends StObject {
  
  /** Output only. Configuration for manual approval of this build. */
  var config: js.UndefOr[ApprovalConfig] = js.undefined
  
  /** Output only. Result of manual approval for this Build. */
  var result: js.UndefOr[ApprovalResult] = js.undefined
  
  /** Output only. The state of this build's approval. */
  var state: js.UndefOr[String] = js.undefined
}
object BuildApproval {
  
  inline def apply(): BuildApproval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildApproval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildApproval] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: ApprovalConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setResult(value: ApprovalResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
