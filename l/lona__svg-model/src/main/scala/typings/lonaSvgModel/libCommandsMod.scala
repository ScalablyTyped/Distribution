package typings.lonaSvgModel

import typings.lonaSvgModel.anon.ControlPoint
import typings.lonaSvgModel.anon.ControlPoint1
import typings.lonaSvgModel.anon.To
import typings.lonaSvgModel.anon.Type
import typings.lonaSvgModel.anon.`0`
import typings.lonaSvgModel.libPrimitivesMod.Point_
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommandsMod {
  
  @JSImport("@lona/svg-model/lib/commands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def close(): `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[`0`]
  
  inline def cubicCurve(to: Point_, controlPoint1: Point_, controlPoint2: Point_): ControlPoint1 = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicCurve")(to.asInstanceOf[js.Any], controlPoint1.asInstanceOf[js.Any], controlPoint2.asInstanceOf[js.Any])).asInstanceOf[ControlPoint1]
  
  inline def line(to: Point_): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(to.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  inline def move(to: Point_): To = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(to.asInstanceOf[js.Any]).asInstanceOf[To]
  
  inline def quadCurve(to: Point_, controlPoint: Point_): ControlPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("quadCurve")(to.asInstanceOf[js.Any], controlPoint.asInstanceOf[js.Any])).asInstanceOf[ControlPoint]
  
  type Close_ = ReturnType[js.Function0[`0`]]
  
  type Command = Move_ | Line_ | QuadCurve_ | CubicCurve_ | Close_
  
  type CubicCurve_ = ReturnType[
    js.Function3[/* to */ Point_, /* controlPoint1 */ Point_, /* controlPoint2 */ Point_, ControlPoint1]
  ]
  
  type Line_ = ReturnType[js.Function1[/* to */ Point_, Type]]
  
  type Move_ = ReturnType[js.Function1[/* to */ Point_, To]]
  
  type QuadCurve_ = ReturnType[js.Function2[/* to */ Point_, /* controlPoint */ Point_, ControlPoint]]
}
