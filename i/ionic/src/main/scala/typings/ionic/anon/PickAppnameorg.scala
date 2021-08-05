package typings.ionic.anon

import typings.ionic.definitionsMod.Org
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<ionic.ionic/definitions.App, 'name' | 'org'> */
trait PickAppnameorg extends StObject {
  
  var name: String
  
  @JSName("org")
  var org_ : Null | Org
}
object PickAppnameorg {
  
  inline def apply(name: String): PickAppnameorg = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(null)
    __obj.asInstanceOf[PickAppnameorg]
  }
  
  extension [Self <: PickAppnameorg](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: Org): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOrg_Null: Self = StObject.set(x, "org", null)
  }
}
