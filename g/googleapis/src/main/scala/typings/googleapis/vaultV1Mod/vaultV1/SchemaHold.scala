package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a hold within Vault. A hold restricts purging of artifacts based
  * on the combination of the query and accounts restrictions. A hold can be
  * configured to either apply to an explicitly configured set of accounts, or
  * can be applied to all members of an organizational unit.
  */
@js.native
trait SchemaHold extends js.Object {
  /**
    * If set, the hold applies to the enumerated accounts and org_unit must be
    * empty.
    */
  var accounts: js.UndefOr[js.Array[SchemaHeldAccount]] = js.native
  /**
    * The corpus to be searched.
    */
  var corpus: js.UndefOr[String] = js.native
  /**
    * The unique immutable ID of the hold. Assigned during creation.
    */
  var holdId: js.UndefOr[String] = js.native
  /**
    * The name of the hold.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If set, the hold applies to all members of the organizational unit and
    * accounts must be empty. This property is mutable. For groups holds, set
    * the accounts field.
    */
  var orgUnit: js.UndefOr[SchemaHeldOrgUnit] = js.native
  /**
    * The corpus-specific query. If set, the corpusQuery must match corpus
    * type.
    */
  var query: js.UndefOr[SchemaCorpusQuery] = js.native
  /**
    * The last time this hold was modified.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaHold {
  @scala.inline
  def apply(
    accounts: js.Array[SchemaHeldAccount] = null,
    corpus: String = null,
    holdId: String = null,
    name: String = null,
    orgUnit: SchemaHeldOrgUnit = null,
    query: SchemaCorpusQuery = null,
    updateTime: String = null
  ): SchemaHold = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    if (corpus != null) __obj.updateDynamic("corpus")(corpus.asInstanceOf[js.Any])
    if (holdId != null) __obj.updateDynamic("holdId")(holdId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orgUnit != null) __obj.updateDynamic("orgUnit")(orgUnit.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHold]
  }
}

