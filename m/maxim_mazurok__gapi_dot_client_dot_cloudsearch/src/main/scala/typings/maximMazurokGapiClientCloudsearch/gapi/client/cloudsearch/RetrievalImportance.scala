package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrievalImportance extends StObject {
  
  /** Indicates the ranking importance given to property when it is matched during retrieval. Once set, the token importance of a property cannot be changed. */
  var importance: js.UndefOr[String] = js.undefined
}
object RetrievalImportance {
  
  inline def apply(): RetrievalImportance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrievalImportance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetrievalImportance] (val x: Self) extends AnyVal {
    
    inline def setImportance(value: String): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
  }
}
