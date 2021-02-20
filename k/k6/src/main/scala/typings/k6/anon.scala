package typings.k6

import org.scalablytyped.runtime.StringDictionary
import typings.k6.httpMod.RefinedParams
import typings.k6.httpMod.RequestCookie
import typings.k6.httpMod.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Blocked extends StObject {
    
    /** Milliseconds spent blocked before initiating request. */
    var blocked: Double = js.native
    
    /** Milliseconds spent setting up TCP connection to host. */
    var connecting: Double = js.native
    
    /** Total time in milliseconds. `sending+waiting+receiving` */
    var duration: Double = js.native
    
    /** Milliseconds spent receiving response data. */
    var receiving: Double = js.native
    
    /** Milliseconds spent sending request. */
    var sending: Double = js.native
    
    /** Milliseconds spent handshaking TLS session with host. */
    var tls_handshaking: Double = js.native
    
    /** Milliseconds spent waiting for server response (TTFB). */
    var waiting: Double = js.native
  }
  object Blocked {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class BlockedMutableBuilder[Self <: Blocked] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocked(value: Double): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnecting(value: Double): Self = StObject.set(x, "connecting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiving(value: Double): Self = StObject.set(x, "receiving", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSending(value: Double): Self = StObject.set(x, "sending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTls_handshaking(value: Double): Self = StObject.set(x, "tls_handshaking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaiting(value: Double): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Body extends StObject {
    
    /** Request body. */
    var body: String = js.native
    
    /** Request cookies. */
    var cookies: StringDictionary[js.Array[RequestCookie]] = js.native
    
    /** Request headers. */
    var headers: StringDictionary[js.Array[String]] = js.native
    
    /** Request method. */
    var method: String = js.native
    
    /** Request URL. */
    var url: String = js.native
  }
  object Body {
    
    @scala.inline
    def apply(
      body: String,
      cookies: StringDictionary[js.Array[RequestCookie]],
      headers: StringDictionary[js.Array[String]],
      method: String,
      url: String
    ): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookies(value: StringDictionary[js.Array[RequestCookie]]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fields[RT /* <: js.UndefOr[ResponseType] */] extends StObject {
    
    var fields: js.UndefOr[StringDictionary[String]] = js.native
    
    var formSelector: js.UndefOr[String] = js.native
    
    var params: js.UndefOr[RefinedParams[RT] | Null] = js.native
    
    var submitSelector: js.UndefOr[String] = js.native
  }
  object Fields {
    
    @scala.inline
    def apply[RT /* <: js.UndefOr[ResponseType] */](): Fields[RT] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields[RT]]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields[_], RT /* <: js.UndefOr[ResponseType] */] (val x: Self with Fields[RT]) extends AnyVal {
      
      @scala.inline
      def setFields(value: StringDictionary[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFormSelector(value: String): Self = StObject.set(x, "formSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormSelectorUndefined: Self = StObject.set(x, "formSelector", js.undefined)
      
      @scala.inline
      def setParams(value: RefinedParams[RT]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsNull: Self = StObject.set(x, "params", null)
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setSubmitSelector(value: String): Self = StObject.set(x, "submitSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitSelectorUndefined: Self = StObject.set(x, "submitSelector", js.undefined)
    }
  }
  
  @js.native
  trait Max extends StObject {
    
    var max: String = js.native
    
    var min: String = js.native
  }
  object Max {
    
    @scala.inline
    def apply(max: String, min: String): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Nextupdate extends StObject {
    
    /** When response will be refreshed with the CA in millisecond Unix time. */
    var next_update: Double = js.native
    
    /** When response signed by responder in millisecond Unix time. */
    var produced_at: Double = js.native
    
    /** Certificate revocation reason. One of `OCSP_REASON_*` constants. */
    var revocation_reason: String = js.native
    
    /** When certificate was revoked in millisecond Unix time. */
    var revoked_at: Double = js.native
    
    /** Certificate status. One of `OCSP_STATUS_*` constants. */
    var status: String = js.native
    
    /** When indicated status was known correct in millisecond Unix time. */
    var this_update: Double = js.native
  }
  object Nextupdate {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class NextupdateMutableBuilder[Self <: Nextupdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext_update(value: Double): Self = StObject.set(x, "next_update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduced_at(value: Double): Self = StObject.set(x, "produced_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevocation_reason(value: String): Self = StObject.set(x, "revocation_reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevoked_at(value: Double): Self = StObject.set(x, "revoked_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThis_update(value: Double): Self = StObject.set(x, "this_update", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Params[RT /* <: js.UndefOr[ResponseType] */] extends StObject {
    
    var params: js.UndefOr[RefinedParams[RT] | Null] = js.native
    
    var selector: js.UndefOr[String] = js.native
  }
  object Params {
    
    @scala.inline
    def apply[RT /* <: js.UndefOr[ResponseType] */](): Params[RT] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params[RT]]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params[_], RT /* <: js.UndefOr[ResponseType] */] (val x: Self with Params[RT]) extends AnyVal {
      
      @scala.inline
      def setParams(value: RefinedParams[RT]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsNull: Self = StObject.set(x, "params", null)
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
  
  @js.native
  trait Replace extends StObject {
    
    var replace: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object Replace {
    
    @scala.inline
    def apply(): Replace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Replace]
    }
    
    @scala.inline
    implicit class ReplaceMutableBuilder[Self <: Replace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
