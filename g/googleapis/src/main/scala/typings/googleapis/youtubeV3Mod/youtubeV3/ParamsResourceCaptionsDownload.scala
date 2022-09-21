package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCaptionsDownload
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the caption track to download, required for One Platform.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the Google+ Page for the channel that the request is be on behalf of
    */
  var onBehalfOf: js.UndefOr[String] = js.undefined
  
  /**
    * *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  
  /**
    * Convert the captions into this format. Supported options are sbv, srt, and vtt.
    */
  var tfmt: js.UndefOr[String] = js.undefined
  
  /**
    * tlang is the language code; machine translate the captions into this language.
    */
  var tlang: js.UndefOr[String] = js.undefined
}
object ParamsResourceCaptionsDownload {
  
  inline def apply(): ParamsResourceCaptionsDownload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCaptionsDownload]
  }
  
  extension [Self <: ParamsResourceCaptionsDownload](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOnBehalfOf(value: String): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    inline def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
    
    inline def setTfmt(value: String): Self = StObject.set(x, "tfmt", value.asInstanceOf[js.Any])
    
    inline def setTfmtUndefined: Self = StObject.set(x, "tfmt", js.undefined)
    
    inline def setTlang(value: String): Self = StObject.set(x, "tlang", value.asInstanceOf[js.Any])
    
    inline def setTlangUndefined: Self = StObject.set(x, "tlang", js.undefined)
  }
}
