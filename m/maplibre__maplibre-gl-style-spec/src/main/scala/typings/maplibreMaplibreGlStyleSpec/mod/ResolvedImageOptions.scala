package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedImageOptions extends StObject {
  
  var available: Boolean
  
  var name: String
}
object ResolvedImageOptions {
  
  inline def apply(available: Boolean, name: String): ResolvedImageOptions = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedImageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedImageOptions] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
