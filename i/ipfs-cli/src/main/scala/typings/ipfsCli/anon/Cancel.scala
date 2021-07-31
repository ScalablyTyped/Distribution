package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel extends StObject {
  
  def cancel(name: String): js.Promise[Canceled] = js.native
  def cancel(
    name: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[Canceled] = js.native
  
  def state(): js.Promise[Enabled] = js.native
  def state(
    _options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[Enabled] = js.native
  
  def subs(): js.Promise[js.Array[String]] = js.native
  def subs(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[js.Array[String]] = js.native
}
