package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

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
  
  inline def apply(): SchemaListDicomStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDicomStoresResponse]
  }
  
  extension [Self <: SchemaListDicomStoresResponse](x: Self) {
    
    inline def setDicomStores(value: js.Array[SchemaDicomStore]): Self = StObject.set(x, "dicomStores", value.asInstanceOf[js.Any])
    
    inline def setDicomStoresUndefined: Self = StObject.set(x, "dicomStores", js.undefined)
    
    inline def setDicomStoresVarargs(value: SchemaDicomStore*): Self = StObject.set(x, "dicomStores", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
