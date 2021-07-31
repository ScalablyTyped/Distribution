package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnStart extends StObject {
  
  var maximumCount: js.UndefOr[Double] = js.undefined
  
  var onEnd: js.UndefOr[js.Function2[/* totalCount */ Double, /* key */ String, Unit]] = js.undefined
  
  var onStart: js.UndefOr[js.Function2[/* totalCount */ Double, /* key */ String, Unit]] = js.undefined
  
  var online: js.UndefOr[Boolean] = js.undefined
}
object OnStart {
  
  @scala.inline
  def apply(): OnStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnStart]
  }
  
  @scala.inline
  implicit class OnStartMutableBuilder[Self <: OnStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumCount(value: Double): Self = StObject.set(x, "maximumCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumCountUndefined: Self = StObject.set(x, "maximumCount", js.undefined)
    
    @scala.inline
    def setOnEnd(value: (/* totalCount */ Double, /* key */ String) => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    @scala.inline
    def setOnStart(value: (/* totalCount */ Double, /* key */ String) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    @scala.inline
    def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineUndefined: Self = StObject.set(x, "online", js.undefined)
  }
}
