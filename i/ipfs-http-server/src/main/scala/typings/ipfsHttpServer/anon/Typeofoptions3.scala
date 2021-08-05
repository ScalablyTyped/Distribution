package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions3 extends StObject {
  
  val allowUnknown_1: Boolean
  
  val stripUnknown_1: Boolean
}
object Typeofoptions3 {
  
  inline def apply(allowUnknown_1: Boolean, stripUnknown_1: Boolean): Typeofoptions3 = {
    val __obj = js.Dynamic.literal(allowUnknown_1 = allowUnknown_1.asInstanceOf[js.Any], stripUnknown_1 = stripUnknown_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions3]
  }
  
  extension [Self <: Typeofoptions3](x: Self) {
    
    inline def setAllowUnknown_1(value: Boolean): Self = StObject.set(x, "allowUnknown_1", value.asInstanceOf[js.Any])
    
    inline def setStripUnknown_1(value: Boolean): Self = StObject.set(x, "stripUnknown_1", value.asInstanceOf[js.Any])
  }
}
