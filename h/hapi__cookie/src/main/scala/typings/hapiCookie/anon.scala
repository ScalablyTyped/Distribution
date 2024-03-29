package typings.hapiCookie

import typings.hapiCookie.hapiCookieStrings.base64
import typings.hapiCookie.hapiCookieStrings.base64json
import typings.hapiCookie.hapiCookieStrings.form
import typings.hapiCookie.hapiCookieStrings.iron
import typings.hapiCookie.hapiCookieStrings.none
import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRequestMod.Request
import typings.hapiIron.mod.SealOptions
import typings.hapiStatehood.anon.Integrity
import typings.hapiStatehood.mod.SameSitePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Clear extends StObject {
    
    def clear(): Unit = js.native
    def clear(key: String): Unit = js.native
    
    def set(key: String, value: String): Unit = js.native
    def set(key: String, value: js.Object): Unit = js.native
    def set(session: js.Object): Unit = js.native
    
    def ttl(milliseconds: Double): Unit = js.native
  }
  
  trait RedirectTo extends StObject {
    
    var redirectTo: js.UndefOr[Boolean] = js.undefined
  }
  object RedirectTo {
    
    inline def apply(): RedirectTo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedirectTo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedirectTo] (val x: Self) extends AnyVal {
      
      inline def setRedirectTo(value: Boolean): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
      
      inline def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
    }
  }
  
  /* Inlined @hapi/hapi.@hapi/hapi.ServerStateCookieOptions & {  name :string} */
  trait ServerStateCookieOptionsn extends StObject {
    
    /**
      * if present and the cookie was not received from the client or explicitly set by the route handler, the
      * cookie is automatically added to the response with the provided value. The value can be
      * a function with signature async function(request) where:
      */
    var autoValue: js.UndefOr[js.Function1[/* request */ Request[ReqRefDefaults], Any]] = js.undefined
    
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
        js.Function2[
          /* definition */ this.type, 
          /* request */ Request[ReqRefDefaults], 
          Unit | js.Promise[Unit]
        ]
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
    var encoding: js.UndefOr[none | base64 | base64json | form | iron] = js.undefined
    
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
    
    var name: String
    
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
  object ServerStateCookieOptionsn {
    
    inline def apply(name: String): ServerStateCookieOptionsn = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerStateCookieOptionsn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerStateCookieOptionsn] (val x: Self) extends AnyVal {
      
      inline def setAutoValue(value: /* request */ Request[ReqRefDefaults] => Any): Self = StObject.set(x, "autoValue", js.Any.fromFunction1(value))
      
      inline def setAutoValueUndefined: Self = StObject.set(x, "autoValue", js.undefined)
      
      inline def setClearInvalid(value: Boolean): Self = StObject.set(x, "clearInvalid", value.asInstanceOf[js.Any])
      
      inline def setClearInvalidUndefined: Self = StObject.set(x, "clearInvalid", js.undefined)
      
      inline def setContextualize(
        value: (ServerStateCookieOptionsn, /* request */ Request[ReqRefDefaults]) => Unit | js.Promise[Unit]
      ): Self = StObject.set(x, "contextualize", js.Any.fromFunction2(value))
      
      inline def setContextualizeUndefined: Self = StObject.set(x, "contextualize", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainNull: Self = StObject.set(x, "domain", null)
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEncoding(value: none | base64 | base64json | form | iron): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
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
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
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
