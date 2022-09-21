package typings.makerjs.global.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * String-based enumeration of all paths types.
  *
  * Examples: use pathType instead of string literal when creating a circle.
  * ```
  * var circle: IPathCircle = { type: pathType.Circle, origin: [0, 0], radius: 7 };   //typescript
  * var circle = { type: pathType.Circle, origin: [0, 0], radius: 7 };   //javascript
  * ```
  */
object pathType {
  
  @JSGlobal("MakerJs.pathType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("MakerJs.pathType.Arc")
  @js.native
  def Arc: String = js.native
  inline def Arc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arc")(x.asInstanceOf[js.Any])
  
  @JSGlobal("MakerJs.pathType.BezierSeed")
  @js.native
  def BezierSeed: String = js.native
  inline def BezierSeed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BezierSeed")(x.asInstanceOf[js.Any])
  
  @JSGlobal("MakerJs.pathType.Circle")
  @js.native
  def Circle: String = js.native
  inline def Circle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
  
  @JSGlobal("MakerJs.pathType.Line")
  @js.native
  def Line: String = js.native
  inline def Line_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
}
