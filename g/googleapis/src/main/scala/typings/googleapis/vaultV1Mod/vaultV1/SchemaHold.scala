package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a hold within Vault. A hold restricts purging of artifacts based
  * on the combination of the query and accounts restrictions. A hold can be
  * configured to either apply to an explicitly configured set of accounts, or
  * can be applied to all members of an organizational unit.
  */
trait SchemaHold extends StObject {
  
  /**
    * If set, the hold applies to the enumerated accounts and org_unit must be
    * empty.
    */
  var accounts: js.UndefOr[js.Array[SchemaHeldAccount]] = js.undefined
  
  /**
    * The corpus to be searched.
    */
  var corpus: js.UndefOr[String] = js.undefined
  
  /**
    * The unique immutable ID of the hold. Assigned during creation.
    */
  var holdId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the hold.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * If set, the hold applies to all members of the organizational unit and
    * accounts must be empty. This property is mutable. For groups holds, set
    * the accounts field.
    */
  var orgUnit: js.UndefOr[SchemaHeldOrgUnit] = js.undefined
  
  /**
    * The corpus-specific query. If set, the corpusQuery must match corpus
    * type.
    */
  var query: js.UndefOr[SchemaCorpusQuery] = js.undefined
  
  /**
    * The last time this hold was modified.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaHold {
  
  inline def apply(): SchemaHold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHold]
  }
  
  extension [Self <: SchemaHold](x: Self) {
    
    inline def setAccounts(value: js.Array[SchemaHeldAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: SchemaHeldAccount*): Self = StObject.set(x, "accounts", js.Array(value :_*))
    
    inline def setCorpus(value: String): Self = StObject.set(x, "corpus", value.asInstanceOf[js.Any])
    
    inline def setCorpusUndefined: Self = StObject.set(x, "corpus", js.undefined)
    
    inline def setHoldId(value: String): Self = StObject.set(x, "holdId", value.asInstanceOf[js.Any])
    
    inline def setHoldIdUndefined: Self = StObject.set(x, "holdId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrgUnit(value: SchemaHeldOrgUnit): Self = StObject.set(x, "orgUnit", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitUndefined: Self = StObject.set(x, "orgUnit", js.undefined)
    
    inline def setQuery(value: SchemaCorpusQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
