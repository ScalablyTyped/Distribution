package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndividualStudentsOptions extends StObject {
  
  /** Identifiers for the students that have access to the coursework/announcement. */
  var studentIds: js.UndefOr[js.Array[String]] = js.undefined
}
object IndividualStudentsOptions {
  
  inline def apply(): IndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndividualStudentsOptions]
  }
  
  extension [Self <: IndividualStudentsOptions](x: Self) {
    
    inline def setStudentIds(value: js.Array[String]): Self = StObject.set(x, "studentIds", value.asInstanceOf[js.Any])
    
    inline def setStudentIdsUndefined: Self = StObject.set(x, "studentIds", js.undefined)
    
    inline def setStudentIdsVarargs(value: String*): Self = StObject.set(x, "studentIds", js.Array(value :_*))
  }
}
