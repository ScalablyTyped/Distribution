package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreIODetails extends StObject {
  
  /** Namespace used in the connection. */
  var namespace: js.UndefOr[String] = js.undefined
  
  /** ProjectId accessed in the connection. */
  var projectId: js.UndefOr[String] = js.undefined
}
object DatastoreIODetails {
  
  inline def apply(): DatastoreIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreIODetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatastoreIODetails] (val x: Self) extends AnyVal {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
