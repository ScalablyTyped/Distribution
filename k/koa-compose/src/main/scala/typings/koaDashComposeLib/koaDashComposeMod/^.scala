package typings
package koaDashComposeLib.koaDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-compose", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](middleware: js.Array[koaDashComposeLib.koaDashComposeMod.composeNs.Middleware[T]]): koaDashComposeLib.koaDashComposeMod.composeNs.ComposedMiddleware[T] = js.native
  def apply[T, U, V, W](
    middleware: js.Tuple2[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Koa.Middleware<T, U> */ _, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Koa.Middleware<V, W> */ _
    ]
  ): js.Any = js.native
}

