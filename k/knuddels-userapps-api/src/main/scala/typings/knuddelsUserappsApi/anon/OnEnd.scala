package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnEnd extends StObject {
  
  var onEnd: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.native
  
  var onStart: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.native
  
  var online: js.UndefOr[Boolean] = js.native
}
object OnEnd {
  
  @scala.inline
  def apply(): OnEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnEnd]
  }
  
  @scala.inline
  implicit class OnEndMutableBuilder[Self <: OnEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnEnd(value: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    @scala.inline
    def setOnStart(value: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    @scala.inline
    def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineUndefined: Self = StObject.set(x, "online", js.undefined)
  }
}
