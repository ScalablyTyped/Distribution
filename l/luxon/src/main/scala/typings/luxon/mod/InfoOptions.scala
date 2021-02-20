package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoOptions extends StObject {
  
  var locale: js.UndefOr[String] = js.native
}
object InfoOptions {
  
  @scala.inline
  def apply(): InfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoOptions]
  }
  
  @scala.inline
  implicit class InfoOptionsMutableBuilder[Self <: InfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
