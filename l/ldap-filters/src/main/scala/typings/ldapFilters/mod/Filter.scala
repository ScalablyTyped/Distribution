package typings.ldapFilters.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  def `match`(data: js.Object): Boolean = js.native
  
  def simplify(): Filter = js.native
  
  def toString(indent: Boolean): String = js.native
  def toString(indent: Double): String = js.native
}
