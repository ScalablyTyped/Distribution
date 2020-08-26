package typings.hellojs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelloJSServiceDef extends js.Object {
  var base: js.UndefOr[String] = js.native
  var del: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
  var form: js.UndefOr[(js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]) | Boolean] = js.native
  var get: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
  var jsonp: js.UndefOr[(js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]) | Boolean] = js.native
  var login: js.UndefOr[js.Function1[/* p */ js.Any, Unit]] = js.native
  var logout: js.UndefOr[(js.Function1[/* callback */ js.Function0[Unit | String], Unit]) | String] = js.native
  var name: js.UndefOr[String] = js.native
  var oauth: HelloJSOAuth2Def | HelloJSOAuth1Def = js.native
  var patch: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
  var post: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
  var put: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
  var refresh: js.UndefOr[Boolean] = js.native
  var root: js.UndefOr[String] = js.native
  var scope: js.UndefOr[StringDictionary[String]] = js.native
  var scope_delim: js.UndefOr[String] = js.native
  var wrap: js.UndefOr[
    StringDictionary[js.Function3[/* r */ js.Any, /* headers */ js.Any, /* p */ js.Any, Unit]]
  ] = js.native
  var xhr: js.UndefOr[js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]] = js.native
}

object HelloJSServiceDef {
  @scala.inline
  def apply(oauth: HelloJSOAuth2Def | HelloJSOAuth1Def): HelloJSServiceDef = {
    val __obj = js.Dynamic.literal(oauth = oauth.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSServiceDef]
  }
  @scala.inline
  implicit class HelloJSServiceDefOps[Self <: HelloJSServiceDef] (val x: Self) extends AnyVal {
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
    def setOauth(value: HelloJSOAuth2Def | HelloJSOAuth1Def): Self = this.set("oauth", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setDel(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = this.set("del", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDel: Self = this.set("del", js.undefined)
    @scala.inline
    def setFormFunction2(value: (/* p */ js.Any, /* query */ js.Any) => Unit): Self = this.set("form", js.Any.fromFunction2(value))
    @scala.inline
    def setForm(value: (js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]) | Boolean): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setGet(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setJsonpFunction2(value: (/* p */ js.Any, /* query */ js.Any) => Unit): Self = this.set("jsonp", js.Any.fromFunction2(value))
    @scala.inline
    def setJsonp(value: (js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]) | Boolean): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    @scala.inline
    def setLogin(value: /* p */ js.Any => Unit): Self = this.set("login", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLogin: Self = this.set("login", js.undefined)
    @scala.inline
    def setLogoutFunction1(value: /* callback */ js.Function0[Unit | String] => Unit): Self = this.set("logout", js.Any.fromFunction1(value))
    @scala.inline
    def setLogout(value: (js.Function1[/* callback */ js.Function0[Unit | String], Unit]) | String): Self = this.set("logout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogout: Self = this.set("logout", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPatch(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = this.set("patch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
    @scala.inline
    def setPost(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = this.set("post", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    @scala.inline
    def setPut(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = this.set("put", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePut: Self = this.set("put", js.undefined)
    @scala.inline
    def setRefresh(value: Boolean): Self = this.set("refresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setScope(value: StringDictionary[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setScope_delim(value: String): Self = this.set("scope_delim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope_delim: Self = this.set("scope_delim", js.undefined)
    @scala.inline
    def setWrap(value: StringDictionary[js.Function3[/* r */ js.Any, /* headers */ js.Any, /* p */ js.Any, Unit]]): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
    @scala.inline
    def setXhr(value: (/* p */ js.Any, /* query */ js.Any) => Unit): Self = this.set("xhr", js.Any.fromFunction2(value))
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
  
}

