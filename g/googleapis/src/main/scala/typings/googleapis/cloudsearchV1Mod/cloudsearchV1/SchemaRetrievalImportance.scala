package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRetrievalImportance extends StObject {
  
  /**
    * Indicates the ranking importance given to property when it is matched
    * during retrieval. Once set, the token importance of a property cannot be
    * changed.
    */
  var importance: js.UndefOr[String] = js.undefined
}
object SchemaRetrievalImportance {
  
  inline def apply(): SchemaRetrievalImportance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRetrievalImportance]
  }
  
  extension [Self <: SchemaRetrievalImportance](x: Self) {
    
    inline def setImportance(value: String): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
  }
}
