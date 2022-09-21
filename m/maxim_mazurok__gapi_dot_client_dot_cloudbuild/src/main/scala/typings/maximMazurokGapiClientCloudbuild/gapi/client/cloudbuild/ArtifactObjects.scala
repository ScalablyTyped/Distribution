package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactObjects extends StObject {
  
  /**
    * Cloud Storage bucket and optional object path, in the form "gs://bucket/path/to/somewhere/". (see [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Files in the workspace matching any path pattern will be uploaded to Cloud Storage with this
    * location as a prefix.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /** Path globs used to match files in the build's workspace. */
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Stores timing information for pushing all artifact objects. */
  var timing: js.UndefOr[TimeSpan] = js.undefined
}
object ArtifactObjects {
  
  inline def apply(): ArtifactObjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactObjects]
  }
  
  extension [Self <: ArtifactObjects](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setTiming(value: TimeSpan): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
  }
}
