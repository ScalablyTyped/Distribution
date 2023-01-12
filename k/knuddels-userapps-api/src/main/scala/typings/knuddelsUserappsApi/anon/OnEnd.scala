package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEnd extends StObject {
  
  var onEnd: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.undefined
  
  var onStart: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.undefined
  
  var online: js.UndefOr[Boolean] = js.undefined
}
object OnEnd {
  
  inline def apply(): OnEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnEnd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnEnd] (val x: Self) extends AnyVal {
    
    inline def setOnEnd(value: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction2(value))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnStart(value: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    inline def setOnlineUndefined: Self = StObject.set(x, "online", js.undefined)
  }
}
