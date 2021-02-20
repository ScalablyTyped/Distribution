package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfidentialInstanceConfig extends StObject {
  
  /** Defines whether the instance should have confidential compute enabled. */
  var enableConfidentialCompute: js.UndefOr[Boolean] = js.native
}
object ConfidentialInstanceConfig {
  
  @scala.inline
  def apply(): ConfidentialInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfidentialInstanceConfig]
  }
  
  @scala.inline
  implicit class ConfidentialInstanceConfigMutableBuilder[Self <: ConfidentialInstanceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableConfidentialCompute(value: Boolean): Self = StObject.set(x, "enableConfidentialCompute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableConfidentialComputeUndefined: Self = StObject.set(x, "enableConfidentialCompute", js.undefined)
  }
}
