package typings.lifeomicAxiosFetch

import typings.lifeomicAxiosFetch.anon.Href
import typings.std.Headers
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTypeUtilsMod {
  
  @JSImport("@lifeomic/axios-fetch/src/typeUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAxiosHeaders(): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAxiosHeaders")().asInstanceOf[Record[String, String]]
  inline def createAxiosHeaders(headers: HeadersLike): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAxiosHeaders")(headers.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  inline def createFetchHeaders(): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFetchHeaders")().asInstanceOf[js.Array[js.Array[String]]]
  inline def createFetchHeaders(axiosHeaders: Record[String, String]): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFetchHeaders")(axiosHeaders.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  
  inline def getUrl(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")().asInstanceOf[js.UndefOr[String]]
  inline def getUrl(input: UrlLike): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  type HeadersLike = js.Array[js.Array[String]] | (Record[String, js.UndefOr[String]]) | Headers | typings.nodeFetch.mod.Headers
  
  type UrlLike = String | Href
}
