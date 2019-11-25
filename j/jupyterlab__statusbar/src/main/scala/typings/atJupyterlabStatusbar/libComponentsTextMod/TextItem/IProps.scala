package typings.atJupyterlabStatusbar.libComponentsTextMod.TextItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Props for a TextItem.
  */
trait IProps extends js.Object {
  /**
    * The content of the text item.
    */
  var source: String | Double
  /**
    * Hover text to give to the node.
    */
  var title: js.UndefOr[String] = js.undefined
}

object IProps {
  @scala.inline
  def apply(source: String | Double, title: String = null): IProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
}

