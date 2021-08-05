package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the progress of the operation. Unit of work is generic and must
  * be interpreted based on where Progress is used.
  */
trait SchemaGoogleFirestoreAdminV1beta2Progress extends StObject {
  
  /**
    * The amount of work completed.
    */
  var completedWork: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of work estimated.
    */
  var estimatedWork: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta2Progress {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1beta2Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2Progress]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1beta2Progress](x: Self) {
    
    inline def setCompletedWork(value: String): Self = StObject.set(x, "completedWork", value.asInstanceOf[js.Any])
    
    inline def setCompletedWorkUndefined: Self = StObject.set(x, "completedWork", js.undefined)
    
    inline def setEstimatedWork(value: String): Self = StObject.set(x, "estimatedWork", value.asInstanceOf[js.Any])
    
    inline def setEstimatedWorkUndefined: Self = StObject.set(x, "estimatedWork", js.undefined)
  }
}
