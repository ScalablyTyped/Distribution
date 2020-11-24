package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceContext extends js.Object {
  
  /** A SourceContext referring to a revision in a Google Cloud Source Repo. */
  var cloudRepo: js.UndefOr[CloudRepoSourceContext] = js.native
  
  /** A SourceContext referring to a Gerrit project. */
  var gerrit: js.UndefOr[GerritSourceContext] = js.native
  
  /** A SourceContext referring to any third party Git repo (e.g., GitHub). */
  var git: js.UndefOr[GitSourceContext] = js.native
  
  /** Labels with user defined metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.SourceContext with TopLevel[js.Any]
  ] = js.native
}
object SourceContext {
  
  @scala.inline
  def apply(): SourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceContext]
  }
  
  @scala.inline
  implicit class SourceContextOps[Self <: SourceContext] (val x: Self) extends AnyVal {
    
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
    def setCloudRepo(value: CloudRepoSourceContext): Self = this.set("cloudRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudRepo: Self = this.set("cloudRepo", js.undefined)
    
    @scala.inline
    def setGerrit(value: GerritSourceContext): Self = this.set("gerrit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGerrit: Self = this.set("gerrit", js.undefined)
    
    @scala.inline
    def setGit(value: GitSourceContext): Self = this.set("git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGit: Self = this.set("git", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.SourceContext with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
}
