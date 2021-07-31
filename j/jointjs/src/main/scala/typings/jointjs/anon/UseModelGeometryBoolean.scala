package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseModelGeometryBoolean extends StObject {
  
  var useModelGeometry: Boolean
}
object UseModelGeometryBoolean {
  
  @scala.inline
  def apply(useModelGeometry: Boolean): UseModelGeometryBoolean = {
    val __obj = js.Dynamic.literal(useModelGeometry = useModelGeometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseModelGeometryBoolean]
  }
  
  @scala.inline
  implicit class UseModelGeometryBooleanMutableBuilder[Self <: UseModelGeometryBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseModelGeometry(value: Boolean): Self = StObject.set(x, "useModelGeometry", value.asInstanceOf[js.Any])
  }
}
