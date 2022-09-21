package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCancel extends StObject {
  
  var onCancel: Any
  
  var onConfirm: Any
}
object OnCancel {
  
  inline def apply(onCancel: Any, onConfirm: Any): OnCancel = {
    val __obj = js.Dynamic.literal(onCancel = onCancel.asInstanceOf[js.Any], onConfirm = onConfirm.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCancel]
  }
  
  extension [Self <: OnCancel](x: Self) {
    
    inline def setOnCancel(value: Any): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
    
    inline def setOnConfirm(value: Any): Self = StObject.set(x, "onConfirm", value.asInstanceOf[js.Any])
  }
}
