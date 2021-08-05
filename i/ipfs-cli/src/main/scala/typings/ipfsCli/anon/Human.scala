package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Human extends StObject {
  
  var ctx: Print
  
  var human: js.Any
  
  var sizeOnly: js.Any
  
  var timeout: js.Any
}
object Human {
  
  inline def apply(ctx: Print, human: js.Any, sizeOnly: js.Any, timeout: js.Any): Human = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], human = human.asInstanceOf[js.Any], sizeOnly = sizeOnly.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Human]
  }
  
  extension [Self <: Human](x: Self) {
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setHuman(value: js.Any): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    inline def setSizeOnly(value: js.Any): Self = StObject.set(x, "sizeOnly", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
