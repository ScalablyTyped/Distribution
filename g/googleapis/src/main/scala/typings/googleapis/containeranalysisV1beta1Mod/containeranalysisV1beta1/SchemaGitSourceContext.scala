package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A GitSourceContext denotes a particular revision in a third party Git
  * repository (e.g., GitHub).
  */
@js.native
trait SchemaGitSourceContext extends js.Object {
  
  /**
    * Git commit hash.
    */
  var revisionId: js.UndefOr[String] = js.native
  
  /**
    * Git repository URL.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaGitSourceContext {
  
  @scala.inline
  def apply(): SchemaGitSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGitSourceContext]
  }
  
  @scala.inline
  implicit class SchemaGitSourceContextOps[Self <: SchemaGitSourceContext] (val x: Self) extends AnyVal {
    
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
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
