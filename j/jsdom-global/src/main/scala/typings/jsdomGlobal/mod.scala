package typings.jsdomGlobal

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsdom-global", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): js.Function0[Unit] = js.native
  def apply(
    html: js.UndefOr[scala.Nothing],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConstructorOptions */ js.Any
  ): js.Function0[Unit] = js.native
  def apply(html: String): js.Function0[Unit] = js.native
  def apply(
    html: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConstructorOptions */ js.Any
  ): js.Function0[Unit] = js.native
  def apply(html: Buffer): js.Function0[Unit] = js.native
  def apply(
    html: Buffer,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConstructorOptions */ js.Any
  ): js.Function0[Unit] = js.native
}
