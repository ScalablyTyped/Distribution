package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoerceDescribeType extends StObject {
  
  var alias: String
  
  def coerce(`val`: js.Any): js.UndefOr[js.Object]
  
  var describe: String
  
  var `type`: String
}
object CoerceDescribeType {
  
  inline def apply(alias: String, coerce: js.Any => js.UndefOr[js.Object], describe: String, `type`: String): CoerceDescribeType = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], coerce = js.Any.fromFunction1(coerce), describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoerceDescribeType]
  }
  
  extension [Self <: CoerceDescribeType](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setCoerce(value: js.Any => js.UndefOr[js.Object]): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
    
    inline def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
