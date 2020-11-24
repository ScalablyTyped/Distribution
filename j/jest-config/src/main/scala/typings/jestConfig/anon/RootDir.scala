package typings.jestConfig.anon

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootDir extends js.Object {
  
  var rootDir: Path = js.native
  
  var testEnvironment: String = js.native
}
object RootDir {
  
  @scala.inline
  def apply(rootDir: Path, testEnvironment: String): RootDir = {
    val __obj = js.Dynamic.literal(rootDir = rootDir.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootDir]
  }
  
  @scala.inline
  implicit class RootDirOps[Self <: RootDir] (val x: Self) extends AnyVal {
    
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
    def setRootDir(value: Path): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestEnvironment(value: String): Self = this.set("testEnvironment", value.asInstanceOf[js.Any])
  }
}
