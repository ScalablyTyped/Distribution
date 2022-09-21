package typings.k6

import org.scalablytyped.runtime.StringDictionary
import typings.k6.httpMod.RefinedParams
import typings.k6.httpMod.RequestCookie
import typings.k6.httpMod.ResponseType
import typings.k6.k6Strings.any
import typings.k6.k6Strings.first
import typings.k6.k6Strings.onlyIPv4
import typings.k6.k6Strings.onlyIPv6
import typings.k6.k6Strings.preferIPv4
import typings.k6.k6Strings.preferIPv6
import typings.k6.k6Strings.random
import typings.k6.k6Strings.roundRobin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Blocked extends StObject {
    
    /** Milliseconds spent blocked before initiating request. */
    var blocked: Double
    
    /** Milliseconds spent setting up TCP connection to host. */
    var connecting: Double
    
    /** Total time in milliseconds. `sending+waiting+receiving` */
    var duration: Double
    
    /** Milliseconds spent receiving response data. */
    var receiving: Double
    
    /** Milliseconds spent sending request. */
    var sending: Double
    
    /** Milliseconds spent handshaking TLS session with host. */
    var tls_handshaking: Double
    
    /** Milliseconds spent waiting for server response (TTFB). */
    var waiting: Double
  }
  object Blocked {
    
    inline def apply(
      blocked: Double,
      connecting: Double,
      duration: Double,
      receiving: Double,
      sending: Double,
      tls_handshaking: Double,
      waiting: Double
    ): Blocked = {
      val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], connecting = connecting.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], receiving = receiving.asInstanceOf[js.Any], sending = sending.asInstanceOf[js.Any], tls_handshaking = tls_handshaking.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blocked]
    }
    
    extension [Self <: Blocked](x: Self) {
      
      inline def setBlocked(value: Double): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
      
      inline def setConnecting(value: Double): Self = StObject.set(x, "connecting", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setReceiving(value: Double): Self = StObject.set(x, "receiving", value.asInstanceOf[js.Any])
      
      inline def setSending(value: Double): Self = StObject.set(x, "sending", value.asInstanceOf[js.Any])
      
      inline def setTls_handshaking(value: Double): Self = StObject.set(x, "tls_handshaking", value.asInstanceOf[js.Any])
      
      inline def setWaiting(value: Double): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    }
  }
  
  trait Body extends StObject {
    
    /** Request body. */
    var body: String
    
    /** Request cookies. */
    var cookies: StringDictionary[js.Array[RequestCookie]]
    
    /** Request headers. */
    var headers: StringDictionary[js.Array[String]]
    
    /** Request method. */
    var method: String
    
    /** Request URL. */
    var url: String
  }
  object Body {
    
    inline def apply(
      body: String,
      cookies: StringDictionary[js.Array[RequestCookie]],
      headers: StringDictionary[js.Array[String]],
      method: String,
      url: String
    ): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCookies(value: StringDictionary[js.Array[RequestCookie]]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fields[RT /* <: js.UndefOr[ResponseType] */] extends StObject {
    
    var fields: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var formSelector: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[RefinedParams[RT] | Null] = js.undefined
    
    var submitSelector: js.UndefOr[String] = js.undefined
  }
  object Fields {
    
    inline def apply[RT /* <: js.UndefOr[ResponseType] */](): Fields[RT] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields[RT]]
    }
    
    extension [Self <: Fields[?], RT /* <: js.UndefOr[ResponseType] */](x: Self & Fields[RT]) {
      
      inline def setFields(value: StringDictionary[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFormSelector(value: String): Self = StObject.set(x, "formSelector", value.asInstanceOf[js.Any])
      
      inline def setFormSelectorUndefined: Self = StObject.set(x, "formSelector", js.undefined)
      
      inline def setParams(value: RefinedParams[RT]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsNull: Self = StObject.set(x, "params", null)
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setSubmitSelector(value: String): Self = StObject.set(x, "submitSelector", value.asInstanceOf[js.Any])
      
      inline def setSubmitSelectorUndefined: Self = StObject.set(x, "submitSelector", js.undefined)
    }
  }
  
  trait Max extends StObject {
    
    var max: String
    
    var min: String
  }
  object Max {
    
    inline def apply(max: String, min: String): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait Nextupdate extends StObject {
    
    /** When response will be refreshed with the CA in millisecond Unix time. */
    var next_update: Double
    
    /** When response signed by responder in millisecond Unix time. */
    var produced_at: Double
    
    /** Certificate revocation reason. One of `OCSP_REASON_*` constants. */
    var revocation_reason: String
    
    /** When certificate was revoked in millisecond Unix time. */
    var revoked_at: Double
    
    /** Certificate status. One of `OCSP_STATUS_*` constants. */
    var status: String
    
    /** When indicated status was known correct in millisecond Unix time. */
    var this_update: Double
  }
  object Nextupdate {
    
    inline def apply(
      next_update: Double,
      produced_at: Double,
      revocation_reason: String,
      revoked_at: Double,
      status: String,
      this_update: Double
    ): Nextupdate = {
      val __obj = js.Dynamic.literal(next_update = next_update.asInstanceOf[js.Any], produced_at = produced_at.asInstanceOf[js.Any], revocation_reason = revocation_reason.asInstanceOf[js.Any], revoked_at = revoked_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], this_update = this_update.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nextupdate]
    }
    
    extension [Self <: Nextupdate](x: Self) {
      
      inline def setNext_update(value: Double): Self = StObject.set(x, "next_update", value.asInstanceOf[js.Any])
      
      inline def setProduced_at(value: Double): Self = StObject.set(x, "produced_at", value.asInstanceOf[js.Any])
      
      inline def setRevocation_reason(value: String): Self = StObject.set(x, "revocation_reason", value.asInstanceOf[js.Any])
      
      inline def setRevoked_at(value: Double): Self = StObject.set(x, "revoked_at", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setThis_update(value: Double): Self = StObject.set(x, "this_update", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params[RT /* <: js.UndefOr[ResponseType] */] extends StObject {
    
    var params: js.UndefOr[RefinedParams[RT] | Null] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
  }
  object Params {
    
    inline def apply[RT /* <: js.UndefOr[ResponseType] */](): Params[RT] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params[RT]]
    }
    
    extension [Self <: Params[?], RT /* <: js.UndefOr[ResponseType] */](x: Self & Params[RT]) {
      
      inline def setParams(value: RefinedParams[RT]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsNull: Self = StObject.set(x, "params", null)
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
  
  trait Policy extends StObject {
    
    var policy: preferIPv4 | preferIPv6 | onlyIPv4 | onlyIPv6 | any
    
    var select: first | random | roundRobin
    
    /** 0, inf, or any time duration(60s, 5m30s, 10m, 2h). */
    var ttl: String
  }
  object Policy {
    
    inline def apply(
      policy: preferIPv4 | preferIPv6 | onlyIPv4 | onlyIPv6 | any,
      select: first | random | roundRobin,
      ttl: String
    ): Policy = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Policy]
    }
    
    extension [Self <: Policy](x: Self) {
      
      inline def setPolicy(value: preferIPv4 | preferIPv6 | onlyIPv4 | onlyIPv6 | any): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: first | random | roundRobin): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  trait Replace extends StObject {
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Replace {
    
    inline def apply(): Replace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Replace]
    }
    
    extension [Self <: Replace](x: Self) {
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
