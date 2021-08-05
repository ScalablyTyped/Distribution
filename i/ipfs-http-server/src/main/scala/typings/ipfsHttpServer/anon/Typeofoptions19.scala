package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions19 extends StObject {
  
  val allowUnknown_9: Boolean
  
  val stripUnknown_9: Boolean
}
object Typeofoptions19 {
  
  inline def apply(allowUnknown_9: Boolean, stripUnknown_9: Boolean): Typeofoptions19 = {
    val __obj = js.Dynamic.literal(allowUnknown_9 = allowUnknown_9.asInstanceOf[js.Any], stripUnknown_9 = stripUnknown_9.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions19]
  }
  
  extension [Self <: Typeofoptions19](x: Self) {
    
    inline def setAllowUnknown_9(value: Boolean): Self = StObject.set(x, "allowUnknown_9", value.asInstanceOf[js.Any])
    
    inline def setStripUnknown_9(value: Boolean): Self = StObject.set(x, "stripUnknown_9", value.asInstanceOf[js.Any])
  }
}
