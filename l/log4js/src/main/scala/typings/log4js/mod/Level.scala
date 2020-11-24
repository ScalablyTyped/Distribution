package typings.log4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level extends js.Object {
  
  var colour: String = js.native
  
  def isEqualTo(otherLevel: Level): Boolean = js.native
  def isEqualTo(other: String): Boolean = js.native
  
  def isGreaterThanOrEqualTo(otherLevel: Level): Boolean = js.native
  def isGreaterThanOrEqualTo(other: String): Boolean = js.native
  
  def isLessThanOrEqualTo(otherLevel: Level): Boolean = js.native
  def isLessThanOrEqualTo(other: String): Boolean = js.native
  
  var level: Double = js.native
  
  var levelStr: String = js.native
}
