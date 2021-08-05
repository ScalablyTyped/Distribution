package typings.libp2pGossipsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shuffleMod {
  
  @JSImport("libp2p-gossipsub/src/utils/shuffle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shuffle[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
