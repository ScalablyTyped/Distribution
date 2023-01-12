package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResourceType extends StObject {
  
  var Glyphs: /* keyof this */ String
  
  var Image: /* keyof this */ String
  
  var Source: /* keyof this */ String
  
  var SpriteImage: /* keyof this */ String
  
  var SpriteJSON: /* keyof this */ String
  
  var Style: /* keyof this */ String
  
  var Tile: /* keyof this */ String
  
  var Unknown: /* keyof this */ String
}
object IResourceType {
  
  inline def apply(
    Glyphs: /* keyof this */ String,
    Image: /* keyof this */ String,
    Source: /* keyof this */ String,
    SpriteImage: /* keyof this */ String,
    SpriteJSON: /* keyof this */ String,
    Style: /* keyof this */ String,
    Tile: /* keyof this */ String,
    Unknown: /* keyof this */ String
  ): IResourceType = {
    val __obj = js.Dynamic.literal(Glyphs = Glyphs.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], SpriteImage = SpriteImage.asInstanceOf[js.Any], SpriteJSON = SpriteJSON.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Tile = Tile.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IResourceType] (val x: Self) extends AnyVal {
    
    inline def setGlyphs(value: /* keyof this */ String): Self = StObject.set(x, "Glyphs", value.asInstanceOf[js.Any])
    
    inline def setImage(value: /* keyof this */ String): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setSource(value: /* keyof this */ String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSpriteImage(value: /* keyof this */ String): Self = StObject.set(x, "SpriteImage", value.asInstanceOf[js.Any])
    
    inline def setSpriteJSON(value: /* keyof this */ String): Self = StObject.set(x, "SpriteJSON", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: /* keyof this */ String): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setTile(value: /* keyof this */ String): Self = StObject.set(x, "Tile", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: /* keyof this */ String): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
  }
}
