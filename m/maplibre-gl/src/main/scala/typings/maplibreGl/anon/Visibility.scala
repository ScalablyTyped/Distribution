package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.none
import typings.maplibreGl.maplibreGlStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visibility extends StObject {
  
  var visibility: js.UndefOr[visible | none] = js.undefined
}
object Visibility {
  
  inline def apply(): Visibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Visibility] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: visible | none): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
