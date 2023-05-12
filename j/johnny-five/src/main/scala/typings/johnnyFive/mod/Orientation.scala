package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.calibrated
import typings.johnnyFive.johnnyFiveStrings.change
import typings.johnnyFive.johnnyFiveStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Orientation")
@js.native
open class Orientation protected () extends StObject {
  def this(option: OrientationOption) = this()
  
  val euler: Any = js.native
  
  def on(event: change | calibrated, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ Any, Unit]): this.type = js.native
  
  val quarternion: Any = js.native
}
