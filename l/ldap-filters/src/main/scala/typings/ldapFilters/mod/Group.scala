package typings.ldapFilters.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends js.Object {
  
  var comp: String = js.native
  
  var filters: js.Array[Filter] = js.native
  
  def `match`(data: js.Object): Boolean = js.native
  
  def toString(indent: Boolean): String = js.native
  def toString(indent: Double): String = js.native
  
  var `type`: String = js.native
}
