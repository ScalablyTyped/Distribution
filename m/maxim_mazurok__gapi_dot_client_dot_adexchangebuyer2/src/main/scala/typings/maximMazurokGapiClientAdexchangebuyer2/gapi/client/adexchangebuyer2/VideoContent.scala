package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoContent extends StObject {
  
  /** The URL to fetch a video ad. */
  var videoUrl: js.UndefOr[String] = js.undefined
  
  /** The contents of a VAST document for a video ad. This document should conform to the VAST 2.0 or 3.0 standard. */
  var videoVastXml: js.UndefOr[String] = js.undefined
}
object VideoContent {
  
  inline def apply(): VideoContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoContent] (val x: Self) extends AnyVal {
    
    inline def setVideoUrl(value: String): Self = StObject.set(x, "videoUrl", value.asInstanceOf[js.Any])
    
    inline def setVideoUrlUndefined: Self = StObject.set(x, "videoUrl", js.undefined)
    
    inline def setVideoVastXml(value: String): Self = StObject.set(x, "videoVastXml", value.asInstanceOf[js.Any])
    
    inline def setVideoVastXmlUndefined: Self = StObject.set(x, "videoVastXml", js.undefined)
  }
}
