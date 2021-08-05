package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchMyInterests extends StObject {
  
  var matchMyInterests: js.UndefOr[Optedstate] = js.undefined
  
  var moreFromAuthors: js.UndefOr[Optedstate] = js.undefined
  
  var moreFromSeries: js.UndefOr[Optedstate] = js.undefined
  
  var priceDrop: js.UndefOr[Optedstate] = js.undefined
  
  var rewardExpirations: js.UndefOr[Optedstate] = js.undefined
}
object MatchMyInterests {
  
  inline def apply(): MatchMyInterests = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchMyInterests]
  }
  
  extension [Self <: MatchMyInterests](x: Self) {
    
    inline def setMatchMyInterests(value: Optedstate): Self = StObject.set(x, "matchMyInterests", value.asInstanceOf[js.Any])
    
    inline def setMatchMyInterestsUndefined: Self = StObject.set(x, "matchMyInterests", js.undefined)
    
    inline def setMoreFromAuthors(value: Optedstate): Self = StObject.set(x, "moreFromAuthors", value.asInstanceOf[js.Any])
    
    inline def setMoreFromAuthorsUndefined: Self = StObject.set(x, "moreFromAuthors", js.undefined)
    
    inline def setMoreFromSeries(value: Optedstate): Self = StObject.set(x, "moreFromSeries", value.asInstanceOf[js.Any])
    
    inline def setMoreFromSeriesUndefined: Self = StObject.set(x, "moreFromSeries", js.undefined)
    
    inline def setPriceDrop(value: Optedstate): Self = StObject.set(x, "priceDrop", value.asInstanceOf[js.Any])
    
    inline def setPriceDropUndefined: Self = StObject.set(x, "priceDrop", js.undefined)
    
    inline def setRewardExpirations(value: Optedstate): Self = StObject.set(x, "rewardExpirations", value.asInstanceOf[js.Any])
    
    inline def setRewardExpirationsUndefined: Self = StObject.set(x, "rewardExpirations", js.undefined)
  }
}
