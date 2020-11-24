package typings.karmaCoverage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reporter extends js.Object {
  
  var dir: js.UndefOr[String] = js.native
  
  var file: js.UndefOr[String] = js.native
  
  var subdir: js.UndefOr[String | (js.Function1[/* browser */ String, String])] = js.native
  
  var `type`: ReporterType = js.native
}
object Reporter {
  
  @scala.inline
  def apply(`type`: ReporterType): Reporter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reporter]
  }
  
  @scala.inline
  implicit class ReporterOps[Self <: Reporter] (val x: Self) extends AnyVal {
    
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
    def setType(value: ReporterType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setSubdirFunction1(value: /* browser */ String => String): Self = this.set("subdir", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubdir(value: String | (js.Function1[/* browser */ String, String])): Self = this.set("subdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdir: Self = this.set("subdir", js.undefined)
  }
}
