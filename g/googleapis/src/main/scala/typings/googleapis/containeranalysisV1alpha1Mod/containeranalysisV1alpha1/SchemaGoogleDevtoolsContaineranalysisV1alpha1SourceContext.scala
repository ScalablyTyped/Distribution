package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SourceContext is a reference to a tree of files. A SourceContext together
  * with a path point to a unique revision of a single file or directory.
  */
@js.native
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext extends js.Object {
  
  /**
    * A SourceContext referring to a revision in a Google Cloud Source Repo.
    */
  var cloudRepo: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext] = js.native
  
  /**
    * A SourceContext referring to a Gerrit project.
    */
  var gerrit: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext] = js.native
  
  /**
    * A SourceContext referring to any third party Git repo (e.g., GitHub).
    */
  var git: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext] = js.native
  
  /**
    * Labels with user defined metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContextOps[Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext] (val x: Self) extends AnyVal {
    
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
    def setCloudRepo(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext): Self = this.set("cloudRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudRepo: Self = this.set("cloudRepo", js.undefined)
    
    @scala.inline
    def setGerrit(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext): Self = this.set("gerrit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGerrit: Self = this.set("gerrit", js.undefined)
    
    @scala.inline
    def setGit(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext): Self = this.set("git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGit: Self = this.set("git", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
}
