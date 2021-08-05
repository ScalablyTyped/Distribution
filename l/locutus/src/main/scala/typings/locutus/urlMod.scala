package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("locutus/php/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def base64Decode(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_decode")().asInstanceOf[js.Any]
  inline def base64Decode(encodedData: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_decode")(encodedData.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def base64Encode(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_encode")().asInstanceOf[js.Any]
  inline def base64Encode(stringToEncode: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_encode")(stringToEncode.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def httpBuildQuery(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")().asInstanceOf[js.Any]
  inline def httpBuildQuery(formdata: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")(formdata.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def httpBuildQuery(formdata: js.Any, numericPrefix: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")(formdata.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def httpBuildQuery(formdata: js.Any, numericPrefix: js.Any, argSeparator: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")(formdata.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any], argSeparator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def httpBuildQuery(formdata: js.Any, numericPrefix: Unit, argSeparator: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")(formdata.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any], argSeparator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def httpBuildQuery(formdata: Unit, numericPrefix: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")(formdata.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def httpBuildQuery(formdata: Unit, numericPrefix: js.Any, argSeparator: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")(formdata.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any], argSeparator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def httpBuildQuery(formdata: Unit, numericPrefix: Unit, argSeparator: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")(formdata.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any], argSeparator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def parseUrl(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_url")().asInstanceOf[js.Any]
  inline def parseUrl(str: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_url")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def parseUrl(str: js.Any, component: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse_url")(str.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def parseUrl(str: Unit, component: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse_url")(str.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def rawurldecode(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rawurldecode")().asInstanceOf[js.Any]
  inline def rawurldecode(str: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rawurldecode")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def rawurlencode(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rawurlencode")().asInstanceOf[js.Any]
  inline def rawurlencode(str: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rawurlencode")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def urldecode(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("urldecode")().asInstanceOf[js.Any]
  inline def urldecode(str: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("urldecode")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def urlencode(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("urlencode")().asInstanceOf[js.Any]
  inline def urlencode(str: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("urlencode")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
