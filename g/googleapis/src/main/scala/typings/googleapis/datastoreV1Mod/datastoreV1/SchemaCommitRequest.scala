package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.Commit.
  */
@js.native
trait SchemaCommitRequest extends js.Object {
  /**
    * The type of commit to perform. Defaults to `TRANSACTIONAL`.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * The mutations to perform.  When mode is `TRANSACTIONAL`, mutations
    * affecting a single entity are applied in order. The following sequences
    * of mutations affecting a single entity are not permitted in a single
    * `Commit` request:  - `insert` followed by `insert` - `update` followed by
    * `insert` - `upsert` followed by `insert` - `delete` followed by `update`
    * When mode is `NON_TRANSACTIONAL`, no two mutations may affect a single
    * entity.
    */
  var mutations: js.UndefOr[js.Array[SchemaMutation]] = js.native
  /**
    * The identifier of the transaction associated with the commit. A
    * transaction identifier is returned by a call to
    * Datastore.BeginTransaction.
    */
  var transaction: js.UndefOr[String] = js.native
}

object SchemaCommitRequest {
  @scala.inline
  def apply(mode: String = null, mutations: js.Array[SchemaMutation] = null, transaction: String = null): SchemaCommitRequest = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mutations != null) __obj.updateDynamic("mutations")(mutations.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommitRequest]
  }
}

