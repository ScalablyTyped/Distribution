package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Age extends StObject {
  
  var age: js.UndefOr[Double] = js.undefined
}
object Age {
  
  @scala.inline
  def apply(): Age = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Age]
  }
  
  @scala.inline
  implicit class AgeMutableBuilder[Self <: Age] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
  }
}
