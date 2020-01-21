package typings.ionic

import typings.ionic.definitionsMod.TreatableAilment
import typings.ionic.doctorBaseMod.DoctorCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/doctor/treat", JSImport.Namespace)
@js.native
object treatMod extends js.Object {
  @js.native
  class DoctorTreatCommand () extends DoctorCommand {
    def handleError(e: js.Any): Unit = js.native
    def treatAilment(ailment: TreatableAilment): js.Promise[Boolean] = js.native
    def treatAilments(ailments: js.Array[TreatableAilment]): js.Promise[Unit] = js.native
  }
  
}

