package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.ExtNameConstraints
import typings.jsrsasign.jsrsasign.GeneralSubtree
import typings.jsrsasign.jsrsasignStrings.nameConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permit
  extends StObject
     with ExtNameConstraints {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: nameConstraints
  
  var permit: js.Array[GeneralSubtree]
}
object Permit {
  
  inline def apply(permit: js.Array[GeneralSubtree]): Permit = {
    val __obj = js.Dynamic.literal(extname = "nameConstraints", permit = permit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Permit] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: nameConstraints): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setPermit(value: js.Array[GeneralSubtree]): Self = StObject.set(x, "permit", value.asInstanceOf[js.Any])
    
    inline def setPermitVarargs(value: GeneralSubtree*): Self = StObject.set(x, "permit", js.Array(value*))
  }
}
