package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinishingLaminating extends StObject {
  
  var `laminating-sides`: js.UndefOr[FinishingSides] = js.undefined
  
  var `laminating-type`: js.UndefOr[LaminatingType] = js.undefined
}
object FinishingLaminating {
  
  inline def apply(): FinishingLaminating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingLaminating]
  }
  
  extension [Self <: FinishingLaminating](x: Self) {
    
    inline def `setLaminating-sides`(value: FinishingSides): Self = StObject.set(x, "laminating-sides", value.asInstanceOf[js.Any])
    
    inline def `setLaminating-sidesUndefined`: Self = StObject.set(x, "laminating-sides", js.undefined)
    
    inline def `setLaminating-type`(value: LaminatingType): Self = StObject.set(x, "laminating-type", value.asInstanceOf[js.Any])
    
    inline def `setLaminating-typeUndefined`: Self = StObject.set(x, "laminating-type", js.undefined)
  }
}
