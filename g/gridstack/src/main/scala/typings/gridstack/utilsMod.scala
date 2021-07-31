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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("gridstack/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gridstack/dist/utils", "Utils")
  @js.native
  class Utils () extends StObject
  /* static members */
  object Utils {
    
    @JSImport("gridstack/dist/utils", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    /** inserts a CSS rule */
    @scala.inline
    def addCSSRule(sheet: CSSStyleSheet, selector: String, rules: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCSSRule")(sheet.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** makes a shallow copy of the passed json struct */
    @scala.inline
    def clone(target: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(target.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /** return the closest parent matching the given class */
    @scala.inline
    def closestByClass(el: HTMLElement, name: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("closestByClass")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /**
      * creates a style sheet with style id under given parent
      * @param id will set the 'data-gs-style-id' attribute to that id
      * @param parent to insert the stylesheet as first child,
      * if none supplied it will be appended to the document head instead.
      */
    @scala.inline
    def createStylesheet(id: String): CSSStyleSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("createStylesheet")(id.asInstanceOf[js.Any]).asInstanceOf[CSSStyleSheet]
    @scala.inline
    def createStylesheet(id: String, parent: HTMLElement): CSSStyleSheet = (^.asInstanceOf[js.Dynamic].applyDynamic("createStylesheet")(id.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[CSSStyleSheet]
    
    /** copies unset fields in target to use the given default sources values */
    @scala.inline
    def defaults(target: js.Any, sources: js.Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    /** returns true if a and b overlap */
    @scala.inline
    def isIntercepted(a: GridStackWidget, b: GridStackWidget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntercepted")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def parseHeight(`val`: numberOrString): HeightData = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHeight")(`val`.asInstanceOf[js.Any]).asInstanceOf[HeightData]
    
    @scala.inline
    def removePositioningStyles(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removePositioningStyles")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** removed the given stylesheet id */
    @scala.inline
    def removeStylesheet(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStylesheet")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Sorts array of nodes
      * @param nodes array to sort
      * @param dir 1 for asc, -1 for desc (optional)
      * @param width width of the grid. If undefined the width will be calculated automatically (optional).
      **/
    @scala.inline
    def sort(nodes: js.Array[GridStackNode]): js.Array[GridStackNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[GridStackNode]]
    @scala.inline
    def sort(nodes: js.Array[GridStackNode], dir: Unit, column: Double): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    
    @scala.inline
    def sort_1(nodes: js.Array[GridStackNode], dir: `-1`): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    @scala.inline
    def sort_1(nodes: js.Array[GridStackNode], dir: `-1`, column: Double): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    @scala.inline
    def sort_1(nodes: js.Array[GridStackNode], dir: `1`): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    @scala.inline
    def sort_1(nodes: js.Array[GridStackNode], dir: `1`, column: Double): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    
    @scala.inline
    def toBool(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBool")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def toNumber(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")().asInstanceOf[Double | Null]
    @scala.inline
    def toNumber(value: String): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  }
  
  @scala.inline
  def obsolete(self: js.Any, f: js.Any, oldName: String, newName: String, rev: String): js.Function1[/* repeated */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("obsolete")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Any]]
  
  @scala.inline
  def obsoleteAttr(el: HTMLElement, oldName: String, newName: String, rev: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("obsoleteAttr")(el.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def obsoleteOpts(opts: GridStackOptions, oldName: String, newName: String, rev: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("obsoleteOpts")(opts.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def obsoleteOptsDel(opts: GridStackOptions, oldName: String, rev: String, info: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("obsoleteOptsDel")(opts.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait HeightData extends StObject {
    
    var height: Double
    
    var unit: String
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
