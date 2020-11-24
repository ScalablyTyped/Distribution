package typings.jui.mod

import typings.jui.anon.Distance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UINotify extends js.Object {
  
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Distance): this.type = js.native
  
  /**
    * Adds a notice message. The value passed is the data object shown by the notice template
    *
    */
  def add(data: js.Object, timeout: Double): Unit = js.native
  
  def reset(): Unit = js.native
}
