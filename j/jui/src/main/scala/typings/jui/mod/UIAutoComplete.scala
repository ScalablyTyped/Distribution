package typings.jui.mod

import typings.jui.anon.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIAutoComplete extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Event): this.type = js.native
  def close(): Unit = js.native
  /**
    * Gets filtered words subject to autofill
    *
    * @return words
    */
  def list(): js.Array[String] = js.native
  /**
    * Updates words subject to autofill
    *
    *
    */
  def update(newWords: js.Array[String]): Unit = js.native
}

