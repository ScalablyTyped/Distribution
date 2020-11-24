package typings.jestTransform.typesMod

import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheKeyOptions extends TransformOptions {
  
  var config: ProjectConfig = js.native
  
  var rootDir: String = js.native
}
object CacheKeyOptions {
  
  @scala.inline
  def apply(config: ProjectConfig, instrument: Boolean, rootDir: String): CacheKeyOptions = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], instrument = instrument.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheKeyOptions]
  }
  
  @scala.inline
  implicit class CacheKeyOptionsOps[Self <: CacheKeyOptions] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: ProjectConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDir(value: String): Self = this.set("rootDir", value.asInstanceOf[js.Any])
  }
}
