package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIPaging extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiLib.Anon_Count): this.type = js.native
  def first(): scala.Unit = js.native
  def last(): scala.Unit = js.native
  def next(): scala.Unit = js.native
  /**
       * Changes to a specified page number, and gets the currently enabled page number if there is no parameter
       *
       * @param pNo Page number
       */
  def page(pNo: scala.Double): scala.Unit = js.native
  def prev(): scala.Unit = js.native
  /**
       * Reloads the number of specified data records, or reloads the initially configured number of data records if there is no parameter
       *
       * @param count Data total count
       */
  def reload(count: scala.Double): scala.Unit = js.native
}

