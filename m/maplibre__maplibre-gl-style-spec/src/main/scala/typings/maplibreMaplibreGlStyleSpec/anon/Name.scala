package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name
  extends StObject
     with typings.maplibreMaplibreGlStyleSpec.mod.InterpolationType {
  
  var name: linear
}
object Name {
  
  inline def apply(): Name = {
    val __obj = js.Dynamic.literal(name = "linear")
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setName(value: linear): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
