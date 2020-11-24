package typings.hat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rack extends js.Object {
  
  def apply(): String = js.native
  def apply(data: js.Any): String = js.native
  
  var base: Double = js.native
  
  var bits: Double = js.native
  
  def get(id: String): js.Any = js.native
  
  var hats: HatsList = js.native
  
  def set(id: String, value: js.Any): Rack = js.native
}
