package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Commitment resource. Creating a Commitment resource means that
  * you are purchasing a committed use contract with an explicit start and end
  * time. You can create commitments based on vCPUs and memory usage and
  * receive discounted rates. For full details, read Signing Up for Committed
  * Use Discounts.  Committed use discounts are subject to Google Cloud
  * Platform&#39;s Service Specific Terms. By purchasing a committed use
  * discount, you agree to these terms. Committed use discounts will not renew,
  * so you must purchase a new commitment to continue receiving discounts. (==
  * resource_for beta.commitments ==) (== resource_for v1.commitments ==)
  */
@js.native
trait SchemaCommitment extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] Commitment end time in RFC3339 text format.
    */
  var endTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#commitment for
    * commitments.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The plan for this commitment, which determines duration and discount
    * rate. The currently supported plans are TWELVE_MONTH (1 year), and
    * THIRTY_SIX_MONTH (3 years).
    */
  var plan: js.UndefOr[String] = js.native
  /**
    * [Output Only] URL of the region where this commitment may be used.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * A list of commitment amounts for particular resources. Note that VCPU and
    * MEMORY resource commitments must occur together.
    */
  var resources: js.UndefOr[js.Array[SchemaResourceCommitment]] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Commitment start time in RFC3339 text format.
    */
  var startTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] Status of the commitment with regards to eventual
    * expiration (each commitment has an end date defined). One of the
    * following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * [Output Only] An optional, human-readable explanation of the status.
    */
  var statusMessage: js.UndefOr[String] = js.native
}

object SchemaCommitment {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    endTimestamp: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    plan: String = null,
    region: String = null,
    resources: js.Array[SchemaResourceCommitment] = null,
    selfLink: String = null,
    startTimestamp: String = null,
    status: String = null,
    statusMessage: String = null
  ): SchemaCommitment = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endTimestamp != null) __obj.updateDynamic("endTimestamp")(endTimestamp.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (startTimestamp != null) __obj.updateDynamic("startTimestamp")(startTimestamp.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommitment]
  }
}

