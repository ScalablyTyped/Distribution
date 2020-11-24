package typings.impress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impress extends js.Object {
  
  def getStep(step: js.Any): js.Any = js.native
  
  def goto(element: js.Any): js.Any = js.native
  def goto(element: js.Any, duration: Double): js.Any = js.native
  
  def init(): Unit = js.native
  
  def next(): js.Any = js.native
  
  def prev(): js.Any = js.native
}
