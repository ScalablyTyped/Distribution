package typings.ionic

import typings.ionic.commandsDoctorBaseMod.DoctorCommand
import typings.ionic.definitionsMod.IAilment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/doctor/check", JSImport.Namespace)
@js.native
object commandsDoctorCheckMod extends js.Object {
  @js.native
  class DoctorCheckCommand () extends DoctorCommand {
    def checkAilment(ailment: IAilment): js.Promise[Unit] = js.native
    def checkAilments(ailments: js.Array[IAilment]): js.Promise[Unit] = js.native
  }
  
}

