package typings.inboxsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadScriptOptions extends StObject {
  
  var nowrap: js.UndefOr[Boolean] = js.undefined
}
object LoadScriptOptions {
  
  inline def apply(): LoadScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadScriptOptions]
  }
  
  extension [Self <: LoadScriptOptions](x: Self) {
    
    inline def setNowrap(value: Boolean): Self = StObject.set(x, "nowrap", value.asInstanceOf[js.Any])
    
    inline def setNowrapUndefined: Self = StObject.set(x, "nowrap", js.undefined)
  }
}
