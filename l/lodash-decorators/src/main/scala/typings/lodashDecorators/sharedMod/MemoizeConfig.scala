package typings.lodashDecorators.sharedMod

import typings.lodashDecorators.anon.Instantiable
import typings.lodashDecorators.commonMod.ResolvableFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoizeConfig[T, U] extends js.Object {
  var cache: js.UndefOr[MemoizeMap[T, U]] = js.native
  var resolver: js.UndefOr[ResolvableFunction] = js.native
  var `type`: js.UndefOr[Instantiable[T, U]] = js.native
}

object MemoizeConfig {
  @scala.inline
  def apply[T, U](): MemoizeConfig[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoizeConfig[T, U]]
  }
  @scala.inline
  implicit class MemoizeConfigOps[Self <: MemoizeConfig[_, _], T, U] (val x: Self with (MemoizeConfig[T, U])) extends AnyVal {
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
    def setCache(value: MemoizeMap[T, U]): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setResolver(value: ResolvableFunction): Self = this.set("resolver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
    @scala.inline
    def setType(value: Instantiable[T, U]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

