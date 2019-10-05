package typings.gun

import typings.gun.gunMod.Gun.ArrayAsRecord
import typings.gun.gunMod.Gun.ChainReference
import typings.gun.gunNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False[DataType, ReferenceKey] extends js.Object {
  var gun: ChainReference[DataType, ReferenceKey, `false`]
  var key: ReferenceKey
  var put: ArrayAsRecord[DataType]
}

object Anon_False {
  @scala.inline
  def apply[DataType, ReferenceKey](
    gun: ChainReference[DataType, ReferenceKey, `false`],
    key: ReferenceKey,
    put: ArrayAsRecord[DataType]
  ): Anon_False[DataType, ReferenceKey] = {
    val __obj = js.Dynamic.literal(gun = gun, key = key.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_False[DataType, ReferenceKey]]
  }
}

