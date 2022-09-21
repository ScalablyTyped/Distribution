package typings.kdbxweb

import typings.kdbxweb.kdbxContextMod.KdbxContext
import typings.kdbxweb.kdbxUuidMod.KdbxUuid
import typings.kdbxweb.xmlUtilsMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kdbxDeletedObjectMod {
  
  @JSImport("kdbxweb/dist/types/format/kdbx-deleted-object", "KdbxDeletedObject")
  @js.native
  open class KdbxDeletedObject () extends StObject {
    
    var deletionTime: js.UndefOr[js.Date] = js.native
    
    /* private */ var readNode: Any = js.native
    
    var uuid: js.UndefOr[KdbxUuid] = js.native
    
    def write(parentNode: Node, ctx: KdbxContext): Unit = js.native
  }
  /* static members */
  object KdbxDeletedObject {
    
    @JSImport("kdbxweb/dist/types/format/kdbx-deleted-object", "KdbxDeletedObject")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(xmlNode: Node): KdbxDeletedObject = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any]).asInstanceOf[KdbxDeletedObject]
  }
}
