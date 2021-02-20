package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishingCovering extends StObject {
  
  var `covering-name`: js.UndefOr[String] = js.native
}
object FinishingCovering {
  
  @scala.inline
  def apply(): FinishingCovering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingCovering]
  }
  
  @scala.inline
  implicit class FinishingCoveringMutableBuilder[Self <: FinishingCovering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setCovering-name`(value: String): Self = StObject.set(x, "covering-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCovering-nameUndefined`: Self = StObject.set(x, "covering-name", js.undefined)
  }
}
