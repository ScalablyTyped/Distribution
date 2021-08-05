package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapMetadataTreeItem extends StObject {
  
  /**
    * Returns the caption text that should be displayed for this tree item.
    */
  def caption(): String
  
  /**
    * Returns the children ot this tree item.
    */
  def children(): js.Object
  
  /**
    * Returns the OLAP metadata item that this tree item represents which is an object of type $.ig.Cube, $.ig.Dimension, $.ig.Hierarchy, $.ig.Measure, $.ig.Level.
    */
  def item(): js.Object
  
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
  def `type`(): Double
}
object OlapMetadataTreeItem {
  
  inline def apply(caption: () => String, children: () => js.Object, item: () => js.Object, `type`: () => Double): OlapMetadataTreeItem = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction0(caption), children = js.Any.fromFunction0(children), item = js.Any.fromFunction0(item))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[OlapMetadataTreeItem]
  }
  
  extension [Self <: OlapMetadataTreeItem](x: Self) {
    
    inline def setCaption(value: () => String): Self = StObject.set(x, "caption", js.Any.fromFunction0(value))
    
    inline def setChildren(value: () => js.Object): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
    
    inline def setItem(value: () => js.Object): Self = StObject.set(x, "item", js.Any.fromFunction0(value))
    
    inline def setType(value: () => Double): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
  }
}
