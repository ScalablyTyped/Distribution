package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Piezo")
@js.native
open class Piezo protected () extends StObject {
  def this(option: Double) = this()
  def this(option: PiezoOption) = this()
  
  def frequency(frequency: Double, duration: Double): Unit = js.native
  
  var id: String = js.native
  
  val isPlaying: Boolean = js.native
  
  val mode: Double = js.native
  
  def noTone(): Unit = js.native
  
  def off(): Unit = js.native
  
  var pin: Double = js.native
  
  def play(tune: PiezoTune): Unit = js.native
  def play(tune: PiezoTune, cb: js.Function0[Unit]): Unit = js.native
  
  def tone(tone: Double, duration: Double): Unit = js.native
}
