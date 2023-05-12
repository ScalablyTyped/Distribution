package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("listr2", "Spinner")
@js.native
open class Spinner () extends StObject {
  
  def fetch(): String = js.native
  
  /* private */ var id: Any = js.native
  
  def isRunning(): Boolean = js.native
  
  def spin(): Unit = js.native
  
  /* protected */ val spinner: js.Array[String] = js.native
  
  /* private */ var spinnerPosition: Any = js.native
  
  def start(): Unit = js.native
  def start(cb: js.Function0[Unit]): Unit = js.native
  def start(cb: js.Function0[Unit], interval: Double): Unit = js.native
  def start(cb: Unit, interval: Double): Unit = js.native
  
  def stop(): Unit = js.native
}
