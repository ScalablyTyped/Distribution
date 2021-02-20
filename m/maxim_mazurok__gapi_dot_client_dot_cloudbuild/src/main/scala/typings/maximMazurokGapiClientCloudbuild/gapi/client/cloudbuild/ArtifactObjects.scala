package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactObjects extends StObject {
  
  /**
    * Cloud Storage bucket and optional object path, in the form "gs://bucket/path/to/somewhere/". (see [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Files in the workspace matching any path pattern will be uploaded to Cloud Storage with this
    * location as a prefix.
    */
  var location: js.UndefOr[String] = js.native
  
  /** Path globs used to match files in the build's workspace. */
  var paths: js.UndefOr[js.Array[String]] = js.native
  
  /** Output only. Stores timing information for pushing all artifact objects. */
  var timing: js.UndefOr[TimeSpan] = js.native
}
object ArtifactObjects {
  
  @scala.inline
  def apply(): ArtifactObjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactObjects]
  }
  
  @scala.inline
  implicit class ArtifactObjectsMutableBuilder[Self <: ArtifactObjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
    
    @scala.inline
    def setTiming(value: TimeSpan): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
  }
}
