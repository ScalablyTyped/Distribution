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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Changed extends StObject {
    
    var changed: Boolean
    
    var rolling: js.UndefOr[Boolean] = js.undefined
  }
  object Changed {
    
    inline def apply(changed: Boolean): Changed = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Changed]
    }
    
    extension [Self <: Changed](x: Self) {
      
      inline def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setRolling(value: Boolean): Self = StObject.set(x, "rolling", value.asInstanceOf[js.Any])
      
      inline def setRollingUndefined: Self = StObject.set(x, "rolling", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* ctx */ Context, stores]
  
  /* Inlined std.Partial<koa-session.koa-session.Session> */
  trait PartialSession extends StObject {
    
    var inspect: js.UndefOr[js.Function0[js.Object]] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var maxAge: js.UndefOr[Double | session] = js.undefined
    
    var populated: js.UndefOr[Boolean] = js.undefined
    
    var save: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var toJSON: js.UndefOr[js.Function0[js.Object]] = js.undefined
  }
  object PartialSession {
    
    inline def apply(): PartialSession = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSession]
    }
    
    extension [Self <: PartialSession](x: Self) {
      
      inline def setInspect(value: () => js.Object): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      inline def setInspectUndefined: Self = StObject.set(x, "inspect", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMaxAge(value: Double | session): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPopulated(value: Boolean): Self = StObject.set(x, "populated", value.asInstanceOf[js.Any])
      
      inline def setPopulatedUndefined: Self = StObject.set(x, "populated", js.undefined)
      
      inline def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    }
  }
  
  /* Inlined std.Partial<koa-session.koa-session.Session> & {  _expire :number | undefined,   _maxAge :number | undefined} */
  trait PartialSessionexpirenumbe extends StObject {
    
    var _expire: js.UndefOr[Double] = js.undefined
    
    var _maxAge: js.UndefOr[Double] = js.undefined
    
    var inspect: js.UndefOr[js.Function0[js.Object]] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var maxAge: js.UndefOr[Double | session] = js.undefined
    
    var populated: js.UndefOr[Boolean] = js.undefined
    
    var save: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var toJSON: js.UndefOr[js.Function0[js.Object]] = js.undefined
  }
  object PartialSessionexpirenumbe {
    
    inline def apply(): PartialSessionexpirenumbe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSessionexpirenumbe]
    }
    
    extension [Self <: PartialSessionexpirenumbe](x: Self) {
      
      inline def setInspect(value: () => js.Object): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      inline def setInspectUndefined: Self = StObject.set(x, "inspect", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMaxAge(value: Double | session): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPopulated(value: Boolean): Self = StObject.set(x, "populated", value.asInstanceOf[js.Any])
      
      inline def setPopulatedUndefined: Self = StObject.set(x, "populated", js.undefined)
      
      inline def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
      
      inline def set_expire(value: Double): Self = StObject.set(x, "_expire", value.asInstanceOf[js.Any])
      
      inline def set_expireUndefined: Self = StObject.set(x, "_expire", js.undefined)
      
      inline def set_maxAge(value: Double): Self = StObject.set(x, "_maxAge", value.asInstanceOf[js.Any])
      
      inline def set_maxAgeUndefined: Self = StObject.set(x, "_maxAge", js.undefined)
    }
  }
  
  /* Inlined std.Partial<koa-session.koa-session.opts> */
  trait Partialopts extends StObject {
    
    var ContextStore: js.UndefOr[Instantiable] = js.undefined
    
    var beforeSave: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Unit]] = js.undefined
    
    var decode: js.UndefOr[js.Function1[/* str */ String, js.Object]] = js.undefined
    
    var domain: js.UndefOr[String] = js.undefined
    
    var encode: js.UndefOr[js.Function1[/* obj */ js.Object, String]] = js.undefined
    
    var expires: js.UndefOr[Date] = js.undefined
    
    var externalKey: js.UndefOr[ExternalKeys] = js.undefined
    
    var genid: js.UndefOr[js.Function0[String]] = js.undefined
    
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var maxAge: js.UndefOr[Double | session] = js.undefined
    
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var renew: js.UndefOr[Boolean] = js.undefined
    
    var rolling: js.UndefOr[Boolean] = js.undefined
    
    var sameSite: js.UndefOr[strict | lax | none | Boolean] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var secureProxy: js.UndefOr[Boolean] = js.undefined
    
    var signed: js.UndefOr[Boolean] = js.undefined
    
    var store: js.UndefOr[stores] = js.undefined
    
    var valid: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ PartialSession, Unit]] = js.undefined
  }
  object Partialopts {
    
    inline def apply(): Partialopts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialopts]
    }
    
    extension [Self <: Partialopts](x: Self) {
      
      inline def setBeforeSave(value: (/* ctx */ Context, /* session */ Session) => Unit): Self = StObject.set(x, "beforeSave", js.Any.fromFunction2(value))
      
      inline def setBeforeSaveUndefined: Self = StObject.set(x, "beforeSave", js.undefined)
      
      inline def setContextStore(value: Instantiable): Self = StObject.set(x, "ContextStore", value.asInstanceOf[js.Any])
      
      inline def setContextStoreUndefined: Self = StObject.set(x, "ContextStore", js.undefined)
      
      inline def setDecode(value: /* str */ String => js.Object): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEncode(value: /* obj */ js.Object => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setExternalKey(value: ExternalKeys): Self = StObject.set(x, "externalKey", value.asInstanceOf[js.Any])
      
      inline def setExternalKeyUndefined: Self = StObject.set(x, "externalKey", js.undefined)
      
      inline def setGenid(value: () => String): Self = StObject.set(x, "genid", js.Any.fromFunction0(value))
      
      inline def setGenidUndefined: Self = StObject.set(x, "genid", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMaxAge(value: Double | session): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRenew(value: Boolean): Self = StObject.set(x, "renew", value.asInstanceOf[js.Any])
      
      inline def setRenewUndefined: Self = StObject.set(x, "renew", js.undefined)
      
      inline def setRolling(value: Boolean): Self = StObject.set(x, "rolling", value.asInstanceOf[js.Any])
      
      inline def setRollingUndefined: Self = StObject.set(x, "rolling", js.undefined)
      
      inline def setSameSite(value: strict | lax | none | Boolean): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureProxy(value: Boolean): Self = StObject.set(x, "secureProxy", value.asInstanceOf[js.Any])
      
      inline def setSecureProxyUndefined: Self = StObject.set(x, "secureProxy", js.undefined)
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
      
      inline def setStore(value: stores): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setValid(value: (/* ctx */ Context, /* session */ PartialSession) => Unit): Self = StObject.set(x, "valid", js.Any.fromFunction2(value))
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
  
  trait Rolling extends StObject {
    
    var rolling: js.UndefOr[Boolean] = js.undefined
  }
  object Rolling {
    
    inline def apply(): Rolling = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rolling]
    }
    
    extension [Self <: Rolling](x: Self) {
      
      inline def setRolling(value: Boolean): Self = StObject.set(x, "rolling", value.asInstanceOf[js.Any])
      
      inline def setRollingUndefined: Self = StObject.set(x, "rolling", js.undefined)
    }
  }
}
