package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video content for a creative.
  */
trait SchemaVideoContent extends StObject {
  
  /**
    * The URL to fetch a video ad.
    */
  var videoUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The contents of a VAST document for a video ad. This document should
    * conform to the VAST 2.0 or 3.0 standard.
    */
  var videoVastXml: js.UndefOr[String] = js.undefined
}
object SchemaVideoContent {
  
  @scala.inline
  def apply(): SchemaVideoContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoContent]
  }
  
  @scala.inline
  implicit class SchemaVideoContentMutableBuilder[Self <: SchemaVideoContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVideoUrl(value: String): Self = StObject.set(x, "videoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUrlUndefined: Self = StObject.set(x, "videoUrl", js.undefined)
    
    @scala.inline
    def setVideoVastXml(value: String): Self = StObject.set(x, "videoVastXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoVastXmlUndefined: Self = StObject.set(x, "videoVastXml", js.undefined)
  }
}
