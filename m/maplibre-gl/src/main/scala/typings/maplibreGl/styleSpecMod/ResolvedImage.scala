package typings.maplibreGl.styleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedImage
  extends StObject
     with _Value {
  
  var available: Boolean
  
  var name: String
}
object ResolvedImage {
  
  inline def apply(available: Boolean, name: String): ResolvedImage = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedImage]
  }
  
  extension [Self <: ResolvedImage](x: Self) {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
