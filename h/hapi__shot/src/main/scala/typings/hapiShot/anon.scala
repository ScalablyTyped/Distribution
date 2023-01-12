package typings.hapiShot

import typings.hapiShot.mod.InjectedRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Close extends StObject {
    
    /**
      * whether the request will emit a close event.
      *
      * @default true
      */
    var close: js.UndefOr[Boolean] = js.undefined
    
    /**
      * indicates whether the request will fire an end event.
      *
      * @default true
      */
    var end: js.UndefOr[Boolean] = js.undefined
    
    /**
      * whether the request will emit an error event.
      * If set to true, the emitted error will have a message of 'Simulated'.
      *
      * @default false
      */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /**
      * indicates whether the request payload will be split into chunks.
      *
      * @default false
      */
    var split: js.UndefOr[Boolean] = js.undefined
  }
  object Close {
    
    inline def apply(): Close = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<node.http.IncomingHttpHeaders> */
  trait ReadonlyIncomingHttpHeade extends StObject {
    
    val accept: js.UndefOr[String] = js.undefined
    
    val `accept-language`: js.UndefOr[String] = js.undefined
    
    val `accept-patch`: js.UndefOr[String] = js.undefined
    
    val `accept-ranges`: js.UndefOr[String] = js.undefined
    
    val `access-control-allow-credentials`: js.UndefOr[String] = js.undefined
    
    val `access-control-allow-headers`: js.UndefOr[String] = js.undefined
    
    val `access-control-allow-methods`: js.UndefOr[String] = js.undefined
    
    val `access-control-allow-origin`: js.UndefOr[String] = js.undefined
    
    val `access-control-expose-headers`: js.UndefOr[String] = js.undefined
    
    val `access-control-max-age`: js.UndefOr[String] = js.undefined
    
    val `access-control-request-headers`: js.UndefOr[String] = js.undefined
    
    val `access-control-request-method`: js.UndefOr[String] = js.undefined
    
    val age: js.UndefOr[String] = js.undefined
    
    val allow: js.UndefOr[String] = js.undefined
    
    val `alt-svc`: js.UndefOr[String] = js.undefined
    
    val authorization: js.UndefOr[String] = js.undefined
    
    val `cache-control`: js.UndefOr[String] = js.undefined
    
    val connection: js.UndefOr[String] = js.undefined
    
    val `content-disposition`: js.UndefOr[String] = js.undefined
    
    val `content-encoding`: js.UndefOr[String] = js.undefined
    
    val `content-language`: js.UndefOr[String] = js.undefined
    
    val `content-length`: js.UndefOr[String] = js.undefined
    
    val `content-location`: js.UndefOr[String] = js.undefined
    
    val `content-range`: js.UndefOr[String] = js.undefined
    
    val `content-type`: js.UndefOr[String] = js.undefined
    
    val cookie: js.UndefOr[String] = js.undefined
    
    val date: js.UndefOr[String] = js.undefined
    
    val etag: js.UndefOr[String] = js.undefined
    
    val expect: js.UndefOr[String] = js.undefined
    
    val expires: js.UndefOr[String] = js.undefined
    
    val forwarded: js.UndefOr[String] = js.undefined
    
    val from: js.UndefOr[String] = js.undefined
    
    val host: js.UndefOr[String] = js.undefined
    
    val `if-match`: js.UndefOr[String] = js.undefined
    
    val `if-modified-since`: js.UndefOr[String] = js.undefined
    
    val `if-none-match`: js.UndefOr[String] = js.undefined
    
    val `if-unmodified-since`: js.UndefOr[String] = js.undefined
    
    val `last-modified`: js.UndefOr[String] = js.undefined
    
    val location: js.UndefOr[String] = js.undefined
    
    val origin: js.UndefOr[String] = js.undefined
    
    val pragma: js.UndefOr[String] = js.undefined
    
    val `proxy-authenticate`: js.UndefOr[String] = js.undefined
    
    val `proxy-authorization`: js.UndefOr[String] = js.undefined
    
    val `public-key-pins`: js.UndefOr[String] = js.undefined
    
    val range: js.UndefOr[String] = js.undefined
    
    val referer: js.UndefOr[String] = js.undefined
    
    val `retry-after`: js.UndefOr[String] = js.undefined
    
    val `sec-websocket-accept`: js.UndefOr[String] = js.undefined
    
    val `sec-websocket-extensions`: js.UndefOr[String] = js.undefined
    
    val `sec-websocket-key`: js.UndefOr[String] = js.undefined
    
    val `sec-websocket-protocol`: js.UndefOr[String] = js.undefined
    
    val `sec-websocket-version`: js.UndefOr[String] = js.undefined
    
    val `set-cookie`: js.UndefOr[js.Array[String]] = js.undefined
    
    val `strict-transport-security`: js.UndefOr[String] = js.undefined
    
    val tk: js.UndefOr[String] = js.undefined
    
    val trailer: js.UndefOr[String] = js.undefined
    
    val `transfer-encoding`: js.UndefOr[String] = js.undefined
    
    val upgrade: js.UndefOr[String] = js.undefined
    
    val `user-agent`: js.UndefOr[String] = js.undefined
    
    val vary: js.UndefOr[String] = js.undefined
    
    val via: js.UndefOr[String] = js.undefined
    
    val warning: js.UndefOr[String] = js.undefined
    
    val `www-authenticate`: js.UndefOr[String] = js.undefined
  }
  object ReadonlyIncomingHttpHeade {
    
    inline def apply(): ReadonlyIncomingHttpHeade = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyIncomingHttpHeade]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyIncomingHttpHeade] (val x: Self) extends AnyVal {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def `setAccept-language`(value: String): Self = StObject.set(x, "accept-language", value.asInstanceOf[js.Any])
      
      inline def `setAccept-languageUndefined`: Self = StObject.set(x, "accept-language", js.undefined)
      
      inline def `setAccept-patch`(value: String): Self = StObject.set(x, "accept-patch", value.asInstanceOf[js.Any])
      
      inline def `setAccept-patchUndefined`: Self = StObject.set(x, "accept-patch", js.undefined)
      
      inline def `setAccept-ranges`(value: String): Self = StObject.set(x, "accept-ranges", value.asInstanceOf[js.Any])
      
      inline def `setAccept-rangesUndefined`: Self = StObject.set(x, "accept-ranges", js.undefined)
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def `setAccess-control-allow-credentials`(value: String): Self = StObject.set(x, "access-control-allow-credentials", value.asInstanceOf[js.Any])
      
      inline def `setAccess-control-allow-credentialsUndefined`: Self = StObject.set(x, "access-control-allow-credentials", js.undefined)
      
      inline def `setAccess-control-allow-headers`(value: String): Self = StObject.set(x, "access-control-allow-headers", value.asInstanceOf[js.Any])
      
      inline def `setAccess-control-allow-headersUndefined`: Self = StObject.set(x, "access-control-allow-headers", js.undefined)
      
      inline def `setAccess-control-allow-methods`(value: String): Self = StObject.set(x, "access-control-allow-methods", value.asInstanceOf[js.Any])
      
      inline def `setAccess-control-allow-methodsUndefined`: Self = StObject.set(x, "access-control-allow-methods", js.undefined)
      
      inline def `setAccess-control-allow-origin`(value: String): Self = StObject.set(x, "access-control-allow-origin", value.asInstanceOf[js.Any])
      
      inline def `setAccess-control-allow-originUndefined`: Self = StObject.set(x, "access-control-allow-origin", js.undefined)
      
      inline def `setAccess-control-expose-headers`(value: String): Self = StObject.set(x, "access-control-expose-headers", value.asInstanceOf[js.Any])
      
      inline def `setAccess-control-expose-headersUndefined`: Self = StObject.set(x, "access-control-expose-headers", js.undefined)
      
      inline def `setAccess-control-max-age`(value: String): Self = StObject.set(x, "access-control-max-age", value.asInstanceOf[js.Any])
      
      inline def `setAccess-control-max-ageUndefined`: Self = StObject.set(x, "access-control-max-age", js.undefined)
      
      inline def `setAccess-control-request-headers`(value: String): Self = StObject.set(x, "access-control-request-headers", value.asInstanceOf[js.Any])
      
      inline def `setAccess-control-request-headersUndefined`: Self = StObject.set(x, "access-control-request-headers", js.undefined)
      
      inline def `setAccess-control-request-method`(value: String): Self = StObject.set(x, "access-control-request-method", value.asInstanceOf[js.Any])
      
      inline def `setAccess-control-request-methodUndefined`: Self = StObject.set(x, "access-control-request-method", js.undefined)
      
      inline def setAge(value: String): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
      
      inline def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def `setAlt-svc`(value: String): Self = StObject.set(x, "alt-svc", value.asInstanceOf[js.Any])
      
      inline def `setAlt-svcUndefined`: Self = StObject.set(x, "alt-svc", js.undefined)
      
      inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
      
      inline def `setCache-control`(value: String): Self = StObject.set(x, "cache-control", value.asInstanceOf[js.Any])
      
      inline def `setCache-controlUndefined`: Self = StObject.set(x, "cache-control", js.undefined)
      
      inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def `setContent-disposition`(value: String): Self = StObject.set(x, "content-disposition", value.asInstanceOf[js.Any])
      
      inline def `setContent-dispositionUndefined`: Self = StObject.set(x, "content-disposition", js.undefined)
      
      inline def `setContent-encoding`(value: String): Self = StObject.set(x, "content-encoding", value.asInstanceOf[js.Any])
      
      inline def `setContent-encodingUndefined`: Self = StObject.set(x, "content-encoding", js.undefined)
      
      inline def `setContent-language`(value: String): Self = StObject.set(x, "content-language", value.asInstanceOf[js.Any])
      
      inline def `setContent-languageUndefined`: Self = StObject.set(x, "content-language", js.undefined)
      
      inline def `setContent-length`(value: String): Self = StObject.set(x, "content-length", value.asInstanceOf[js.Any])
      
      inline def `setContent-lengthUndefined`: Self = StObject.set(x, "content-length", js.undefined)
      
      inline def `setContent-location`(value: String): Self = StObject.set(x, "content-location", value.asInstanceOf[js.Any])
      
      inline def `setContent-locationUndefined`: Self = StObject.set(x, "content-location", js.undefined)
      
      inline def `setContent-range`(value: String): Self = StObject.set(x, "content-range", value.asInstanceOf[js.Any])
      
      inline def `setContent-rangeUndefined`: Self = StObject.set(x, "content-range", js.undefined)
      
      inline def `setContent-type`(value: String): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
      
      inline def `setContent-typeUndefined`: Self = StObject.set(x, "content-type", js.undefined)
      
      inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      inline def setExpect(value: String): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
      
      inline def setExpectUndefined: Self = StObject.set(x, "expect", js.undefined)
      
      inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setForwarded(value: String): Self = StObject.set(x, "forwarded", value.asInstanceOf[js.Any])
      
      inline def setForwardedUndefined: Self = StObject.set(x, "forwarded", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def `setIf-match`(value: String): Self = StObject.set(x, "if-match", value.asInstanceOf[js.Any])
      
      inline def `setIf-matchUndefined`: Self = StObject.set(x, "if-match", js.undefined)
      
      inline def `setIf-modified-since`(value: String): Self = StObject.set(x, "if-modified-since", value.asInstanceOf[js.Any])
      
      inline def `setIf-modified-sinceUndefined`: Self = StObject.set(x, "if-modified-since", js.undefined)
      
      inline def `setIf-none-match`(value: String): Self = StObject.set(x, "if-none-match", value.asInstanceOf[js.Any])
      
      inline def `setIf-none-matchUndefined`: Self = StObject.set(x, "if-none-match", js.undefined)
      
      inline def `setIf-unmodified-since`(value: String): Self = StObject.set(x, "if-unmodified-since", value.asInstanceOf[js.Any])
      
      inline def `setIf-unmodified-sinceUndefined`: Self = StObject.set(x, "if-unmodified-since", js.undefined)
      
      inline def `setLast-modified`(value: String): Self = StObject.set(x, "last-modified", value.asInstanceOf[js.Any])
      
      inline def `setLast-modifiedUndefined`: Self = StObject.set(x, "last-modified", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPragma(value: String): Self = StObject.set(x, "pragma", value.asInstanceOf[js.Any])
      
      inline def setPragmaUndefined: Self = StObject.set(x, "pragma", js.undefined)
      
      inline def `setProxy-authenticate`(value: String): Self = StObject.set(x, "proxy-authenticate", value.asInstanceOf[js.Any])
      
      inline def `setProxy-authenticateUndefined`: Self = StObject.set(x, "proxy-authenticate", js.undefined)
      
      inline def `setProxy-authorization`(value: String): Self = StObject.set(x, "proxy-authorization", value.asInstanceOf[js.Any])
      
      inline def `setProxy-authorizationUndefined`: Self = StObject.set(x, "proxy-authorization", js.undefined)
      
      inline def `setPublic-key-pins`(value: String): Self = StObject.set(x, "public-key-pins", value.asInstanceOf[js.Any])
      
      inline def `setPublic-key-pinsUndefined`: Self = StObject.set(x, "public-key-pins", js.undefined)
      
      inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
      
      inline def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
      
      inline def `setRetry-after`(value: String): Self = StObject.set(x, "retry-after", value.asInstanceOf[js.Any])
      
      inline def `setRetry-afterUndefined`: Self = StObject.set(x, "retry-after", js.undefined)
      
      inline def `setSec-websocket-accept`(value: String): Self = StObject.set(x, "sec-websocket-accept", value.asInstanceOf[js.Any])
      
      inline def `setSec-websocket-acceptUndefined`: Self = StObject.set(x, "sec-websocket-accept", js.undefined)
      
      inline def `setSec-websocket-extensions`(value: String): Self = StObject.set(x, "sec-websocket-extensions", value.asInstanceOf[js.Any])
      
      inline def `setSec-websocket-extensionsUndefined`: Self = StObject.set(x, "sec-websocket-extensions", js.undefined)
      
      inline def `setSec-websocket-key`(value: String): Self = StObject.set(x, "sec-websocket-key", value.asInstanceOf[js.Any])
      
      inline def `setSec-websocket-keyUndefined`: Self = StObject.set(x, "sec-websocket-key", js.undefined)
      
      inline def `setSec-websocket-protocol`(value: String): Self = StObject.set(x, "sec-websocket-protocol", value.asInstanceOf[js.Any])
      
      inline def `setSec-websocket-protocolUndefined`: Self = StObject.set(x, "sec-websocket-protocol", js.undefined)
      
      inline def `setSec-websocket-version`(value: String): Self = StObject.set(x, "sec-websocket-version", value.asInstanceOf[js.Any])
      
      inline def `setSec-websocket-versionUndefined`: Self = StObject.set(x, "sec-websocket-version", js.undefined)
      
      inline def `setSet-cookie`(value: js.Array[String]): Self = StObject.set(x, "set-cookie", value.asInstanceOf[js.Any])
      
      inline def `setSet-cookieUndefined`: Self = StObject.set(x, "set-cookie", js.undefined)
      
      inline def `setSet-cookieVarargs`(value: String*): Self = StObject.set(x, "set-cookie", js.Array(value*))
      
      inline def `setStrict-transport-security`(value: String): Self = StObject.set(x, "strict-transport-security", value.asInstanceOf[js.Any])
      
      inline def `setStrict-transport-securityUndefined`: Self = StObject.set(x, "strict-transport-security", js.undefined)
      
      inline def setTk(value: String): Self = StObject.set(x, "tk", value.asInstanceOf[js.Any])
      
      inline def setTkUndefined: Self = StObject.set(x, "tk", js.undefined)
      
      inline def setTrailer(value: String): Self = StObject.set(x, "trailer", value.asInstanceOf[js.Any])
      
      inline def setTrailerUndefined: Self = StObject.set(x, "trailer", js.undefined)
      
      inline def `setTransfer-encoding`(value: String): Self = StObject.set(x, "transfer-encoding", value.asInstanceOf[js.Any])
      
      inline def `setTransfer-encodingUndefined`: Self = StObject.set(x, "transfer-encoding", js.undefined)
      
      inline def setUpgrade(value: String): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
      
      inline def `setUser-agent`(value: String): Self = StObject.set(x, "user-agent", value.asInstanceOf[js.Any])
      
      inline def `setUser-agentUndefined`: Self = StObject.set(x, "user-agent", js.undefined)
      
      inline def setVary(value: String): Self = StObject.set(x, "vary", value.asInstanceOf[js.Any])
      
      inline def setVaryUndefined: Self = StObject.set(x, "vary", js.undefined)
      
      inline def setVia(value: String): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
      
      inline def setViaUndefined: Self = StObject.set(x, "via", js.undefined)
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
      
      inline def `setWww-authenticate`(value: String): Self = StObject.set(x, "www-authenticate", value.asInstanceOf[js.Any])
      
      inline def `setWww-authenticateUndefined`: Self = StObject.set(x, "www-authenticate", js.undefined)
    }
  }
  
  trait Req extends StObject {
    
    /**
      * The simulated request object.
      */
    var req: InjectedRequest
    
    /**
      * The simulated response object.
      */
    var res: ServerResponse[IncomingMessage]
  }
  object Req {
    
    inline def apply(req: InjectedRequest, res: ServerResponse[IncomingMessage]): Req = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[Req]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Req] (val x: Self) extends AnyVal {
      
      inline def setReq(value: InjectedRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRes(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
}
