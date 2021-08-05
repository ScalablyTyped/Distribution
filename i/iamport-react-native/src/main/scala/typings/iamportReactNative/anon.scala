package typings.iamportReactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cardquota extends StObject {
    
    var card_quota: js.UndefOr[Double] = js.undefined
  }
  object Cardquota {
    
    inline def apply(): Cardquota = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cardquota]
    }
    
    extension [Self <: Cardquota](x: Self) {
      
      inline def setCard_quota(value: Double): Self = StObject.set(x, "card_quota", value.asInstanceOf[js.Any])
      
      inline def setCard_quotaUndefined: Self = StObject.set(x, "card_quota", js.undefined)
    }
  }
}
