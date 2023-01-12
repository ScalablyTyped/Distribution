package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recipe extends StObject {
  
  var recipe: Any
}
object Recipe {
  
  inline def apply(recipe: Any): Recipe = {
    val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recipe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Recipe] (val x: Self) extends AnyVal {
    
    inline def setRecipe(value: Any): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
  }
}
