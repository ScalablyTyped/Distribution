package typings.instagramPrivateApi.igtvChannelFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvChannelFeedResponseBiographyWithEntities extends StObject {
  
  var entities: js.Array[js.Any]
  
  var raw_text: String
}
object IgtvChannelFeedResponseBiographyWithEntities {
  
  @scala.inline
  def apply(entities: js.Array[js.Any], raw_text: String): IgtvChannelFeedResponseBiographyWithEntities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvChannelFeedResponseBiographyWithEntities]
  }
  
  @scala.inline
  implicit class IgtvChannelFeedResponseBiographyWithEntitiesMutableBuilder[Self <: IgtvChannelFeedResponseBiographyWithEntities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[js.Any]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: js.Any*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setRaw_text(value: String): Self = StObject.set(x, "raw_text", value.asInstanceOf[js.Any])
  }
}
