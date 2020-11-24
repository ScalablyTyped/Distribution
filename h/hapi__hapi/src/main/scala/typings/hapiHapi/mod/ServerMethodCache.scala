package typings.hapiHapi.mod

import typings.hapiCatbox.mod.PolicyOptions
import typings.hapiHapi.hapiHapiBooleans.`false`
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
  implicit class ServerMethodCacheOps[Self <: ServerMethodCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGenerateTimeout(value: Double | `false`): Self = this.set("generateTimeout", value.asInstanceOf[js.Any])
  }
}
