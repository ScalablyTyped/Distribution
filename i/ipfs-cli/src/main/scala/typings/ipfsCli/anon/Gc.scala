package typings.ipfsCli.anon

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gc extends StObject {
  
  def gc(): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_gc.Err */ js.Any
  ] = js.native
  def gc(
    _options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_gc.Err */ js.Any
  ] = js.native
  
  def stat(): js.Promise[NumObjects] = js.native
  def stat(options: js.Any): js.Promise[NumObjects] = js.native
  
  def version(): js.Promise[js.Any] = js.native
  def version(options: js.Any): js.Promise[js.Any] = js.native
}
