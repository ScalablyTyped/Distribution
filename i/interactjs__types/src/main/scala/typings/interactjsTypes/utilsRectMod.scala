package typings.interactjsTypes

import typings.interactjsTypes.anon.PartialRectPoint
import typings.interactjsTypes.anon.RectPartialPoint
import typings.interactjsTypes.anon.RequiredRectPoint
import typings.interactjsTypes.anon.X
import typings.interactjsTypes.coreTypesMod.EdgeOptions
import typings.interactjsTypes.coreTypesMod.HasGetRect
import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.coreTypesMod.Rect
import typings.interactjsTypes.coreTypesMod.RectResolvable
import typings.std.Node
import typings.std.ParentNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsRectMod {
  
  @JSImport("@interactjs/utils/rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEdges(edges: EdgeOptions, rect: Rect, delta: Point): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEdges")(edges.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getStringOptionResult(value: Any, target: HasGetRect, element: Node): ParentNode | Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringOptionResult")(value.asInstanceOf[js.Any], target.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[ParentNode | Rect]
  
  inline def rectToXY(rect: Point): X = ^.asInstanceOf[js.Dynamic].applyDynamic("rectToXY")(rect.asInstanceOf[js.Any]).asInstanceOf[X]
  inline def rectToXY(rect: Rect): X = ^.asInstanceOf[js.Dynamic].applyDynamic("rectToXY")(rect.asInstanceOf[js.Any]).asInstanceOf[X]
  
  inline def resolveRectLike[T /* <: js.Array[Any] */](value: RectResolvable[T]): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRectLike")(value.asInstanceOf[js.Any]).asInstanceOf[Rect]
  inline def resolveRectLike[T /* <: js.Array[Any] */](value: RectResolvable[T], target: Unit, element: Unit, functionArgs: T): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRectLike")(value.asInstanceOf[js.Any], target.asInstanceOf[js.Any], element.asInstanceOf[js.Any], functionArgs.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def resolveRectLike[T /* <: js.Array[Any] */](value: RectResolvable[T], target: Unit, element: Node): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRectLike")(value.asInstanceOf[js.Any], target.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def resolveRectLike[T /* <: js.Array[Any] */](value: RectResolvable[T], target: Unit, element: Node, functionArgs: T): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRectLike")(value.asInstanceOf[js.Any], target.asInstanceOf[js.Any], element.asInstanceOf[js.Any], functionArgs.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def resolveRectLike[T /* <: js.Array[Any] */](value: RectResolvable[T], target: HasGetRect): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRectLike")(value.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def resolveRectLike[T /* <: js.Array[Any] */](value: RectResolvable[T], target: HasGetRect, element: Unit, functionArgs: T): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRectLike")(value.asInstanceOf[js.Any], target.asInstanceOf[js.Any], element.asInstanceOf[js.Any], functionArgs.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def resolveRectLike[T /* <: js.Array[Any] */](value: RectResolvable[T], target: HasGetRect, element: Node): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRectLike")(value.asInstanceOf[js.Any], target.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def resolveRectLike[T /* <: js.Array[Any] */](value: RectResolvable[T], target: HasGetRect, element: Node, functionArgs: T): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRectLike")(value.asInstanceOf[js.Any], target.asInstanceOf[js.Any], element.asInstanceOf[js.Any], functionArgs.asInstanceOf[js.Any])).asInstanceOf[Rect]
  
  inline def tlbrToXywh(rect: RectPartialPoint): RequiredRectPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("tlbrToXywh")(rect.asInstanceOf[js.Any]).asInstanceOf[RequiredRectPoint]
  
  inline def xywhToTlbr[T /* <: PartialRectPoint */](rect: T): Rect & T = ^.asInstanceOf[js.Dynamic].applyDynamic("xywhToTlbr")(rect.asInstanceOf[js.Any]).asInstanceOf[Rect & T]
}
