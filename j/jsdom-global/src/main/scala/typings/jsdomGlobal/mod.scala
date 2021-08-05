package typings.jsdomGlobal

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function0[Unit]]
  inline def apply(html: String): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def apply(
    html: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConstructorOptions */ js.Any
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def apply(
    html: Unit,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConstructorOptions */ js.Any
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def apply(html: Buffer): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def apply(
    html: Buffer,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConstructorOptions */ js.Any
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("jsdom-global", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
