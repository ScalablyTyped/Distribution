package typings.ionicReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var Ionic: js.Any = js.native
  
  var cordova: js.Any = js.native
}
object Window {
  
  @scala.inline
  def apply(Ionic: js.Any, cordova: js.Any): Window = {
    val __obj = js.Dynamic.literal(Ionic = Ionic.asInstanceOf[js.Any], cordova = cordova.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCordova(value: js.Any): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIonic(value: js.Any): Self = StObject.set(x, "Ionic", value.asInstanceOf[js.Any])
  }
}
