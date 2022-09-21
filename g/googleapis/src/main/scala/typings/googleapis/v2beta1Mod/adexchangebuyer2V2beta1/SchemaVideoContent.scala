package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoContent extends StObject {
  
  /**
    * The URL to fetch a video ad.
    */
  var videoUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The contents of a VAST document for a video ad. This document should conform to the VAST 2.0 or 3.0 standard.
    */
  var videoVastXml: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideoContent {
  
  inline def apply(): SchemaVideoContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoContent]
  }
  
  extension [Self <: SchemaVideoContent](x: Self) {
    
    inline def setVideoUrl(value: String): Self = StObject.set(x, "videoUrl", value.asInstanceOf[js.Any])
    
    inline def setVideoUrlNull: Self = StObject.set(x, "videoUrl", null)
    
    inline def setVideoUrlUndefined: Self = StObject.set(x, "videoUrl", js.undefined)
    
    inline def setVideoVastXml(value: String): Self = StObject.set(x, "videoVastXml", value.asInstanceOf[js.Any])
    
    inline def setVideoVastXmlNull: Self = StObject.set(x, "videoVastXml", null)
    
    inline def setVideoVastXmlUndefined: Self = StObject.set(x, "videoVastXml", js.undefined)
  }
}
