package typings.maskedinput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskedInputStaticDefaults extends StObject {
  
  var alias: String = js.native
}
object MaskedInputStaticDefaults {
  
  @scala.inline
  def apply(alias: String): MaskedInputStaticDefaults = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedInputStaticDefaults]
  }
  
  @scala.inline
  implicit class MaskedInputStaticDefaultsMutableBuilder[Self <: MaskedInputStaticDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
  }
}
