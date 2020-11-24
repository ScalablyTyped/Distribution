package typings.jqueryDropotron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Interface for "JQuery".
  * @author  Cyril Schumacher
  * @version 1.0
  */
@js.native
trait JQuery extends js.Object {
  
  def dropotron(): Unit = js.native
  def dropotron(config: DropotronConfiguration): Unit = js.native
  @JSName("dropotron")
  var dropotron_Original: Dropotron = js.native
}
