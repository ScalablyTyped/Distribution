package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly The type of platform the restriction applies to.
  */
@js.native
trait SchemaPlatformContext extends js.Object {
  
  /**
    * The platforms this restriction applies to.
    */
  var platforms: js.UndefOr[js.Array[String]] = js.native
}
object SchemaPlatformContext {
  
  @scala.inline
  def apply(): SchemaPlatformContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlatformContext]
  }
  
  @scala.inline
  implicit class SchemaPlatformContextOps[Self <: SchemaPlatformContext] (val x: Self) extends AnyVal {
    
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
    def setPlatformsVarargs(value: String*): Self = this.set("platforms", js.Array(value :_*))
    
    @scala.inline
    def setPlatforms(value: js.Array[String]): Self = this.set("platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatforms: Self = this.set("platforms", js.undefined)
  }
}
