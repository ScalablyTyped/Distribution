package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.googima
import typings.jwplayer.jwplayerStrings.mid
import typings.jwplayer.jwplayerStrings.post
import typings.jwplayer.jwplayerStrings.pre
import typings.jwplayer.jwplayerStrings.vast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdImpressionParam extends StObject {
  
  var adposition: pre | mid | post
  
  var adsystem: String
  
  var adtitle: String
  
  var clickThroughUrl: String
  
  var client: vast | googima
  
  var creativetype: String
  
  var linear: String
  
  var mediafile: js.Any
  
  var tag: String
  
  var vastversion: Double
  
  var wrapper: js.Array[js.Any]
}
object AdImpressionParam {
  
  @scala.inline
  def apply(
    adposition: pre | mid | post,
    adsystem: String,
    adtitle: String,
    clickThroughUrl: String,
    client: vast | googima,
    creativetype: String,
    linear: String,
    mediafile: js.Any,
    tag: String,
    vastversion: Double,
    wrapper: js.Array[js.Any]
  ): AdImpressionParam = {
    val __obj = js.Dynamic.literal(adposition = adposition.asInstanceOf[js.Any], adsystem = adsystem.asInstanceOf[js.Any], adtitle = adtitle.asInstanceOf[js.Any], clickThroughUrl = clickThroughUrl.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], creativetype = creativetype.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], mediafile = mediafile.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], vastversion = vastversion.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdImpressionParam]
  }
  
  @scala.inline
  implicit class AdImpressionParamMutableBuilder[Self <: AdImpressionParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdposition(value: pre | mid | post): Self = StObject.set(x, "adposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdsystem(value: String): Self = StObject.set(x, "adsystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdtitle(value: String): Self = StObject.set(x, "adtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUrl(value: String): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: vast | googima): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativetype(value: String): Self = StObject.set(x, "creativetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinear(value: String): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediafile(value: js.Any): Self = StObject.set(x, "mediafile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVastversion(value: Double): Self = StObject.set(x, "vastversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapper(value: js.Array[js.Any]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperVarargs(value: js.Any*): Self = StObject.set(x, "wrapper", js.Array(value :_*))
  }
}
