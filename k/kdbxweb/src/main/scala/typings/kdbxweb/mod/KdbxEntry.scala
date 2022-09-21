package typings.kdbxweb.mod

import typings.kdbxweb.xmlUtilsMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxEntry")
@js.native
open class KdbxEntry ()
  extends typings.kdbxweb.kdbxEntryMod.KdbxEntry
/* static members */
object KdbxEntry {
  
  @JSImport("kdbxweb", "KdbxEntry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(meta: typings.kdbxweb.kdbxMetaMod.KdbxMeta, parentGroup: typings.kdbxweb.kdbxGroupMod.KdbxGroup): typings.kdbxweb.kdbxEntryMod.KdbxEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(meta.asInstanceOf[js.Any], parentGroup.asInstanceOf[js.Any])).asInstanceOf[typings.kdbxweb.kdbxEntryMod.KdbxEntry]
  
  inline def read(xmlNode: Node, ctx: typings.kdbxweb.kdbxContextMod.KdbxContext): typings.kdbxweb.kdbxEntryMod.KdbxEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[typings.kdbxweb.kdbxEntryMod.KdbxEntry]
  inline def read(
    xmlNode: Node,
    ctx: typings.kdbxweb.kdbxContextMod.KdbxContext,
    parentGroup: typings.kdbxweb.kdbxGroupMod.KdbxGroup
  ): typings.kdbxweb.kdbxEntryMod.KdbxEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], parentGroup.asInstanceOf[js.Any])).asInstanceOf[typings.kdbxweb.kdbxEntryMod.KdbxEntry]
}
