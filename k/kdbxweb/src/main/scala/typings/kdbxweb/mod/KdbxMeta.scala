package typings.kdbxweb.mod

import typings.kdbxweb.distTypesUtilsXmlUtilsMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxMeta")
@js.native
open class KdbxMeta ()
  extends typings.kdbxweb.distTypesFormatKdbxMetaMod.KdbxMeta
/* static members */
object KdbxMeta {
  
  @JSImport("kdbxweb", "KdbxMeta")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new meta
    * @returns {KdbxMeta}
    */
  inline def create(): typings.kdbxweb.distTypesFormatKdbxMetaMod.KdbxMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.kdbxweb.distTypesFormatKdbxMetaMod.KdbxMeta]
  
  inline def read(xmlNode: Node, ctx: typings.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext): typings.kdbxweb.distTypesFormatKdbxMetaMod.KdbxMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[typings.kdbxweb.distTypesFormatKdbxMetaMod.KdbxMeta]
}
