package typings.kdbxweb.mod

import typings.kdbxweb.xmlUtilsMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxGroup")
@js.native
open class KdbxGroup ()
  extends typings.kdbxweb.kdbxGroupMod.KdbxGroup
/* static members */
object KdbxGroup {
  
  @JSImport("kdbxweb", "KdbxGroup")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(name: String): typings.kdbxweb.kdbxGroupMod.KdbxGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[typings.kdbxweb.kdbxGroupMod.KdbxGroup]
  inline def create(name: String, parentGroup: typings.kdbxweb.kdbxGroupMod.KdbxGroup): typings.kdbxweb.kdbxGroupMod.KdbxGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], parentGroup.asInstanceOf[js.Any])).asInstanceOf[typings.kdbxweb.kdbxGroupMod.KdbxGroup]
  
  /**
    * Finds a best place to insert new item into collection
    */
  @JSImport("kdbxweb", "KdbxGroup.findInsertIx")
  @js.native
  def findInsertIx: Any = js.native
  inline def findInsertIx_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findInsertIx")(x.asInstanceOf[js.Any])
  
  inline def read(xmlNode: Node, ctx: typings.kdbxweb.kdbxContextMod.KdbxContext): typings.kdbxweb.kdbxGroupMod.KdbxGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[typings.kdbxweb.kdbxGroupMod.KdbxGroup]
  inline def read(
    xmlNode: Node,
    ctx: typings.kdbxweb.kdbxContextMod.KdbxContext,
    parentGroup: typings.kdbxweb.kdbxGroupMod.KdbxGroup
  ): typings.kdbxweb.kdbxGroupMod.KdbxGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], parentGroup.asInstanceOf[js.Any])).asInstanceOf[typings.kdbxweb.kdbxGroupMod.KdbxGroup]
}
