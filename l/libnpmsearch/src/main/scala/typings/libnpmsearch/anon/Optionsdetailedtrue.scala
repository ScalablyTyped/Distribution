package typings.libnpmsearch.anon

import org.scalablytyped.runtime.StringDictionary
import typings.libnpmsearch.libnpmsearchBooleans.`true`
import typings.libnpmsearch.libnpmsearchStrings.maintenance
import typings.libnpmsearch.libnpmsearchStrings.optimal
import typings.libnpmsearch.libnpmsearchStrings.popularity
import typings.libnpmsearch.libnpmsearchStrings.quality
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.streamMod.Stream
import typings.npmPackageArg.mod.Result
import typings.npmRegistryFetch.anon.PartialAuthOptions
import typings.npmRegistryFetch.anon.PartialFetchRetryOptions
import typings.npmlog.mod.Logger
import typings.ssri.mod.Integrity
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined libnpmsearch.libnpmsearch.Options & {  detailed :true} */
@js.native
trait Optionsdetailedtrue
  extends /* key */ StringDictionary[js.Any] {
  /**
    * @deprecated
    * This is a legacy authentication token supported only for
    * compatibility. Please use `opts.token` instead.
    */
  var _auth: js.UndefOr[String] = js.native
  /**
    * Alias for `token`.
    */
  var _authToken: js.UndefOr[String] = js.native
  /**
    * Alias for `password`
    */
  var _password: js.UndefOr[String] = js.native
  /**
    * An `Agent` instance to be shared across requests. This allows
    * multiple concurrent fetch requests to happen on the same socket.
    *
    * You do not need to provide this option unless you want something
    * particularly specialized, since proxy configurations and http/https
    * agents are already automatically managed internally when this option
    * is not passed through.
    */
  var agent: js.UndefOr[Agent] = js.native
  var `always-auth`: js.UndefOr[Boolean] = js.native
  var alwaysAuth: js.UndefOr[Boolean] = js.native
  /**
    * Request body to send through the outgoing request. Buffers and
    * Streams will be passed through as-is, with a default `content-type`
    * of `application/octet-stream`. Plain JavaScript objects will be
    * `JSON.stringify`ed and the `content-type` will default to
    * `application/json`.
    *
    * Use `opts.headers` to set the content-type to something else.
    */
  var body: js.UndefOr[Buffer | Stream | js.Object | String] = js.native
  /**
    * The Certificate Authority signing certificate that is trusted for SSL
    * connections to the registry. Values should be in PEM format (Windows
    * calls it "Base-64 encoded X.509 (.CER)") with newlines replaced by
    * the string `'\n'`. For example:
    *
    * ```typescript
    * {
    * ca: '-----BEGIN CERTIFICATE-----\nXXXX\nXXXX\n-----END CERTIFICATE-----'
    * }
    * ```
    *
    * Set to `null` to only allow "known" registrars, or to a specific CA
    * cert to trust only that specific signing authority.
    *
    * Multiple CAs can be trusted by specifying an array of certificates
    * instead of a single string.
    *
    * See also `opts.strictSSL`, `opts.ca` and `opts.key`
    */
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer]) | Null] = js.native
  /**
    * The location of the http cache directory. If provided, certain
    * cachable requests will be cached according to
    * [IETF RFC 7234](https://tools.ietf.org/html/rfc7234) rules. This will
    * speed up future requests, as well as make the cached data available
    * offline if necessary/requested.
    *
    * See also `offline`, `preferOffline`, and `preferOnline`.
    */
  var cache: js.UndefOr[String] = js.native
  /**
    * A client certificate to pass when accessing the registry. Values
    * should be in PEM format (Windows calls it "Base-64 encoded X.509
    * (.CER)") with newlines replaced by the string `'\n'`. For example:
    *
    * ```typescript
    * {
    * cert: '-----BEGIN CERTIFICATE-----\nXXXX\nXXXX\n-----END CERTIFICATE-----'
    * }
    * ```
    *
    * It is *not* the path to a certificate file (and there is no "certfile"
    * option).
    *
    * See also: `opts.ca` and `opts.key`
    */
  var cert: js.UndefOr[String] = js.native
  /**
    * If true, returns an object with `package`, `score`, and `searchScore`
    * fields, with `package` being what would usually be returned, and the
    * other two containing details about how that package scored. Useful
    * for UIs. Default: `false`
    */
  var detailed: js.UndefOr[Boolean] with `true` = js.native
  var email: js.UndefOr[String] = js.native
  /**
    * The "retries" config for `retry` to use when fetching packages from
    * the registry.
    *
    * See also `opts.retry` to provide all retry options as a single object.
    */
  var fetchRetries: js.UndefOr[Double] = js.native
  /**
    * The "factor" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var fetchRetryFactor: js.UndefOr[Double] = js.native
  /**
    * The "maxTimeout" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var fetchRetryMaxtimeout: js.UndefOr[Double] = js.native
  /**
    * The "minTimeout" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var fetchRetryMintimeout: js.UndefOr[Double] = js.native
  /**
    * If present, other auth-related values in `opts` will be completely
    * ignored, including `alwaysAuth`, `email`, and `otp`, when calculating
    * auth for a request, and the auth details in `opts.forceAuth` will be
    * used instead.
    */
  var forceAuth: js.UndefOr[PartialAuthOptions] = js.native
  /**
    * Offset number for results. Used with `opts.limit` for pagination.
    * Default: `0`
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * If true, `npm-registry-fetch` will set the `Content-Encoding` header
    * to `gzip` and use `zlib.gzip()` or `zlib.createGzip()` to gzip-encode
    * `opts.body`.
    */
  var gzip: js.UndefOr[Boolean] = js.native
  /**
    * Additional headers for the outgoing request. This option can also be
    * used to override headers automatically generated by
    * `npm-registry-fetch`, such as `Content-Type`.
    */
  var headers: js.UndefOr[Record[String, String]] = js.native
  /**
    * If true, the response body will be thrown away and `res.body` set to
    * `null`. This will prevent dangling response sockets for requests
    * where you don't usually care what the response body is.
    */
  var ignoreBody: js.UndefOr[Boolean] = js.native
  /**
    * If provided, the response body's will be verified against this
    * integrity string, using [`ssri`](https://npm.im/ssri). If
    * verification succeeds, the response will complete as normal. If
    * verification fails, the response body will error with an `EINTEGRITY`
    * error.
    *
    * Body integrity is only verified if the body is actually consumed to
    * completion -- that is, if you use `res.json()`/`res.buffer()`, or if
    * you consume the default `res` stream data to its end.
    *
    * Cached data will have its integrity automatically verified using the
    * previously-generated integrity hash for the saved request
    * information, so `EINTEGRITY` errors can happen if `opts.cache` is
    * used, even if `opts.integrity` is not passed in.
    */
  var integrity: js.UndefOr[String | Integrity] = js.native
  /**
    * This is used to populate the `npm-in-ci` request header sent to the
    * registry.
    */
  var isFromCI: js.UndefOr[Boolean] = js.native
  /**
    * A client key to pass when accessing the registry. Values should be in
    * PEM format with newlines replaced by the string `'\n'`. For example:
    *
    * ```typescript
    * {
    * key: '-----BEGIN PRIVATE KEY-----\nXXXX\nXXXX\n-----END PRIVATE KEY-----'
    * }
    * ```
    *
    * It is *not* the path to a key file (and there is no "keyfile"
    * option).
    *
    * See also: `opts.ca` and `opts.cert`
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Number of results to limit the query to. Default: `20`
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The IP address of the local interface to use when making connections
    * to the registry.
    *
    * See also `opts.proxy`
    */
  var localAddress: js.UndefOr[String] = js.native
  /**
    * Logger object to use for logging operation details.
    */
  var log: js.UndefOr[Logger] = js.native
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `maintenance` metrics when scoring and sorting packages.
    * Default: `0.65` (same as `opts.sortBy: 'optimal'`)
    */
  var maintenance: js.UndefOr[Double] = js.native
  /**
    * When using `fetch.json.stream()` (NOT `fetch.json()`), this will be
    * passed down to `JSONStream` as the second argument to
    * `JSONStream.parse`, and can be used to transform stream data before
    * output.
    */
  var mapJSON: js.UndefOr[js.Function1[/* v */ js.Any, _]] = js.native
  /**
    * Maximum number of sockets to keep open during requests. Has no effect
    * if `opts.agent` is used.
    */
  var maxSockets: js.UndefOr[Double] = js.native
  /**
    * HTTP method to use for the outgoing request. Case-insensitive.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * If true, proxying will be disabled even if `opts.proxy` is used.
    */
  var noproxy: js.UndefOr[Boolean] = js.native
  /**
    * If provided, will be sent in the `npm-session` header. This header is
    * used by the npm registry to identify individual user sessions
    * (usually individual invocations of the CLI).
    */
  var npmSession: js.UndefOr[String] = js.native
  /**
    * Force offline mode: no network requests will be done during install.
    * To allow `npm-registry-fetch` to fill in missing cache data, see
    * `opts.preferOffline`.
    *
    * This option is only really useful if you're also using `opts.cache`.
    */
  var offline: js.UndefOr[Boolean] = js.native
  /**
    * This is a one-time password from a two-factor authenticator. It is
    * required for certain registry interactions when two-factor auth is
    * enabled for a user account.
    */
  var otp: js.UndefOr[Double | String] = js.native
  /**
    * Password used for basic authentication. For the more modern
    * authentication method, please use the (more secure) `opts.token`
    *
    * Can optionally be scoped to a registry by using a "nerf dart" for
    * that registry. That is:
    *
    * ```typescript
    * {
    * '//registry.npmjs.org/:password': 't0k3nH34r'
    * }
    * ```
    *
    * See also `opts.username`
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `popularity` metrics when scoring and sorting packages.
    * Default: `0.98` (same as `opts.sortBy: 'optimal'`)
    */
  var popularity: js.UndefOr[Double] = js.native
  /**
    * If true, staleness checks for cached data will be bypassed, but
    * missing data will be requested from the server. To force full offline
    * mode, use `opts.offline`.
    *
    * This option is generally only useful if you're also using `opts.cache`.
    */
  var preferOffline: js.UndefOr[Boolean] = js.native
  /**
    * If true, staleness checks for cached data will be forced, making the
    * CLI look for updates immediately even for fresh package data.
    *
    * This option is generally only useful if you're also using `opts.cache`.
    */
  var preferOnline: js.UndefOr[Boolean] = js.native
  /**
    * If provided, will be sent in the npm-scope header. This header is
    * used by the npm registry to identify the toplevel package scope that
    * a particular project installation is using.
    */
  var projectScope: js.UndefOr[String] = js.native
  /**
    * A proxy to use for outgoing http requests. If not passed in, the
    * `HTTP(S)_PROXY` environment variable will be used.
    */
  var proxy: js.UndefOr[String] = js.native
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `quality` metrics when scoring and sorting packages.
    * Default: `0.5` (same as `opts.sortBy: 'optimal'`)
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * If provided, the request URI will have a query string appended to it
    * using this query. If `opts.query` is an object, it will be converted
    * to a query string using [`querystring.stringify()`](https://nodejs.org/api/querystring.html#querystring_querystring_stringify_obj_sep_eq_options).
    *
    * If the request URI already has a query string, it will be merged with
    * `opts.query`, preferring `opts.query` values.
    */
  var query: js.UndefOr[String | js.Object] = js.native
  /**
    * Registry configuration for a request. If a request URL only includes
    * the URL path, this registry setting will be prepended. This
    * configuration is also used to determine authentication details, so
    * even if the request URL references a completely different host,
    * `opts.registry` will be used to find the auth details for that
    * request.
    *
    * See also `opts.scope`, `opts.spec`, and `opts.<scope>:registry` which
    * can all affect the actual registry URL used by the outgoing request.
    */
  var registry: js.UndefOr[String] = js.native
  /**
    * Single-object configuration for request retry settings. If passed in,
    * will override individually-passed `fetchRetry*` settings.
    */
  var retry: js.UndefOr[PartialFetchRetryOptions] = js.native
  /**
    * Associate an operation with a scope for a scoped registry. This
    * option can force lookup of scope-specific registries and
    * authentication.
    *
    * See also `opts.<scope>:registry` and `opts.spec` for interactions
    * with this option.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * Used as a shorthand to set `opts.quality`, `opts.maintenance`, and
    * `opts.popularity` with values that prioritize each one.
    */
  var sortBy: js.UndefOr[optimal | quality | maintenance | popularity] = js.native
  /**
    * If provided, can be used to automatically configure `opts.scope`
    * based on a specific package name. Non-registry package specs will
    * throw an error.
    */
  var spec: js.UndefOr[String | Result] = js.native
  /**
    * Whether or not to do SSL key validation when making requests to the
    * registry via https.
    *
    * See also `opts.ca`.
    */
  var strictSSL: js.UndefOr[Boolean] = js.native
  /**
    * Time before a hanging request times out.
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Authentication token string.
    *
    * Can be scoped to a registry by using a "nerf dart" for that registry.
    * That is:
    *
    * ```typescript
    * {
    * '//registry.npmjs.org/:token': 't0k3nH34r'
    * }
    * ```
    */
  var token: js.UndefOr[String] = js.native
  /**
    * User agent string to send in the `User-Agent` header.
    */
  var userAgent: js.UndefOr[String] = js.native
  /**
    * Username used for basic authentication. For the more modern
    * authentication method, please use the (more secure) `opts.token`
    *
    * Can optionally be scoped to a registry by using a "nerf dart" for
    * that registry. That is:
    *
    * ```typescript
    * {
    * '//registry.npmjs.org/:username': 't0k3nH34r'
    * }
    * ```
    *
    * See also `opts.password`
    */
  var username: js.UndefOr[String] = js.native
}

