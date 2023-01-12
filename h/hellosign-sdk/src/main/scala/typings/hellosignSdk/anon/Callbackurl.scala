package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callbackurl extends StObject {
  
  var callback_url: js.UndefOr[String] = js.undefined
}
object Callbackurl {
  
  inline def apply(): Callbackurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbackurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Callbackurl] (val x: Self) extends AnyVal {
    
    inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
    
    inline def setCallback_urlUndefined: Self = StObject.set(x, "callback_url", js.undefined)
  }
}
