package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index[Defaults, Name /* <: String */] extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var methods: js.UndefOr[Start] = js.undefined
  
  var name: js.UndefOr[Name] = js.undefined
  
  var options: Defaults
}
object Index {
  
  inline def apply[Defaults, Name /* <: String */](options: Defaults): Index[Defaults, Name] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[Defaults, Name]]
  }
  
  extension [Self <: Index[?, ?], Defaults, Name /* <: String */](x: Self & (Index[Defaults, Name])) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setMethods(value: Start): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: Defaults): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
