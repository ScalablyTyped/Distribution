package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Medium extends StObject {
  
  var medium: js.UndefOr[String] = js.undefined
}
object Medium {
  
  inline def apply(): Medium = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Medium]
  }
  
  extension [Self <: Medium](x: Self) {
    
    inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
  }
}
