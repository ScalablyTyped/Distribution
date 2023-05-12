package typings.linguiConf.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleObject
  extends StObject
     with /* locale */ StringDictionary[js.Array[String] | String] {
  
  var default: js.UndefOr[String] = js.undefined
}
object LocaleObject {
  
  inline def apply(): LocaleObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocaleObject] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
