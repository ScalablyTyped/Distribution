package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single message which encapsulates structured name and metadata for a
  * given counter.
  */
trait SchemaCounterStructuredNameAndMetadata extends StObject {
  
  /**
    * Metadata associated with a counter
    */
  var metadata: js.UndefOr[SchemaCounterMetadata] = js.undefined
  
  /**
    * Structured name of the counter.
    */
  var name: js.UndefOr[SchemaCounterStructuredName] = js.undefined
}
object SchemaCounterStructuredNameAndMetadata {
  
  @scala.inline
  def apply(): SchemaCounterStructuredNameAndMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCounterStructuredNameAndMetadata]
  }
  
  @scala.inline
  implicit class SchemaCounterStructuredNameAndMetadataMutableBuilder[Self <: SchemaCounterStructuredNameAndMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: SchemaCounterMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: SchemaCounterStructuredName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
