package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidBase_ extends StObject {
  
  var cidBase: js.Any
  
  var ctx: js.Any
  
  var human: js.Any
  
  var timeout: js.Any
}
object CidBase_ {
  
  inline def apply(cidBase: js.Any, ctx: js.Any, human: js.Any, timeout: js.Any): CidBase_ = {
    val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], human = human.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CidBase_]
  }
  
  extension [Self <: CidBase_](x: Self) {
    
    inline def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: js.Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setHuman(value: js.Any): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
