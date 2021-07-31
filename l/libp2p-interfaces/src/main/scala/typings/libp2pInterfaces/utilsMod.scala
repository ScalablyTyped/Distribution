package typings.libp2pInterfaces

import typings.std.Set
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("libp2p-interfaces/src/pubsub/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def anyMatch(a: js.Array[js.Any], b: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyMatch")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def anyMatch(a: js.Array[js.Any], b: Set[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyMatch")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def anyMatch(a: Set[js.Any], b: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyMatch")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def anyMatch(a: Set[js.Any], b: Set[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyMatch")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def ensureArray(maybeArray: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureArray")(maybeArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def msgId(from: String, seqno: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("msgId")(from.asInstanceOf[js.Any], seqno.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  @scala.inline
  def noSignMsgId(data: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("noSignMsgId")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  @scala.inline
  def normalizeInRpcMessage(message: js.Any, peerId: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeInRpcMessage")(message.asInstanceOf[js.Any], peerId.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def normalizeOutRpcMessage(message: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeOutRpcMessage")(message.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def randomSeqno(): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomSeqno")().asInstanceOf[Uint8Array]
}
