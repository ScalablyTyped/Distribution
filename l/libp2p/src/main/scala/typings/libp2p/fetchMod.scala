package typings.libp2p

import typings.libp2p.distSrcFetchMod.FetchServiceComponents
import typings.libp2p.distSrcFetchMod.FetchServiceInit
import typings.libp2p.distSrcFetchMod.FetchService_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object fetchMod {
  
  @JSImport("libp2p/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchService(): js.Function1[/* components */ FetchServiceComponents, FetchService_] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchService")().asInstanceOf[js.Function1[/* components */ FetchServiceComponents, FetchService_]]
  inline def fetchService(init: FetchServiceInit): js.Function1[/* components */ FetchServiceComponents, FetchService_] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchService")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ FetchServiceComponents, FetchService_]]
}
