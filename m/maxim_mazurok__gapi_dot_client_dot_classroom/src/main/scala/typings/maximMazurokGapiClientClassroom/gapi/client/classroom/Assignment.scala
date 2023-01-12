package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assignment extends StObject {
  
  /** Drive folder where attachments from student submissions are placed. This is only populated for course teachers and administrators. */
  var studentWorkFolder: js.UndefOr[DriveFolder] = js.undefined
}
object Assignment {
  
  inline def apply(): Assignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Assignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Assignment] (val x: Self) extends AnyVal {
    
    inline def setStudentWorkFolder(value: DriveFolder): Self = StObject.set(x, "studentWorkFolder", value.asInstanceOf[js.Any])
    
    inline def setStudentWorkFolderUndefined: Self = StObject.set(x, "studentWorkFolder", js.undefined)
  }
}
