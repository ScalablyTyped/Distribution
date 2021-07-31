package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseModelGeometry extends StObject {
  
  var useModelGeometry: js.UndefOr[Boolean] = js.undefined
}
object UseModelGeometry {
  
  @scala.inline
  def apply(): UseModelGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseModelGeometry]
  }
  
  @scala.inline
  implicit class UseModelGeometryMutableBuilder[Self <: UseModelGeometry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseModelGeometry(value: Boolean): Self = StObject.set(x, "useModelGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseModelGeometryUndefined: Self = StObject.set(x, "useModelGeometry", js.undefined)
  }
}
