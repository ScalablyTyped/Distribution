package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListPerfSamplesResponse extends StObject {
  
  /**
    * Optional, returned if result size exceeds the page size specified in the
    * request (or the default page size, 500, if unspecified). It indicates the
    * last sample timestamp to be used as page_token in subsequent request
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  var perfSamples: js.UndefOr[js.Array[SchemaPerfSample]] = js.native
}
object SchemaListPerfSamplesResponse {
  
  @scala.inline
  def apply(): SchemaListPerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPerfSamplesResponse]
  }
  
  @scala.inline
  implicit class SchemaListPerfSamplesResponseMutableBuilder[Self <: SchemaListPerfSamplesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPerfSamples(value: js.Array[SchemaPerfSample]): Self = StObject.set(x, "perfSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfSamplesUndefined: Self = StObject.set(x, "perfSamples", js.undefined)
    
    @scala.inline
    def setPerfSamplesVarargs(value: SchemaPerfSample*): Self = StObject.set(x, "perfSamples", js.Array(value :_*))
  }
}
