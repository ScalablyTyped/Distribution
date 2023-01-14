package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonRevokedInterval extends StObject {
  
  var from: js.UndefOr[Double] = js.undefined
  
  var to: js.UndefOr[Double] = js.undefined
}
object NonRevokedInterval {
  
  inline def apply(): NonRevokedInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonRevokedInterval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonRevokedInterval] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
