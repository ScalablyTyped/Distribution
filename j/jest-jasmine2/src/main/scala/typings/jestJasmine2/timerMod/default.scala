package typings.jestJasmine2.timerMod

import typings.jestJasmine2.anon.Now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/jasmine/Timer", JSImport.Default)
@js.native
class default () extends Timer {
  def this(options: Now) = this()
  /* CompleteClass */
  override def elapsed(): Double = js.native
  /* CompleteClass */
  override def start(): Unit = js.native
}

