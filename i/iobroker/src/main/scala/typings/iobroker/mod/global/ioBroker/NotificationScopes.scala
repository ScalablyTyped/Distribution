package typings.iobroker.mod.global.ioBroker

import typings.iobroker.iobrokerStrings.accessErrors
import typings.iobroker.iobrokerStrings.fileToJsonl
import typings.iobroker.iobrokerStrings.fsIoErrors
import typings.iobroker.iobrokerStrings.memIssues
import typings.iobroker.iobrokerStrings.noDiskSpace
import typings.iobroker.iobrokerStrings.nonExistingFileErrors
import typings.iobroker.iobrokerStrings.remoteHostErrors
import typings.iobroker.iobrokerStrings.restartLoop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Predefined notification scopes and their categories */
trait NotificationScopes extends StObject {
  
  var system: memIssues | fsIoErrors | noDiskSpace | accessErrors | nonExistingFileErrors | remoteHostErrors | restartLoop | fileToJsonl
}
object NotificationScopes {
  
  inline def apply(
    system: memIssues | fsIoErrors | noDiskSpace | accessErrors | nonExistingFileErrors | remoteHostErrors | restartLoop | fileToJsonl
  ): NotificationScopes = {
    val __obj = js.Dynamic.literal(system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationScopes]
  }
  
  extension [Self <: NotificationScopes](x: Self) {
    
    inline def setSystem(
      value: memIssues | fsIoErrors | noDiskSpace | accessErrors | nonExistingFileErrors | remoteHostErrors | restartLoop | fileToJsonl
    ): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
  }
}
