package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrecisionOpt extends StObject {
  
  var precision: js.UndefOr[Double] = js.native
}
object PrecisionOpt {
  
  @scala.inline
  def apply(): PrecisionOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrecisionOpt]
  }
  
  @scala.inline
  implicit class PrecisionOptMutableBuilder[Self <: PrecisionOpt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
  }
}
