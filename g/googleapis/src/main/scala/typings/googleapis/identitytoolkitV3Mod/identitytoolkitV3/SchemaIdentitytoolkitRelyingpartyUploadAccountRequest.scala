package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitytoolkitRelyingpartyUploadAccountRequest extends StObject {
  
  /**
    * Whether allow overwrite existing account when user local_id exists.
    */
  var allowOverwrite: js.UndefOr[Boolean | Null] = js.undefined
  
  var blockSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The following 4 fields are for standard scrypt algorithm.
    */
  var cpuMemCost: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String | Null] = js.undefined
  
  var dkLen: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The password hash algorithm.
    */
  var hashAlgorithm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Memory cost for hash calculation. Used by scrypt similar algorithms.
    */
  var memoryCost: js.UndefOr[Double | Null] = js.undefined
  
  var parallelization: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Rounds for hash calculation. Used by scrypt and similar algorithms.
    */
  var rounds: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The salt separator.
    */
  var saltSeparator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, backend will do sanity check(including duplicate email and federated id) when uploading account.
    */
  var sanityCheck: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The key for to hash the password.
    */
  var signerKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specify which project (field value is actually project id) to operate. Only used when provided credential.
    */
  var targetProjectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The account info to be stored.
    */
  var users: js.UndefOr[js.Array[SchemaUserInfo]] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartyUploadAccountRequest {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartyUploadAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyUploadAccountRequest]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartyUploadAccountRequest](x: Self) {
    
    inline def setAllowOverwrite(value: Boolean): Self = StObject.set(x, "allowOverwrite", value.asInstanceOf[js.Any])
    
    inline def setAllowOverwriteNull: Self = StObject.set(x, "allowOverwrite", null)
    
    inline def setAllowOverwriteUndefined: Self = StObject.set(x, "allowOverwrite", js.undefined)
    
    inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    inline def setBlockSizeNull: Self = StObject.set(x, "blockSize", null)
    
    inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
    
    inline def setCpuMemCost(value: Double): Self = StObject.set(x, "cpuMemCost", value.asInstanceOf[js.Any])
    
    inline def setCpuMemCostNull: Self = StObject.set(x, "cpuMemCost", null)
    
    inline def setCpuMemCostUndefined: Self = StObject.set(x, "cpuMemCost", js.undefined)
    
    inline def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    inline def setDelegatedProjectNumberNull: Self = StObject.set(x, "delegatedProjectNumber", null)
    
    inline def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    inline def setDkLen(value: Double): Self = StObject.set(x, "dkLen", value.asInstanceOf[js.Any])
    
    inline def setDkLenNull: Self = StObject.set(x, "dkLen", null)
    
    inline def setDkLenUndefined: Self = StObject.set(x, "dkLen", js.undefined)
    
    inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmNull: Self = StObject.set(x, "hashAlgorithm", null)
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setMemoryCost(value: Double): Self = StObject.set(x, "memoryCost", value.asInstanceOf[js.Any])
    
    inline def setMemoryCostNull: Self = StObject.set(x, "memoryCost", null)
    
    inline def setMemoryCostUndefined: Self = StObject.set(x, "memoryCost", js.undefined)
    
    inline def setParallelization(value: Double): Self = StObject.set(x, "parallelization", value.asInstanceOf[js.Any])
    
    inline def setParallelizationNull: Self = StObject.set(x, "parallelization", null)
    
    inline def setParallelizationUndefined: Self = StObject.set(x, "parallelization", js.undefined)
    
    inline def setRounds(value: Double): Self = StObject.set(x, "rounds", value.asInstanceOf[js.Any])
    
    inline def setRoundsNull: Self = StObject.set(x, "rounds", null)
    
    inline def setRoundsUndefined: Self = StObject.set(x, "rounds", js.undefined)
    
    inline def setSaltSeparator(value: String): Self = StObject.set(x, "saltSeparator", value.asInstanceOf[js.Any])
    
    inline def setSaltSeparatorNull: Self = StObject.set(x, "saltSeparator", null)
    
    inline def setSaltSeparatorUndefined: Self = StObject.set(x, "saltSeparator", js.undefined)
    
    inline def setSanityCheck(value: Boolean): Self = StObject.set(x, "sanityCheck", value.asInstanceOf[js.Any])
    
    inline def setSanityCheckNull: Self = StObject.set(x, "sanityCheck", null)
    
    inline def setSanityCheckUndefined: Self = StObject.set(x, "sanityCheck", js.undefined)
    
    inline def setSignerKey(value: String): Self = StObject.set(x, "signerKey", value.asInstanceOf[js.Any])
    
    inline def setSignerKeyNull: Self = StObject.set(x, "signerKey", null)
    
    inline def setSignerKeyUndefined: Self = StObject.set(x, "signerKey", js.undefined)
    
    inline def setTargetProjectId(value: String): Self = StObject.set(x, "targetProjectId", value.asInstanceOf[js.Any])
    
    inline def setTargetProjectIdNull: Self = StObject.set(x, "targetProjectId", null)
    
    inline def setTargetProjectIdUndefined: Self = StObject.set(x, "targetProjectId", js.undefined)
    
    inline def setUsers(value: js.Array[SchemaUserInfo]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: SchemaUserInfo*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
