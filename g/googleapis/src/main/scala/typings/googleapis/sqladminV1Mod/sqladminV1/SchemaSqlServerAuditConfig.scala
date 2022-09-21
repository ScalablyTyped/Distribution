package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSqlServerAuditConfig extends StObject {
  
  /**
    * The name of the destination bucket (e.g., gs://mybucket).
    */
  var bucket: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always sql#sqlServerAuditConfig
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How long to keep generated audit files.
    */
  var retentionInterval: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How often to upload generated audit files.
    */
  var uploadInterval: js.UndefOr[String | Null] = js.undefined
}
object SchemaSqlServerAuditConfig {
  
  inline def apply(): SchemaSqlServerAuditConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlServerAuditConfig]
  }
  
  extension [Self <: SchemaSqlServerAuditConfig](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketNull: Self = StObject.set(x, "bucket", null)
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRetentionInterval(value: String): Self = StObject.set(x, "retentionInterval", value.asInstanceOf[js.Any])
    
    inline def setRetentionIntervalNull: Self = StObject.set(x, "retentionInterval", null)
    
    inline def setRetentionIntervalUndefined: Self = StObject.set(x, "retentionInterval", js.undefined)
    
    inline def setUploadInterval(value: String): Self = StObject.set(x, "uploadInterval", value.asInstanceOf[js.Any])
    
    inline def setUploadIntervalNull: Self = StObject.set(x, "uploadInterval", null)
    
    inline def setUploadIntervalUndefined: Self = StObject.set(x, "uploadInterval", js.undefined)
  }
}
