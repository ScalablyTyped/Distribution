package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.googima
import typings.jwplayer.jwplayerStrings.vast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdTimeParam extends StObject {
  
  var client: vast | googima
  
  var creativetype: String
  
  var duration: Double
  
  var position: Double
  
  var sequence: Double
  
  var tag: String
}
object AdTimeParam {
  
  @scala.inline
  def apply(
    client: vast | googima,
    creativetype: String,
    duration: Double,
    position: Double,
    sequence: Double,
    tag: String
  ): AdTimeParam = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], creativetype = creativetype.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdTimeParam]
  }
  
  @scala.inline
  implicit class AdTimeParamMutableBuilder[Self <: AdTimeParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: vast | googima): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativetype(value: String): Self = StObject.set(x, "creativetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
