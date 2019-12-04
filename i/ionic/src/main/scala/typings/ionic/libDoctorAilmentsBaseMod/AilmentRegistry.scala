package typings.ionic.libDoctorAilmentsBaseMod

import typings.ionic.definitionsMod.IAilment
import typings.ionic.definitionsMod.IAilmentRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/doctor/ailments/base", "AilmentRegistry")
@js.native
class AilmentRegistry () extends IAilmentRegistry {
  var _ailments: js.Array[IAilment] = js.native
  /* CompleteClass */
  override var ailments: js.Array[IAilment] = js.native
  /* CompleteClass */
  override def get(id: String): js.UndefOr[IAilment] = js.native
  /* CompleteClass */
  override def register(ailment: IAilment): Unit = js.native
}

