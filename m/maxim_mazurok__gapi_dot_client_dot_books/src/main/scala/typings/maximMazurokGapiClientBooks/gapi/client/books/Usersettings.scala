package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.FolderName
import typings.maximMazurokGapiClientBooks.anon.MatchMyInterests
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Usersettings extends StObject {
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** User settings in sub-objects, each for different purposes. */
  var notesExport: js.UndefOr[FolderName] = js.undefined
  
  var notification: js.UndefOr[MatchMyInterests] = js.undefined
}
object Usersettings {
  
  inline def apply(): Usersettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Usersettings]
  }
  
  extension [Self <: Usersettings](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNotesExport(value: FolderName): Self = StObject.set(x, "notesExport", value.asInstanceOf[js.Any])
    
    inline def setNotesExportUndefined: Self = StObject.set(x, "notesExport", js.undefined)
    
    inline def setNotification(value: MatchMyInterests): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
  }
}
