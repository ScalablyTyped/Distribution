package typings.atJupyterlabStatusbar.libComponentsGroupMod.GroupItemNs

import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Props for the GroupItem.
  */
trait IProps extends js.Object {
  /**
    * The items to arrange in a group.
    */
  var children: js.Array[Element]
  /**
    * The spacing, in px, between the items in the goup.
    */
  var spacing: Double
}

object IProps {
  @scala.inline
  def apply(children: js.Array[Element], spacing: Double): IProps = {
    val __obj = js.Dynamic.literal(children = children, spacing = spacing)
  
    __obj.asInstanceOf[IProps]
  }
}

