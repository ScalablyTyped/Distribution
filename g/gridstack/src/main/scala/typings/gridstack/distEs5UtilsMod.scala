package typings.gridstack

import org.scalablytyped.runtime.StringDictionary
import typings.gridstack.anon.Target
import typings.gridstack.distEs5TypesMod.GridStackElement
import typings.gridstack.distEs5TypesMod.GridStackNode
import typings.gridstack.distEs5TypesMod.GridStackOptions
import typings.gridstack.distEs5TypesMod.GridStackPosition
import typings.gridstack.distEs5TypesMod.GridStackWidget
import typings.gridstack.distEs5TypesMod.numberOrString
import typings.gridstack.gridstackInts.`-1`
import typings.gridstack.gridstackInts.`1`
import typings.std.CSSStyleSheet
import typings.std.DragEvent
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5UtilsMod {
  
  @JSImport("gridstack/dist/es5/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gridstack/dist/es5/utils", "Utils")
  @js.native
  open class Utils () extends StObject
  /* static members */
  object Utils {
    
    @JSImport("gridstack/dist/es5/utils", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    /** inserts a CSS rule */
    inline def addCSSRule(sheet: CSSStyleSheet, selector: String, rules: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCSSRule")(sheet.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addElStyles(el: HTMLElement, styles: StringDictionary[String | js.Array[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addElStyles")(el.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def appendTo(el: HTMLElement, parent: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTo")(el.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def appendTo(el: HTMLElement, parent: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTo")(el.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def appendTo(el: HTMLElement, parent: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTo")(el.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** returns the area */
    inline def area(a: GridStackPosition): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** returns the area a and b overlap */
    inline def areaIntercept(a: GridStackPosition, b: GridStackPosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("areaIntercept")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** single level clone, returning a new object with same top fields. This will share sub objects and arrays */
    inline def clone[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Recursive clone version that returns a full copy, checking for nested objects and arrays ONLY.
      * Note: this will use as-is any key starting with double __ (and not copy inside) some lib have circular dependencies.
      */
    inline def cloneDeep[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDeep")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /** deep clone the given HTML node, removing teh unique id field */
    inline def cloneNode(el: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneNode")(el.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    /** return the closest parent (or itself) matching the given class */
    inline def closestUpByClass(el: HTMLElement, name: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("closestUpByClass")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /** copies over b size & position (GridStackPosition), and optionally min/max as well */
    inline def copyPos(a: GridStackWidget, b: GridStackWidget): GridStackWidget = (^.asInstanceOf[js.Dynamic].applyDynamic("copyPos")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[GridStackWidget]
    inline def copyPos(a: GridStackWidget, b: GridStackWidget, doMinMax: Boolean): GridStackWidget = (^.asInstanceOf[js.Dynamic].applyDynamic("copyPos")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], doMinMax.asInstanceOf[js.Any])).asInstanceOf[GridStackWidget]
    
    /**
      * creates a style sheet with style id under given parent
      * @param id will set the 'gs-style-id' attribute to that id
      * @param parent to insert the stylesheet as first child,
      * if none supplied it will be appended to the document head instead.
      */
    inline def createStylesheet(id: String): CSSStyleSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("createStylesheet")(id.asInstanceOf[js.Any]).asInstanceOf[CSSStyleSheet]
    inline def createStylesheet(id: String, parent: HTMLElement): CSSStyleSheet = (^.asInstanceOf[js.Dynamic].applyDynamic("createStylesheet")(id.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[CSSStyleSheet]
    
    /** copies unset fields in target to use the given default sources values */
    inline def defaults(target: Any, sources: Any*): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
    
    /** convert a potential selector into actual single element */
    inline def getElement(els: GridStackElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(els.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    /** convert a potential selector into actual list of html elements */
    inline def getElements(els: GridStackElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
    
    inline def initEvent[T](e: DragEvent, info: Target): T = (^.asInstanceOf[js.Dynamic].applyDynamic("initEvent")(e.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def initEvent[T](e: MouseEvent, info: Target): T = (^.asInstanceOf[js.Dynamic].applyDynamic("initEvent")(e.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /** returns true if a and b overlap */
    inline def isIntercepted(a: GridStackPosition, b: GridStackPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntercepted")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** returns true if a and b touch edges or corners */
    inline def isTouching(a: GridStackPosition, b: GridStackPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTouching")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def parseHeight(`val`: numberOrString): HeightData = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHeight")(`val`.asInstanceOf[js.Any]).asInstanceOf[HeightData]
    
    /** removes field from the first object if same as the second objects (like diffing) and internal '_' for saving */
    inline def removeInternalAndSame(a: Any, b: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeInternalAndSame")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** removes internal fields '_' and default values for saving */
    inline def removeInternalForSave(n: GridStackNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeInternalForSave")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeInternalForSave(n: GridStackNode, removeEl: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeInternalForSave")(n.asInstanceOf[js.Any], removeEl.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removePositioningStyles(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removePositioningStyles")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** removed the given stylesheet id */
    inline def removeStylesheet(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStylesheet")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** given 2 objects return true if they have the same values. Checks for Object {} having same fields and values (just 1 level down) */
    inline def same(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("same")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** true if a and b has same size & position */
    inline def samePos(a: GridStackPosition, b: GridStackPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("samePos")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** copies the MouseEvent properties and sends it as another event to the given target */
    inline def simulateMouseEvent(e: MouseEvent, simulatedType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("simulateMouseEvent")(e.asInstanceOf[js.Any], simulatedType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def simulateMouseEvent(e: MouseEvent, simulatedType: String, target: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("simulateMouseEvent")(e.asInstanceOf[js.Any], simulatedType.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sorts array of nodes
      * @param nodes array to sort
      * @param dir 1 for asc, -1 for desc (optional)
      * @param width width of the grid. If undefined the width will be calculated automatically (optional).
      **/
    inline def sort(nodes: js.Array[GridStackNode]): js.Array[GridStackNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[GridStackNode]]
    inline def sort(nodes: js.Array[GridStackNode], dir: `-1` | `1`): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    inline def sort(nodes: js.Array[GridStackNode], dir: `-1` | `1`, column: Double): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    inline def sort(nodes: js.Array[GridStackNode], dir: Unit, column: Double): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    
    /** delay calling the given function for given delay, preventing new calls from happening while waiting */
    inline def throttle(func: js.Function0[Unit], delay: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def toBool(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBool")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def toNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")().asInstanceOf[Double]
    inline def toNumber(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  inline def obsolete(self: Any, f: Any, oldName: String, newName: String, rev: String): js.Function1[/* repeated */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("obsolete")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  
  inline def obsoleteAttr(el: HTMLElement, oldName: String, newName: String, rev: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("obsoleteAttr")(el.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def obsoleteOpts(opts: GridStackOptions, oldName: String, newName: String, rev: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("obsoleteOpts")(opts.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def obsoleteOptsDel(opts: GridStackOptions, oldName: String, rev: String, info: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("obsoleteOptsDel")(opts.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait HeightData extends StObject {
    
    var h: Double
    
    var unit: String
  }
  object HeightData {
    
    inline def apply(h: Double, unit: String): HeightData = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeightData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeightData] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
}
