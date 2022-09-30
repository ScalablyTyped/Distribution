package typings.gridstack

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.gridstack.gridstackInts.`-1`
import typings.gridstack.gridstackInts.`1`
import typings.gridstack.typesMod.GridStackElement
import typings.gridstack.typesMod.GridStackNode
import typings.gridstack.typesMod.GridStackPosition
import typings.gridstack.typesMod.GridStackWidget
import typings.gridstack.typesMod.numberOrString
import typings.gridstack.utilsMod.HeightData
import typings.gridstack.utilsMod.Utils
import typings.std.CSSStyleSheet
import typings.std.DragEvent
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Target extends StObject {
    
    var target: js.UndefOr[EventTarget] = js.undefined
    
    var `type`: String
  }
  object Target {
    
    inline def apply(`type`: String): Target = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofUtils
    extends StObject
       with Instantiable0[Utils] {
    
    /** inserts a CSS rule */
    def addCSSRule(sheet: CSSStyleSheet, selector: String, rules: String): Unit = js.native
    
    def addElStyles(el: HTMLElement, styles: StringDictionary[String | js.Array[String]]): Unit = js.native
    
    def appendTo(el: HTMLElement, parent: String): Unit = js.native
    def appendTo(el: HTMLElement, parent: HTMLElement): Unit = js.native
    def appendTo(el: HTMLElement, parent: Node): Unit = js.native
    
    /** single level clone, returning a new object with same top fields. This will share sub objects and arrays */
    def clone[T](obj: T): T = js.native
    
    /**
      * Recursive clone version that returns a full copy, checking for nested objects and arrays ONLY.
      * Note: this will use as-is any key starting with double __ (and not copy inside) some lib have circular dependencies.
      */
    def cloneDeep[T](obj: T): T = js.native
    
    /** deep clone the given HTML node, removing teh unique id field */
    def cloneNode(el: HTMLElement): HTMLElement = js.native
    
    /** return the closest parent (or itself) matching the given class */
    def closestByClass(el: HTMLElement, name: String): HTMLElement = js.native
    
    /** copies over b size & position (GridStackPosition), and possibly min/max as well */
    def copyPos(a: GridStackWidget, b: GridStackWidget): GridStackWidget = js.native
    def copyPos(a: GridStackWidget, b: GridStackWidget, doMinMax: Boolean): GridStackWidget = js.native
    
    /**
      * creates a style sheet with style id under given parent
      * @param id will set the 'gs-style-id' attribute to that id
      * @param parent to insert the stylesheet as first child,
      * if none supplied it will be appended to the document head instead.
      */
    def createStylesheet(id: String): CSSStyleSheet = js.native
    def createStylesheet(id: String, parent: HTMLElement): CSSStyleSheet = js.native
    
    /** copies unset fields in target to use the given default sources values */
    def defaults(target: Any, sources: Any*): js.Object = js.native
    
    /** convert a potential selector into actual single element */
    def getElement(els: GridStackElement): HTMLElement = js.native
    
    /** convert a potential selector into actual list of html elements */
    def getElements(els: GridStackElement): js.Array[HTMLElement] = js.native
    
    def initEvent[T](e: DragEvent, info: Target): T = js.native
    def initEvent[T](e: MouseEvent, info: Target): T = js.native
    
    /** returns true if a and b overlap */
    def isIntercepted(a: GridStackPosition, b: GridStackPosition): Boolean = js.native
    
    /** returns true if a and b touch edges or corners */
    def isTouching(a: GridStackPosition, b: GridStackPosition): Boolean = js.native
    
    def parseHeight(`val`: numberOrString): HeightData = js.native
    
    /** removes field from the first object if same as the second objects (like diffing) and internal '_' for saving */
    def removeInternalAndSame(a: Any, b: Any): Unit = js.native
    
    def removePositioningStyles(el: HTMLElement): Unit = js.native
    
    /** removed the given stylesheet id */
    def removeStylesheet(id: String): Unit = js.native
    
    /** given 2 objects return true if they have the same values. Checks for Object {} having same fields and values (just 1 level down) */
    def same(a: Any, b: Any): Boolean = js.native
    
    /** true if a and b has same size & position */
    def samePos(a: GridStackPosition, b: GridStackPosition): Boolean = js.native
    
    /**
      * Sorts array of nodes
      * @param nodes array to sort
      * @param dir 1 for asc, -1 for desc (optional)
      * @param width width of the grid. If undefined the width will be calculated automatically (optional).
      **/
    def sort(nodes: js.Array[GridStackNode]): js.Array[GridStackNode] = js.native
    def sort(nodes: js.Array[GridStackNode], dir: `-1` | `1`): js.Array[GridStackNode] = js.native
    def sort(nodes: js.Array[GridStackNode], dir: `-1` | `1`, column: Double): js.Array[GridStackNode] = js.native
    def sort(nodes: js.Array[GridStackNode], dir: Unit, column: Double): js.Array[GridStackNode] = js.native
    
    /** delay calling the given function for given delay, preventing new calls from happening while waiting */
    def throttle(func: js.Function0[Unit], delay: Double): js.Function0[Unit] = js.native
    
    def toBool(v: Any): Boolean = js.native
    
    def toNumber(): Double = js.native
    def toNumber(value: String): Double = js.native
  }
  
  @js.native
  trait TypeofUtilsInstantiable
    extends StObject
       with Instantiable0[typings.gridstack.distUtilsMod.Utils] {
    
    /** inserts a CSS rule */
    def addCSSRule(sheet: CSSStyleSheet, selector: String, rules: String): Unit = js.native
    
    def addElStyles(el: HTMLElement, styles: StringDictionary[String | js.Array[String]]): Unit = js.native
    
    def appendTo(el: HTMLElement, parent: String): Unit = js.native
    def appendTo(el: HTMLElement, parent: HTMLElement): Unit = js.native
    def appendTo(el: HTMLElement, parent: Node): Unit = js.native
    
    /** single level clone, returning a new object with same top fields. This will share sub objects and arrays */
    def clone[T](obj: T): T = js.native
    
    /**
      * Recursive clone version that returns a full copy, checking for nested objects and arrays ONLY.
      * Note: this will use as-is any key starting with double __ (and not copy inside) some lib have circular dependencies.
      */
    def cloneDeep[T](obj: T): T = js.native
    
    /** deep clone the given HTML node, removing teh unique id field */
    def cloneNode(el: HTMLElement): HTMLElement = js.native
    
    /** return the closest parent (or itself) matching the given class */
    def closestByClass(el: HTMLElement, name: String): HTMLElement = js.native
    
    /** copies over b size & position (GridStackPosition), and possibly min/max as well */
    def copyPos(
      a: typings.gridstack.distTypesMod.GridStackWidget,
      b: typings.gridstack.distTypesMod.GridStackWidget
    ): typings.gridstack.distTypesMod.GridStackWidget = js.native
    def copyPos(
      a: typings.gridstack.distTypesMod.GridStackWidget,
      b: typings.gridstack.distTypesMod.GridStackWidget,
      doMinMax: Boolean
    ): typings.gridstack.distTypesMod.GridStackWidget = js.native
    
    /**
      * creates a style sheet with style id under given parent
      * @param id will set the 'gs-style-id' attribute to that id
      * @param parent to insert the stylesheet as first child,
      * if none supplied it will be appended to the document head instead.
      */
    def createStylesheet(id: String): CSSStyleSheet = js.native
    def createStylesheet(id: String, parent: HTMLElement): CSSStyleSheet = js.native
    
    /** copies unset fields in target to use the given default sources values */
    def defaults(target: Any, sources: Any*): js.Object = js.native
    
    /** convert a potential selector into actual single element */
    def getElement(els: typings.gridstack.distTypesMod.GridStackElement): HTMLElement = js.native
    
    /** convert a potential selector into actual list of html elements */
    def getElements(els: typings.gridstack.distTypesMod.GridStackElement): js.Array[HTMLElement] = js.native
    
    def initEvent[T](e: DragEvent, info: Target): T = js.native
    def initEvent[T](e: MouseEvent, info: Target): T = js.native
    
    /** returns true if a and b overlap */
    def isIntercepted(
      a: typings.gridstack.distTypesMod.GridStackPosition,
      b: typings.gridstack.distTypesMod.GridStackPosition
    ): Boolean = js.native
    
    /** returns true if a and b touch edges or corners */
    def isTouching(
      a: typings.gridstack.distTypesMod.GridStackPosition,
      b: typings.gridstack.distTypesMod.GridStackPosition
    ): Boolean = js.native
    
    def parseHeight(`val`: typings.gridstack.distTypesMod.numberOrString): typings.gridstack.distUtilsMod.HeightData = js.native
    
    /** removes field from the first object if same as the second objects (like diffing) and internal '_' for saving */
    def removeInternalAndSame(a: Any, b: Any): Unit = js.native
    
    def removePositioningStyles(el: HTMLElement): Unit = js.native
    
    /** removed the given stylesheet id */
    def removeStylesheet(id: String): Unit = js.native
    
    /** given 2 objects return true if they have the same values. Checks for Object {} having same fields and values (just 1 level down) */
    def same(a: Any, b: Any): Boolean = js.native
    
    /** true if a and b has same size & position */
    def samePos(
      a: typings.gridstack.distTypesMod.GridStackPosition,
      b: typings.gridstack.distTypesMod.GridStackPosition
    ): Boolean = js.native
    
    /**
      * Sorts array of nodes
      * @param nodes array to sort
      * @param dir 1 for asc, -1 for desc (optional)
      * @param width width of the grid. If undefined the width will be calculated automatically (optional).
      **/
    def sort(nodes: js.Array[typings.gridstack.distTypesMod.GridStackNode]): js.Array[typings.gridstack.distTypesMod.GridStackNode] = js.native
    def sort(nodes: js.Array[typings.gridstack.distTypesMod.GridStackNode], dir: `-1` | `1`): js.Array[typings.gridstack.distTypesMod.GridStackNode] = js.native
    def sort(nodes: js.Array[typings.gridstack.distTypesMod.GridStackNode], dir: `-1` | `1`, column: Double): js.Array[typings.gridstack.distTypesMod.GridStackNode] = js.native
    def sort(nodes: js.Array[typings.gridstack.distTypesMod.GridStackNode], dir: Unit, column: Double): js.Array[typings.gridstack.distTypesMod.GridStackNode] = js.native
    
    /** delay calling the given function for given delay, preventing new calls from happening while waiting */
    def throttle(func: js.Function0[Unit], delay: Double): js.Function0[Unit] = js.native
    
    def toBool(v: Any): Boolean = js.native
    
    def toNumber(): Double = js.native
    def toNumber(value: String): Double = js.native
  }
}
