package typings.ionicReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var Ionic: js.Any
  
  var cordova: js.Any
}
object Window {
  
  inline def apply(Ionic: js.Any, cordova: js.Any): Window = {
    val __obj = js.Dynamic.literal(Ionic = Ionic.asInstanceOf[js.Any], cordova = cordova.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setCordova(value: js.Any): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
    
    inline def setIonic(value: js.Any): Self = StObject.set(x, "Ionic", value.asInstanceOf[js.Any])
  }
}
