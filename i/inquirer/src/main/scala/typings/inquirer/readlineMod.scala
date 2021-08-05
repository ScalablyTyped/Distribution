package typings.inquirer

import typings.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readlineMod {
  
  @JSImport("inquirer/lib/utils/readline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearLine(readLine: Interface, count: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(readLine.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def down(readLine: Interface, count: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("down")(readLine.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def left(readLine: Interface, count: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("left")(readLine.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def right(readLine: Interface, count: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("right")(readLine.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def up(readLine: Interface, count: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("up")(readLine.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
