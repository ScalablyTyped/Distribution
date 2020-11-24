package typings.jqueryBackstretch

import typings.jqueryBackstretch.JQueryBackStretch.BackStretch
import typings.jqueryBackstretch.JQueryBackStretch.BackStretchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def backstretch(images: js.Array[String]): BackStretch = js.native
  def backstretch(images: js.Array[String], config: BackStretchOptions): BackStretch = js.native
  def backstretch(method: String): JQuery = js.native
}
