package typings.grommet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictx
  extends /* x */ StringDictionary[js.UndefOr[BorderSize]] {
  
  var large: js.UndefOr[BorderSize] = js.native
  
  var medium: js.UndefOr[BorderSize] = js.native
  
  var small: js.UndefOr[BorderSize] = js.native
}
object Dictx {
  
  @scala.inline
  def apply(): Dictx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictx]
  }
  
  @scala.inline
  implicit class DictxMutableBuilder[Self <: Dictx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLarge(value: BorderSize): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    @scala.inline
    def setMedium(value: BorderSize): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    @scala.inline
    def setSmall(value: BorderSize): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
  }
}
