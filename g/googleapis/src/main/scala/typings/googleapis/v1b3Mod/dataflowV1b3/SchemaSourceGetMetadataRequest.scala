package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to compute the SourceMetadata of a Source.
  */
@js.native
trait SchemaSourceGetMetadataRequest extends StObject {
  
  /**
    * Specification of the source whose metadata should be computed.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}
object SchemaSourceGetMetadataRequest {
  
  @scala.inline
  def apply(): SchemaSourceGetMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceGetMetadataRequest]
  }
  
  @scala.inline
  implicit class SchemaSourceGetMetadataRequestMutableBuilder[Self <: SchemaSourceGetMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
