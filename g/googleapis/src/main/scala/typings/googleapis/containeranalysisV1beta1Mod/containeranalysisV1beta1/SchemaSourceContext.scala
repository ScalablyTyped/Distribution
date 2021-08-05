package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SourceContext is a reference to a tree of files. A SourceContext together
  * with a path point to a unique revision of a single file or directory.
  */
trait SchemaSourceContext extends StObject {
  
  /**
    * A SourceContext referring to a revision in a Google Cloud Source Repo.
    */
  var cloudRepo: js.UndefOr[SchemaCloudRepoSourceContext] = js.undefined
  
  /**
    * A SourceContext referring to a Gerrit project.
    */
  var gerrit: js.UndefOr[SchemaGerritSourceContext] = js.undefined
  
  /**
    * A SourceContext referring to any third party Git repo (e.g., GitHub).
    */
  var git: js.UndefOr[SchemaGitSourceContext] = js.undefined
  
  /**
    * Labels with user defined metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaSourceContext {
  
  inline def apply(): SchemaSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceContext]
  }
  
  extension [Self <: SchemaSourceContext](x: Self) {
    
    inline def setCloudRepo(value: SchemaCloudRepoSourceContext): Self = StObject.set(x, "cloudRepo", value.asInstanceOf[js.Any])
    
    inline def setCloudRepoUndefined: Self = StObject.set(x, "cloudRepo", js.undefined)
    
    inline def setGerrit(value: SchemaGerritSourceContext): Self = StObject.set(x, "gerrit", value.asInstanceOf[js.Any])
    
    inline def setGerritUndefined: Self = StObject.set(x, "gerrit", js.undefined)
    
    inline def setGit(value: SchemaGitSourceContext): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    inline def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
