package typings.koaSession.anon

import typings.koa.mod.Context
import typings.koaSession.koaSessionStrings.lax
import typings.koaSession.koaSessionStrings.none
import typings.koaSession.koaSessionStrings.session
import typings.koaSession.koaSessionStrings.strict
import typings.koaSession.mod.ExternalKeys
import typings.koaSession.mod.Session
import typings.koaSession.mod.stores
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<koa-session.koa-session.opts> */
@js.native
trait Partialopts extends js.Object {
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
  implicit class PartialoptsOps[Self <: Partialopts] (val x: Self) extends AnyVal {
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
    def setContextStore(value: Instantiable): Self = this.set("ContextStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextStore: Self = this.set("ContextStore", js.undefined)
    @scala.inline
    def setBeforeSave(value: (/* ctx */ Context, /* session */ Session) => Unit): Self = this.set("beforeSave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeSave: Self = this.set("beforeSave", js.undefined)
    @scala.inline
    def setDecode(value: /* str */ String => js.Object): Self = this.set("decode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDecode: Self = this.set("decode", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setEncode(value: /* obj */ js.Object => String): Self = this.set("encode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    @scala.inline
    def setExpires(value: Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setExternalKey(value: ExternalKeys): Self = this.set("externalKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalKey: Self = this.set("externalKey", js.undefined)
    @scala.inline
    def setGenid(value: () => String): Self = this.set("genid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGenid: Self = this.set("genid", js.undefined)
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpOnly: Self = this.set("httpOnly", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMaxAge(value: Double | session): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setRenew(value: Boolean): Self = this.set("renew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenew: Self = this.set("renew", js.undefined)
    @scala.inline
    def setRolling(value: Boolean): Self = this.set("rolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRolling: Self = this.set("rolling", js.undefined)
    @scala.inline
    def setSameSite(value: strict | lax | none | Boolean): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSameSite: Self = this.set("sameSite", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setSecureProxy(value: Boolean): Self = this.set("secureProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureProxy: Self = this.set("secureProxy", js.undefined)
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
    @scala.inline
    def setStore(value: stores): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setValid(value: (/* ctx */ Context, /* session */ PartialSession) => Unit): Self = this.set("valid", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
  }
  
}

