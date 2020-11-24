package typings.gulpCodecov.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodecovOptions extends js.Object {
  
  var branch: js.UndefOr[String] = js.native
  
  var build: js.UndefOr[String] = js.native
  
  var clear: js.UndefOr[Boolean] = js.native
  
  var commit: js.UndefOr[String] = js.native
  
  var disable: js.UndefOr[String] = js.native
  
  var dump: js.UndefOr[Boolean] = js.native
  
  var env: js.UndefOr[String] = js.native
  
  var file: js.UndefOr[String] = js.native
  
  var flags: js.UndefOr[String] = js.native
  
  var `gcov-args`: js.UndefOr[String] = js.native
  
  var `gcov-exec`: js.UndefOr[String] = js.native
  
  var `gcov-glob`: js.UndefOr[String] = js.native
  
  var `gcov-root`: js.UndefOr[String] = js.native
  
  var pipe: js.UndefOr[Boolean] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var slug: js.UndefOr[String] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var yml: js.UndefOr[String] = js.native
}
object CodecovOptions {
  
  @scala.inline
  def apply(): CodecovOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodecovOptions]
  }
  
  @scala.inline
  implicit class CodecovOptionsOps[Self <: CodecovOptions] (val x: Self) extends AnyVal {
    
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
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    
    @scala.inline
    def setBuild(value: String): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    
    @scala.inline
    def setClear(value: Boolean): Self = this.set("clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setCommit(value: String): Self = this.set("commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    
    @scala.inline
    def setDisable(value: String): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setDump(value: Boolean): Self = this.set("dump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDump: Self = this.set("dump", js.undefined)
    
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def `setGcov-args`(value: String): Self = this.set("gcov-args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGcov-args`: Self = this.set("gcov-args", js.undefined)
    
    @scala.inline
    def `setGcov-exec`(value: String): Self = this.set("gcov-exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGcov-exec`: Self = this.set("gcov-exec", js.undefined)
    
    @scala.inline
    def `setGcov-glob`(value: String): Self = this.set("gcov-glob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGcov-glob`: Self = this.set("gcov-glob", js.undefined)
    
    @scala.inline
    def `setGcov-root`(value: String): Self = this.set("gcov-root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGcov-root`: Self = this.set("gcov-root", js.undefined)
    
    @scala.inline
    def setPipe(value: Boolean): Self = this.set("pipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipe: Self = this.set("pipe", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlug: Self = this.set("slug", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setYml(value: String): Self = this.set("yml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYml: Self = this.set("yml", js.undefined)
  }
}
