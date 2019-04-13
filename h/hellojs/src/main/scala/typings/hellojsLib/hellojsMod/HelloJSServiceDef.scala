package typings
package hellojsLib.hellojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSServiceDef extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
  var del: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | HelloJSUrlMappingFunction]
  ] = js.undefined
  var form: js.UndefOr[(js.Function2[/* p */ js.Any, /* query */ js.Any, scala.Unit]) | scala.Boolean] = js.undefined
  var get: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | HelloJSUrlMappingFunction]
  ] = js.undefined
  var jsonp: js.UndefOr[(js.Function2[/* p */ js.Any, /* query */ js.Any, scala.Unit]) | scala.Boolean] = js.undefined
  var login: js.UndefOr[js.Function1[/* p */ js.Any, scala.Unit]] = js.undefined
  var logout: js.UndefOr[
    (js.Function1[/* callback */ js.Function0[scala.Unit | java.lang.String], scala.Unit]) | java.lang.String
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var oauth: HelloJSOAuth2Def | HelloJSOAuth1Def
  var patch: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | HelloJSUrlMappingFunction]
  ] = js.undefined
  var post: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | HelloJSUrlMappingFunction]
  ] = js.undefined
  var put: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | HelloJSUrlMappingFunction]
  ] = js.undefined
  var refresh: js.UndefOr[scala.Boolean] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var scope_delim: js.UndefOr[java.lang.String] = js.undefined
  var wrap: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Function3[/* r */ js.Any, /* headers */ js.Any, /* p */ js.Any, scala.Unit]]
  ] = js.undefined
  var xhr: js.UndefOr[js.Function2[/* p */ js.Any, /* query */ js.Any, scala.Unit]] = js.undefined
}

object HelloJSServiceDef {
  @scala.inline
  def apply(
    oauth: HelloJSOAuth2Def | HelloJSOAuth1Def,
    base: java.lang.String = null,
    del: org.scalablytyped.runtime.StringDictionary[java.lang.String | HelloJSUrlMappingFunction] = null,
    form: (js.Function2[/* p */ js.Any, /* query */ js.Any, scala.Unit]) | scala.Boolean = null,
    get: org.scalablytyped.runtime.StringDictionary[java.lang.String | HelloJSUrlMappingFunction] = null,
    jsonp: (js.Function2[/* p */ js.Any, /* query */ js.Any, scala.Unit]) | scala.Boolean = null,
    login: /* p */ js.Any => scala.Unit = null,
    logout: (js.Function1[/* callback */ js.Function0[scala.Unit | java.lang.String], scala.Unit]) | java.lang.String = null,
    name: java.lang.String = null,
    patch: org.scalablytyped.runtime.StringDictionary[java.lang.String | HelloJSUrlMappingFunction] = null,
    post: org.scalablytyped.runtime.StringDictionary[java.lang.String | HelloJSUrlMappingFunction] = null,
    put: org.scalablytyped.runtime.StringDictionary[java.lang.String | HelloJSUrlMappingFunction] = null,
    refresh: js.UndefOr[scala.Boolean] = js.undefined,
    root: java.lang.String = null,
    scope: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    scope_delim: java.lang.String = null,
    wrap: org.scalablytyped.runtime.StringDictionary[js.Function3[/* r */ js.Any, /* headers */ js.Any, /* p */ js.Any, scala.Unit]] = null,
    xhr: (/* p */ js.Any, /* query */ js.Any) => scala.Unit = null
  ): HelloJSServiceDef = {
    val __obj = js.Dynamic.literal(oauth = oauth.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base)
    if (del != null) __obj.updateDynamic("del")(del)
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get)
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (login != null) __obj.updateDynamic("login")(js.Any.fromFunction1(login))
    if (logout != null) __obj.updateDynamic("logout")(logout.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (patch != null) __obj.updateDynamic("patch")(patch)
    if (post != null) __obj.updateDynamic("post")(post)
    if (put != null) __obj.updateDynamic("put")(put)
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh)
    if (root != null) __obj.updateDynamic("root")(root)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (scope_delim != null) __obj.updateDynamic("scope_delim")(scope_delim)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    if (xhr != null) __obj.updateDynamic("xhr")(js.Any.fromFunction2(xhr))
    __obj.asInstanceOf[HelloJSServiceDef]
  }
}

