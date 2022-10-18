package typings.libp2pUtils

import typings.libp2pInterfaceConnection.mod.MultiaddrConnection
import typings.libp2pUtils.distSrcStreamToMaConnMod.StreamOptions
import typings.libp2pUtils.distSrcStreamToMaConnMod.StreamProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object streamToMaConnMod {
  
  @JSImport("@libp2p/utils/stream-to-ma-conn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def streamToMaConnection(props: StreamProperties): MultiaddrConnection = ^.asInstanceOf[js.Dynamic].applyDynamic("streamToMaConnection")(props.asInstanceOf[js.Any]).asInstanceOf[MultiaddrConnection]
  inline def streamToMaConnection(props: StreamProperties, options: StreamOptions): MultiaddrConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("streamToMaConnection")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MultiaddrConnection]
}
