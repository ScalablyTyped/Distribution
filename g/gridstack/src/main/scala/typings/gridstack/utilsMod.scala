package typings.gridstack

import typings.gridstack.gridstackNumbers.`-1`
import typings.gridstack.gridstackNumbers.`1`
import typings.gridstack.typesMod.GridStackNode
import typings.gridstack.typesMod.GridStackOptions
import typings.gridstack.typesMod.GridStackWidget
import typings.gridstack.typesMod.numberOrString
import typings.std.CSSStyleSheet
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("gridstack/dist/utils", "Utils")
  @js.native
  class Utils () extends StObject
  /* static members */
  object Utils {
    
    /** inserts a CSS rule */
    @JSImport("gridstack/dist/utils", "Utils.addCSSRule")
    @js.native
    def addCSSRule(sheet: CSSStyleSheet, selector: String, rules: String): Unit = js.native
    
    /** makes a shallow copy of the passed json struct */
    @JSImport("gridstack/dist/utils", "Utils.clone")
    @js.native
    def clone(target: js.Object): js.Object = js.native
    
    /** return the closest parent matching the given class */
    @JSImport("gridstack/dist/utils", "Utils.closestByClass")
    @js.native
    def closestByClass(el: HTMLElement, name: String): HTMLElement = js.native
    
    /**
      * creates a style sheet with style id under given parent
      * @param id will set the 'data-gs-style-id' attribute to that id
      * @param parent to insert the stylesheet as first child,
      * if none supplied it will be appended to the document head instead.
      */
    @JSImport("gridstack/dist/utils", "Utils.createStylesheet")
    @js.native
    def createStylesheet(id: String): CSSStyleSheet = js.native
    @JSImport("gridstack/dist/utils", "Utils.createStylesheet")
    @js.native
    def createStylesheet(id: String, parent: HTMLElement): CSSStyleSheet = js.native
    
    /** copies unset fields in target to use the given default sources values */
    @JSImport("gridstack/dist/utils", "Utils.defaults")
    @js.native
    def defaults(target: js.Any, sources: js.Any*): js.Object = js.native
    
    /** returns true if a and b overlap */
    @JSImport("gridstack/dist/utils", "Utils.isIntercepted")
    @js.native
    def isIntercepted(a: GridStackWidget, b: GridStackWidget): Boolean = js.native
    
    @JSImport("gridstack/dist/utils", "Utils.parseHeight")
    @js.native
    def parseHeight(`val`: numberOrString): HeightData = js.native
    
    @JSImport("gridstack/dist/utils", "Utils.removePositioningStyles")
    @js.native
    def removePositioningStyles(el: HTMLElement): Unit = js.native
    
    /** removed the given stylesheet id */
    @JSImport("gridstack/dist/utils", "Utils.removeStylesheet")
    @js.native
    def removeStylesheet(id: String): Unit = js.native
    
    /**
      * Sorts array of nodes
      * @param nodes array to sort
      * @param dir 1 for asc, -1 for desc (optional)
      * @param width width of the grid. If undefined the width will be calculated automatically (optional).
      **/
    @JSImport("gridstack/dist/utils", "Utils.sort")
    @js.native
    def sort(nodes: js.Array[GridStackNode]): js.Array[GridStackNode] = js.native
    @JSImport("gridstack/dist/utils", "Utils.sort")
    @js.native
    def sort(nodes: js.Array[GridStackNode], dir: js.UndefOr[scala.Nothing], column: Double): js.Array[GridStackNode] = js.native
    @JSImport("gridstack/dist/utils", "Utils.sort")
    @js.native
    def sort_1(nodes: js.Array[GridStackNode], dir: `-1`): js.Array[GridStackNode] = js.native
    @JSImport("gridstack/dist/utils", "Utils.sort")
    @js.native
    def sort_1(nodes: js.Array[GridStackNode], dir: `-1`, column: Double): js.Array[GridStackNode] = js.native
    @JSImport("gridstack/dist/utils", "Utils.sort")
    @js.native
    def sort_1(nodes: js.Array[GridStackNode], dir: `1`): js.Array[GridStackNode] = js.native
    @JSImport("gridstack/dist/utils", "Utils.sort")
    @js.native
    def sort_1(nodes: js.Array[GridStackNode], dir: `1`, column: Double): js.Array[GridStackNode] = js.native
    
    @JSImport("gridstack/dist/utils", "Utils.toBool")
    @js.native
    def toBool(v: js.Any): Boolean = js.native
    
    @JSImport("gridstack/dist/utils", "Utils.toNumber")
    @js.native
    def toNumber(): Double | Null = js.native
    @JSImport("gridstack/dist/utils", "Utils.toNumber")
    @js.native
    def toNumber(value: String): Double | Null = js.native
  }
  
  @JSImport("gridstack/dist/utils", "obsolete")
  @js.native
  def obsolete(self: js.Any, f: js.Any, oldName: String, newName: String, rev: String): js.Function1[/* repeated */ js.Any, _] = js.native
  
  @JSImport("gridstack/dist/utils", "obsoleteAttr")
  @js.native
  def obsoleteAttr(el: HTMLElement, oldName: String, newName: String, rev: String): Unit = js.native
  
  @JSImport("gridstack/dist/utils", "obsoleteOpts")
  @js.native
  def obsoleteOpts(opts: GridStackOptions, oldName: String, newName: String, rev: String): Unit = js.native
  
  @JSImport("gridstack/dist/utils", "obsoleteOptsDel")
  @js.native
  def obsoleteOptsDel(opts: GridStackOptions, oldName: String, rev: String, info: String): Unit = js.native
  
  @js.native
  trait HeightData extends StObject {
    
    var height: Double = js.native
    
    var unit: String = js.native
  }
  object HeightData {
    
    @scala.inline
    def apply(height: Double, unit: String): HeightData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeightData]
    }
    
    @scala.inline
    implicit class HeightDataMutableBuilder[Self <: HeightData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
}
