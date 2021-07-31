package typings.ipfsCli.anon

import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bitswap extends StObject {
  
  def bitswap(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.BitswapStats */ js.Any
  ] = js.native
  def bitswap(
    _options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.BitswapStats */ js.Any
  ] = js.native
  
  var bw: (js.Function1[/* options */ js.UndefOr[js.Any], AsyncGenerator[RateIn, Unit, js.Any]]) | js.Function0[js.Promise[scala.Nothing]] = js.native
  
  def repo(): js.Promise[NumObjects] = js.native
  def repo(options: js.Any): js.Promise[NumObjects] = js.native
}
