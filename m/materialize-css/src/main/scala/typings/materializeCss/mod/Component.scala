package typings.materializeCss.mod

import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Component")
@js.native
abstract class Component[TOptions] protected ()
  extends typings.materializeCss.M.Component[TOptions] {
  /**
    * Construct component instance and set everything up
    */
  def this(elem: Element) = this()
  def this(elem: Element, options: Partial[TOptions]) = this()
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: TOptions = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

