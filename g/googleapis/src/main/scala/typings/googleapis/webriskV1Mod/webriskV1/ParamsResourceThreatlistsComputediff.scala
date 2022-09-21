package typings.googleapis.webriskV1Mod.webriskV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceThreatlistsComputediff
  extends StObject
     with StandardParameters {
  
  /**
    * Sets the maximum number of entries that the client is willing to have in the local database. This should be a power of 2 between 2**10 and 2**20. If zero, no database size limit is set.
    */
  @JSName("constraints.maxDatabaseEntries")
  var constraintsDotmaxDatabaseEntries: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum size in number of entries. The diff will not contain more entries than this value. This should be a power of 2 between 2**10 and 2**20. If zero, no diff size limit is set.
    */
  @JSName("constraints.maxDiffEntries")
  var constraintsDotmaxDiffEntries: js.UndefOr[Double] = js.undefined
  
  /**
    * The compression types supported by the client.
    */
  @JSName("constraints.supportedCompressions")
  var constraintsDotsupportedCompressions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. The threat list to update. Only a single ThreatType should be specified per request. If you want to handle multiple ThreatTypes, you must make one request per ThreatType.
    */
  var threatType: js.UndefOr[String] = js.undefined
  
  /**
    * The current version token of the client for the requested list (the client version that was received from the last successful diff). If the client does not have a version token (this is the first time calling ComputeThreatListDiff), this may be left empty and a full database snapshot will be returned.
    */
  var versionToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceThreatlistsComputediff {
  
  inline def apply(): ParamsResourceThreatlistsComputediff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceThreatlistsComputediff]
  }
  
  extension [Self <: ParamsResourceThreatlistsComputediff](x: Self) {
    
    inline def setConstraintsDotmaxDatabaseEntries(value: Double): Self = StObject.set(x, "constraints.maxDatabaseEntries", value.asInstanceOf[js.Any])
    
    inline def setConstraintsDotmaxDatabaseEntriesUndefined: Self = StObject.set(x, "constraints.maxDatabaseEntries", js.undefined)
    
    inline def setConstraintsDotmaxDiffEntries(value: Double): Self = StObject.set(x, "constraints.maxDiffEntries", value.asInstanceOf[js.Any])
    
    inline def setConstraintsDotmaxDiffEntriesUndefined: Self = StObject.set(x, "constraints.maxDiffEntries", js.undefined)
    
    inline def setConstraintsDotsupportedCompressions(value: js.Array[String]): Self = StObject.set(x, "constraints.supportedCompressions", value.asInstanceOf[js.Any])
    
    inline def setConstraintsDotsupportedCompressionsUndefined: Self = StObject.set(x, "constraints.supportedCompressions", js.undefined)
    
    inline def setConstraintsDotsupportedCompressionsVarargs(value: String*): Self = StObject.set(x, "constraints.supportedCompressions", js.Array(value*))
    
    inline def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    inline def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
    
    inline def setVersionToken(value: String): Self = StObject.set(x, "versionToken", value.asInstanceOf[js.Any])
    
    inline def setVersionTokenUndefined: Self = StObject.set(x, "versionToken", js.undefined)
  }
}
