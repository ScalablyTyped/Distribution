package typings.ipfsCli.anon

import typings.parseDuration.mod.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoerceType extends StObject {
  
  def coerce(str: String): Double | Null
  def coerce(str: String, format: Units): Double | Null
  @JSName("coerce")
  var coerce_Original: FnCall
  
  var `type`: String
}
object CoerceType {
  
  inline def apply(coerce: FnCall, `type`: String): CoerceType = {
    val __obj = js.Dynamic.literal(coerce = coerce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoerceType]
  }
  
  extension [Self <: CoerceType](x: Self) {
    
    inline def setCoerce(value: FnCall): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
