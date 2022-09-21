package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1Progress extends StObject {
  
  /**
    * The amount of work completed.
    */
  var completedWork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The amount of work estimated.
    */
  var estimatedWork: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirestoreAdminV1Progress {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1Progress]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1Progress](x: Self) {
    
    inline def setCompletedWork(value: String): Self = StObject.set(x, "completedWork", value.asInstanceOf[js.Any])
    
    inline def setCompletedWorkNull: Self = StObject.set(x, "completedWork", null)
    
    inline def setCompletedWorkUndefined: Self = StObject.set(x, "completedWork", js.undefined)
    
    inline def setEstimatedWork(value: String): Self = StObject.set(x, "estimatedWork", value.asInstanceOf[js.Any])
    
    inline def setEstimatedWorkNull: Self = StObject.set(x, "estimatedWork", null)
    
    inline def setEstimatedWorkUndefined: Self = StObject.set(x, "estimatedWork", js.undefined)
  }
}
