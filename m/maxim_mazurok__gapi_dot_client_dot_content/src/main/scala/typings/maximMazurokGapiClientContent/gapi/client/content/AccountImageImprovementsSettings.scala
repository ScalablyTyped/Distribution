package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountImageImprovementsSettings extends StObject {
  
  /** Enables automatic image improvements. */
  var allowAutomaticImageImprovements: js.UndefOr[Boolean] = js.undefined
}
object AccountImageImprovementsSettings {
  
  inline def apply(): AccountImageImprovementsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountImageImprovementsSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountImageImprovementsSettings] (val x: Self) extends AnyVal {
    
    inline def setAllowAutomaticImageImprovements(value: Boolean): Self = StObject.set(x, "allowAutomaticImageImprovements", value.asInstanceOf[js.Any])
    
    inline def setAllowAutomaticImageImprovementsUndefined: Self = StObject.set(x, "allowAutomaticImageImprovements", js.undefined)
  }
}
