package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListJobTemplatesResponse extends StObject {
  
  /**
    * List of job templates in the specified region.
    */
  var jobTemplates: js.UndefOr[js.Array[SchemaJobTemplate]] = js.undefined
  
  /**
    * The pagination token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListJobTemplatesResponse {
  
  inline def apply(): SchemaListJobTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListJobTemplatesResponse]
  }
  
  extension [Self <: SchemaListJobTemplatesResponse](x: Self) {
    
    inline def setJobTemplates(value: js.Array[SchemaJobTemplate]): Self = StObject.set(x, "jobTemplates", value.asInstanceOf[js.Any])
    
    inline def setJobTemplatesUndefined: Self = StObject.set(x, "jobTemplates", js.undefined)
    
    inline def setJobTemplatesVarargs(value: SchemaJobTemplate*): Self = StObject.set(x, "jobTemplates", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
