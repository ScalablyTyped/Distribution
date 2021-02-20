package typings.knockoutAmdHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutStatic extends StObject {
  
  var amdTemplateEngine: KnockoutAMDTemplate = js.native
}
object KnockoutStatic {
  
  @scala.inline
  def apply(amdTemplateEngine: KnockoutAMDTemplate): KnockoutStatic = {
    val __obj = js.Dynamic.literal(amdTemplateEngine = amdTemplateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  @scala.inline
  implicit class KnockoutStaticMutableBuilder[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmdTemplateEngine(value: KnockoutAMDTemplate): Self = StObject.set(x, "amdTemplateEngine", value.asInstanceOf[js.Any])
  }
}
