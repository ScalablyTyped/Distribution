package typings.ionic

import typings.ionic.commandMod.Command
import typings.ionic.definitionsMod.IAilment
import typings.ionic.definitionsMod.IAilmentRegistry
import typings.ionic.definitionsMod.INamespace
import typings.ionic.definitionsMod.TreatableAilment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doctorBaseMod {
  
  @JSImport("ionic/commands/doctor/base", "DoctorCommand")
  @js.native
  abstract class DoctorCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def detectAilments(): js.Promise[js.Array[IAilment]] = js.native
    
    def detectTreatableAilments(): js.Promise[js.Array[TreatableAilment]] = js.native
    
    def getRegistry(): js.Promise[IAilmentRegistry] = js.native
  }
}
