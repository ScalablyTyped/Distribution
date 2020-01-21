package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes one specific error.
  */
@js.native
trait SchemaErrorProto extends js.Object {
  /**
    * Error arguments, to be used when building user-friendly error messages
    * given the error domain and code.  Different error codes require different
    * arguments.
    */
  var argument: js.UndefOr[js.Array[String]] = js.native
  /**
    * Error code in the error domain. This should correspond to a value of the
    * enum type whose name is in domain. See the core error domain in
    * error_domain.proto.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Debugging information, which should not be shared externally.
    */
  var debugInfo: js.UndefOr[String] = js.native
  /**
    * Error domain. RoSy services can define their own domain and error codes.
    * This should normally be the name of an enum type, such as:
    * gdata.CoreErrorDomain
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * A short explanation for the error, which can be shared outside Google.
    * Please set domain, code and arguments whenever possible instead of this
    * error message so that external APIs can build safe error messages
    * themselves.  External messages built in a RoSy interface will most likely
    * refer to information and concepts that are not available externally and
    * should not be exposed. It is safer if external APIs can understand the
    * errors and decide what the error message should look like.
    */
  var externalErrorMessage: js.UndefOr[String] = js.native
  /**
    * Location of the error, as specified by the location type.  If
    * location_type is PATH, this should be a path to a field that&#39;s
    * relative to the request, using FieldPath notation
    * (net/proto2/util/public/field_path.h).  Examples:
    * authenticated_user.gaia_id   resource.address[2].country
    */
  var location: js.UndefOr[String] = js.native
  var locationType: js.UndefOr[String] = js.native
}

object SchemaErrorProto {
  @scala.inline
  def apply(
    argument: js.Array[String] = null,
    code: String = null,
    debugInfo: String = null,
    domain: String = null,
    externalErrorMessage: String = null,
    location: String = null,
    locationType: String = null
  ): SchemaErrorProto = {
    val __obj = js.Dynamic.literal()
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (debugInfo != null) __obj.updateDynamic("debugInfo")(debugInfo.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (externalErrorMessage != null) __obj.updateDynamic("externalErrorMessage")(externalErrorMessage.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaErrorProto]
  }
}

