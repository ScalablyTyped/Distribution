package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictk
  extends StObject
     with /**
  * Other properties which may be included.
  */
/* prop */ StringDictionary[Any] {
  
  var device_display_name: js.UndefOr[String] = js.undefined
}
object Dictk {
  
  inline def apply(): Dictk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictk]
  }
  
  extension [Self <: Dictk](x: Self) {
    
    inline def setDevice_display_name(value: String): Self = StObject.set(x, "device_display_name", value.asInstanceOf[js.Any])
    
    inline def setDevice_display_nameUndefined: Self = StObject.set(x, "device_display_name", js.undefined)
  }
}
