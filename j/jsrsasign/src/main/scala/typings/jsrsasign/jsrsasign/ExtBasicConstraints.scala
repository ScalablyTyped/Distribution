package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignStrings.basicConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtBasicConstraints
  extends StObject
     with ExtParam {
  
  var cA: js.UndefOr[Boolean] = js.undefined
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: basicConstraints
  
  var pathLen: js.UndefOr[Double] = js.undefined
}
object ExtBasicConstraints {
  
  inline def apply(): ExtBasicConstraints = {
    val __obj = js.Dynamic.literal(extname = "basicConstraints")
    __obj.asInstanceOf[ExtBasicConstraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtBasicConstraints] (val x: Self) extends AnyVal {
    
    inline def setCA(value: Boolean): Self = StObject.set(x, "cA", value.asInstanceOf[js.Any])
    
    inline def setCAUndefined: Self = StObject.set(x, "cA", js.undefined)
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: basicConstraints): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setPathLen(value: Double): Self = StObject.set(x, "pathLen", value.asInstanceOf[js.Any])
    
    inline def setPathLenUndefined: Self = StObject.set(x, "pathLen", js.undefined)
  }
}
