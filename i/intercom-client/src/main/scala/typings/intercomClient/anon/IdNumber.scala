package typings.intercomClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdNumber extends StObject {
  
  var id: Double
}
object IdNumber {
  
  @scala.inline
  def apply(id: Double): IdNumber = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdNumber]
  }
  
  @scala.inline
  implicit class IdNumberMutableBuilder[Self <: IdNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
