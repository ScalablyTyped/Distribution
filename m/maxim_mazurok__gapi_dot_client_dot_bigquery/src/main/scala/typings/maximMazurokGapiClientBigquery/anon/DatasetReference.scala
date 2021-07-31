package typings.maximMazurokGapiClientBigquery.anon

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetReference extends StObject {
  
  /** The dataset reference. Use this property to access specific parts of the dataset's ID, such as project ID or dataset ID. */
  var datasetReference: js.UndefOr[typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.DatasetReference] = js.undefined
  
  /** A descriptive name for the dataset, if one exists. */
  var friendlyName: js.UndefOr[String] = js.undefined
  
  /** The fully-qualified, unique, opaque ID of the dataset. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The resource type. This property always returns the value "bigquery#dataset". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The labels associated with this dataset. You can use these to organize and group your datasets. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.DatasetReference & TopLevel[js.Any]
  ] = js.undefined
  
  /** The geographic location where the data resides. */
  var location: js.UndefOr[String] = js.undefined
}
object DatasetReference {
  
  @scala.inline
  def apply(): DatasetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetReference]
  }
  
  @scala.inline
  implicit class DatasetReferenceMutableBuilder[Self <: DatasetReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetReference(value: typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.DatasetReference): Self = StObject.set(x, "datasetReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetReferenceUndefined: Self = StObject.set(x, "datasetReference", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.DatasetReference & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
