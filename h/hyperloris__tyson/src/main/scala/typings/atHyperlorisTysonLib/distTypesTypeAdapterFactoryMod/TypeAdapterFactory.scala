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

object TypeAdapterFactory {
  @scala.inline
  def apply(
    create: js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Tyson */ js.Any, 
      atHyperlorisTysonLib.distTypesReflectTypeTokenMod.TypeToken[js.Any], 
      js.UndefOr[atHyperlorisTysonLib.distTypesTypeAdapterMod.TypeAdapter[js.Any]]
    ]
  ): TypeAdapterFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[TypeAdapterFactory]
  }
}

