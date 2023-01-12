package typings.maplibreGl.anon

import typings.maplibreGl.mod.OverscaledTileID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icons extends StObject {
  
  var icons: js.Array[String]
  
  var source: String
  
  var tileID: OverscaledTileID
  
  var `type`: String
}
object Icons {
  
  inline def apply(icons: js.Array[String], source: String, tileID: OverscaledTileID, `type`: String): Icons = {
    val __obj = js.Dynamic.literal(icons = icons.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tileID = tileID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Icons] (val x: Self) extends AnyVal {
    
    inline def setIcons(value: js.Array[String]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsVarargs(value: String*): Self = StObject.set(x, "icons", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTileID(value: OverscaledTileID): Self = StObject.set(x, "tileID", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
