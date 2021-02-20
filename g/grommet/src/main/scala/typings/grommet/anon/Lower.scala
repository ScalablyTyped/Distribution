package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lower extends StObject {
  
  var lower: js.UndefOr[String] = js.native
  
  var upper: js.UndefOr[String] = js.native
}
object Lower {
  
  @scala.inline
  def apply(): Lower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lower]
  }
  
  @scala.inline
  implicit class LowerMutableBuilder[Self <: Lower] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLower(value: String): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerUndefined: Self = StObject.set(x, "lower", js.undefined)
    
    @scala.inline
    def setUpper(value: String): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperUndefined: Self = StObject.set(x, "upper", js.undefined)
  }
}
