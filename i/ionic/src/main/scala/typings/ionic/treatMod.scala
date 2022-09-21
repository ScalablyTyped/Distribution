package typings.ionic

import typings.ionic.definitionsMod.INamespace
import typings.ionic.definitionsMod.TreatableAilment
import typings.ionic.doctorBaseMod.DoctorCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treatMod {
  
  @JSImport("ionic/commands/doctor/treat", "DoctorTreatCommand")
  @js.native
  open class DoctorTreatCommand protected () extends DoctorCommand {
    def this(namespace: INamespace) = this()
    
    def handleError(e: Any): Unit = js.native
    
    def treatAilment(ailment: TreatableAilment): js.Promise[Boolean] = js.native
    
    def treatAilments(ailments: js.Array[TreatableAilment]): js.Promise[Unit] = js.native
  }
}
