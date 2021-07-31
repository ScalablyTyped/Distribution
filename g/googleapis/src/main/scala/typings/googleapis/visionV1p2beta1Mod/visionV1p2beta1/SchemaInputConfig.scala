package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The desired input location and metadata.
  */
trait SchemaInputConfig extends StObject {
  
  /**
    * The Google Cloud Storage location to read the input from.
    */
  var gcsSource: js.UndefOr[SchemaGcsSource] = js.undefined
  
  /**
    * The type of the file. Currently only &quot;application/pdf&quot; and
    * &quot;image/tiff&quot; are supported. Wildcards are not supported.
    */
  var mimeType: js.UndefOr[String] = js.undefined
}
object SchemaInputConfig {
  
  @scala.inline
  def apply(): SchemaInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInputConfig]
  }
  
  @scala.inline
  implicit class SchemaInputConfigMutableBuilder[Self <: SchemaInputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcsSource(value: SchemaGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
