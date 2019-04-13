package typings
package gunLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False[DataType, ReferenceKey] extends js.Object {
  var gun: gunLib.gunMod.GunNs.ChainReference[DataType, ReferenceKey, gunLib.gunLibNumbers.`false`]
  var key: ReferenceKey
  var put: gunLib.gunMod.GunNs.ArrayAsRecord[DataType]
}

object Anon_False {
  @scala.inline
  def apply[DataType, ReferenceKey](
    gun: gunLib.gunMod.GunNs.ChainReference[DataType, ReferenceKey, gunLib.gunLibNumbers.`false`],
    key: ReferenceKey,
    put: gunLib.gunMod.GunNs.ArrayAsRecord[DataType]
  ): Anon_False[DataType, ReferenceKey] = {
    val __obj = js.Dynamic.literal(gun = gun, key = key.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_False[DataType, ReferenceKey]]
  }
}

