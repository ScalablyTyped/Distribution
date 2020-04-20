package typings.ioTs.schemableMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithUnion[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends js.Object {
  def union[A /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param members because its type {[ K in keyof A ]: Kind<S, A[K]>} is not an array type */ members: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
    */ typings.ioTs.ioTsStrings.WithUnion with TopLevel[js.Any]
  ): js.Any
}

object WithUnion {
  @scala.inline
  def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
    union: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
    */ typings.ioTs.ioTsStrings.WithUnion with TopLevel[js.Any] => js.Any
  ): WithUnion[S] = {
    val __obj = js.Dynamic.literal(union = js.Any.fromFunction1(union))
    __obj.asInstanceOf[WithUnion[S]]
  }
}

