package typings.ionic

import typings.ionic.definitionsMod.IAilment
import typings.ionic.definitionsMod.IAilmentRegistry
import typings.ionic.definitionsMod.TreatableAilment
import typings.ionic.libCommandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/doctor/base", JSImport.Namespace)
@js.native
object commandsDoctorBaseMod extends js.Object {
  @js.native
  abstract class DoctorCommand () extends Command {
    def detectAilments(): js.Promise[js.Array[IAilment]] = js.native
    def detectTreatableAilments(): js.Promise[js.Array[TreatableAilment]] = js.native
    def getRegistry(): js.Promise[IAilmentRegistry] = js.native
  }
  
}

