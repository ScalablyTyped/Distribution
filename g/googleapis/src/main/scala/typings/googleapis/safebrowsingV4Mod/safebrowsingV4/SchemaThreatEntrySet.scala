package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of threats that should be added or removed from a client&#39;s local
  * database.
  */
@js.native
trait SchemaThreatEntrySet extends StObject {
  
  /**
    * The compression type for the entries in this set.
    */
  var compressionType: js.UndefOr[String] = js.native
  
  /**
    * The raw SHA256-formatted entries.
    */
  var rawHashes: js.UndefOr[SchemaRawHashes] = js.native
  
  /**
    * The raw removal indices for a local list.
    */
  var rawIndices: js.UndefOr[SchemaRawIndices] = js.native
  
  /**
    * The encoded 4-byte prefixes of SHA256-formatted entries, using a
    * Golomb-Rice encoding. The hashes are converted to uint32, sorted in
    * ascending order, then delta encoded and stored as encoded_data.
    */
  var riceHashes: js.UndefOr[SchemaRiceDeltaEncoding] = js.native
  
  /**
    * The encoded local, lexicographically-sorted list indices, using a
    * Golomb-Rice encoding. Used for sending compressed removal indices. The
    * removal indices (uint32) are sorted in ascending order, then delta
    * encoded and stored as encoded_data.
    */
  var riceIndices: js.UndefOr[SchemaRiceDeltaEncoding] = js.native
}
object SchemaThreatEntrySet {
  
  @scala.inline
  def apply(): SchemaThreatEntrySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatEntrySet]
  }
  
  @scala.inline
  implicit class SchemaThreatEntrySetMutableBuilder[Self <: SchemaThreatEntrySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompressionType(value: String): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionTypeUndefined: Self = StObject.set(x, "compressionType", js.undefined)
    
    @scala.inline
    def setRawHashes(value: SchemaRawHashes): Self = StObject.set(x, "rawHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawHashesUndefined: Self = StObject.set(x, "rawHashes", js.undefined)
    
    @scala.inline
    def setRawIndices(value: SchemaRawIndices): Self = StObject.set(x, "rawIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawIndicesUndefined: Self = StObject.set(x, "rawIndices", js.undefined)
    
    @scala.inline
    def setRiceHashes(value: SchemaRiceDeltaEncoding): Self = StObject.set(x, "riceHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiceHashesUndefined: Self = StObject.set(x, "riceHashes", js.undefined)
    
    @scala.inline
    def setRiceIndices(value: SchemaRiceDeltaEncoding): Self = StObject.set(x, "riceIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiceIndicesUndefined: Self = StObject.set(x, "riceIndices", js.undefined)
  }
}
