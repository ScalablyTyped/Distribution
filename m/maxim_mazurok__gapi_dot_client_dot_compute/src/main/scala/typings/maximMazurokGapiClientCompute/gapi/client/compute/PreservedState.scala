package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreservedState extends StObject {
  
  /** Preserved disks defined for this instance. This map is keyed with the device names of the disks. */
  var disks: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.PreservedStatePreservedDisk}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.PreservedState & TopLevel[js.Any]
  ] = js.undefined
  
  /** Preserved metadata defined for this instance. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.PreservedState & TopLevel[js.Any]
  ] = js.undefined
}
object PreservedState {
  
  @scala.inline
  def apply(): PreservedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreservedState]
  }
  
  @scala.inline
  implicit class PreservedStateMutableBuilder[Self <: PreservedState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisks(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.PreservedStatePreservedDisk}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.PreservedState & TopLevel[js.Any]
    ): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.PreservedState & TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
