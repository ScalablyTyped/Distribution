package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Measures the progress of a particular metric.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1beta1Progress extends StObject {
  
  /**
    * The amount of work that has been completed. Note that this may be greater
    * than work_estimated.
    */
  var workCompleted: js.UndefOr[String] = js.native
  
  /**
    * An estimate of how much work needs to be performed. May be zero if the
    * work estimate is unavailable.
    */
  var workEstimated: js.UndefOr[String] = js.native
}
object SchemaGoogleDatastoreAdminV1beta1Progress {
  
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1beta1Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1beta1Progress]
  }
  
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1beta1ProgressMutableBuilder[Self <: SchemaGoogleDatastoreAdminV1beta1Progress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkCompleted(value: String): Self = StObject.set(x, "workCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkCompletedUndefined: Self = StObject.set(x, "workCompleted", js.undefined)
    
    @scala.inline
    def setWorkEstimated(value: String): Self = StObject.set(x, "workEstimated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkEstimatedUndefined: Self = StObject.set(x, "workEstimated", js.undefined)
  }
}
