package typings.kahootJsUpdated.mod

import typings.kahootJsUpdated.anon.Answer
import typings.kahootJsUpdated.anon.ChallengeAlwaysCorrect
import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KahootOptions extends StObject {
  
  /**
    * Modules to load or not to load. All are enabled by default
    */
  var modules: js.UndefOr[Answer] = js.undefined
  
  /**
    * Options used in Challenge quizzes
    */
  var options: js.UndefOr[ChallengeAlwaysCorrect] = js.undefined
  
  var proxy: js.UndefOr[js.Function1[/* options */ RequestOptions, Unit | RequestOptions]] = js.undefined
  
  var wsproxy: js.UndefOr[js.Function1[/* url */ String, WsProxyReturn]] = js.undefined
}
object KahootOptions {
  
  inline def apply(): KahootOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KahootOptions]
  }
  
  extension [Self <: KahootOptions](x: Self) {
    
    inline def setModules(value: Answer): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setOptions(value: ChallengeAlwaysCorrect): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setProxy(value: /* options */ RequestOptions => Unit | RequestOptions): Self = StObject.set(x, "proxy", js.Any.fromFunction1(value))
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setWsproxy(value: /* url */ String => WsProxyReturn): Self = StObject.set(x, "wsproxy", js.Any.fromFunction1(value))
    
    inline def setWsproxyUndefined: Self = StObject.set(x, "wsproxy", js.undefined)
  }
}
