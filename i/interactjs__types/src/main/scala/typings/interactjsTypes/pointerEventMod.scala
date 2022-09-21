package typings.interactjsTypes

import typings.interactjsTypes.baseEventMod.BaseEvent
import typings.interactjsTypes.interactionMod.Interaction
import typings.interactjsTypes.typesMod.Point
import typings.interactjsTypes.typesMod.PointerEventType
import typings.interactjsTypes.typesMod.PointerType
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerEventMod {
  
  @JSImport("@interactjs/pointer-events/PointerEvent", JSImport.Default)
  @js.native
  open class default[T /* <: String */] protected () extends PointerEvent[T] {
    def this(
      `type`: T,
      pointer: PointerEvent[Any],
      event: PointerEventType,
      eventTarget: Node,
      interaction: Interaction[scala.Nothing],
      timeStamp: Double
    ) = this()
    /** */
    def this(
      `type`: T,
      pointer: PointerType,
      event: PointerEventType,
      eventTarget: Node,
      interaction: Interaction[scala.Nothing],
      timeStamp: Double
    ) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @JSImport("@interactjs/pointer-events/PointerEvent", "PointerEvent")
  @js.native
  open class PointerEvent[T /* <: String */] protected ()
    extends BaseEvent[scala.Nothing] {
    def this(
      `type`: T,
      pointer: PointerEvent[Any],
      event: PointerEventType,
      eventTarget: Node,
      interaction: Interaction[scala.Nothing],
      timeStamp: Double
    ) = this()
    /** */
    def this(
      `type`: T,
      pointer: PointerType,
      event: PointerEventType,
      eventTarget: Node,
      interaction: Interaction[scala.Nothing],
      timeStamp: Double
    ) = this()
    
    def _addOrigin(hasOriginXOriginY: Point): this.type = js.native
    
    def _subtractOrigin(hasOriginXOriginY: Point): this.type = js.native
    
    var clientX: Double = js.native
    
    var clientY: Double = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var double: Boolean = js.native
    
    var dt: Double = js.native
    
    var eventable: Any = js.native
    
    var originalEvent: PointerEventType = js.native
    
    var pageX: Double = js.native
    
    var pageY: Double = js.native
    
    var pointerId: Double = js.native
    
    var pointerType: String = js.native
    
    @JSName("type")
    var type_PointerEvent: T = js.native
  }
}
