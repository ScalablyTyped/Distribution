package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent hellosign-sdk.hellosign-sdk.GenericObject<{}> */
trait OAuth
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var refresh_token: js.UndefOr[String] = js.undefined
}
object OAuth {
  
  inline def apply(): OAuth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OAuth] (val x: Self) extends AnyVal {
    
    inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
  }
}
