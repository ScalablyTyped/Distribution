package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("locutus/php/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def base64Decode(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_decode")().asInstanceOf[Any]
  inline def base64Decode(encodedData: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_decode")(encodedData.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def base64Encode(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_encode")().asInstanceOf[Any]
  inline def base64Encode(stringToEncode: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_encode")(stringToEncode.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def httpBuildQuery(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")().asInstanceOf[Any]
  inline def httpBuildQuery(formdata: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")(formdata.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def httpBuildQuery(formdata: Any, numericPrefix: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")(formdata.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def httpBuildQuery(formdata: Any, numericPrefix: Any, argSeparator: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")(formdata.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any], argSeparator.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def httpBuildQuery(formdata: Any, numericPrefix: Unit, argSeparator: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")(formdata.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any], argSeparator.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def httpBuildQuery(formdata: Unit, numericPrefix: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")(formdata.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def httpBuildQuery(formdata: Unit, numericPrefix: Any, argSeparator: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")(formdata.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any], argSeparator.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def httpBuildQuery(formdata: Unit, numericPrefix: Unit, argSeparator: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("http_build_query")(formdata.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any], argSeparator.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseUrl(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_url")().asInstanceOf[Any]
  inline def parseUrl(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_url")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parseUrl(str: Any, component: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse_url")(str.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parseUrl(str: Unit, component: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse_url")(str.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def rawurldecode(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rawurldecode")().asInstanceOf[Any]
  inline def rawurldecode(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rawurldecode")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def rawurlencode(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rawurlencode")().asInstanceOf[Any]
  inline def rawurlencode(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rawurlencode")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def urldecode(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("urldecode")().asInstanceOf[Any]
  inline def urldecode(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("urldecode")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def urlencode(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("urlencode")().asInstanceOf[Any]
  inline def urlencode(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("urlencode")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
}
