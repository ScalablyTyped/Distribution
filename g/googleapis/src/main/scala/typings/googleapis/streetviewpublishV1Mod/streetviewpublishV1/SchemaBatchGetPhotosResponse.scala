package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to batch get of Photos.
  */
trait SchemaBatchGetPhotosResponse extends StObject {
  
  /**
    * List of results for each individual Photo requested, in the same order as
    * the requests in BatchGetPhotos.
    */
  var results: js.UndefOr[js.Array[SchemaPhotoResponse]] = js.undefined
}
object SchemaBatchGetPhotosResponse {
  
  inline def apply(): SchemaBatchGetPhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetPhotosResponse]
  }
  
  extension [Self <: SchemaBatchGetPhotosResponse](x: Self) {
    
    inline def setResults(value: js.Array[SchemaPhotoResponse]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaPhotoResponse*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
