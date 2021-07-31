package typings.ipfsCli.anon

import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Repo extends StObject {
  
  def bitswap(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.BitswapStats */ js.Any
  ] = js.native
  def bitswap(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.BitswapStats */ js.Any
  ] = js.native
  
  def bw(): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  def bw(options: js.Object): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  
  def repo(): js.Promise[RepoPath] = js.native
  def repo(options: js.Object): js.Promise[RepoPath] = js.native
}
