package typings.lonaSvgModel

import typings.lonaSvgModel.anon.ControlPoint
import typings.lonaSvgModel.anon.ControlPoint1
import typings.lonaSvgModel.anon.To
import typings.lonaSvgModel.anon.ToType
import typings.lonaSvgModel.anon.Type
import typings.lonaSvgModel.libPrimitivesMod.Point_
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommandsMod {
  
  @JSImport("@lona/svg-model/lib/commands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def close(): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Type]
  
  inline def cubicCurve(to: Point_, controlPoint1: Point_, controlPoint2: Point_): ControlPoint1 = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicCurve")(to.asInstanceOf[js.Any], controlPoint1.asInstanceOf[js.Any], controlPoint2.asInstanceOf[js.Any])).asInstanceOf[ControlPoint1]
  
  inline def line(to: Point_): To = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(to.asInstanceOf[js.Any]).asInstanceOf[To]
  
  inline def move(to: Point_): ToType = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(to.asInstanceOf[js.Any]).asInstanceOf[ToType]
  
  inline def quadCurve(to: Point_, controlPoint: Point_): ControlPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("quadCurve")(to.asInstanceOf[js.Any], controlPoint.asInstanceOf[js.Any])).asInstanceOf[ControlPoint]
  
  type Close_ = ReturnType[js.Function0[Type]]
  
  type Command = Move_ | Line_ | QuadCurve_ | CubicCurve_ | Close_
  
  type CubicCurve_ = ReturnType[
    js.Function3[/* to */ Point_, /* controlPoint1 */ Point_, /* controlPoint2 */ Point_, ControlPoint1]
  ]
  
  type Line_ = ReturnType[js.Function1[/* to */ Point_, To]]
  
  type Move_ = ReturnType[js.Function1[/* to */ Point_, ToType]]
  
  type QuadCurve_ = ReturnType[js.Function2[/* to */ Point_, /* controlPoint */ Point_, ControlPoint]]
}
