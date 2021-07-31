package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobResolversSupported extends StObject {
  
  var `resolver-name`: js.UndefOr[String] = js.undefined
}
object JobResolversSupported {
  
  @scala.inline
  def apply(): JobResolversSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobResolversSupported]
  }
  
  @scala.inline
  implicit class JobResolversSupportedMutableBuilder[Self <: JobResolversSupported] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setResolver-name`(value: String): Self = StObject.set(x, "resolver-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setResolver-nameUndefined`: Self = StObject.set(x, "resolver-name", js.undefined)
  }
}
