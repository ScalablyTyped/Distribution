package typings.gridstack.utilsMod

import typings.gridstack.gridstackNumbers.`-1`
import typings.gridstack.gridstackNumbers.`1`
import typings.gridstack.typesMod.GridStackNode
import typings.gridstack.typesMod.GridStackWidget
import typings.gridstack.typesMod.numberOrString
import typings.std.CSSStyleSheet
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gridstack/dist/utils", "Utils")
@js.native
class Utils () extends js.Object
/* static members */
@JSImport("gridstack/dist/utils", "Utils")
@js.native
object Utils extends js.Object {
  
  /** inserts a CSS rule */
  def addCSSRule(sheet: CSSStyleSheet, selector: String, rules: String): Unit = js.native
  
  /** makes a shallow copy of the passed json struct */
  def clone(target: js.Object): js.Object = js.native
  
  /** return the closest parent matching the given class */
  def closestByClass(el: HTMLElement, name: String): HTMLElement = js.native
  
  /**
    * creates a style sheet with style id under given parent
    * @param id will set the 'data-gs-style-id' attribute to that id
    * @param parent to insert the stylesheet as first child,
    * if none supplied it will be appended to the document head instead.
    */
  def createStylesheet(id: String): CSSStyleSheet = js.native
  def createStylesheet(id: String, parent: HTMLElement): CSSStyleSheet = js.native
  
  /** copies unset fields in target to use the given default sources values */
  def defaults(target: js.Any, sources: js.Any*): js.Object = js.native
  
  /** returns true if a and b overlap */
  def isIntercepted(a: GridStackWidget, b: GridStackWidget): Boolean = js.native
  
  def parseHeight(`val`: numberOrString): HeightData = js.native
  
  def removePositioningStyles(el: HTMLElement): Unit = js.native
  
  /** removed the given stylesheet id */
  def removeStylesheet(id: String): Unit = js.native
  
  /**
    * Sorts array of nodes
    * @param nodes array to sort
    * @param dir 1 for asc, -1 for desc (optional)
    * @param width width of the grid. If undefined the width will be calculated automatically (optional).
    **/
  def sort(nodes: js.Array[GridStackNode]): js.Array[GridStackNode] = js.native
  def sort(nodes: js.Array[GridStackNode], dir: js.UndefOr[scala.Nothing], column: Double): js.Array[GridStackNode] = js.native
  @JSName("sort")
  def sort_1(nodes: js.Array[GridStackNode], dir: `-1`): js.Array[GridStackNode] = js.native
  @JSName("sort")
  def sort_1(nodes: js.Array[GridStackNode], dir: `-1`, column: Double): js.Array[GridStackNode] = js.native
  @JSName("sort")
  def sort_1(nodes: js.Array[GridStackNode], dir: `1`): js.Array[GridStackNode] = js.native
  @JSName("sort")
  def sort_1(nodes: js.Array[GridStackNode], dir: `1`, column: Double): js.Array[GridStackNode] = js.native
  
  def toBool(v: js.Any): Boolean = js.native
  
  def toNumber(): Double | Null = js.native
  def toNumber(value: String): Double | Null = js.native
}
