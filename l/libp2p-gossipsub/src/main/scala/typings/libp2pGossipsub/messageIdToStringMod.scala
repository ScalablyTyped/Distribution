package typings.libp2pGossipsub

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageIdToStringMod {
  
  @JSImport("libp2p-gossipsub/src/utils/messageIdToString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def messageIdToString(msgId: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("messageIdToString")(msgId.asInstanceOf[js.Any]).asInstanceOf[String]
}
