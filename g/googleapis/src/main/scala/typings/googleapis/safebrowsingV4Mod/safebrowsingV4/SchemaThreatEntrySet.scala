package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of threats that should be added or removed from a client&#39;s local
  * database.
  */
@js.native
trait SchemaThreatEntrySet extends js.Object {
  
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
  implicit class SchemaThreatEntrySetOps[Self <: SchemaThreatEntrySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompressionType(value: String): Self = this.set("compressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressionType: Self = this.set("compressionType", js.undefined)
    
    @scala.inline
    def setRawHashes(value: SchemaRawHashes): Self = this.set("rawHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawHashes: Self = this.set("rawHashes", js.undefined)
    
    @scala.inline
    def setRawIndices(value: SchemaRawIndices): Self = this.set("rawIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawIndices: Self = this.set("rawIndices", js.undefined)
    
    @scala.inline
    def setRiceHashes(value: SchemaRiceDeltaEncoding): Self = this.set("riceHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiceHashes: Self = this.set("riceHashes", js.undefined)
    
    @scala.inline
    def setRiceIndices(value: SchemaRiceDeltaEncoding): Self = this.set("riceIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiceIndices: Self = this.set("riceIndices", js.undefined)
  }
}
