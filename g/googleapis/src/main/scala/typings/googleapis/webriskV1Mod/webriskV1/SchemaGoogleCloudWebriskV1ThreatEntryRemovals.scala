package typings.googleapis.webriskV1Mod.webriskV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudWebriskV1ThreatEntryRemovals extends StObject {
  
  /**
    * The raw removal indices for a local list.
    */
  var rawIndices: js.UndefOr[SchemaGoogleCloudWebriskV1RawIndices] = js.undefined
  
  /**
    * The encoded local, lexicographically-sorted list indices, using a Golomb-Rice encoding. Used for sending compressed removal indices. The removal indices (uint32) are sorted in ascending order, then delta encoded and stored as encoded_data.
    */
  var riceIndices: js.UndefOr[SchemaGoogleCloudWebriskV1RiceDeltaEncoding] = js.undefined
}
object SchemaGoogleCloudWebriskV1ThreatEntryRemovals {
  
  inline def apply(): SchemaGoogleCloudWebriskV1ThreatEntryRemovals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudWebriskV1ThreatEntryRemovals]
  }
  
  extension [Self <: SchemaGoogleCloudWebriskV1ThreatEntryRemovals](x: Self) {
    
    inline def setRawIndices(value: SchemaGoogleCloudWebriskV1RawIndices): Self = StObject.set(x, "rawIndices", value.asInstanceOf[js.Any])
    
    inline def setRawIndicesUndefined: Self = StObject.set(x, "rawIndices", js.undefined)
    
    inline def setRiceIndices(value: SchemaGoogleCloudWebriskV1RiceDeltaEncoding): Self = StObject.set(x, "riceIndices", value.asInstanceOf[js.Any])
    
    inline def setRiceIndicesUndefined: Self = StObject.set(x, "riceIndices", js.undefined)
  }
}
