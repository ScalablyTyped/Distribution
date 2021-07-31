package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideostream extends StObject {
  
  /**
    * The height, in pixels, of the video resource.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * MIME type of the video stream.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the video stream.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The width, in pixels, of the video resource.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SchemaVideostream {
  
  @scala.inline
  def apply(): SchemaVideostream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideostream]
  }
  
  @scala.inline
  implicit class SchemaVideostreamMutableBuilder[Self <: SchemaVideostream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
