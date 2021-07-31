package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Media extends StObject {
  
  /** Name of the media resource. */
  var resourceName: js.UndefOr[String] = js.undefined
}
object Media {
  
  @scala.inline
  def apply(): Media = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Media]
  }
  
  @scala.inline
  implicit class MediaMutableBuilder[Self <: Media] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
