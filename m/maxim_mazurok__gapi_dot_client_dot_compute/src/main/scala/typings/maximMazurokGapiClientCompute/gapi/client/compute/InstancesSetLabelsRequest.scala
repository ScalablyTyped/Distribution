package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesSetLabelsRequest extends StObject {
  
  /** Fingerprint of the previous set of labels for this resource, used to prevent conflicts. Provide the latest fingerprint value when making a request to add or change labels. */
  var labelFingerprint: js.UndefOr[String] = js.undefined
  
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.InstancesSetLabelsRequest & TopLevel[js.Any]
  ] = js.undefined
}
object InstancesSetLabelsRequest {
  
  @scala.inline
  def apply(): InstancesSetLabelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesSetLabelsRequest]
  }
  
  @scala.inline
  implicit class InstancesSetLabelsRequestMutableBuilder[Self <: InstancesSetLabelsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelFingerprint(value: String): Self = StObject.set(x, "labelFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFingerprintUndefined: Self = StObject.set(x, "labelFingerprint", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.InstancesSetLabelsRequest & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
