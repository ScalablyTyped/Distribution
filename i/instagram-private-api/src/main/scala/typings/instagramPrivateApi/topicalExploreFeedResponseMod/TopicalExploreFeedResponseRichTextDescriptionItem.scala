package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseRichTextDescriptionItem extends StObject {
  
  var block_type: String
  
  var depth: Double
  
  var text_with_entities: TopicalExploreFeedResponseTextWithEntities
}
object TopicalExploreFeedResponseRichTextDescriptionItem {
  
  inline def apply(block_type: String, depth: Double, text_with_entities: TopicalExploreFeedResponseTextWithEntities): TopicalExploreFeedResponseRichTextDescriptionItem = {
    val __obj = js.Dynamic.literal(block_type = block_type.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], text_with_entities = text_with_entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseRichTextDescriptionItem]
  }
  
  extension [Self <: TopicalExploreFeedResponseRichTextDescriptionItem](x: Self) {
    
    inline def setBlock_type(value: String): Self = StObject.set(x, "block_type", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setText_with_entities(value: TopicalExploreFeedResponseTextWithEntities): Self = StObject.set(x, "text_with_entities", value.asInstanceOf[js.Any])
  }
}
