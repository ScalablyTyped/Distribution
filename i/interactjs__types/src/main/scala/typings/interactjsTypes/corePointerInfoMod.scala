package typings.interactjsTypes

import typings.interactjsTypes.anon.Duration
import typings.interactjsTypes.coreTypesMod.PointerEventType
import typings.interactjsTypes.coreTypesMod.PointerType
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePointerInfoMod {
  
  @JSImport("@interactjs/core/PointerInfo", "PointerInfo")
  @js.native
  open class PointerInfo protected () extends StObject {
    def this(id: Double, pointer: PointerType, event: PointerEventType, downTime: Double, downTarget: Node) = this()
    
    var downTarget: Node = js.native
    
    var downTime: Double = js.native
    
    var event: PointerEventType = js.native
    
    var hold: js.UndefOr[Duration] = js.native
    
    var id: Double = js.native
    
    var pointer: PointerType = js.native
  }
}
