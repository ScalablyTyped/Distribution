package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTeachersResponse extends StObject {
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Teachers who match the list request. */
  var teachers: js.UndefOr[js.Array[Teacher]] = js.undefined
}
object ListTeachersResponse {
  
  inline def apply(): ListTeachersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTeachersResponse]
  }
  
  extension [Self <: ListTeachersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTeachers(value: js.Array[Teacher]): Self = StObject.set(x, "teachers", value.asInstanceOf[js.Any])
    
    inline def setTeachersUndefined: Self = StObject.set(x, "teachers", js.undefined)
    
    inline def setTeachersVarargs(value: Teacher*): Self = StObject.set(x, "teachers", js.Array(value*))
  }
}
