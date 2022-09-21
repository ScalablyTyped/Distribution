package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeIamPolicyLongrunningMetadata extends StObject {
  
  /** Output only. The time the operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
}
object AnalyzeIamPolicyLongrunningMetadata {
  
  inline def apply(): AnalyzeIamPolicyLongrunningMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeIamPolicyLongrunningMetadata]
  }
  
  extension [Self <: AnalyzeIamPolicyLongrunningMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
  }
}
