package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hapi extends StObject {
  
  var hapi: js.UndefOr[String] = js.undefined
  
  var node: js.UndefOr[String] = js.undefined
}
object Hapi {
  
  inline def apply(): Hapi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hapi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hapi] (val x: Self) extends AnyVal {
    
    inline def setHapi(value: String): Self = StObject.set(x, "hapi", value.asInstanceOf[js.Any])
    
    inline def setHapiUndefined: Self = StObject.set(x, "hapi", js.undefined)
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
  }
}
