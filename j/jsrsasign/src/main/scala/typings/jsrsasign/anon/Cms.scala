package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cms extends StObject {
  
  var cms: String
}
object Cms {
  
  inline def apply(cms: String): Cms = {
    val __obj = js.Dynamic.literal(cms = cms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cms] (val x: Self) extends AnyVal {
    
    inline def setCms(value: String): Self = StObject.set(x, "cms", value.asInstanceOf[js.Any])
  }
}
