package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dense extends StObject {
  
  var dense: js.UndefOr[Boolean] = js.native
}
object Dense {
  
  @scala.inline
  def apply(): Dense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dense]
  }
  
  @scala.inline
  implicit class DenseMutableBuilder[Self <: Dense] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
  }
}
