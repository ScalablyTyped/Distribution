package typings.materialBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var CSS: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CSS */ Any
}
object Window {
  
  inline def apply(CSS: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CSS */ Any): Window = {
    val __obj = js.Dynamic.literal(CSS = CSS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setCSS(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CSS */ Any): Self = StObject.set(x, "CSS", value.asInstanceOf[js.Any])
  }
}
