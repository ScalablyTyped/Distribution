package typings.lifeomicAxiosFetch

import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosTransformer
import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lifeomic/axios-fetch", "buildAxiosFetch")
  @js.native
  def buildAxiosFetch(axios: AxiosInstance): js.Function2[/* url */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]] = js.native
  @JSImport("@lifeomic/axios-fetch", "buildAxiosFetch")
  @js.native
  def buildAxiosFetch(axios: AxiosInstance, transformer: AxiosTransformer): js.Function2[/* url */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]] = js.native
}
