package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobResolversSupported extends StObject {
  
  var `resolver-name`: js.UndefOr[String] = js.undefined
}
object JobResolversSupported {
  
  inline def apply(): JobResolversSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobResolversSupported]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobResolversSupported] (val x: Self) extends AnyVal {
    
    inline def `setResolver-name`(value: String): Self = StObject.set(x, "resolver-name", value.asInstanceOf[js.Any])
    
    inline def `setResolver-nameUndefined`: Self = StObject.set(x, "resolver-name", js.undefined)
  }
}
