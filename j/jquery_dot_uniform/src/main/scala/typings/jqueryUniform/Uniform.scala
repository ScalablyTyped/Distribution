package typings.jqueryUniform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uniform extends js.Object {
  
  def apply(): JQuery = js.native
  def apply(options: UniformOptions): JQuery = js.native
  
  var defaults: UniformOptions = js.native
  
  var elements: js.Array[JQuery] = js.native
  
  def restore(): Unit = js.native
  def restore(elemOrSelector: js.Any): Unit = js.native
  
  def update(): Unit = js.native
  def update(elemOrSelector: js.Any): Unit = js.native
}
