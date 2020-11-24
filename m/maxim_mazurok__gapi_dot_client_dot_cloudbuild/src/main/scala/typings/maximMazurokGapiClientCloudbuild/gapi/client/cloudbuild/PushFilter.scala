package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushFilter extends js.Object {
  
  /** Regexes matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax */
  var branch: js.UndefOr[String] = js.native
  
  /** When true, only trigger a build if the revision regex does NOT match the git_ref regex. */
  var invertRegex: js.UndefOr[Boolean] = js.native
  
  /** Regexes matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax */
  var tag: js.UndefOr[String] = js.native
}
object PushFilter {
  
  @scala.inline
  def apply(): PushFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushFilter]
  }
  
  @scala.inline
  implicit class PushFilterOps[Self <: PushFilter] (val x: Self) extends AnyVal {
    
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
    def setInvertRegex(value: Boolean): Self = this.set("invertRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertRegex: Self = this.set("invertRegex", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
