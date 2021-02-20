package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuiteInfo extends StObject {
  
  var totalSpecsDefined: Double = js.native
}
object SuiteInfo {
  
  @scala.inline
  def apply(totalSpecsDefined: Double): SuiteInfo = {
    val __obj = js.Dynamic.literal(totalSpecsDefined = totalSpecsDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteInfo]
  }
  
  @scala.inline
  implicit class SuiteInfoMutableBuilder[Self <: SuiteInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotalSpecsDefined(value: Double): Self = StObject.set(x, "totalSpecsDefined", value.asInstanceOf[js.Any])
  }
}
