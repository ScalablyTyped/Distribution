package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheInvalidationRule extends StObject {
  
  /** If set, this invalidation rule will only apply to requests with a Host header matching host. */
  var host: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object CacheInvalidationRule {
  
  @scala.inline
  def apply(): CacheInvalidationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheInvalidationRule]
  }
  
  @scala.inline
  implicit class CacheInvalidationRuleMutableBuilder[Self <: CacheInvalidationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
