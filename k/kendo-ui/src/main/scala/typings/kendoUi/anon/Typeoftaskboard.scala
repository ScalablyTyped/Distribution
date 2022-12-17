package typings.kendoUi.anon

import org.scalablytyped.runtime.Instantiable0
import typings.kendoUi.kendo.ui.taskboard.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoftaskboard extends StObject {
  
  var Command: Instantiable0[typings.kendoUi.kendo.ui.taskboard.Command]
  
  val commands: TypeofcommandsAddCardCommand
}
object Typeoftaskboard {
  
  inline def apply(Command: Instantiable0[Command], commands: TypeofcommandsAddCardCommand): Typeoftaskboard = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoftaskboard]
  }
  
  extension [Self <: Typeoftaskboard](x: Self) {
    
    inline def setCommand(value: Instantiable0[Command]): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setCommands(value: TypeofcommandsAddCardCommand): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
  }
}
