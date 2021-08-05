package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeOnly extends StObject {
  
  var human: AliasStringDefaultBoolean
  
  var sizeOnly: AliasStringDefaultBoolean
  
  var timeout: CoerceType
}
object SizeOnly {
  
  inline def apply(human: AliasStringDefaultBoolean, sizeOnly: AliasStringDefaultBoolean, timeout: CoerceType): SizeOnly = {
    val __obj = js.Dynamic.literal(human = human.asInstanceOf[js.Any], sizeOnly = sizeOnly.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeOnly]
  }
  
  extension [Self <: SizeOnly](x: Self) {
    
    inline def setHuman(value: AliasStringDefaultBoolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    inline def setSizeOnly(value: AliasStringDefaultBoolean): Self = StObject.set(x, "sizeOnly", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: CoerceType): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
