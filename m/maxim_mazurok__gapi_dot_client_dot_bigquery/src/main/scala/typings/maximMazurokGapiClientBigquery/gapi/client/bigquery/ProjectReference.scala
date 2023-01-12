package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectReference extends StObject {
  
  /** [Required] ID of the project. Can be either the numeric ID or the assigned ID of the project. */
  var projectId: js.UndefOr[String] = js.undefined
}
object ProjectReference {
  
  inline def apply(): ProjectReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectReference] (val x: Self) extends AnyVal {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
