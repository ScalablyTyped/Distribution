package typings.knockoutMapper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutStatic extends StObject {
  
  var mapper: KnockoutMapper
}
object KnockoutStatic {
  
  inline def apply(mapper: KnockoutMapper): KnockoutStatic = {
    val __obj = js.Dynamic.literal(mapper = mapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  extension [Self <: KnockoutStatic](x: Self) {
    
    inline def setMapper(value: KnockoutMapper): Self = StObject.set(x, "mapper", value.asInstanceOf[js.Any])
  }
}
