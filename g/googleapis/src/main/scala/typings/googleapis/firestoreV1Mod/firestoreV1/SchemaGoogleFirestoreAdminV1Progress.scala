package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the progress of the operation. Unit of work is generic and must
  * be interpreted based on where Progress is used.
  */
trait SchemaGoogleFirestoreAdminV1Progress extends StObject {
  
  /**
    * The amount of work completed.
    */
  var completedWork: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of work estimated.
    */
  var estimatedWork: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFirestoreAdminV1Progress {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1Progress]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1ProgressMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1Progress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletedWork(value: String): Self = StObject.set(x, "completedWork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedWorkUndefined: Self = StObject.set(x, "completedWork", js.undefined)
    
    @scala.inline
    def setEstimatedWork(value: String): Self = StObject.set(x, "estimatedWork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedWorkUndefined: Self = StObject.set(x, "estimatedWork", js.undefined)
  }
}
