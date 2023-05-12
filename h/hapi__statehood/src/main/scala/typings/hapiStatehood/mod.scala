package typings.hapiStatehood

import typings.hapiBoom.mod.Boom
import typings.hapiIron.mod.SealOptions
import typings.hapiStatehood.anon.Failed
import typings.hapiStatehood.anon.Integrity
import typings.hapiStatehood.hapiStatehoodStrings.base64
import typings.hapiStatehood.hapiStatehoodStrings.base64json
import typings.hapiStatehood.hapiStatehoodStrings.form
import typings.hapiStatehood.hapiStatehoodStrings.iron
import typings.hapiStatehood.hapiStatehoodStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/statehood", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@hapi/statehood", "Definitions")
  @js.native
  open class Definitions[HapiRequest] protected () extends StObject {
    def this(options: StateOptions[HapiRequest]) = this()
    
    def add(name: String, options: StateOptions[HapiRequest]): Unit = js.native
    
    def format(cookies: js.Array[FormatCookie[HapiRequest]], context: HapiRequest): js.Promise[js.Array[String]] = js.native
    def format(cookies: FormatCookie[HapiRequest], context: HapiRequest): js.Promise[js.Array[String]] = js.native
    
    def parse(cookies: String): js.Promise[Failed[HapiRequest]] = js.native
    
    def passThrough(header: String, fallback: Boolean): String | Boom[Any] = js.native
  }
  
  inline def exclude(cookies: String, excludes: js.Array[String]): String | Boom[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(cookies.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[String | Boom[Any]]
  
  inline def prepareValue(name: String, value: Any, options: StateOptions[Any]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareValue")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait FormatCookie[HapiRequest] extends StObject {
    
    var name: String
    
    var options: StateOptions[HapiRequest]
    
    var value: Any
  }
  object FormatCookie {
    
    inline def apply[HapiRequest](name: String, options: StateOptions[HapiRequest], value: Any): FormatCookie[HapiRequest] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatCookie[HapiRequest]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatCookie[?], HapiRequest] (val x: Self & FormatCookie[HapiRequest]) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: StateOptions[HapiRequest]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiStatehood.hapiStatehoodBooleans.`false`
    - typings.hapiStatehood.hapiStatehoodStrings.None
    - typings.hapiStatehood.hapiStatehoodStrings.Lax
    - typings.hapiStatehood.hapiStatehoodStrings.Strict
  */
  trait SameSitePolicy extends StObject
  object SameSitePolicy {
    
    inline def Lax: typings.hapiStatehood.hapiStatehoodStrings.Lax = "Lax".asInstanceOf[typings.hapiStatehood.hapiStatehoodStrings.Lax]
    
    inline def None: typings.hapiStatehood.hapiStatehoodStrings.None = "None".asInstanceOf[typings.hapiStatehood.hapiStatehoodStrings.None]
    
    inline def Strict: typings.hapiStatehood.hapiStatehoodStrings.Strict = "Strict".asInstanceOf[typings.hapiStatehood.hapiStatehoodStrings.Strict]
    
    inline def `false`: typings.hapiStatehood.hapiStatehoodBooleans.`false` = false.asInstanceOf[typings.hapiStatehood.hapiStatehoodBooleans.`false`]
  }
  
  trait StateOptions[HapiRequest] extends StObject {
    
    /**
      * if present and the cookie was not received from the client or explicitly set by the route handler, the
      * cookie is automatically added to the response with the provided value. The value can be
      * a function with signature async function(request) where:
      */
    var autoValue: js.UndefOr[js.Function1[/* request */ HapiRequest, Any]] = js.undefined
    
    /**
      * If true, automatically instruct the client to remove invalid cookies.
      *
      * @default false
      */
    var clearInvalid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function using the signature `async function(definition, request)` used to override a request-specific cookie settings.
      */
    var contextualize: js.UndefOr[
        js.Function2[/* definition */ this.type, /* request */ HapiRequest, Unit | js.Promise[Unit]]
      ] = js.undefined
    
    /**
      * The domain scope.
      *
      * @default null (no domain)
      */
    var domain: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Encoding performs on the provided value before serialization. Options are:
      *
      *     - `none` - no encoding. When used, the cookie value must be a string.
      *     - `base64` - string value is encoded using Base64.
      *     - `base64json` - object value is JSON-stringified then encoded using Base64.
      *     - `form` - object value is encoded using the x-www-form-urlencoded method.
      *     - `iron` - Encrypts and sign the value using iron.
      *
      * @default 'none'
      */
    var encoding: js.UndefOr[none_ | base64 | base64json | form | iron] = js.undefined
    
    /**
      * If `true`, errors are ignored and treated as missing cookies.
      */
    var ignoreErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Options for 'iron' encoding.
      */
    var iron: js.UndefOr[SealOptions] = js.undefined
    
    /**
      * Sets the `HttpOnly` flag.
      *
      * @default true
      */
    var isHttpOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the `SameSite` flag. The value must be one of:
      *
      *     - `false`  - no flag.
      *     - `Strict` - sets the value to `Strict`.
      *     - `Lax`    - sets the value to `Lax`.
      *     - `None`   - sets the value to `None`.
      *
      *  @default 'Strict'
      */
    var isSameSite: js.UndefOr[SameSitePolicy] = js.undefined
    
    /**
      * Sets the `Secure` flag.
      *
      * @default true
      */
    var isSecure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used by proxy plugins (e.g. h2o2).
      */
    var passThrough: js.UndefOr[Any] = js.undefined
    
    /**
      * Password used for 'iron' encoding (must be at least 32 characters long).
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * The path scope.
      *
      * @default null (no path)
      */
    var path: js.UndefOr[String | Null] = js.undefined
    
    /**
      * An object used to calculate an HMAC for cookie integrity validation. This does not provide privacy, only a mean
      * to verify that the cookie value was generated by the server. Redundant when 'iron' encoding is used. Options are:
      *  - integrity -
      *  - password -
      */
    var sign: js.UndefOr[Integrity] = js.undefined
    
    /**
      * If `false`, allows any cookie value including values in violation of [RFC 6265](https://tools.ietf.org/html/rfc6265).
      *
      * @default true
      */
    var strictHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Time-to-live in milliseconds.
      *
      * @default null (session time-life - cookies are deleted when the browser is closed)
      */
    var ttl: js.UndefOr[Double | Null] = js.undefined
  }
  object StateOptions {
    
    inline def apply[HapiRequest](): StateOptions[HapiRequest] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StateOptions[HapiRequest]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StateOptions[?], HapiRequest] (val x: Self & StateOptions[HapiRequest]) extends AnyVal {
      
      inline def setAutoValue(value: /* request */ HapiRequest => Any): Self = StObject.set(x, "autoValue", js.Any.fromFunction1(value))
      
      inline def setAutoValueUndefined: Self = StObject.set(x, "autoValue", js.undefined)
      
      inline def setClearInvalid(value: Boolean): Self = StObject.set(x, "clearInvalid", value.asInstanceOf[js.Any])
      
      inline def setClearInvalidUndefined: Self = StObject.set(x, "clearInvalid", js.undefined)
      
      inline def setContextualize(value: (StateOptions[HapiRequest], /* request */ HapiRequest) => Unit | js.Promise[Unit]): Self = StObject.set(x, "contextualize", js.Any.fromFunction2(value))
      
      inline def setContextualizeUndefined: Self = StObject.set(x, "contextualize", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainNull: Self = StObject.set(x, "domain", null)
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEncoding(value: none_ | base64 | base64json | form | iron): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      inline def setIron(value: SealOptions): Self = StObject.set(x, "iron", value.asInstanceOf[js.Any])
      
      inline def setIronUndefined: Self = StObject.set(x, "iron", js.undefined)
      
      inline def setIsHttpOnly(value: Boolean): Self = StObject.set(x, "isHttpOnly", value.asInstanceOf[js.Any])
      
      inline def setIsHttpOnlyUndefined: Self = StObject.set(x, "isHttpOnly", js.undefined)
      
      inline def setIsSameSite(value: SameSitePolicy): Self = StObject.set(x, "isSameSite", value.asInstanceOf[js.Any])
      
      inline def setIsSameSiteUndefined: Self = StObject.set(x, "isSameSite", js.undefined)
      
      inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
      
      inline def setIsSecureUndefined: Self = StObject.set(x, "isSecure", js.undefined)
      
      inline def setPassThrough(value: Any): Self = StObject.set(x, "passThrough", value.asInstanceOf[js.Any])
      
      inline def setPassThroughUndefined: Self = StObject.set(x, "passThrough", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSign(value: Integrity): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
      
      inline def setSignUndefined: Self = StObject.set(x, "sign", js.undefined)
      
      inline def setStrictHeader(value: Boolean): Self = StObject.set(x, "strictHeader", value.asInstanceOf[js.Any])
      
      inline def setStrictHeaderUndefined: Self = StObject.set(x, "strictHeader", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlNull: Self = StObject.set(x, "ttl", null)
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
