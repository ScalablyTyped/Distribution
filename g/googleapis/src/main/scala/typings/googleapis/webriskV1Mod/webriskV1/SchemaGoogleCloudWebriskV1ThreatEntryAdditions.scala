package typings.googleapis.webriskV1Mod.webriskV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudWebriskV1ThreatEntryAdditions extends StObject {
  
  /**
    * The raw SHA256-formatted entries. Repeated to allow returning sets of hashes with different prefix sizes.
    */
  var rawHashes: js.UndefOr[js.Array[SchemaGoogleCloudWebriskV1RawHashes]] = js.undefined
  
  /**
    * The encoded 4-byte prefixes of SHA256-formatted entries, using a Golomb-Rice encoding. The hashes are converted to uint32, sorted in ascending order, then delta encoded and stored as encoded_data.
    */
  var riceHashes: js.UndefOr[SchemaGoogleCloudWebriskV1RiceDeltaEncoding] = js.undefined
}
object SchemaGoogleCloudWebriskV1ThreatEntryAdditions {
  
  inline def apply(): SchemaGoogleCloudWebriskV1ThreatEntryAdditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudWebriskV1ThreatEntryAdditions]
  }
  
  extension [Self <: SchemaGoogleCloudWebriskV1ThreatEntryAdditions](x: Self) {
    
    inline def setRawHashes(value: js.Array[SchemaGoogleCloudWebriskV1RawHashes]): Self = StObject.set(x, "rawHashes", value.asInstanceOf[js.Any])
    
    inline def setRawHashesUndefined: Self = StObject.set(x, "rawHashes", js.undefined)
    
    inline def setRawHashesVarargs(value: SchemaGoogleCloudWebriskV1RawHashes*): Self = StObject.set(x, "rawHashes", js.Array(value*))
    
    inline def setRiceHashes(value: SchemaGoogleCloudWebriskV1RiceDeltaEncoding): Self = StObject.set(x, "riceHashes", value.asInstanceOf[js.Any])
    
    inline def setRiceHashesUndefined: Self = StObject.set(x, "riceHashes", js.undefined)
  }
}
