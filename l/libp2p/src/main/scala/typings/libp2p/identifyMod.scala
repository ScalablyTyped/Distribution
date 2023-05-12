package typings.libp2p

import typings.libp2p.anon.TypeofIdentify
import typings.libp2p.distSrcIdentifyMod.IdentifyServiceComponents
import typings.libp2p.distSrcIdentifyMod.IdentifyServiceInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object identifyMod {
  
  @JSImport("libp2p/identify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Message {
    
    @JSImport("libp2p/identify", "Message")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libp2p/identify", "Message.Identify")
    @js.native
    def Identify: TypeofIdentify = js.native
    inline def Identify_=(x: TypeofIdentify): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Identify")(x.asInstanceOf[js.Any])
  }
  
  inline def identifyService(): js.Function1[/* components */ IdentifyServiceComponents, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("identifyService")().asInstanceOf[js.Function1[/* components */ IdentifyServiceComponents, js.Object]]
  inline def identifyService(init: IdentifyServiceInit): js.Function1[/* components */ IdentifyServiceComponents, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("identifyService")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ IdentifyServiceComponents, js.Object]]
  
  object multicodecs {
    
    @JSImport("libp2p/identify", "multicodecs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libp2p/identify", "multicodecs.IDENTIFY")
    @js.native
    def IDENTIFY: String = js.native
    inline def IDENTIFY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTIFY")(x.asInstanceOf[js.Any])
    
    @JSImport("libp2p/identify", "multicodecs.IDENTIFY_PUSH")
    @js.native
    def IDENTIFY_PUSH: String = js.native
    inline def IDENTIFY_PUSH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTIFY_PUSH")(x.asInstanceOf[js.Any])
  }
}
