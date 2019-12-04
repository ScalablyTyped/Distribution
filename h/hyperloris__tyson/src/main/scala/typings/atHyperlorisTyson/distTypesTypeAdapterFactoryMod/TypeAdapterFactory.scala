package typings.atHyperlorisTyson.distTypesTypeAdapterFactoryMod

import typings.atHyperlorisTyson.atHyperlorisTysonMod.Tyson
import typings.atHyperlorisTyson.distTypesReflectTypeTokenMod.TypeToken
import typings.atHyperlorisTyson.distTypesTypeAdapterMod.TypeAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAdapterFactory extends js.Object {
  def create[T](tyson: Tyson, typeToken: TypeToken[T]): js.UndefOr[TypeAdapter[T]]
}

object TypeAdapterFactory {
  @scala.inline
  def apply(create: (Tyson, TypeToken[js.Any]) => js.UndefOr[TypeAdapter[js.Any]]): TypeAdapterFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
  
    __obj.asInstanceOf[TypeAdapterFactory]
  }
}

