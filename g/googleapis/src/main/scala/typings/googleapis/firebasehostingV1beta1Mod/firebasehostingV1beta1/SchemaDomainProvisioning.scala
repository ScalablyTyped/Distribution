package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The current certificate provisioning status information for a domain.
  */
@js.native
trait SchemaDomainProvisioning extends js.Object {
  /**
    * The TXT records (for the certificate challenge) that were found at the
    * last DNS fetch.
    */
  var certChallengeDiscoveredTxt: js.UndefOr[js.Array[String]] = js.native
  /**
    * The DNS challenge for generating a certificate.
    */
  var certChallengeDns: js.UndefOr[SchemaCertDnsChallenge] = js.native
  /**
    * The HTTP challenge for generating a certificate.
    */
  var certChallengeHttp: js.UndefOr[SchemaCertHttpChallenge] = js.native
  /**
    * The certificate provisioning status; updated when Firebase Hosting
    * provisions an SSL certificate for the domain.
    */
  var certStatus: js.UndefOr[String] = js.native
  /**
    * The IPs found at the last DNS fetch.
    */
  var discoveredIps: js.UndefOr[js.Array[String]] = js.native
  /**
    * The time at which the last DNS fetch occurred.
    */
  var dnsFetchTime: js.UndefOr[String] = js.native
  /**
    * The DNS record match status as of the last DNS fetch.
    */
  var dnsStatus: js.UndefOr[String] = js.native
  /**
    * The list of IPs to which the domain is expected to resolve.
    */
  var expectedIps: js.UndefOr[js.Array[String]] = js.native
}

object SchemaDomainProvisioning {
  @scala.inline
  def apply(
    certChallengeDiscoveredTxt: js.Array[String] = null,
    certChallengeDns: SchemaCertDnsChallenge = null,
    certChallengeHttp: SchemaCertHttpChallenge = null,
    certStatus: String = null,
    discoveredIps: js.Array[String] = null,
    dnsFetchTime: String = null,
    dnsStatus: String = null,
    expectedIps: js.Array[String] = null
  ): SchemaDomainProvisioning = {
    val __obj = js.Dynamic.literal()
    if (certChallengeDiscoveredTxt != null) __obj.updateDynamic("certChallengeDiscoveredTxt")(certChallengeDiscoveredTxt.asInstanceOf[js.Any])
    if (certChallengeDns != null) __obj.updateDynamic("certChallengeDns")(certChallengeDns.asInstanceOf[js.Any])
    if (certChallengeHttp != null) __obj.updateDynamic("certChallengeHttp")(certChallengeHttp.asInstanceOf[js.Any])
    if (certStatus != null) __obj.updateDynamic("certStatus")(certStatus.asInstanceOf[js.Any])
    if (discoveredIps != null) __obj.updateDynamic("discoveredIps")(discoveredIps.asInstanceOf[js.Any])
    if (dnsFetchTime != null) __obj.updateDynamic("dnsFetchTime")(dnsFetchTime.asInstanceOf[js.Any])
    if (dnsStatus != null) __obj.updateDynamic("dnsStatus")(dnsStatus.asInstanceOf[js.Any])
    if (expectedIps != null) __obj.updateDynamic("expectedIps")(expectedIps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDomainProvisioning]
  }
}

