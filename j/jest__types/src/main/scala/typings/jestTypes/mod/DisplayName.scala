package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayName extends StObject {
  
  var color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ Any
  
  var name: String
}
object DisplayName {
  
  inline def apply(
    color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ Any,
    name: String
  ): DisplayName = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
    
    inline def setColor(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ Any
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
