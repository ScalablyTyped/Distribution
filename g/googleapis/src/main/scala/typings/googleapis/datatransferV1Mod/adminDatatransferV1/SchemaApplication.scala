package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The JSON template for an Application resource.
  */
@js.native
trait SchemaApplication extends StObject {
  
  /**
    * Etag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The application&#39;s ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies the resource as a DataTransfer Application Resource.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The application&#39;s name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The list of all possible transfer parameters for this application. These
    * parameters can be used to select the data of the user in this application
    * to be transfered.
    */
  var transferParams: js.UndefOr[js.Array[SchemaApplicationTransferParam]] = js.native
}
object SchemaApplication {
  
  @scala.inline
  def apply(): SchemaApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplication]
  }
  
  @scala.inline
  implicit class SchemaApplicationMutableBuilder[Self <: SchemaApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTransferParams(value: js.Array[SchemaApplicationTransferParam]): Self = StObject.set(x, "transferParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferParamsUndefined: Self = StObject.set(x, "transferParams", js.undefined)
    
    @scala.inline
    def setTransferParamsVarargs(value: SchemaApplicationTransferParam*): Self = StObject.set(x, "transferParams", js.Array(value :_*))
  }
}
