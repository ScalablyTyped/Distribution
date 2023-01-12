package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.ExtNameConstraints
import typings.jsrsasign.jsrsasign.GeneralSubtree
import typings.jsrsasign.jsrsasignStrings.nameConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exclude
  extends StObject
     with ExtNameConstraints {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var exclude: js.Array[GeneralSubtree]
  
  var extname: nameConstraints
}
object Exclude {
  
  inline def apply(exclude: js.Array[GeneralSubtree]): Exclude = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], extname = "nameConstraints")
    __obj.asInstanceOf[Exclude]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Exclude] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExclude(value: js.Array[GeneralSubtree]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeVarargs(value: GeneralSubtree*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExtname(value: nameConstraints): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
  }
}
