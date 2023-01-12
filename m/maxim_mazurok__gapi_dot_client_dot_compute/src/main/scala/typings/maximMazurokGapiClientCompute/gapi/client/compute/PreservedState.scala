package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreservedState extends StObject {
  
  /** Preserved disks defined for this instance. This map is keyed with the device names of the disks. */
  var disks: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.PreservedStatePreservedDisk} */ js.Any
  ] = js.undefined
  
  /** Preserved metadata defined for this instance. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object PreservedState {
  
  inline def apply(): PreservedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreservedState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreservedState] (val x: Self) extends AnyVal {
    
    inline def setDisks(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.PreservedStatePreservedDisk} */ js.Any
    ): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
