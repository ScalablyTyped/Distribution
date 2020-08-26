package typings.hyperlorisTyson.typeAdapterFactoryMod

import typings.hyperlorisTyson.mod.Tyson
import typings.hyperlorisTyson.typeAdapterMod.TypeAdapter
import typings.hyperlorisTyson.typeTokenMod.TypeToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeAdapterFactory extends js.Object {
  def create[T](tyson: Tyson, typeToken: TypeToken[T]): js.UndefOr[TypeAdapter[T]] = js.native
}

object TypeAdapterFactory {
  @scala.inline
  def apply(create: (Tyson, TypeToken[js.Any]) => js.UndefOr[TypeAdapter[js.Any]]): TypeAdapterFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[TypeAdapterFactory]
  }
  @scala.inline
  implicit class TypeAdapterFactoryOps[Self <: TypeAdapterFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: (Tyson, TypeToken[js.Any]) => js.UndefOr[TypeAdapter[js.Any]]): Self = this.set("create", js.Any.fromFunction2(value))
  }
  
}

