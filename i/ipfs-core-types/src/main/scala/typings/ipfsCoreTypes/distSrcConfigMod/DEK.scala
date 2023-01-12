package typings.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DEK extends StObject {
  
  var hash: js.UndefOr[String] = js.undefined
  
  var iterationCount: js.UndefOr[Double] = js.undefined
  
  var keyLength: js.UndefOr[Double] = js.undefined
  
  var salt: js.UndefOr[String] = js.undefined
}
object DEK {
  
  inline def apply(): DEK = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DEK]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DEK] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
    
    inline def setIterationCountUndefined: Self = StObject.set(x, "iterationCount", js.undefined)
    
    inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    
    inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
  }
}
