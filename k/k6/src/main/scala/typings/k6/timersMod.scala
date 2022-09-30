package typings.k6

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timersMod {
  
  @JSImport("k6/experimental/timers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearInterval(intervalID: IntervalID): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(intervalID.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearTimeout(timeoutID: TimeoutID): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(timeoutID.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setInterval(functionRef: js.Function1[/* repeated */ Any, Unit], delay: Double, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")((scala.List(functionRef.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  inline def setTimeout(functionRef: js.Function1[/* repeated */ Any, Unit], delay: Double, args: Any*): TimeoutID = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")((scala.List(functionRef.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[TimeoutID]
  
  type IntervalID = Double
  
  type TimeoutID = Double
}
