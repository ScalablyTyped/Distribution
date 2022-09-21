package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipeTilesetId extends StObject {
  
  var recipe: Any
  
  var tilesetId: String
}
object RecipeTilesetId {
  
  inline def apply(recipe: Any, tilesetId: String): RecipeTilesetId = {
    val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any], tilesetId = tilesetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipeTilesetId]
  }
  
  extension [Self <: RecipeTilesetId](x: Self) {
    
    inline def setRecipe(value: Any): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    
    inline def setTilesetId(value: String): Self = StObject.set(x, "tilesetId", value.asInstanceOf[js.Any])
  }
}
