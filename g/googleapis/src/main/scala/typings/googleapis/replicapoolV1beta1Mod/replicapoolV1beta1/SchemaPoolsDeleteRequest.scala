package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPoolsDeleteRequest extends StObject {
  
  /**
    * If there are instances you would like to keep, you can specify them here.
    * These instances won&#39;t be deleted, but the associated replica objects
    * will be removed.
    */
  var abandonInstances: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaPoolsDeleteRequest {
  
  @scala.inline
  def apply(): SchemaPoolsDeleteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoolsDeleteRequest]
  }
  
  @scala.inline
  implicit class SchemaPoolsDeleteRequestMutableBuilder[Self <: SchemaPoolsDeleteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbandonInstances(value: js.Array[String]): Self = StObject.set(x, "abandonInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbandonInstancesUndefined: Self = StObject.set(x, "abandonInstances", js.undefined)
    
    @scala.inline
    def setAbandonInstancesVarargs(value: String*): Self = StObject.set(x, "abandonInstances", js.Array(value :_*))
  }
}
