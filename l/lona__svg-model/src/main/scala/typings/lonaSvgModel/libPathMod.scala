package typings.lonaSvgModel

import typings.lonaSvgModel.anon.ControlPoint
import typings.lonaSvgModel.anon.ControlPoint1
import typings.lonaSvgModel.anon.To
import typings.lonaSvgModel.anon.ToType
import typings.lonaSvgModel.anon.Type
import typings.lonaSvgModel.libCommandsMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathMod {
  
  @JSImport("@lona/svg-model/lib/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(string: String, transform: String): js.Array[Command] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(string.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[Command]]
  
  inline def convertCommand(segment: js.Array[Any], x: Double, y: Double): ToType | To | ControlPoint | ControlPoint1 | Type | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("convertCommand")(segment.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[ToType | To | ControlPoint | ControlPoint1 | Type | Null]
}
