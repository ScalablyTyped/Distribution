package typings.kahootJsUpdated.anon

import typings.kahootJsUpdated.mod.WsProxyReturn
import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<kahoot.js-updated.kahoot.js-updated.KahootOptions> */
trait RequiredKahootOptions extends StObject {
  
  var modules: Answer
  
  var options: ChallengeAlwaysCorrect
  
  def proxy(options: RequestOptions): Unit | RequestOptions
  @JSName("proxy")
  var proxy_Original: js.Function1[/* options */ RequestOptions, Unit | RequestOptions]
  
  def wsproxy(url: String): WsProxyReturn
  @JSName("wsproxy")
  var wsproxy_Original: js.Function1[/* url */ String, WsProxyReturn]
}
object RequiredKahootOptions {
  
  inline def apply(
    modules: Answer,
    options: ChallengeAlwaysCorrect,
    proxy: /* options */ RequestOptions => Unit | RequestOptions,
    wsproxy: /* url */ String => WsProxyReturn
  ): RequiredKahootOptions = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], proxy = js.Any.fromFunction1(proxy), wsproxy = js.Any.fromFunction1(wsproxy))
    __obj.asInstanceOf[RequiredKahootOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredKahootOptions] (val x: Self) extends AnyVal {
    
    inline def setModules(value: Answer): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ChallengeAlwaysCorrect): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setProxy(value: /* options */ RequestOptions => Unit | RequestOptions): Self = StObject.set(x, "proxy", js.Any.fromFunction1(value))
    
    inline def setWsproxy(value: /* url */ String => WsProxyReturn): Self = StObject.set(x, "wsproxy", js.Any.fromFunction1(value))
  }
}
