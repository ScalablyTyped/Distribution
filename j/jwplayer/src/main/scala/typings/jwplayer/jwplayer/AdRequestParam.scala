package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.googima
import typings.jwplayer.jwplayerStrings.mid
import typings.jwplayer.jwplayerStrings.post
import typings.jwplayer.jwplayerStrings.pre
import typings.jwplayer.jwplayerStrings.vast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdRequestParam extends StObject {
  
  var adposition: pre | mid | post
  
  var client: vast | googima
  
  var offset: pre | mid | post
  
  var tag: String
}
object AdRequestParam {
  
  @scala.inline
  def apply(adposition: pre | mid | post, client: vast | googima, offset: pre | mid | post, tag: String): AdRequestParam = {
    val __obj = js.Dynamic.literal(adposition = adposition.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdRequestParam]
  }
  
  @scala.inline
  implicit class AdRequestParamMutableBuilder[Self <: AdRequestParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdposition(value: pre | mid | post): Self = StObject.set(x, "adposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: vast | googima): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: pre | mid | post): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
