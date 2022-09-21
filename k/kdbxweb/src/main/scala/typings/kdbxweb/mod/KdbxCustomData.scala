package typings.kdbxweb.mod

import typings.kdbxweb.kdbxCustomDataMod.KdbxCustomDataMap
import typings.kdbxweb.xmlUtilsMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxCustomData")
@js.native
open class KdbxCustomData ()
  extends typings.kdbxweb.kdbxCustomDataMod.KdbxCustomData
/* static members */
object KdbxCustomData {
  
  @JSImport("kdbxweb", "KdbxCustomData")
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(node: Node): KdbxCustomDataMap = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(node.asInstanceOf[js.Any]).asInstanceOf[KdbxCustomDataMap]
  
  @JSImport("kdbxweb", "KdbxCustomData.readItem")
  @js.native
  def readItem: Any = js.native
  inline def readItem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readItem")(x.asInstanceOf[js.Any])
  
  inline def write(parentNode: Node, ctx: typings.kdbxweb.kdbxContextMod.KdbxContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(parentNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(parentNode: Node, ctx: typings.kdbxweb.kdbxContextMod.KdbxContext, customData: KdbxCustomDataMap): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(parentNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], customData.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
