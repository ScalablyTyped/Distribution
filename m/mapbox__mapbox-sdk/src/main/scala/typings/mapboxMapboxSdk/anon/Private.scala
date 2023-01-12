package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Private extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  var recipe: Any
  
  var tilesetId: String
}
object Private {
  
  inline def apply(name: String, recipe: Any, tilesetId: String): Private = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any], tilesetId = tilesetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Private]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Private] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setRecipe(value: Any): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    
    inline def setTilesetId(value: String): Self = StObject.set(x, "tilesetId", value.asInstanceOf[js.Any])
  }
}
