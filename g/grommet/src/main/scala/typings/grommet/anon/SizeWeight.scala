package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeWeight extends StObject {
  
  var size: js.UndefOr[String] = js.undefined
  
  var weight: js.UndefOr[String] = js.undefined
}
object SizeWeight {
  
  @scala.inline
  def apply(): SizeWeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeWeight]
  }
  
  @scala.inline
  implicit class SizeWeightMutableBuilder[Self <: SizeWeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
