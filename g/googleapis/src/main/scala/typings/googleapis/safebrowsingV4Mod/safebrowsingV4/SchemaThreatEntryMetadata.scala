package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metadata associated with a specific threat entry. The client is
  * expected to know the metadata key/value pairs associated with each threat
  * type.
  */
trait SchemaThreatEntryMetadata extends StObject {
  
  /**
    * The metadata entries.
    */
  var entries: js.UndefOr[js.Array[SchemaMetadataEntry]] = js.undefined
}
object SchemaThreatEntryMetadata {
  
  @scala.inline
  def apply(): SchemaThreatEntryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatEntryMetadata]
  }
  
  @scala.inline
  implicit class SchemaThreatEntryMetadataMutableBuilder[Self <: SchemaThreatEntryMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[SchemaMetadataEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaMetadataEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
