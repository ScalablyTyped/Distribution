package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListVolumeRestoresResponse extends StObject {
  
  /**
    * A token which may be sent as page_token in a subsequent `ListVolumeRestores` call to retrieve the next page of results. If this field is omitted or empty, then there are no more results to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of VolumeRestores matching the given criteria.
    */
  var volumeRestores: js.UndefOr[js.Array[SchemaVolumeRestore]] = js.undefined
}
object SchemaListVolumeRestoresResponse {
  
  inline def apply(): SchemaListVolumeRestoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVolumeRestoresResponse]
  }
  
  extension [Self <: SchemaListVolumeRestoresResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setVolumeRestores(value: js.Array[SchemaVolumeRestore]): Self = StObject.set(x, "volumeRestores", value.asInstanceOf[js.Any])
    
    inline def setVolumeRestoresUndefined: Self = StObject.set(x, "volumeRestores", js.undefined)
    
    inline def setVolumeRestoresVarargs(value: SchemaVolumeRestore*): Self = StObject.set(x, "volumeRestores", js.Array(value*))
  }
}
