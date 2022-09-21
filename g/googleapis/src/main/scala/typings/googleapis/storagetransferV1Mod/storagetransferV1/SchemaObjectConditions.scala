package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObjectConditions extends StObject {
  
  /**
    * If you specify `exclude_prefixes`, Storage Transfer Service uses the items in the `exclude_prefixes` array to determine which objects to exclude from a transfer. Objects must not start with one of the matching `exclude_prefixes` for inclusion in a transfer. The following are requirements of `exclude_prefixes`: * Each exclude-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each exclude-prefix must omit the leading slash. For example, to exclude the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the exclude-prefix as `logs/y=2015/requests.gz`. * None of the exclude-prefix values can be empty, if specified. * Each exclude-prefix must exclude a distinct portion of the object namespace. No exclude-prefix may be a prefix of another exclude-prefix. * If include_prefixes is specified, then each exclude-prefix must start with the value of a path explicitly included by `include_prefixes`. The max size of `exclude_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
    */
  var excludePrefixes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * If you specify `include_prefixes`, Storage Transfer Service uses the items in the `include_prefixes` array to determine which objects to include in a transfer. Objects must start with one of the matching `include_prefixes` for inclusion in the transfer. If exclude_prefixes is specified, objects must not start with any of the `exclude_prefixes` specified for inclusion in the transfer. The following are requirements of `include_prefixes`: * Each include-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each include-prefix must omit the leading slash. For example, to include the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the include-prefix as `logs/y=2015/requests.gz`. * None of the include-prefix values can be empty, if specified. * Each include-prefix must include a distinct portion of the object namespace. No include-prefix may be a prefix of another include-prefix. The max size of `include_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
    */
  var includePrefixes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * If specified, only objects with a "last modification time" before this timestamp and objects that don't have a "last modification time" are transferred.
    */
  var lastModifiedBefore: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If specified, only objects with a "last modification time" on or after this timestamp and objects that don't have a "last modification time" are transferred. The `last_modified_since` and `last_modified_before` fields can be used together for chunked data processing. For example, consider a script that processes each day's worth of data at a time. For that you'd set each of the fields as follows: * `last_modified_since` to the start of the day * `last_modified_before` to the end of the day
    */
  var lastModifiedSince: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ensures that objects are not transferred if a specific maximum time has elapsed since the "last modification time". When a TransferOperation begins, objects with a "last modification time" are transferred only if the elapsed time between the start_time of the `TransferOperation`and the "last modification time" of the object is less than the value of max_time_elapsed_since_last_modification`. Objects that do not have a "last modification time" are also transferred.
    */
  var maxTimeElapsedSinceLastModification: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ensures that objects are not transferred until a specific minimum time has elapsed after the "last modification time". When a TransferOperation begins, objects with a "last modification time" are transferred only if the elapsed time between the start_time of the `TransferOperation` and the "last modification time" of the object is equal to or greater than the value of min_time_elapsed_since_last_modification`. Objects that do not have a "last modification time" are also transferred.
    */
  var minTimeElapsedSinceLastModification: js.UndefOr[String | Null] = js.undefined
}
object SchemaObjectConditions {
  
  inline def apply(): SchemaObjectConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectConditions]
  }
  
  extension [Self <: SchemaObjectConditions](x: Self) {
    
    inline def setExcludePrefixes(value: js.Array[String]): Self = StObject.set(x, "excludePrefixes", value.asInstanceOf[js.Any])
    
    inline def setExcludePrefixesNull: Self = StObject.set(x, "excludePrefixes", null)
    
    inline def setExcludePrefixesUndefined: Self = StObject.set(x, "excludePrefixes", js.undefined)
    
    inline def setExcludePrefixesVarargs(value: String*): Self = StObject.set(x, "excludePrefixes", js.Array(value*))
    
    inline def setIncludePrefixes(value: js.Array[String]): Self = StObject.set(x, "includePrefixes", value.asInstanceOf[js.Any])
    
    inline def setIncludePrefixesNull: Self = StObject.set(x, "includePrefixes", null)
    
    inline def setIncludePrefixesUndefined: Self = StObject.set(x, "includePrefixes", js.undefined)
    
    inline def setIncludePrefixesVarargs(value: String*): Self = StObject.set(x, "includePrefixes", js.Array(value*))
    
    inline def setLastModifiedBefore(value: String): Self = StObject.set(x, "lastModifiedBefore", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBeforeNull: Self = StObject.set(x, "lastModifiedBefore", null)
    
    inline def setLastModifiedBeforeUndefined: Self = StObject.set(x, "lastModifiedBefore", js.undefined)
    
    inline def setLastModifiedSince(value: String): Self = StObject.set(x, "lastModifiedSince", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedSinceNull: Self = StObject.set(x, "lastModifiedSince", null)
    
    inline def setLastModifiedSinceUndefined: Self = StObject.set(x, "lastModifiedSince", js.undefined)
    
    inline def setMaxTimeElapsedSinceLastModification(value: String): Self = StObject.set(x, "maxTimeElapsedSinceLastModification", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeElapsedSinceLastModificationNull: Self = StObject.set(x, "maxTimeElapsedSinceLastModification", null)
    
    inline def setMaxTimeElapsedSinceLastModificationUndefined: Self = StObject.set(x, "maxTimeElapsedSinceLastModification", js.undefined)
    
    inline def setMinTimeElapsedSinceLastModification(value: String): Self = StObject.set(x, "minTimeElapsedSinceLastModification", value.asInstanceOf[js.Any])
    
    inline def setMinTimeElapsedSinceLastModificationNull: Self = StObject.set(x, "minTimeElapsedSinceLastModification", null)
    
    inline def setMinTimeElapsedSinceLastModificationUndefined: Self = StObject.set(x, "minTimeElapsedSinceLastModification", js.undefined)
  }
}
