package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Multiple extends StObject {
  
  var multiple: js.UndefOr[String] = js.undefined
}
object Multiple {
  
  @scala.inline
  def apply(): Multiple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multiple]
  }
  
  @scala.inline
  implicit class MultipleMutableBuilder[Self <: Multiple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiple(value: String): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