object Optionsdetailedtrue {
  @scala.inline
  def apply(detailed: js.UndefOr[Boolean] with `true`): Optionsdetailedtrue = {
    val __obj = js.Dynamic.literal(detailed = detailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsdetailedtrue]
  }
  @scala.inline
  implicit class OptionsdetailedtrueOps[Self <: Optionsdetailedtrue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetailed(value: js.UndefOr[Boolean] with `true`): Self = this.set("detailed", value.asInstanceOf[js.Any])
    @scala.inline
    def set_auth(value: String): Self = this.set("_auth", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_auth: Self = this.set("_auth", js.undefined)
    @scala.inline
    def set_authToken(value: String): Self = this.set("_authToken", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_authToken: Self = this.set("_authToken", js.undefined)
    @scala.inline
    def set_password(value: String): Self = this.set("_password", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_password: Self = this.set("_password", js.undefined)
    @scala.inline
    def setAgent(value: Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def `setAlways-auth`(value: Boolean): Self = this.set("always-auth", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAlways-auth`: Self = this.set("always-auth", js.undefined)
    @scala.inline
    def setAlwaysAuth(value: Boolean): Self = this.set("alwaysAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysAuth: Self = this.set("alwaysAuth", js.undefined)
    @scala.inline
    def setBody(value: Buffer | Stream | js.Object | String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCaVarargs(value: (String | Buffer)*): Self = this.set("ca", js.Array(value :_*))
    @scala.inline
    def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("ca", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    @scala.inline
    def setCaNull: Self = this.set("ca", null)
    @scala.inline
    def setCache(value: String): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setFetchRetries(value: Double): Self = this.set("fetchRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchRetries: Self = this.set("fetchRetries", js.undefined)
    @scala.inline
    def setFetchRetryFactor(value: Double): Self = this.set("fetchRetryFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchRetryFactor: Self = this.set("fetchRetryFactor", js.undefined)
    @scala.inline
    def setFetchRetryMaxtimeout(value: Double): Self = this.set("fetchRetryMaxtimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchRetryMaxtimeout: Self = this.set("fetchRetryMaxtimeout", js.undefined)
    @scala.inline
    def setFetchRetryMintimeout(value: Double): Self = this.set("fetchRetryMintimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchRetryMintimeout: Self = this.set("fetchRetryMintimeout", js.undefined)
    @scala.inline
    def setForceAuth(value: PartialAuthOptions): Self = this.set("forceAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceAuth: Self = this.set("forceAuth", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setGzip(value: Boolean): Self = this.set("gzip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIgnoreBody(value: Boolean): Self = this.set("ignoreBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreBody: Self = this.set("ignoreBody", js.undefined)
    @scala.inline
    def setIntegrity(value: String | Integrity): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    @scala.inline
    def setIsFromCI(value: Boolean): Self = this.set("isFromCI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFromCI: Self = this.set("isFromCI", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    @scala.inline
    def setLog(value: Logger): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setMaintenance(value: Double): Self = this.set("maintenance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenance: Self = this.set("maintenance", js.undefined)
    @scala.inline
    def setMapJSON(value: /* v */ js.Any => _): Self = this.set("mapJSON", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMapJSON: Self = this.set("mapJSON", js.undefined)
    @scala.inline
    def setMaxSockets(value: Double): Self = this.set("maxSockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSockets: Self = this.set("maxSockets", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setNoproxy(value: Boolean): Self = this.set("noproxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoproxy: Self = this.set("noproxy", js.undefined)
    @scala.inline
    def setNpmSession(value: String): Self = this.set("npmSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNpmSession: Self = this.set("npmSession", js.undefined)
    @scala.inline
    def setOffline(value: Boolean): Self = this.set("offline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffline: Self = this.set("offline", js.undefined)
    @scala.inline
    def setOtp(value: Double | String): Self = this.set("otp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtp: Self = this.set("otp", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPopularity(value: Double): Self = this.set("popularity", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopularity: Self = this.set("popularity", js.undefined)
    @scala.inline
    def setPreferOffline(value: Boolean): Self = this.set("preferOffline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferOffline: Self = this.set("preferOffline", js.undefined)
    @scala.inline
    def setPreferOnline(value: Boolean): Self = this.set("preferOnline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferOnline: Self = this.set("preferOnline", js.undefined)
    @scala.inline
    def setProjectScope(value: String): Self = this.set("projectScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectScope: Self = this.set("projectScope", js.undefined)
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setQuery(value: String | js.Object): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setRegistry(value: String): Self = this.set("registry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistry: Self = this.set("registry", js.undefined)
    @scala.inline
    def setRetry(value: PartialFetchRetryOptions): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSortBy(value: optimal | quality | maintenance | popularity): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    @scala.inline
    def setSpec(value: String | Result): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
    @scala.inline
    def setStrictSSL(value: Boolean): Self = this.set("strictSSL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictSSL: Self = this.set("strictSSL", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

