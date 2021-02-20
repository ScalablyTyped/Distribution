package typings.koaSession

import org.scalablytyped.runtime.Instantiable1
import typings.koa.mod.Context
import typings.koaSession.koaSessionStrings.lax
import typings.koaSession.koaSessionStrings.none
import typings.koaSession.koaSessionStrings.session
import typings.koaSession.koaSessionStrings.strict
import typings.koaSession.mod.ExternalKeys
import typings.koaSession.mod.Session
import typings.koaSession.mod.stores
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Changed extends StObject {
    
    var changed: Boolean = js.native
    
    var rolling: js.UndefOr[Boolean] = js.native
  }
  object Changed {
    
    @scala.inline
    def apply(changed: Boolean): Changed = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Changed]
    }
    
    @scala.inline
    implicit class ChangedMutableBuilder[Self <: Changed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolling(value: Boolean): Self = StObject.set(x, "rolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRollingUndefined: Self = StObject.set(x, "rolling", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable extends Instantiable1[/* ctx */ Context, stores]
  
  /* Inlined std.Partial<koa-session.koa-session.Session> */
  @js.native
  trait PartialSession extends StObject {
    
    var inspect: js.UndefOr[js.Function0[js.Object]] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    var maxAge: js.UndefOr[Double | session] = js.native
    
    var populated: js.UndefOr[Boolean] = js.native
    
    var save: js.UndefOr[js.Function0[Unit]] = js.native
    
    var toJSON: js.UndefOr[js.Function0[js.Object]] = js.native
  }
  object PartialSession {
    
    @scala.inline
    def apply(): PartialSession = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSession]
    }
    
    @scala.inline
    implicit class PartialSessionMutableBuilder[Self <: PartialSession] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInspect(value: () => js.Object): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInspectUndefined: Self = StObject.set(x, "inspect", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double | session): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setPopulated(value: Boolean): Self = StObject.set(x, "populated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopulatedUndefined: Self = StObject.set(x, "populated", js.undefined)
      
      @scala.inline
      def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      @scala.inline
      def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    }
  }
  
  /* Inlined std.Partial<koa-session.koa-session.Session> & {  _expire :number | undefined,   _maxAge :number | undefined} */
  @js.native
  trait PartialSessionexpirenumbe extends StObject {
    
    var _expire: js.UndefOr[Double] = js.native
    
    var _maxAge: js.UndefOr[Double] = js.native
    
    var inspect: js.UndefOr[js.Function0[js.Object]] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    var maxAge: js.UndefOr[Double | session] = js.native
    
    var populated: js.UndefOr[Boolean] = js.native
    
    var save: js.UndefOr[js.Function0[Unit]] = js.native
    
    var toJSON: js.UndefOr[js.Function0[js.Object]] = js.native
  }
  object PartialSessionexpirenumbe {
    
    @scala.inline
    def apply(): PartialSessionexpirenumbe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSessionexpirenumbe]
    }
    
    @scala.inline
    implicit class PartialSessionexpirenumbeMutableBuilder[Self <: PartialSessionexpirenumbe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInspect(value: () => js.Object): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInspectUndefined: Self = StObject.set(x, "inspect", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double | session): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setPopulated(value: Boolean): Self = StObject.set(x, "populated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopulatedUndefined: Self = StObject.set(x, "populated", js.undefined)
      
      @scala.inline
      def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      @scala.inline
      def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
      
      @scala.inline
      def set_expire(value: Double): Self = StObject.set(x, "_expire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_expireUndefined: Self = StObject.set(x, "_expire", js.undefined)
      
      @scala.inline
      def set_maxAge(value: Double): Self = StObject.set(x, "_maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_maxAgeUndefined: Self = StObject.set(x, "_maxAge", js.undefined)
    }
  }
  
  /* Inlined std.Partial<koa-session.koa-session.opts> */
  @js.native
  trait Partialopts extends StObject {
    
    var ContextStore: js.UndefOr[Instantiable] = js.native
    
    var beforeSave: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Unit]] = js.native
    
    var decode: js.UndefOr[js.Function1[/* str */ String, js.Object]] = js.native
    
    var domain: js.UndefOr[String] = js.native
    
    var encode: js.UndefOr[js.Function1[/* obj */ js.Object, String]] = js.native
    
    var expires: js.UndefOr[Date] = js.native
    
    var externalKey: js.UndefOr[ExternalKeys] = js.native
    
    var genid: js.UndefOr[js.Function0[String]] = js.native
    
    var httpOnly: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var maxAge: js.UndefOr[Double | session] = js.native
    
    var overwrite: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var renew: js.UndefOr[Boolean] = js.native
    
    var rolling: js.UndefOr[Boolean] = js.native
    
    var sameSite: js.UndefOr[strict | lax | none | Boolean] = js.native
    
    var secure: js.UndefOr[Boolean] = js.native
    
    var secureProxy: js.UndefOr[Boolean] = js.native
    
    var signed: js.UndefOr[Boolean] = js.native
    
    var store: js.UndefOr[stores] = js.native
    
    var valid: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ PartialSession, Unit]] = js.native
  }
  object Partialopts {
    
    @scala.inline
    def apply(): Partialopts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialopts]
    }
    
    @scala.inline
    implicit class PartialoptsMutableBuilder[Self <: Partialopts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforeSave(value: (/* ctx */ Context, /* session */ Session) => Unit): Self = StObject.set(x, "beforeSave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeSaveUndefined: Self = StObject.set(x, "beforeSave", js.undefined)
      
      @scala.inline
      def setContextStore(value: Instantiable): Self = StObject.set(x, "ContextStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextStoreUndefined: Self = StObject.set(x, "ContextStore", js.undefined)
      
      @scala.inline
      def setDecode(value: /* str */ String => js.Object): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setEncode(value: /* obj */ js.Object => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      @scala.inline
      def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setExternalKey(value: ExternalKeys): Self = StObject.set(x, "externalKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalKeyUndefined: Self = StObject.set(x, "externalKey", js.undefined)
      
      @scala.inline
      def setGenid(value: () => String): Self = StObject.set(x, "genid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGenidUndefined: Self = StObject.set(x, "genid", js.undefined)
      
      @scala.inline
      def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double | session): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRenew(value: Boolean): Self = StObject.set(x, "renew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenewUndefined: Self = StObject.set(x, "renew", js.undefined)
      
      @scala.inline
      def setRolling(value: Boolean): Self = StObject.set(x, "rolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRollingUndefined: Self = StObject.set(x, "rolling", js.undefined)
      
      @scala.inline
      def setSameSite(value: strict | lax | none | Boolean): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProxy(value: Boolean): Self = StObject.set(x, "secureProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProxyUndefined: Self = StObject.set(x, "secureProxy", js.undefined)
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
      
      @scala.inline
      def setStore(value: stores): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setValid(value: (/* ctx */ Context, /* session */ PartialSession) => Unit): Self = StObject.set(x, "valid", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
  
  @js.native
  trait Rolling extends StObject {
    
    var rolling: js.UndefOr[Boolean] = js.native
  }
  object Rolling {
    
    @scala.inline
    def apply(): Rolling = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rolling]
    }
    
    @scala.inline
    implicit class RollingMutableBuilder[Self <: Rolling] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRolling(value: Boolean): Self = StObject.set(x, "rolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRollingUndefined: Self = StObject.set(x, "rolling", js.undefined)
    }
  }
}
