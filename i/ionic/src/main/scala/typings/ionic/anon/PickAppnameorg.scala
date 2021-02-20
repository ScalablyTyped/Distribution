package typings.ionic.anon

import typings.ionic.definitionsMod.Org
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<ionic.ionic/definitions.App, 'name' | 'org'> */
@js.native
trait PickAppnameorg extends StObject {
  
  var name: String = js.native
  
  @JSName("org")
  var org_ : Null | Org = js.native
}
object PickAppnameorg {
  
  @scala.inline
  def apply(name: String): PickAppnameorg = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAppnameorg]
  }
  
  @scala.inline
  implicit class PickAppnameorgMutableBuilder[Self <: PickAppnameorg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: Org): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_Null: Self = StObject.set(x, "org", null)
  }
}
