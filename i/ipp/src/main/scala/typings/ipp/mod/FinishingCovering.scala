package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinishingCovering extends StObject {
  
  var `covering-name`: js.UndefOr[String] = js.undefined
}
object FinishingCovering {
  
  inline def apply(): FinishingCovering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingCovering]
  }
  
  extension [Self <: FinishingCovering](x: Self) {
    
    inline def `setCovering-name`(value: String): Self = StObject.set(x, "covering-name", value.asInstanceOf[js.Any])
    
    inline def `setCovering-nameUndefined`: Self = StObject.set(x, "covering-name", js.undefined)
  }
}
