package typings.makeupExpander.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("makeup-expander", JSImport.Namespace)
@js.native
class ^ protected () extends Expander {
  def this(el: HTMLElement) = this()
  def this(el: HTMLElement, selectedOptions: Options) = this()
  /* CompleteClass */
  override var collapseOnClickOut: Boolean = js.native
  /* CompleteClass */
  override var collapseOnFocusOut: Boolean = js.native
  /* CompleteClass */
  override var collapseOnMouseOut: Boolean = js.native
  /* CompleteClass */
  override var expandOnClick: Boolean = js.native
  /* CompleteClass */
  override var expandOnFocus: Boolean = js.native
  /* CompleteClass */
  override var expandOnHover: Boolean = js.native
  /* CompleteClass */
  override def collapse(): Unit = js.native
  /* CompleteClass */
  override def expand(isKeyboard: Boolean): Unit = js.native
  /* CompleteClass */
  override def isExpanded(): Boolean = js.native
  /* CompleteClass */
  override def toggle(): Unit = js.native
}

