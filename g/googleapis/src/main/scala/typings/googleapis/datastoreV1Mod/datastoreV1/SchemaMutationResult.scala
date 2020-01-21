package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of applying a mutation.
  */
@js.native
trait SchemaMutationResult extends js.Object {
  /**
    * Whether a conflict was detected for this mutation. Always false when a
    * conflict detection strategy field is not set in the mutation.
    */
  var conflictDetected: js.UndefOr[Boolean] = js.native
  /**
    * The automatically allocated key. Set only when the mutation allocated a
    * key.
    */
  var key: js.UndefOr[SchemaKey] = js.native
  /**
    * The version of the entity on the server after processing the mutation. If
    * the mutation doesn&#39;t change anything on the server, then the version
    * will be the version of the current entity or, if no entity is present, a
    * version that is strictly greater than the version of any previous entity
    * and less than the version of any possible future entity.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaMutationResult {
  @scala.inline
  def apply(
    conflictDetected: js.UndefOr[Boolean] = js.undefined,
    key: SchemaKey = null,
    version: String = null
  ): SchemaMutationResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(conflictDetected)) __obj.updateDynamic("conflictDetected")(conflictDetected.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMutationResult]
  }
}

