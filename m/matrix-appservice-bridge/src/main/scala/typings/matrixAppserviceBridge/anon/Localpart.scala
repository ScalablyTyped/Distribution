package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Localpart extends StObject {
  
  var localpart: String
}
object Localpart {
  
  inline def apply(localpart: String): Localpart = {
    val __obj = js.Dynamic.literal(localpart = localpart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Localpart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Localpart] (val x: Self) extends AnyVal {
    
    inline def setLocalpart(value: String): Self = StObject.set(x, "localpart", value.asInstanceOf[js.Any])
  }
}
