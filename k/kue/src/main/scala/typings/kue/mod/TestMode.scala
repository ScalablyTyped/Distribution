package typings.kue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestMode extends js.Object {
  
  def clear(): Unit = js.native
  
  def enter(): Unit = js.native
  def enter(process: Boolean): Unit = js.native
  
  def exit(): Unit = js.native
  
  var jobs: js.Array[Job] = js.native
}
