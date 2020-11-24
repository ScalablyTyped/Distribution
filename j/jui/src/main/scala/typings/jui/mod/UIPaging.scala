package typings.jui.mod

import typings.jui.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIPaging extends js.Object {
  
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Count): this.type = js.native
  
  def first(): Unit = js.native
  
  def last(): Unit = js.native
  
  def next(): Unit = js.native
  
  /**
    * Changes to a specified page number, and gets the currently enabled page number if there is no parameter
    *
    * @param pNo Page number
    */
  def page(pNo: Double): Unit = js.native
  
  def prev(): Unit = js.native
  
  /**
    * Reloads the number of specified data records, or reloads the initially configured number of data records if there is no parameter
    *
    * @param count Data total count
    */
  def reload(count: Double): Unit = js.native
}
