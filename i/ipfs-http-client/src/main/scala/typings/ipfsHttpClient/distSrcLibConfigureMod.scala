package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcLibCoreMod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLibConfigureMod {
  
  @JSImport("ipfs-http-client/dist/src/lib/configure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configure[T](fn: Fn[T]): Factory[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(fn.asInstanceOf[js.Any]).asInstanceOf[Factory[T]]
  
  type Factory[T] = js.Function1[/* clientOptions */ Options, T]
  
  type Fn[T] = js.Function2[/* client */ Client, /* clientOptions */ Options, T]
  
  type Options = typings.ipfsHttpClient.distSrcTypesMod.Options
}
