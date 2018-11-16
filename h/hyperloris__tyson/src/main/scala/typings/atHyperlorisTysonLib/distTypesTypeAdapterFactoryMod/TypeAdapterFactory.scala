package typings
package atHyperlorisTysonLib.distTypesTypeAdapterFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TypeAdapterFactory extends js.Object {
  def create[T](
    tyson: atHyperlorisTysonLib.distTypesTysonMod.Tyson,
    typeToken: atHyperlorisTysonLib.distTypesReflectTypeTokenMod.TypeToken[T]
  ): js.UndefOr[atHyperlorisTysonLib.distTypesTypeAdapterMod.TypeAdapter[T]]
}

