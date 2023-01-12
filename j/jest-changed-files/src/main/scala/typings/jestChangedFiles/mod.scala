package typings.jestChangedFiles

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-changed-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findRepos(roots: js.Array[String]): js.Promise[Repos] = ^.asInstanceOf[js.Dynamic].applyDynamic("findRepos")(roots.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Repos]]
  
  inline def getChangedFilesForRoots(roots: js.Array[String], options: Options): js.Promise[ChangedFiles] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChangedFilesForRoots")(roots.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ChangedFiles]]
  
  trait ChangedFiles extends StObject {
    
    var changedFiles: Paths
    
    var repos: Repos
  }
  object ChangedFiles {
    
    inline def apply(changedFiles: Paths, repos: Repos): ChangedFiles = {
      val __obj = js.Dynamic.literal(changedFiles = changedFiles.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangedFiles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangedFiles] (val x: Self) extends AnyVal {
      
      inline def setChangedFiles(value: Paths): Self = StObject.set(x, "changedFiles", value.asInstanceOf[js.Any])
      
      inline def setRepos(value: Repos): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
    }
  }
  
  type ChangedFilesPromise = js.Promise[ChangedFiles]
  
  trait Options extends StObject {
    
    var changedSince: js.UndefOr[String] = js.undefined
    
    var includePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var lastCommit: js.UndefOr[Boolean] = js.undefined
    
    var withAncestor: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setChangedSince(value: String): Self = StObject.set(x, "changedSince", value.asInstanceOf[js.Any])
      
      inline def setChangedSinceUndefined: Self = StObject.set(x, "changedSince", js.undefined)
      
      inline def setIncludePaths(value: js.Array[String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
      
      inline def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
      
      inline def setIncludePathsVarargs(value: String*): Self = StObject.set(x, "includePaths", js.Array(value*))
      
      inline def setLastCommit(value: Boolean): Self = StObject.set(x, "lastCommit", value.asInstanceOf[js.Any])
      
      inline def setLastCommitUndefined: Self = StObject.set(x, "lastCommit", js.undefined)
      
      inline def setWithAncestor(value: Boolean): Self = StObject.set(x, "withAncestor", value.asInstanceOf[js.Any])
      
      inline def setWithAncestorUndefined: Self = StObject.set(x, "withAncestor", js.undefined)
    }
  }
  
  type Paths = Set[String]
  
  trait Repos extends StObject {
    
    var git: Paths
    
    var hg: Paths
  }
  object Repos {
    
    inline def apply(git: Paths, hg: Paths): Repos = {
      val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], hg = hg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Repos]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Repos] (val x: Self) extends AnyVal {
      
      inline def setGit(value: Paths): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setHg(value: Paths): Self = StObject.set(x, "hg", value.asInstanceOf[js.Any])
    }
  }
}
