package typings.hapi.mod

import typings.catbox.mod.PolicyOptions
import typings.hapi.hapiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerMethodCache
  extends PolicyOptions[js.Any] {
  
  @JSName("generateTimeout")
  var generateTimeout_ServerMethodCache: Double | `false` = js.native
}
object ServerMethodCache {
  
  @scala.inline
  def apply(generateTimeout: Double | `false`): ServerMethodCache = {
    val __obj = js.Dynamic.literal(generateTimeout = generateTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerMethodCache]
  }
  
  @scala.inline
  implicit class ServerMethodCacheMutableBuilder[Self <: ServerMethodCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerateTimeout(value: Double | `false`): Self = StObject.set(x, "generateTimeout", value.asInstanceOf[js.Any])
  }
}
