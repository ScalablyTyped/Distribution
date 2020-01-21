package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about the request.
  */
@js.native
trait SchemaRequestMetadata extends js.Object {
  /**
    * The IP address of the caller. For caller from internet, this will be
    * public IPv4 or IPv6 address. For caller from a Compute Engine VM with
    * external IP address, this will be the VM&#39;s external IP address. For
    * caller from a Compute Engine VM without external IP address, if the VM is
    * in the same organization (or project) as the accessed resource,
    * `caller_ip` will be the VM&#39;s internal IPv4 address, otherwise the
    * `caller_ip` will be redacted to &quot;gce-internal-ip&quot;. See
    * https://cloud.google.com/compute/docs/vpc/ for more information.
    */
  var callerIp: js.UndefOr[String] = js.native
  /**
    * The network of the caller. Set only if the network host project is part
    * of the same GCP organization (or project) as the accessed resource. See
    * https://cloud.google.com/compute/docs/vpc/ for more information. This is
    * a scheme-less URI full resource name. For example:
    * &quot;//compute.googleapis.com/projects/PROJECT_ID/global/networks/NETWORK_ID&quot;
    */
  var callerNetwork: js.UndefOr[String] = js.native
  /**
    * The user agent of the caller. This information is not authenticated and
    * should be treated accordingly. For example:  +
    * `google-api-python-client/1.4.0`:     The request was made by the Google
    * API client for Python. +   `Cloud SDK Command Line Tool
    * apitools-client/1.0 gcloud/0.9.62`:     The request was made by the
    * Google Cloud SDK CLI (gcloud). +   `AppEngine-Google;
    * (+http://code.google.com/appengine; appid: s~my-project`:     The request
    * was made from the `my-project` App Engine app. NOLINT
    */
  var callerSuppliedUserAgent: js.UndefOr[String] = js.native
  /**
    * The destination of a network activity, such as accepting a TCP
    * connection. In a multi hop network activity, the destination represents
    * the receiver of the last hop. Only two fields are used in this message,
    * Peer.port and Peer.ip. These fields are optionally populated by those
    * services utilizing the IAM condition feature.
    */
  var destinationAttributes: js.UndefOr[SchemaPeer] = js.native
  /**
    * Request attributes used in IAM condition evaluation. This field contains
    * request attributes like request time and access levels associated with
    * the request.   To get the whole view of the attributes used in IAM
    * condition evaluation, the user must also look into
    * `AuditLog.authentication_info.resource_attributes`.
    */
  var requestAttributes: js.UndefOr[SchemaRequest] = js.native
}

object SchemaRequestMetadata {
  @scala.inline
  def apply(
    callerIp: String = null,
    callerNetwork: String = null,
    callerSuppliedUserAgent: String = null,
    destinationAttributes: SchemaPeer = null,
    requestAttributes: SchemaRequest = null
  ): SchemaRequestMetadata = {
    val __obj = js.Dynamic.literal()
    if (callerIp != null) __obj.updateDynamic("callerIp")(callerIp.asInstanceOf[js.Any])
    if (callerNetwork != null) __obj.updateDynamic("callerNetwork")(callerNetwork.asInstanceOf[js.Any])
    if (callerSuppliedUserAgent != null) __obj.updateDynamic("callerSuppliedUserAgent")(callerSuppliedUserAgent.asInstanceOf[js.Any])
    if (destinationAttributes != null) __obj.updateDynamic("destinationAttributes")(destinationAttributes.asInstanceOf[js.Any])
    if (requestAttributes != null) __obj.updateDynamic("requestAttributes")(requestAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRequestMetadata]
  }
}

