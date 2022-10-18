package typings.kdbxweb.mod

import typings.kdbxweb.distTypesUtilsXmlUtilsMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxEntry")
@js.native
open class KdbxEntry ()
  extends typings.kdbxweb.distTypesFormatKdbxEntryMod.KdbxEntry
/* static members */
object KdbxEntry {
  
  @JSImport("kdbxweb", "KdbxEntry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    meta: typings.kdbxweb.distTypesFormatKdbxMetaMod.KdbxMeta,
    parentGroup: typings.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup
  ): typings.kdbxweb.distTypesFormatKdbxEntryMod.KdbxEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(meta.asInstanceOf[js.Any], parentGroup.asInstanceOf[js.Any])).asInstanceOf[typings.kdbxweb.distTypesFormatKdbxEntryMod.KdbxEntry]
  
  inline def read(xmlNode: Node, ctx: typings.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext): typings.kdbxweb.distTypesFormatKdbxEntryMod.KdbxEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[typings.kdbxweb.distTypesFormatKdbxEntryMod.KdbxEntry]
  inline def read(
    xmlNode: Node,
    ctx: typings.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext,
    parentGroup: typings.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup
  ): typings.kdbxweb.distTypesFormatKdbxEntryMod.KdbxEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], parentGroup.asInstanceOf[js.Any])).asInstanceOf[typings.kdbxweb.distTypesFormatKdbxEntryMod.KdbxEntry]
}
