package typings.jestTypes.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasteConfig extends js.Object {
  
  /** Whether to hash files using SHA-1. */
  var computeSha1: js.UndefOr[Boolean] = js.native
  
  /** The platform to use as the default, e.g. 'ios'. */
  var defaultPlatform: js.UndefOr[String | Null] = js.native
  
  /** Path to a custom implementation of Haste. */
  var hasteImplModulePath: js.UndefOr[String] = js.native
  
  /** All platforms to target, e.g ['ios', 'android']. */
  var platforms: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether to throw on error on module collision. */
  var throwOnModuleCollision: js.UndefOr[Boolean] = js.native
}
object HasteConfig {
  
  @scala.inline
  def apply(): HasteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasteConfig]
  }
  
  @scala.inline
  implicit class HasteConfigOps[Self <: HasteConfig] (val x: Self) extends AnyVal {
    
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
    def setComputeSha1(value: Boolean): Self = this.set("computeSha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeSha1: Self = this.set("computeSha1", js.undefined)
    
    @scala.inline
    def setDefaultPlatform(value: String): Self = this.set("defaultPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPlatform: Self = this.set("defaultPlatform", js.undefined)
    
    @scala.inline
    def setDefaultPlatformNull: Self = this.set("defaultPlatform", null)
    
    @scala.inline
    def setHasteImplModulePath(value: String): Self = this.set("hasteImplModulePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasteImplModulePath: Self = this.set("hasteImplModulePath", js.undefined)
    
    @scala.inline
    def setPlatformsVarargs(value: String*): Self = this.set("platforms", js.Array(value :_*))
    
    @scala.inline
    def setPlatforms(value: js.Array[String]): Self = this.set("platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatforms: Self = this.set("platforms", js.undefined)
    
    @scala.inline
    def setThrowOnModuleCollision(value: Boolean): Self = this.set("throwOnModuleCollision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowOnModuleCollision: Self = this.set("throwOnModuleCollision", js.undefined)
  }
}
