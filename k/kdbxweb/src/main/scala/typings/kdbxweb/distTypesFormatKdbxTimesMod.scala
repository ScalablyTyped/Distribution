package typings.kdbxweb

import typings.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext
import typings.kdbxweb.distTypesUtilsXmlUtilsMod.global.Node
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormatKdbxTimesMod {
  
  @JSImport("kdbxweb/dist/types/format/kdbx-times", "KdbxTimes")
  @js.native
  open class KdbxTimes () extends StObject {
    
    var creationTime: js.UndefOr[js.Date] = js.native
    
    var expires: js.UndefOr[Boolean | Null] = js.native
    
    var expiryTime: js.UndefOr[js.Date] = js.native
    
    var lastAccessTime: js.UndefOr[js.Date] = js.native
    
    var lastModTime: js.UndefOr[js.Date] = js.native
    
    var locationChanged: js.UndefOr[js.Date] = js.native
    
    /* private */ var readNode: Any = js.native
    
    def update(): Unit = js.native
    
    var usageCount: js.UndefOr[Double] = js.native
    
    def write(parentNode: Element, ctx: KdbxContext): Unit = js.native
  }
  /* static members */
  object KdbxTimes {
    
    @JSImport("kdbxweb/dist/types/format/kdbx-times", "KdbxTimes")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): KdbxTimes = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[KdbxTimes]
    
    inline def read(xmlNode: Node): KdbxTimes = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any]).asInstanceOf[KdbxTimes]
  }
}
