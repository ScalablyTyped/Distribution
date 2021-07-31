package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetHttpsProxiesSetQuicOverrideRequest extends StObject {
  
  /**
    * QUIC policy for the TargetHttpsProxy resource.
    */
  var quicOverride: js.UndefOr[String] = js.undefined
}
object SchemaTargetHttpsProxiesSetQuicOverrideRequest {
  
  @scala.inline
  def apply(): SchemaTargetHttpsProxiesSetQuicOverrideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetHttpsProxiesSetQuicOverrideRequest]
  }
  
  @scala.inline
  implicit class SchemaTargetHttpsProxiesSetQuicOverrideRequestMutableBuilder[Self <: SchemaTargetHttpsProxiesSetQuicOverrideRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuicOverride(value: String): Self = StObject.set(x, "quicOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuicOverrideUndefined: Self = StObject.set(x, "quicOverride", js.undefined)
  }
}
