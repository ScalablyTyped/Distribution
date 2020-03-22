package typings.luminoVirtualdom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementSpecialAttrs extends js.Object {
  /**
    * The JS-safe name for the HTML `class` attribute.
    */
  val className: js.UndefOr[String] = js.undefined
  /**
    * The dataset for the rendered DOM element.
    */
  val dataset: js.UndefOr[ElementDataset] = js.undefined
  /**
    * The JS-safe name for the HTML `for` attribute.
    */
  val htmlFor: js.UndefOr[String] = js.undefined
  /**
    * The key id for the virtual element node.
    *
    * If a node is given a key id, the generated DOM node will not be
    * recreated during a rendering update if it only moves among its
    * siblings in the render tree.
    *
    * In general, reordering child nodes will cause the nodes to be
    * completely re-rendered. Keys allow this to be optimized away.
    *
    * If a key is provided, it must be unique among sibling nodes.
    */
  val key: js.UndefOr[String] = js.undefined
  /**
    * The inline style for the rendered DOM element.
    */
  val style: js.UndefOr[ElementInlineStyle] = js.undefined
}

object ElementSpecialAttrs {
  @scala.inline
  def apply(
    className: String = null,
    dataset: ElementDataset = null,
    htmlFor: String = null,
    key: String = null,
    style: ElementInlineStyle = null
  ): ElementSpecialAttrs = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementSpecialAttrs]
  }
}

