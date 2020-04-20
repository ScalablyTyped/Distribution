package typings.ioTs

import typings.ioTs.schemableMod.Schemable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Schema", JSImport.Namespace)
@js.native
object schemaMod extends js.Object {
  def make[A](f: Schema[A]): Schema[A] = js.native
  type Schema[A] = js.Function1[
    /* S */ Schemable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any
  ]
  type TypeOf[S] = js.Any
}

