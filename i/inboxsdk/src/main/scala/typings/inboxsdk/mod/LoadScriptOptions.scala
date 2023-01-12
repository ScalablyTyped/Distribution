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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadScriptOptions] (val x: Self) extends AnyVal {
    
    inline def setNowrap(value: Boolean): Self = StObject.set(x, "nowrap", value.asInstanceOf[js.Any])
    
    inline def setNowrapUndefined: Self = StObject.set(x, "nowrap", js.undefined)
  }
}
