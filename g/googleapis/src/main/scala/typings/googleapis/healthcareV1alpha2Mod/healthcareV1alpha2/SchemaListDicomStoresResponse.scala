package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the DICOM stores in the given dataset.
  */
trait SchemaListDicomStoresResponse extends StObject {
  
  /**
    * The returned DICOM stores. Won&#39;t be more DICOM stores than the value
    * of page_size in the request.
    */
  var dicomStores: js.UndefOr[js.Array[SchemaDicomStore]] = js.undefined
  
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListDicomStoresResponse {
  
  @scala.inline
  def apply(): SchemaListDicomStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDicomStoresResponse]
  }
  
  @scala.inline
  implicit class SchemaListDicomStoresResponseMutableBuilder[Self <: SchemaListDicomStoresResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDicomStores(value: js.Array[SchemaDicomStore]): Self = StObject.set(x, "dicomStores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDicomStoresUndefined: Self = StObject.set(x, "dicomStores", js.undefined)
    
    @scala.inline
    def setDicomStoresVarargs(value: SchemaDicomStore*): Self = StObject.set(x, "dicomStores", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
