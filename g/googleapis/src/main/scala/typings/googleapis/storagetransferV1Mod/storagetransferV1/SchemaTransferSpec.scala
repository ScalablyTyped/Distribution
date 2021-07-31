package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for running a transfer.
  */
trait SchemaTransferSpec extends StObject {
  
  /**
    * An AWS S3 data source.
    */
  var awsS3DataSource: js.UndefOr[SchemaAwsS3Data] = js.undefined
  
  /**
    * A Google Cloud Storage data sink.
    */
  var gcsDataSink: js.UndefOr[SchemaGcsData] = js.undefined
  
  /**
    * A Google Cloud Storage data source.
    */
  var gcsDataSource: js.UndefOr[SchemaGcsData] = js.undefined
  
  /**
    * An HTTP URL data source.
    */
  var httpDataSource: js.UndefOr[SchemaHttpData] = js.undefined
  
  /**
    * Only objects that satisfy these object conditions are included in the set
    * of data source and data sink objects.  Object conditions based on
    * objects&#39; `lastModificationTime` do not exclude objects in a data
    * sink.
    */
  var objectConditions: js.UndefOr[SchemaObjectConditions] = js.undefined
  
  /**
    * If the option `deleteObjectsUniqueInSink` is `true`, object conditions
    * based on objects&#39; `lastModificationTime` are ignored and do not
    * exclude objects in a data source or a data sink.
    */
  var transferOptions: js.UndefOr[SchemaTransferOptions] = js.undefined
}
object SchemaTransferSpec {
  
  @scala.inline
  def apply(): SchemaTransferSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferSpec]
  }
  
  @scala.inline
  implicit class SchemaTransferSpecMutableBuilder[Self <: SchemaTransferSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsS3DataSource(value: SchemaAwsS3Data): Self = StObject.set(x, "awsS3DataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsS3DataSourceUndefined: Self = StObject.set(x, "awsS3DataSource", js.undefined)
    
    @scala.inline
    def setGcsDataSink(value: SchemaGcsData): Self = StObject.set(x, "gcsDataSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDataSinkUndefined: Self = StObject.set(x, "gcsDataSink", js.undefined)
    
    @scala.inline
    def setGcsDataSource(value: SchemaGcsData): Self = StObject.set(x, "gcsDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDataSourceUndefined: Self = StObject.set(x, "gcsDataSource", js.undefined)
    
    @scala.inline
    def setHttpDataSource(value: SchemaHttpData): Self = StObject.set(x, "httpDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpDataSourceUndefined: Self = StObject.set(x, "httpDataSource", js.undefined)
    
    @scala.inline
    def setObjectConditions(value: SchemaObjectConditions): Self = StObject.set(x, "objectConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectConditionsUndefined: Self = StObject.set(x, "objectConditions", js.undefined)
    
    @scala.inline
    def setTransferOptions(value: SchemaTransferOptions): Self = StObject.set(x, "transferOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferOptionsUndefined: Self = StObject.set(x, "transferOptions", js.undefined)
  }
}
