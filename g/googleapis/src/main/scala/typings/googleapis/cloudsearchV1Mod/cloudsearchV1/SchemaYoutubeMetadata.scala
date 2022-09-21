package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaYoutubeMetadata extends StObject {
  
  /**
    * YouTube resource ID of the artifact.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If this field is set to true, server should still contact external backends to get metadata for search but clients should not render this chip.
    */
  var shouldNotRender: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * YouTube query parameter for timestamp. YouTube specific flag that allows users to embed time token when sharing a link. This property contains parsed time token in seconds.
    */
  var startTime: js.UndefOr[Double | Null] = js.undefined
}
object SchemaYoutubeMetadata {
  
  inline def apply(): SchemaYoutubeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaYoutubeMetadata]
  }
  
  extension [Self <: SchemaYoutubeMetadata](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setShouldNotRender(value: Boolean): Self = StObject.set(x, "shouldNotRender", value.asInstanceOf[js.Any])
    
    inline def setShouldNotRenderNull: Self = StObject.set(x, "shouldNotRender", null)
    
    inline def setShouldNotRenderUndefined: Self = StObject.set(x, "shouldNotRender", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
