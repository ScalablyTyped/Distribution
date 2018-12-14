package typings
package hellojsLib.hellojsMod.helloNs

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

