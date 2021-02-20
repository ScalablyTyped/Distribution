package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the upload status of a row in the request.
  */
@js.native
trait SchemaRowStatus extends StObject {
  
  /**
    * Whether the stored entity is changed as a result of upload.
    */
  var changed: js.UndefOr[Boolean] = js.native
  
  /**
    * Entity Id.
    */
  var entityId: js.UndefOr[String] = js.native
  
  /**
    * Entity name.
    */
  var entityName: js.UndefOr[String] = js.native
  
  /**
    * Reasons why the entity can&#39;t be uploaded.
    */
  var errors: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether the entity is persisted.
    */
  var persisted: js.UndefOr[Boolean] = js.native
  
  /**
    * Row number.
    */
  var rowNumber: js.UndefOr[Double] = js.native
}
object SchemaRowStatus {
  
  @scala.inline
  def apply(): SchemaRowStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRowStatus]
  }
  
  @scala.inline
  implicit class SchemaRowStatusMutableBuilder[Self <: SchemaRowStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
    
    @scala.inline
    def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    @scala.inline
    def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityNameUndefined: Self = StObject.set(x, "entityName", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setPersisted(value: Boolean): Self = StObject.set(x, "persisted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistedUndefined: Self = StObject.set(x, "persisted", js.undefined)
    
    @scala.inline
    def setRowNumber(value: Double): Self = StObject.set(x, "rowNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowNumberUndefined: Self = StObject.set(x, "rowNumber", js.undefined)
  }
}
