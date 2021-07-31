package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SourceContext is a reference to a tree of files. A SourceContext together
  * with a path point to a unique revision of a single file or directory.
  */
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext extends StObject {
  
  /**
    * A SourceContext referring to a revision in a Google Cloud Source Repo.
    */
  var cloudRepo: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext] = js.undefined
  
  /**
    * A SourceContext referring to a Gerrit project.
    */
  var gerrit: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext] = js.undefined
  
  /**
    * A SourceContext referring to any third party Git repo (e.g., GitHub).
    */
  var git: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext] = js.undefined
  
  /**
    * Labels with user defined metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContextMutableBuilder[Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudRepo(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext): Self = StObject.set(x, "cloudRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudRepoUndefined: Self = StObject.set(x, "cloudRepo", js.undefined)
    
    @scala.inline
    def setGerrit(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext): Self = StObject.set(x, "gerrit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGerritUndefined: Self = StObject.set(x, "gerrit", js.undefined)
    
    @scala.inline
    def setGit(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
