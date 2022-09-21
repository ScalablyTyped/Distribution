package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportYumArtifactsGcsSource extends StObject {
  
  /** Cloud Storage paths URI (e.g., gs://my_bucket//my_object). */
  var uris: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Supports URI wildcards for matching multiple objects from a single URI. */
  var useWildcards: js.UndefOr[Boolean] = js.undefined
}
object ImportYumArtifactsGcsSource {
  
  inline def apply(): ImportYumArtifactsGcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportYumArtifactsGcsSource]
  }
  
  extension [Self <: ImportYumArtifactsGcsSource](x: Self) {
    
    inline def setUris(value: js.Array[String]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    inline def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    inline def setUrisVarargs(value: String*): Self = StObject.set(x, "uris", js.Array(value*))
    
    inline def setUseWildcards(value: Boolean): Self = StObject.set(x, "useWildcards", value.asInstanceOf[js.Any])
    
    inline def setUseWildcardsUndefined: Self = StObject.set(x, "useWildcards", js.undefined)
  }
}
