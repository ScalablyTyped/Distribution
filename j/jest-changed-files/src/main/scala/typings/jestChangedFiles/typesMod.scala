package typings.jestChangedFiles

import typings.jestTypes.configMod.Path
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ChangedFiles extends StObject {
    
    var changedFiles: Paths = js.native
    
    var repos: Repos = js.native
  }
  object ChangedFiles {
    
    @scala.inline
    def apply(changedFiles: Paths, repos: Repos): ChangedFiles = {
      val __obj = js.Dynamic.literal(changedFiles = changedFiles.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangedFiles]
    }
    
    @scala.inline
    implicit class ChangedFilesMutableBuilder[Self <: ChangedFiles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangedFiles(value: Paths): Self = StObject.set(x, "changedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepos(value: Repos): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
    }
  }
  
  type ChangedFilesPromise = js.Promise[ChangedFiles]
  
  @js.native
  trait Options extends StObject {
    
    var changedSince: js.UndefOr[String] = js.native
    
    var includePaths: js.UndefOr[js.Array[Path]] = js.native
    
    var lastCommit: js.UndefOr[Boolean] = js.native
    
    var withAncestor: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangedSince(value: String): Self = StObject.set(x, "changedSince", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedSinceUndefined: Self = StObject.set(x, "changedSince", js.undefined)
      
      @scala.inline
      def setIncludePaths(value: js.Array[Path]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
      
      @scala.inline
      def setIncludePathsVarargs(value: Path*): Self = StObject.set(x, "includePaths", js.Array(value :_*))
      
      @scala.inline
      def setLastCommit(value: Boolean): Self = StObject.set(x, "lastCommit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastCommitUndefined: Self = StObject.set(x, "lastCommit", js.undefined)
      
      @scala.inline
      def setWithAncestor(value: Boolean): Self = StObject.set(x, "withAncestor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithAncestorUndefined: Self = StObject.set(x, "withAncestor", js.undefined)
    }
  }
  
  type Paths = Set[Path]
  
  @js.native
  trait Repos extends StObject {
    
    var git: Paths = js.native
    
    var hg: Paths = js.native
  }
  object Repos {
    
    @scala.inline
    def apply(git: Paths, hg: Paths): Repos = {
      val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], hg = hg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Repos]
    }
    
    @scala.inline
    implicit class ReposMutableBuilder[Self <: Repos] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGit(value: Paths): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHg(value: Paths): Self = StObject.set(x, "hg", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SCMAdapter extends StObject {
    
    def findChangedFiles(cwd: Path, options: Options): js.Promise[js.Array[Path]] = js.native
    
    def getRoot(cwd: Path): js.Promise[Path | Null] = js.native
  }
  object SCMAdapter {
    
    @scala.inline
    def apply(
      findChangedFiles: (Path, Options) => js.Promise[js.Array[Path]],
      getRoot: Path => js.Promise[Path | Null]
    ): SCMAdapter = {
      val __obj = js.Dynamic.literal(findChangedFiles = js.Any.fromFunction2(findChangedFiles), getRoot = js.Any.fromFunction1(getRoot))
      __obj.asInstanceOf[SCMAdapter]
    }
    
    @scala.inline
    implicit class SCMAdapterMutableBuilder[Self <: SCMAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindChangedFiles(value: (Path, Options) => js.Promise[js.Array[Path]]): Self = StObject.set(x, "findChangedFiles", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetRoot(value: Path => js.Promise[Path | Null]): Self = StObject.set(x, "getRoot", js.Any.fromFunction1(value))
    }
  }
}
