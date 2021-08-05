package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions5 extends StObject {
  
  val allowUnknown_2: Boolean
  
  val stripUnknown_2: Boolean
}
object Typeofoptions5 {
  
  inline def apply(allowUnknown_2: Boolean, stripUnknown_2: Boolean): Typeofoptions5 = {
    val __obj = js.Dynamic.literal(allowUnknown_2 = allowUnknown_2.asInstanceOf[js.Any], stripUnknown_2 = stripUnknown_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions5]
  }
  
  extension [Self <: Typeofoptions5](x: Self) {
    
    inline def setAllowUnknown_2(value: Boolean): Self = StObject.set(x, "allowUnknown_2", value.asInstanceOf[js.Any])
    
    inline def setStripUnknown_2(value: Boolean): Self = StObject.set(x, "stripUnknown_2", value.asInstanceOf[js.Any])
  }
}
