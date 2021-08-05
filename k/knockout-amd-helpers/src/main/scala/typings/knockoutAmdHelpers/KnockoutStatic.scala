package typings.knockoutAmdHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutStatic extends StObject {
  
  var amdTemplateEngine: KnockoutAMDTemplate
}
object KnockoutStatic {
  
  inline def apply(amdTemplateEngine: KnockoutAMDTemplate): KnockoutStatic = {
    val __obj = js.Dynamic.literal(amdTemplateEngine = amdTemplateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  extension [Self <: KnockoutStatic](x: Self) {
    
    inline def setAmdTemplateEngine(value: KnockoutAMDTemplate): Self = StObject.set(x, "amdTemplateEngine", value.asInstanceOf[js.Any])
  }
}
