package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltImage extends StObject {
  
  /** Docker Registry 2.0 digest. */
  var digest: js.UndefOr[String] = js.undefined
  
  /** Name used to push the container image to Google Container Registry, as presented to `docker push`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Stores timing information for pushing the specified image. */
  var pushTiming: js.UndefOr[TimeSpan] = js.undefined
}
object BuiltImage {
  
  @scala.inline
  def apply(): BuiltImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltImage]
  }
  
  @scala.inline
  implicit class BuiltImageMutableBuilder[Self <: BuiltImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPushTiming(value: TimeSpan): Self = StObject.set(x, "pushTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushTimingUndefined: Self = StObject.set(x, "pushTiming", js.undefined)
  }
}
