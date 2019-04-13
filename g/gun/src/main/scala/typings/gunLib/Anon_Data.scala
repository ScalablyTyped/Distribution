package typings
package gunLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[DataType] extends js.Object {
  def put(data: gunLib.gunMod.GunNs.DisallowArray[gunLib.gunMod.GunNs.Saveable[DataType]]): scala.Unit
}

object Anon_Data {
  @scala.inline
  def apply[DataType](put: gunLib.gunMod.GunNs.DisallowArray[gunLib.gunMod.GunNs.Saveable[DataType]] => scala.Unit): Anon_Data[DataType] = {
    val __obj = js.Dynamic.literal(put = js.Any.fromFunction1(put))
  
    __obj.asInstanceOf[Anon_Data[DataType]]
  }
}

