package typings.iamportReactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cardquota extends StObject {
    
    var card_quota: js.UndefOr[Double] = js.native
  }
  object Cardquota {
    
    @scala.inline
    def apply(): Cardquota = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cardquota]
    }
    
    @scala.inline
    implicit class CardquotaMutableBuilder[Self <: Cardquota] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCard_quota(value: Double): Self = StObject.set(x, "card_quota", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCard_quotaUndefined: Self = StObject.set(x, "card_quota", js.undefined)
    }
  }
}
