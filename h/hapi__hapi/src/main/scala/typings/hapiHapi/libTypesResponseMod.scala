package typings.hapiHapi

import typings.hapiHapi.anon.Etag
import typings.hapiHapi.anon.Vary
import typings.hapiHapi.hapiHapiBooleans.`true`
import typings.hapiHapi.hapiHapiStrings.ascii
import typings.hapiHapi.hapiHapiStrings.base64
import typings.hapiHapi.hapiHapiStrings.binary
import typings.hapiHapi.hapiHapiStrings.buffer
import typings.hapiHapi.hapiHapiStrings.finish
import typings.hapiHapi.hapiHapiStrings.hex
import typings.hapiHapi.hapiHapiStrings.latin1
import typings.hapiHapi.hapiHapiStrings.peek
import typings.hapiHapi.hapiHapiStrings.plain
import typings.hapiHapi.hapiHapiStrings.stream
import typings.hapiHapi.hapiHapiStrings.ucs2
import typings.hapiHapi.hapiHapiStrings.utf16le
import typings.hapiHapi.hapiHapiStrings.utf8
import typings.hapiHapi.libTypesPluginMod.PluginsStates
import typings.hapiHapi.libTypesPluginMod.ServerRealm
import typings.hapiHapi.libTypesRequestMod.AuthCredentials
import typings.hapiHapi.libTypesRequestMod.MergeType
import typings.hapiHapi.libTypesRequestMod.ReqRef
import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRequestMod.Request
import typings.hapiHapi.libTypesServerStateMod.ServerStateCookieOptions
import typings.hapiHapi.libTypesUtilsMod.Json.StringifyArguments
import typings.hapiHapi.libTypesUtilsMod.Json.StringifyReplacer
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.ReturnValue
import typings.hapiHapi.libTypesUtilsMod.PeekListener
import typings.hapiPodium.mod.Podium
import typings.std.Parameters
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesResponseMod {
  
  trait Auth[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra] extends StObject {
    
    val data: js.UndefOr[AuthenticationData[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra]] = js.undefined
    
    val error: js.UndefOr[js.Error | Null] = js.undefined
    
    val isAuth: `true`
  }
  object Auth {
    
    inline def apply[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra](): Auth[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra] = {
      val __obj = js.Dynamic.literal(isAuth = true)
      __obj.asInstanceOf[Auth[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Auth[?, ?, ?, ?], AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra] (val x: Self & (Auth[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra])) extends AnyVal {
      
      inline def setData(value: AuthenticationData[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIsAuth(value: `true`): Self = StObject.set(x, "isAuth", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthenticationData[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra] extends StObject {
    
    var artifacts: js.UndefOr[ArtifactsExtra] = js.undefined
    
    var credentials: MergeType[CredentialsExtra, AuthCredentials[AuthUser, AuthApp]]
  }
  object AuthenticationData {
    
    inline def apply[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra](credentials: MergeType[CredentialsExtra, AuthCredentials[AuthUser, AuthApp]]): AuthenticationData[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra] = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticationData[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthenticationData[?, ?, ?, ?], AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra] (val x: Self & (AuthenticationData[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra])) extends AnyVal {
      
      inline def setArtifacts(value: ArtifactsExtra): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
      
      inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
      
      inline def setCredentials(value: MergeType[CredentialsExtra, AuthCredentials[AuthUser, AuthApp]]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseApplicationState extends StObject
  
  @js.native
  trait ResponseEvents extends Podium[Unit] {
    
    @JSName("on")
    def on_finish(criteria: finish, listener: js.Function1[/* data */ Unit, Unit]): this.type = js.native
    /**
      * 'peek' - emitted for each chunk of data written back to the client connection. The event method signature is function(chunk, encoding).
      * 'finish' - emitted when the response finished writing but before the client response connection is ended. The event method signature is function ().
      */
    @JSName("on")
    def on_peek(criteria: peek, listener: PeekListener): this.type = js.native
    
    @JSName("once")
    def once_finish(criteria: finish, listener: js.Function1[/* data */ Unit, Unit]): this.type = js.native
    @JSName("once")
    def once_peek(criteria: peek): js.Promise[Parameters[PeekListener]] = js.native
    /**
      * 'peek' - emitted for each chunk of data written back to the client connection. The event method signature is function(chunk, encoding).
      * 'finish' - emitted when the response finished writing but before the client response connection is ended. The event method signature is function ().
      */
    @JSName("once")
    def once_peek(criteria: peek, listener: PeekListener): this.type = js.native
  }
  
  @js.native
  trait ResponseObject extends Podium[Unit] {
    
    /**
      * @default {}.
      * Application-specific state. Provides a safe place to store application data without potential conflicts with the framework. Should not be used by plugins which should use plugins[name].
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responseapp)
      */
    var app: ResponseApplicationState = js.native
    
    /**
      * Sets the HTTP 'Content-Length' header (to avoid chunked transfer encoding) where:
      * @param length - the header value. Must match the actual payload size.
      * @return Return value: the current response object.
      * [See docs](https://hapijs.com/api/17.0.1#-responsebyteslength)
      */
    def bytes(length: Double): ResponseObject = js.native
    
    /**
      * Controls the 'Content-Type' HTTP header 'charset' property of the response.
      *  * When invoked without any parameter, will prevent hapi from applying its default charset normalization to 'utf-8'
      *  * When 'charset' parameter is provided, will set the 'Content-Type' HTTP header 'charset' property where:
      * @param charset - the charset property value.
      * @return Return value: the current response object.
      * [See docs](https://hapijs.com/api/17.0.1#-responsecharsetcharset)
      */
    def charset(): js.UndefOr[ResponseObject] = js.native
    def charset(charset: String): js.UndefOr[ResponseObject] = js.native
    
    /**
      * Sets the HTTP status code where:
      * @param statusCode - the HTTP status code (e.g. 200).
      * @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsecodestatuscode)
      */
    def code(statusCode: Double): ResponseObject = js.native
    
    /**
      * Sets the HTTP status code to Created (201) and the HTTP 'Location' header where:
      * @param uri - an absolute or relative URI used as the 'Location' header value.
      * @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsecreateduri)
      */
    def created(uri: String): ResponseObject = js.native
    
    /**
      * Sets the string encoding scheme used to serial data into the HTTP payload where:
      * @param encoding  the encoding property value (see node Buffer encoding [See docs](https://nodejs.org/api/buffer.html#buffer_buffers_and_character_encodings)).
      *  * 'ascii' - for 7-bit ASCII data only. This encoding is fast and will strip the high bit if set.
      *  * 'utf8' - Multibyte encoded Unicode characters. Many web pages and other document formats use UTF-8.
      *  * 'utf16le' - 2 or 4 bytes, little-endian encoded Unicode characters. Surrogate pairs (U+10000 to U+10FFFF) are supported.
      *  * 'ucs2' - Alias of 'utf16le'.
      *  * 'base64' - Base64 encoding. When creating a Buffer from a string, this encoding will also correctly accept "URL and Filename Safe Alphabet" as specified in RFC4648, Section 5.
      *  * 'latin1' - A way of encoding the Buffer into a one-byte encoded string (as defined by the IANA in RFC1345, page 63, to be the Latin-1 supplement block and C0/C1 control codes).
      *  * 'binary' - Alias for 'latin1'.
      *  * 'hex' - Encode each byte as two hexadecimal characters.
      * @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responseencodingencoding)
      */
    def encoding(encoding: ascii | utf8 | utf16le | ucs2 | base64 | latin1 | binary | hex): ResponseObject = js.native
    
    /**
      * Sets the representation entity tag where:
      * @param tag - the entity tag string without the double-quote.
      * @param options - (optional) settings where:
      *  * weak - if true, the tag will be prefixed with the 'W/' weak signifier. Weak tags will fail to match identical tags for the purpose of determining 304 response status. Defaults to false.
      *  * vary - if true and content encoding is set or applied to the response (e.g 'gzip' or 'deflate'), the encoding name will be automatically added to the tag at transmission time (separated by
      *     a '-' character). Ignored when weak is true. Defaults to true.
      * @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responseetagtag-options)
      */
    def etag(tag: String): ResponseObject = js.native
    def etag(tag: String, options: Vary): ResponseObject = js.native
    
    /**
      * Access: read only and the public podium interface.
      * The response.events object supports the following events:
      * * 'peek' - emitted for each chunk of data written back to the client connection. The event method signature is function(chunk, encoding).
      * * 'finish' - emitted when the response finished writing but before the client response connection is ended. The event method signature is function ().
      * [See docs](https://hapijs.com/api/17.0.1#-responseevents)
      */
    val events: ResponseEvents = js.native
    
    /**
      * Sets an HTTP header where:
      * @param name - the header name.
      * @param value - the header value.
      * @param options - (optional) object where:
      *  * append - if true, the value is appended to any existing header value using separator. Defaults to false.
      *  * separator - string used as separator when appending to an existing value. Defaults to ','.
      *  * override - if false, the header value is not set if an existing value present. Defaults to true.
      *  * duplicate - if false, the header value is not modified if the provided value is already included. Does not apply when append is false or if the name is 'set-cookie'. Defaults to true.
      *  @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responseheadername-value-options)
      */
    def header(name: String, value: String): ResponseObject = js.native
    def header(name: String, value: String, options: ResponseObjectHeaderOptions): ResponseObject = js.native
    
    /**
      * @default {}.
      * An object containing the response headers where each key is a header field name and the value is the string header value or array of string.
      * Note that this is an incomplete list of headers to be included with the response. Additional headers will be added once the response is prepared for transmission.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responseheaders)
      */
    val headers: Record[String, String | js.Array[String]] = js.native
    
    /**
      * Sets the HTTP 'Location' header where:
      * @param uri - an absolute or relative URI used as the 'Location' header value.
      * @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responselocationuri)
      */
    def location(uri: String): ResponseObject = js.native
    
    /**
      * Sets the HTTP status message where:
      * @param httpMessage - the HTTP status message (e.g. 'Ok' for status code 200).
      * @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsemessagehttpmessage)
      */
    def message(httpMessage: String): ResponseObject = js.native
    
    /**
      * Sets the status code to 301 or 308 (based on the response.rewritable() setting) where:
      * @param isPermanent - if false, sets status to temporary. Defaults to true.
      * @return Return value: the current response object.
      * Only available after calling the response.redirect() method.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsepermanentispermanent)
      */
    def permanent(): ResponseObject = js.native
    def permanent(isPermanent: Boolean): ResponseObject = js.native
    
    /**
      * @default {}.
      * Plugin-specific state. Provides a place to store and pass request-level plugin data. plugins is an object where each key is a plugin name and the value is the state.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responseplugins)
      */
    var plugins: PluginsStates = js.native
    
    /**
      * Sets an HTTP redirection response (302) and decorates the response with additional methods, where:
      * @param uri - an absolute or relative URI used to redirect the client to another resource.
      * @return Return value: the current response object.
      * Decorates the response object with the response.temporary(), response.permanent(), and response.rewritable() methods to easily change the default redirection code (302).
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responseredirecturi)
      */
    def redirect(uri: String): ResponseObject = js.native
    
    /**
      * Sets the JSON.stringify() replacer argument where:
      * @param method - the replacer function or array. Defaults to none.
      * @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsereplacermethod)
      */
    def replacer(method: StringifyReplacer): ResponseObject = js.native
    
    /**
      * Sets the status code to 301/302 for rewritable (allows changing the request method from 'POST' to 'GET') or 307/308 for non-rewritable (does not allow changing the request method from 'POST'
      * to 'GET'). Exact code based on the response.temporary() or response.permanent() setting. Arguments:
      * @param isRewritable - if false, sets to non-rewritable. Defaults to true.
      * @return Return value: the current response object.
      * Only available after calling the response.redirect() method.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responserewritableisrewritable)
      */
    def rewritable(): ResponseObject = js.native
    def rewritable(isRewritable: Boolean): ResponseObject = js.native
    
    /**
      * Object containing the response handling flags.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsesettings)
      */
    val settings: ResponseSettings = js.native
    
    /**
      * The raw value returned by the lifecycle method.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsesource)
      */
    val source: ReturnValue[ReqRefDefaults] = js.native
    
    /**
      * Sets the JSON.stringify() space argument where:
      * @param count - the number of spaces to indent nested object keys. Defaults to no indentation.
      * @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsespacescount)
      */
    def spaces(count: Double): ResponseObject = js.native
    
    def state(name: String, value: String): ResponseObject = js.native
    def state(name: String, value: String, options: ServerStateCookieOptions): ResponseObject = js.native
    /**
      * Sets an HTTP cookie where:
      * @param name - the cookie name.
      * @param value - the cookie value. If no options.encoding is defined, must be a string. See server.state() for supported encoding values.
      * @param options - (optional) configuration. If the state was previously registered with the server using server.state(), the specified keys in options are merged with the default server
      *     definition.
      * @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsestatename-value-options)
      */
    def state(name: String, value: js.Object): ResponseObject = js.native
    def state(name: String, value: js.Object, options: ServerStateCookieOptions): ResponseObject = js.native
    
    /**
      * @default 200.
      * The HTTP response status code.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsestatuscode)
      */
    val statusCode: Double = js.native
    
    /**
      * Sets a string suffix when the response is process via JSON.stringify() where:
      * @param suffix - the string suffix.
      * @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsesuffixsuffix)
      */
    def suffix(suffix: String): ResponseObject = js.native
    
    /**
      * Marks the response object as a takeover response.
      * @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsetakeover)
      */
    def takeover(): ResponseObject = js.native
    
    /**
      * Sets the status code to 302 or 307 (based on the response.rewritable() setting) where:
      * @param isTemporary - if false, sets status to permanent. Defaults to true.
      * @return Return value: the current response object.
      * Only available after calling the response.redirect() method.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsetemporaryistemporary)
      */
    def temporary(): ResponseObject = js.native
    def temporary(isTemporary: Boolean): ResponseObject = js.native
    
    /**
      * Overrides the default route cache expiration rule for this response instance where:
      * @param msec - the time-to-live value in milliseconds.
      * @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsettlmsec)
      */
    def ttl(msec: Double): ResponseObject = js.native
    
    /**
      * Sets the HTTP 'Content-Type' header where:
      * @param mimeType - is the mime type.
      * @return Return value: the current response object.
      * Should only be used to override the built-in default for each response type.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsetypemimetype)
      */
    def `type`(mimeType: String): ResponseObject = js.native
    
    /**
      * Clears the HTTP cookie by setting an expired value where:
      * @param name - the cookie name.
      * @param options - (optional) configuration for expiring cookie. If the state was previously registered with the server using server.state(), the specified options are merged with the server
      *     definition.
      * @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responseunstatename-options)
      */
    def unstate(name: String): ResponseObject = js.native
    def unstate(name: String, options: ServerStateCookieOptions): ResponseObject = js.native
    
    /**
      * A string indicating the type of source with available values:
      * * 'plain' - a plain response such as string, number, null, or simple object.
      * * 'buffer' - a Buffer.
      * * 'stream' - a Stream.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsevariety)
      */
    val variety: plain | buffer | stream = js.native
    
    /**
      * Adds the provided header to the list of inputs affected the response generation via the HTTP 'Vary' header where:
      * @param header - the HTTP request header name.
      * @return Return value: the current response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-responsevaryheader)
      */
    def vary(header: String): ResponseObject = js.native
  }
  
  trait ResponseObjectHeaderOptions extends StObject {
    
    var append: js.UndefOr[Boolean] = js.undefined
    
    var duplicate: js.UndefOr[Boolean] = js.undefined
    
    var `override`: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object ResponseObjectHeaderOptions {
    
    inline def apply(): ResponseObjectHeaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseObjectHeaderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseObjectHeaderOptions] (val x: Self) extends AnyVal {
      
      inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setDuplicate(value: Boolean): Self = StObject.set(x, "duplicate", value.asInstanceOf[js.Any])
      
      inline def setDuplicateUndefined: Self = StObject.set(x, "duplicate", js.undefined)
      
      inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  trait ResponseSettings extends StObject {
    
    /**
      * Defaults value: true.
      * If true and source is a Stream, copies the statusCode and headers properties of the stream object to the outbound response.
      */
    val passThrough: Boolean
    
    /**
      * @default null (use route defaults).
      * Override the route json options used when source value requires stringification.
      */
    val stringify: StringifyArguments
    
    /**
      * @default null (use route defaults).
      * If set, overrides the route cache with an expiration value in milliseconds.
      */
    val ttl: Double
    
    /**
      * @default false.
      * If true, a suffix will be automatically added to the 'ETag' header at transmission time (separated by a '-' character) when the HTTP 'Vary' header is present.
      */
    var varyEtag: Boolean
  }
  object ResponseSettings {
    
    inline def apply(passThrough: Boolean, stringify: StringifyArguments, ttl: Double, varyEtag: Boolean): ResponseSettings = {
      val __obj = js.Dynamic.literal(passThrough = passThrough.asInstanceOf[js.Any], stringify = stringify.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], varyEtag = varyEtag.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseSettings] (val x: Self) extends AnyVal {
      
      inline def setPassThrough(value: Boolean): Self = StObject.set(x, "passThrough", value.asInstanceOf[js.Any])
      
      inline def setStringify(value: StringifyArguments): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setVaryEtag(value: Boolean): Self = StObject.set(x, "varyEtag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResponseToolkit[Refs /* <: ReqRef */] extends StObject {
    
    /**
      * A response symbol. When returned by a lifecycle method, the request lifecycle skips to the finalizing step
      * without further interaction with the node response stream. It is the developer's responsibility to write
      * and end the response directly via [request.raw.res](https://github.com/hapijs/hapi/blob/master/API.md#request.raw).
      */
    val abandon: js.Symbol = js.native
    
    /**
      * Used by the [authentication] method to pass back valid credentials where:
      * @param data - an object with:
      * * credentials - (required) object representing the authenticated entity.
      * * artifacts - (optional) authentication artifacts object specific to the authentication scheme.
      * @return Return value: an internal authentication object.
      */
    def authenticated[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra](data: AuthenticationData[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra]): Auth[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra] = js.native
    
    /**
      * A response symbol. When returned by a lifecycle method, the request lifecycle skips to the finalizing step after
      * calling request.raw.res.end()) to close the the node response stream.
      */
    val close: js.Symbol = js.native
    
    /**
      * A response symbol. Provides access to the route or server context set via the route [bind](https://github.com/hapijs/hapi/blob/master/API.md#route.options.bind)
      * option or [server.bind()](https://github.com/hapijs/hapi/blob/master/API.md#server.bind()).
      */
    val context: Any = js.native
    
    /**
      * A response symbol. When returned by a lifecycle method, the request lifecycle continues without changing the response.
      */
    val continue: js.Symbol = js.native
    
    /**
      * Sets the response 'ETag' and 'Last-Modified' headers and checks for any conditional request headers to decide if
      * the response is going to qualify for an HTTP 304 (Not Modified). If the entity values match the request
      * conditions, h.entity() returns a response object for the lifecycle method to return as its value which will
      * set a 304 response. Otherwise, it sets the provided entity headers and returns undefined.
      * The method arguments are:
      * @param options - a required configuration object with:
      * * etag - the ETag string. Required if modified is not present. Defaults to no header.
      * * modified - the Last-Modified header value. Required if etag is not present. Defaults to no header.
      * * vary - same as the response.etag() option. Defaults to true.
      * @return Return value: - a response object if the response is unmodified. - undefined if the response has changed.
      * If undefined is returned, the developer must return a valid lifecycle method value. If a response is returned,
      * it should be used as the return value (but may be customize using the response methods).
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-hentityoptions)
      */
    def entity(): ResponseObject = js.native
    def entity(options: Etag): ResponseObject = js.native
    
    /**
      * The [server realm](https://github.com/hapijs/hapi/blob/master/API.md#server.realm) associated with the matching
      * route. Defaults to the root server realm in the onRequest step.
      */
    val realm: ServerRealm = js.native
    
    /**
      * Redirects the client to the specified uri. Same as calling h.response().redirect(uri).
      * @param url
      * @return Returns a response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-hredirecturi)
      */
    def redirect(): ResponseObject = js.native
    def redirect(uri: String): ResponseObject = js.native
    
    /**
      * Access: read only and public request interface.
      * The [request] object. This is a duplication of the request lifecycle method argument used by
      * [toolkit decorations](https://github.com/hapijs/hapi/blob/master/API.md#server.decorate()) to access the current request.
      */
    val request: Request[Refs] = js.native
    
    /**
      * Wraps the provided value and returns a response object which allows customizing the response
      * (e.g. setting the HTTP status code, custom headers, etc.), where:
      * @param value - (optional) return value. Defaults to null.
      * @return Returns a response object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-hresponsevalue)
      */
    def response(): ResponseObject = js.native
    def response(value: ResponseValue): ResponseObject = js.native
    
    /**
      * Sets a response cookie using the same arguments as response.state().
      * @param name of the cookie
      * @param value of the cookie
      * @param (optional) ServerStateCookieOptions object.
      * @return Return value: none.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-hstatename-value-options)
      */
    def state(name: String, value: String): Unit = js.native
    def state(name: String, value: String, options: ServerStateCookieOptions): Unit = js.native
    def state(name: String, value: js.Object): Unit = js.native
    def state(name: String, value: js.Object, options: ServerStateCookieOptions): Unit = js.native
    
    /**
      * Used by the [authentication] method to indicate authentication failed and pass back the credentials received where:
      * @param error - (required) the authentication error.
      * @param data - (optional) an object with:
      * * credentials - (required) object representing the authenticated entity.
      * * artifacts - (optional) authentication artifacts object specific to the authentication scheme.
      * @return void.
      * The method is used to pass both the authentication error and the credentials. For example, if a request included
      * expired credentials, it allows the method to pass back the user information (combined with a 'try'
      * authentication mode) for error customization.
      * There is no difference between throwing the error or passing it with the h.unauthenticated() method is no credentials are passed, but it might still be helpful for code clarity.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-hunauthenticatederror-data)
      */
    def unauthenticated[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra](error: js.Error): Auth[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra] = js.native
    def unauthenticated[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra](error: js.Error, data: AuthenticationData[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra]): Auth[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra] = js.native
    
    /**
      * Clears a response cookie using the same arguments as
      * @param name of the cookie
      * @param options (optional) ServerStateCookieOptions object.
      * @return void.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-hunstatename-options)
      */
    def unstate(name: String): Unit = js.native
    def unstate(name: String, options: ServerStateCookieOptions): Unit = js.native
  }
  
  type ResponseValue = String | js.Object
}
