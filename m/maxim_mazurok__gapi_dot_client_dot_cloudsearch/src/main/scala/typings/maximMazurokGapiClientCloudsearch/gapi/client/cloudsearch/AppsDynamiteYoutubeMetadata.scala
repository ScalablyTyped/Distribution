package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteYoutubeMetadata extends StObject {
  
  /** YouTube resource ID of the artifact. */
  var id: js.UndefOr[String] = js.undefined
  
  /** If this field is set to true, server should still contact external backends to get metadata for search but clients should not render this chip. */
  var shouldNotRender: js.UndefOr[Boolean] = js.undefined
  
  /** YouTube query parameter for timestamp. YouTube specific flag that allows users to embed time token when sharing a link. This property contains parsed time token in seconds. */
  var startTime: js.UndefOr[Double] = js.undefined
}
object AppsDynamiteYoutubeMetadata {
  
  inline def apply(): AppsDynamiteYoutubeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteYoutubeMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteYoutubeMetadata] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setShouldNotRender(value: Boolean): Self = StObject.set(x, "shouldNotRender", value.asInstanceOf[js.Any])
    
    inline def setShouldNotRenderUndefined: Self = StObject.set(x, "shouldNotRender", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
