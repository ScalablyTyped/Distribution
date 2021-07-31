package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinishingBailing extends StObject {
  
  var `baling-type`: js.UndefOr[BalingType] = js.undefined
  
  var `baling-when`: js.UndefOr[BalingWhen] = js.undefined
}
object FinishingBailing {
  
  @scala.inline
  def apply(): FinishingBailing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingBailing]
  }
  
  @scala.inline
  implicit class FinishingBailingMutableBuilder[Self <: FinishingBailing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setBaling-type`(value: BalingType): Self = StObject.set(x, "baling-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBaling-typeUndefined`: Self = StObject.set(x, "baling-type", js.undefined)
    
    @scala.inline
    def `setBaling-when`(value: BalingWhen): Self = StObject.set(x, "baling-when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBaling-whenUndefined`: Self = StObject.set(x, "baling-when", js.undefined)
  }
}
