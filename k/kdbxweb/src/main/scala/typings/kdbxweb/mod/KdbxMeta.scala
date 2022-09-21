package typings.kdbxweb.mod

import typings.kdbxweb.xmlUtilsMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxMeta")
@js.native
open class KdbxMeta ()
  extends typings.kdbxweb.kdbxMetaMod.KdbxMeta
/* static members */
object KdbxMeta {
  
  @JSImport("kdbxweb", "KdbxMeta")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new meta
    * @returns {KdbxMeta}
    */
  inline def create(): typings.kdbxweb.kdbxMetaMod.KdbxMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.kdbxweb.kdbxMetaMod.KdbxMeta]
  
  inline def read(xmlNode: Node, ctx: typings.kdbxweb.kdbxContextMod.KdbxContext): typings.kdbxweb.kdbxMetaMod.KdbxMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[typings.kdbxweb.kdbxMetaMod.KdbxMeta]
}
