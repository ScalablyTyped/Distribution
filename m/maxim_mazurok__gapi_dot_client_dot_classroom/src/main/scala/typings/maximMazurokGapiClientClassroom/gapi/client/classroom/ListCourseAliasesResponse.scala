package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCourseAliasesResponse extends StObject {
  
  /** The course aliases. */
  var aliases: js.UndefOr[js.Array[CourseAlias]] = js.undefined
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCourseAliasesResponse {
  
  inline def apply(): ListCourseAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCourseAliasesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCourseAliasesResponse] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: js.Array[CourseAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: CourseAlias*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
