package typings
package atHyperlorisTysonLib.distTypesTypeAdapterFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAdapterFactory extends js.Object {
  def create[T](
    tyson: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Tyson */ js.Any,
    typeToken: atHyperlorisTysonLib.distTypesReflectTypeTokenMod.TypeToken[T]
  ): js.UndefOr[atHyperlorisTysonLib.distTypesTypeAdapterMod.TypeAdapter[T]]
}

