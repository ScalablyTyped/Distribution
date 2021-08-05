package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions1 extends StObject {
  
  val allowUnknown: Boolean
  
  val stripUnknown: Boolean
}
object Typeofoptions1 {
  
  inline def apply(allowUnknown: Boolean, stripUnknown: Boolean): Typeofoptions1 = {
    val __obj = js.Dynamic.literal(allowUnknown = allowUnknown.asInstanceOf[js.Any], stripUnknown = stripUnknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions1]
  }
  
  extension [Self <: Typeofoptions1](x: Self) {
    
    inline def setAllowUnknown(value: Boolean): Self = StObject.set(x, "allowUnknown", value.asInstanceOf[js.Any])
    
    inline def setStripUnknown(value: Boolean): Self = StObject.set(x, "stripUnknown", value.asInstanceOf[js.Any])
  }
}
