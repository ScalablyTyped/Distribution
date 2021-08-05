package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions9 extends StObject {
  
  val allowUnknown_4: Boolean
  
  val stripUnknown_4: Boolean
}
object Typeofoptions9 {
  
  inline def apply(allowUnknown_4: Boolean, stripUnknown_4: Boolean): Typeofoptions9 = {
    val __obj = js.Dynamic.literal(allowUnknown_4 = allowUnknown_4.asInstanceOf[js.Any], stripUnknown_4 = stripUnknown_4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions9]
  }
  
  extension [Self <: Typeofoptions9](x: Self) {
    
    inline def setAllowUnknown_4(value: Boolean): Self = StObject.set(x, "allowUnknown_4", value.asInstanceOf[js.Any])
    
    inline def setStripUnknown_4(value: Boolean): Self = StObject.set(x, "stripUnknown_4", value.asInstanceOf[js.Any])
  }
}
