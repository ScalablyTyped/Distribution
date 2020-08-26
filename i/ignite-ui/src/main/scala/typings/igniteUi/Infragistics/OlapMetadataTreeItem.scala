package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapMetadataTreeItem extends js.Object {
  /**
    * Returns the caption text that should be displayed for this tree item.
    */
  def caption(): String = js.native
  /**
    * Returns the children ot this tree item.
    */
  def children(): js.Object = js.native
  /**
    * Returns the OLAP metadata item that this tree item represents which is an object of type $.ig.Cube, $.ig.Dimension, $.ig.Hierarchy, $.ig.Measure, $.ig.Level.
    */
  def item(): js.Object = js.native
  /**
    * Returns the metadata tree item type which is a value from the $.ig.MetadataTreeItemType enumeration.
    *
    *             $.ig.MetadataTreeItemType.prototype.cube = 0;
    *             Item type for the cube tree items. Contain an item() of type $.ig.Cube.
    *
    *             $.ig.MetadataTreeItemType.prototype.dimension = 1;
    *             Item type for the dimension tree items. Contain an item() of type $.ig.Dimension.
    *
    *             $.ig.MetadataTreeItemType.prototype.group = 2;
    *             Item type for the group tree items. Does not have item().
    *
    *             $.ig.MetadataTreeItemType.prototype.userDefinedHierarchy = 3;
    *             Item type for the userDefinedHierarchy tree items. Contain an item() of type $.ig.Hierarchy.
    *
    *             $.ig.MetadataTreeItemType.prototype.systemEnabledHierarchy = 4;
    *             Item type for the systemEnabledHierarchy tree items. Contain an item() of type $.ig.Hierarchy.
    *
    *             $.ig.MetadataTreeItemType.prototype.parentChildHierarchy = 5;
    *             Item type for the parentChildHierarchy tree items. Contain an item() of type $.ig.Hierarchy.
    *
    *             $.ig.MetadataTreeItemType.prototype.measure = 6;
    *             Item type for the measure tree items. Contain an item() of type $.ig.Measure.
    *
    *             $.ig.MetadataTreeItemType.prototype.level1 = 7;
    *             Item type for the level1 tree items. Contain an item() of type $.ig.Level.
    *
    *             $.ig.MetadataTreeItemType.prototype.level2 = 8;
    *             Item type for the level2 tree items. Contain an item() of type $.ig.Level.
    *
    *             $.ig.MetadataTreeItemType.prototype.level3 = 9;
    *             Item type for the level3 tree items. Contain an item() of type $.ig.Level.
    *
    *             $.ig.MetadataTreeItemType.prototype.level4 = 10;
    *             Item type for the level4 tree items. Contain an item() of type $.ig.Level.
    *
    *             $.ig.MetadataTreeItemType.prototype.level5 = 11;
    *             Item type for the level5 tree items. Contain an item() of type $.ig.Level.
    */
  def `type`(): Double = js.native
}

object OlapMetadataTreeItem {
  @scala.inline
  def apply(caption: () => String, children: () => js.Object, item: () => js.Object, `type`: () => Double): OlapMetadataTreeItem = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction0(caption), children = js.Any.fromFunction0(children), item = js.Any.fromFunction0(item))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[OlapMetadataTreeItem]
  }
  @scala.inline
  implicit class OlapMetadataTreeItemOps[Self <: OlapMetadataTreeItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaption(value: () => String): Self = this.set("caption", js.Any.fromFunction0(value))
    @scala.inline
    def setChildren(value: () => js.Object): Self = this.set("children", js.Any.fromFunction0(value))
    @scala.inline
    def setItem(value: () => js.Object): Self = this.set("item", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: () => Double): Self = this.set("type", js.Any.fromFunction0(value))
  }
  
}

