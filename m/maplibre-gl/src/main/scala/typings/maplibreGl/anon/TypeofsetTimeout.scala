package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofsetTimeout extends StObject {
  
  // util.promisify no rest args compability
  // tslint:disable-next-line void-return
  def apply(callback: js.Function1[/* args */ Unit, Unit]): typings.node.timersMod.global.NodeJS.Timeout = js.native
  def apply(callback: js.Function1[/* args */ Unit, Unit], ms: Double): typings.node.timersMod.global.NodeJS.Timeout = js.native
  def apply[TArgs /* <: js.Array[Any] */](
    callback: js.Function1[/* args */ TArgs, Unit],
    ms: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): typings.node.timersMod.global.NodeJS.Timeout = js.native
  def apply[TArgs /* <: js.Array[Any] */](
    callback: js.Function1[/* args */ TArgs, Unit],
    ms: Unit,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): typings.node.timersMod.global.NodeJS.Timeout = js.native
}
