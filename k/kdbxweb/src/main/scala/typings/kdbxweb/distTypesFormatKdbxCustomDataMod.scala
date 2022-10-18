package typings.kdbxweb

import typings.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext
import typings.kdbxweb.distTypesUtilsXmlUtilsMod.global.Node
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormatKdbxCustomDataMod {
  
  @JSImport("kdbxweb/dist/types/format/kdbx-custom-data", "KdbxCustomData")
  @js.native
  open class KdbxCustomData () extends StObject
  /* static members */
  object KdbxCustomData {
    
    @JSImport("kdbxweb/dist/types/format/kdbx-custom-data", "KdbxCustomData")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(node: Node): KdbxCustomDataMap = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(node.asInstanceOf[js.Any]).asInstanceOf[KdbxCustomDataMap]
    
    @JSImport("kdbxweb/dist/types/format/kdbx-custom-data", "KdbxCustomData.readItem")
    @js.native
    def readItem: Any = js.native
    inline def readItem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readItem")(x.asInstanceOf[js.Any])
    
    inline def write(parentNode: Node, ctx: KdbxContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(parentNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def write(parentNode: Node, ctx: KdbxContext, customData: KdbxCustomDataMap): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(parentNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], customData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait KdbxCustomDataItem extends StObject {
    
    var lastModified: js.UndefOr[js.Date] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object KdbxCustomDataItem {
    
    inline def apply(): KdbxCustomDataItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KdbxCustomDataItem]
    }
    
    extension [Self <: KdbxCustomDataItem](x: Self) {
      
      inline def setLastModified(value: js.Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type KdbxCustomDataMap = Map[String, KdbxCustomDataItem]
}
