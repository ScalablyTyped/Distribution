package typings.gun.anon

import typings.gun.gunBooleans.`false`
import typings.gun.mod.Gun.ArrayAsRecord
import typings.gun.mod.Gun.ChainReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gun[DataType, ReferenceKey] extends js.Object {
  var gun: ChainReference[DataType, ReferenceKey, `false`] = js.native
  var key: ReferenceKey = js.native
  var put: ArrayAsRecord[DataType] = js.native
}

object Gun {
  @scala.inline
  def apply[DataType, ReferenceKey](
    gun: ChainReference[DataType, ReferenceKey, `false`],
    key: ReferenceKey,
    put: ArrayAsRecord[DataType]
  ): Gun[DataType, ReferenceKey] = {
    val __obj = js.Dynamic.literal(gun = gun.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gun[DataType, ReferenceKey]]
  }
  @scala.inline
  implicit class GunOps[Self <: Gun[_, _], DataType, ReferenceKey] (val x: Self with (Gun[DataType, ReferenceKey])) extends AnyVal {
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
    def setGun(value: ChainReference[DataType, ReferenceKey, `false`]): Self = this.set("gun", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: ReferenceKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setPut(value: ArrayAsRecord[DataType]): Self = this.set("put", value.asInstanceOf[js.Any])
  }
  
}

