package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubdivisionsOpt
  extends StObject
     with PrecisionOpt {
  
  var subdivisions: js.UndefOr[js.Array[Curve]] = js.undefined
}
object SubdivisionsOpt {
  
  @scala.inline
  def apply(): SubdivisionsOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubdivisionsOpt]
  }
  
  @scala.inline
  implicit class SubdivisionsOptMutableBuilder[Self <: SubdivisionsOpt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubdivisions(value: js.Array[Curve]): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
    
    @scala.inline
    def setSubdivisionsVarargs(value: Curve*): Self = StObject.set(x, "subdivisions", js.Array(value :_*))
  }
}
