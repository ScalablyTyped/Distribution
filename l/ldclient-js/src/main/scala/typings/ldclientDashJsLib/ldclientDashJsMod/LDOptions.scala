package typings
package ldclientDashJsLib.ldclientDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LDOptions extends js.Object {
  /**
       * Whether all user attributes (except the user key) should be marked as
       * private, and not sent to LaunchDarkly.
       *
       * Defaults to false.
       */
  var allAttributesPrivate: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether or not to send an analytics event for a flag evaluation even if the same flag was
       * evaluated with the same value within the last five minutes. This defaults to false (duplicate
       * events within five minutes will be dropped).
       */
  var allowFrequentDuplicateEvents: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The base url for the LaunchDarkly server.
       *
       * This is used for enterprise customers with their own LaunchDarkly instances.
       * Most users should use the default value.
       *
       */
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The initial set of flags to use until the remote set is retrieved.
       *
       * If "localStorage" is specified, the flags will be saved and
       * retrieved from browser local storage. Alternatively, an LDFlagSet can
       * be specified which will be used as the initial source of flag values.
       */
  var bootstrap: js.UndefOr[ldclientDashJsLib.ldclientDashJsLibStrings.localStorage | LDFlagSet] = js.undefined
  /**
       * True if you want LaunchDarkly to provide additional information about how
       * flag values were calculated, which is then available through the client's
       * variationDetail() method. Since this increases the size of network requests,
       * such information is not sent unless you request it with this option.
       */
  var evaluationReasons: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The url for the LaunchDarkly events server.
       *
       * This is used for enterprise customers with their own LaunchDarkly instances.
       * Most users should use the default value.
       *
       */
  var eventsUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
       * True (the default) if the client should make a request to LaunchDarkly for
       * A/B testing goals. By default, this request is made on every page load.
       * Set it to false if you are not using A/B testing and want to skip the request.
       */
  var fetchGoals: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The signed user key for Secure Mode.
       */
  var hash: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The names of user attributes that should be marked as private, and not sent
       * to LaunchDarkly.
       *
       * Must be a list of strings. Defaults to empty list.
       */
  var privateAttributeNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * True (the default) if the client should send analytics events to LaunchDarkly.
       * Set it to false if you are not using analytics events.
       */
  var sendEvents: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether analytics events should be sent only when you call variation (true), or also when you
       * call allFlags (false). This defaults to false (events will be sent in both cases).
       */
  var sendEventsOnlyForVariation: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether or not to include custom HTTP headers when requesting flags from LaunchDarkly;
       * currently these are used to track what version of the SDK is active. This defaults to true
       * (custom headers will be sent). One reason you might want to set it to false is that the presence
       * of custom headers causes browsers to make an extra OPTIONS request (a CORS preflight check)
       * before each flag request, which could affect performance.
       */
  var sendLDHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The url for the LaunchDarkly stream server.
       *
       * This is used for enterprise customers with their own LaunchDarkly instances.
       * Most users should use the default value.
       *
       */
  var streamUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Whether or not to use the REPORT verb to fetch flag settings.
       *
       * If useReport is true, flag settings will be fetched with a REPORT request
       * including a JSON entity body with the user object.
       *
       * Otherwise (by default) a GET request will be issued with the user passed as
       * a base64 URL-encoded path parameter.
       *
       * Do not use unless advised by LaunchDarkly.
       */
  var useReport: js.UndefOr[scala.Boolean] = js.undefined
}

