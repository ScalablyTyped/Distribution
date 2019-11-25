package typings.atHyperlorisTyson.distTypesTypeAdapterFactoryMod

import typings.atHyperlorisTyson.distTypesReflectTypeTokenMod.TypeToken
import typings.atHyperlorisTyson.distTypesTypeAdapterMod.TypeAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAdapterFactory extends js.Object {
  def create[T](
    tyson: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Tyson */ js.Any,
    typeToken: TypeToken[T]
  ): js.UndefOr[TypeAdapter[T]]
}

object TypeAdapterFactory {
  @scala.inline
  def apply(
    create: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Tyson */ js.Any, TypeToken[js.Any]) => js.UndefOr[TypeAdapter[js.Any]]
  ): TypeAdapterFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
  
    __obj.asInstanceOf[TypeAdapterFactory]
  }
}

