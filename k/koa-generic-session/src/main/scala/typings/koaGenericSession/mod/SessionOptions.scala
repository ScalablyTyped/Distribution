package typings.koaGenericSession.mod

import typings.koa.mod.Context
import typings.koaGenericSession.anon.HttpOnly
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionOptions extends js.Object {
  
  var allowEmpty: js.UndefOr[Boolean] = js.native
  
  var beforeSave: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Unit]] = js.native
  
  var cookie: js.UndefOr[HttpOnly] = js.native
  
  var defer: js.UndefOr[Boolean] = js.native
  
  var errorHandler: js.UndefOr[js.Function3[/* error */ Error, /* type */ String, /* ctx */ Context, Unit]] = js.native
  
  var genSid: js.UndefOr[js.Function1[/* length */ Double, String]] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var reconnectTimeout: js.UndefOr[Double] = js.native
  
  var rolling: js.UndefOr[Boolean] = js.native
  
  var sessionIdStore: js.UndefOr[SessionIdStore] = js.native
  
  var store: js.UndefOr[SessionStore] = js.native
  
  var ttl: js.UndefOr[Double] = js.native
  
  var valid: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Boolean]] = js.native
}
object SessionOptions {
  
  @scala.inline
  def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  
  @scala.inline
  implicit class SessionOptionsOps[Self <: SessionOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    
    @scala.inline
    def setBeforeSave(value: (/* ctx */ Context, /* session */ Session) => Unit): Self = this.set("beforeSave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeSave: Self = this.set("beforeSave", js.undefined)
    
    @scala.inline
    def setCookie(value: HttpOnly): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    
    @scala.inline
    def setErrorHandler(value: (/* error */ Error, /* type */ String, /* ctx */ Context) => Unit): Self = this.set("errorHandler", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setGenSid(value: /* length */ Double => String): Self = this.set("genSid", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGenSid: Self = this.set("genSid", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setReconnectTimeout(value: Double): Self = this.set("reconnectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectTimeout: Self = this.set("reconnectTimeout", js.undefined)
    
    @scala.inline
    def setRolling(value: Boolean): Self = this.set("rolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRolling: Self = this.set("rolling", js.undefined)
    
    @scala.inline
    def setSessionIdStore(value: SessionIdStore): Self = this.set("sessionIdStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionIdStore: Self = this.set("sessionIdStore", js.undefined)
    
    @scala.inline
    def setStore(value: SessionStore): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    
    @scala.inline
    def setValid(value: (/* ctx */ Context, /* session */ Session) => Boolean): Self = this.set("valid", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
  }
}
