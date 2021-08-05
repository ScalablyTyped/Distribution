package typings.jestChangedFiles

import typings.jestTypes.configMod.Path
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ChangedFiles extends StObject {
    
    var changedFiles: Paths
    
    var repos: Repos
  }
  object ChangedFiles {
    
    inline def apply(changedFiles: Paths, repos: Repos): ChangedFiles = {
      val __obj = js.Dynamic.literal(changedFiles = changedFiles.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangedFiles]
    }
    
    extension [Self <: ChangedFiles](x: Self) {
      
      inline def setChangedFiles(value: Paths): Self = StObject.set(x, "changedFiles", value.asInstanceOf[js.Any])
      
      inline def setRepos(value: Repos): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
    }
  }
  
  type ChangedFilesPromise = js.Promise[ChangedFiles]
  
  trait Options extends StObject {
    
    var changedSince: js.UndefOr[String] = js.undefined
    
    var includePaths: js.UndefOr[js.Array[Path]] = js.undefined
    
    var lastCommit: js.UndefOr[Boolean] = js.undefined
    
    var withAncestor: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setChangedSince(value: String): Self = StObject.set(x, "changedSince", value.asInstanceOf[js.Any])
      
      inline def setChangedSinceUndefined: Self = StObject.set(x, "changedSince", js.undefined)
      
      inline def setIncludePaths(value: js.Array[Path]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
      
      inline def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
      
      inline def setIncludePathsVarargs(value: Path*): Self = StObject.set(x, "includePaths", js.Array(value :_*))
      
      inline def setLastCommit(value: Boolean): Self = StObject.set(x, "lastCommit", value.asInstanceOf[js.Any])
      
      inline def setLastCommitUndefined: Self = StObject.set(x, "lastCommit", js.undefined)
      
      inline def setWithAncestor(value: Boolean): Self = StObject.set(x, "withAncestor", value.asInstanceOf[js.Any])
      
      inline def setWithAncestorUndefined: Self = StObject.set(x, "withAncestor", js.undefined)
    }
  }
  
  type Paths = Set[Path]
  
  trait Repos extends StObject {
    
    var git: Paths
    
    var hg: Paths
  }
  object Repos {
    
    inline def apply(git: Paths, hg: Paths): Repos = {
      val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], hg = hg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Repos]
    }
    
    extension [Self <: Repos](x: Self) {
      
      inline def setGit(value: Paths): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setHg(value: Paths): Self = StObject.set(x, "hg", value.asInstanceOf[js.Any])
    }
  }
  
  trait SCMAdapter extends StObject {
    
    def findChangedFiles(cwd: Path, options: Options): js.Promise[js.Array[Path]]
    
    def getRoot(cwd: Path): js.Promise[Path | Null]
  }
  object SCMAdapter {
    
    inline def apply(
      findChangedFiles: (Path, Options) => js.Promise[js.Array[Path]],
      getRoot: Path => js.Promise[Path | Null]
    ): SCMAdapter = {
      val __obj = js.Dynamic.literal(findChangedFiles = js.Any.fromFunction2(findChangedFiles), getRoot = js.Any.fromFunction1(getRoot))
      __obj.asInstanceOf[SCMAdapter]
    }
    
    extension [Self <: SCMAdapter](x: Self) {
      
      inline def setFindChangedFiles(value: (Path, Options) => js.Promise[js.Array[Path]]): Self = StObject.set(x, "findChangedFiles", js.Any.fromFunction2(value))
      
      inline def setGetRoot(value: Path => js.Promise[Path | Null]): Self = StObject.set(x, "getRoot", js.Any.fromFunction1(value))
    }
  }
}
