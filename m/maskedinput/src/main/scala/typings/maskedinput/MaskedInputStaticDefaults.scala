package typings.maskedinput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskedInputStaticDefaults extends StObject {
  
  var alias: String
}
object MaskedInputStaticDefaults {
  
  inline def apply(alias: String): MaskedInputStaticDefaults = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedInputStaticDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaskedInputStaticDefaults] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
  }
}
