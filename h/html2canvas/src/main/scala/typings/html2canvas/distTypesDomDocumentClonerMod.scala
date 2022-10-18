package typings.html2canvas

import typings.html2canvas.distTypesCoreContextMod.Context
import typings.html2canvas.distTypesCssLayoutBoundsMod.Bounds
import typings.std.CSSStyleDeclaration
import typings.std.Document
import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLIFrameElement
import typings.std.HTMLImageElement
import typings.std.HTMLStyleElement
import typings.std.HTMLVideoElement
import typings.std.Node
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDomDocumentClonerMod {
  
  @JSImport("html2canvas/dist/types/dom/document-cloner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/dom/document-cloner", "DocumentCloner")
  @js.native
  open class DocumentCloner protected () extends StObject {
    def this(context: Context, element: HTMLElement, options: CloneConfigurations) = this()
    
    def appendChildNode(clone: HTMLElement, child: Node, copyStyles: Boolean): Unit = js.native
    def appendChildNode(clone: SVGElement, child: Node, copyStyles: Boolean): Unit = js.native
    
    def cloneChildNodes(node: Element, clone: HTMLElement, copyStyles: Boolean): Unit = js.native
    def cloneChildNodes(node: Element, clone: SVGElement, copyStyles: Boolean): Unit = js.native
    
    def cloneNode(node: Node, copyStyles: Boolean): Node = js.native
    
    var clonedReferenceElement: js.UndefOr[HTMLElement] = js.native
    
    /* private */ val context: Any = js.native
    
    /* private */ val counters: Any = js.native
    
    def createCanvasClone(canvas: HTMLCanvasElement): HTMLImageElement | HTMLCanvasElement = js.native
    
    def createCustomElementClone(node: HTMLElement): HTMLElement = js.native
    
    def createElementClone(node: HTMLElement): HTMLElement | SVGElement = js.native
    def createElementClone(node: SVGElement): HTMLElement | SVGElement = js.native
    
    def createStyleClone(node: HTMLStyleElement): HTMLStyleElement = js.native
    
    def createVideoClone(video: HTMLVideoElement): HTMLCanvasElement = js.native
    
    /* private */ val documentElement: Any = js.native
    
    /* private */ val options: Any = js.native
    
    /* private */ var quoteDepth: Any = js.native
    
    /* private */ val referenceElement: Any = js.native
    
    def resolvePseudoContent(node: Element, clone: Element, style: CSSStyleDeclaration, pseudoElt: PseudoElementType): HTMLElement | Unit = js.native
    
    /* private */ val scrolledElements: Any = js.native
    
    def toIFrame(ownerDocument: Document, windowSize: Bounds): js.Promise[HTMLIFrameElement] = js.native
  }
  /* static members */
  object DocumentCloner {
    
    @JSImport("html2canvas/dist/types/dom/document-cloner", "DocumentCloner")
    @js.native
    val ^ : js.Any = js.native
    
    inline def destroy(container: HTMLIFrameElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  sealed trait PseudoElementType extends StObject
  @JSImport("html2canvas/dist/types/dom/document-cloner", "PseudoElementType")
  @js.native
  object PseudoElementType extends StObject {
    
    @js.native
    sealed trait AFTER
      extends StObject
         with PseudoElementType
    
    @js.native
    sealed trait BEFORE
      extends StObject
         with PseudoElementType
  }
  
  inline def copyCSSStyles(style: CSSStyleDeclaration, target: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("copyCSSStyles")(style.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def copyCSSStyles(style: CSSStyleDeclaration, target: SVGElement): SVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("copyCSSStyles")(style.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[SVGElement]
  
  trait CloneConfigurations
    extends StObject
       with CloneOptions {
    
    var copyStyles: Boolean
    
    var inlineImages: Boolean
  }
  object CloneConfigurations {
    
    inline def apply(copyStyles: Boolean, inlineImages: Boolean): CloneConfigurations = {
      val __obj = js.Dynamic.literal(copyStyles = copyStyles.asInstanceOf[js.Any], inlineImages = inlineImages.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloneConfigurations]
    }
    
    extension [Self <: CloneConfigurations](x: Self) {
      
      inline def setCopyStyles(value: Boolean): Self = StObject.set(x, "copyStyles", value.asInstanceOf[js.Any])
      
      inline def setInlineImages(value: Boolean): Self = StObject.set(x, "inlineImages", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloneOptions extends StObject {
    
    var allowTaint: js.UndefOr[Boolean] = js.undefined
    
    var ignoreElements: js.UndefOr[js.Function1[/* element */ Element, Boolean]] = js.undefined
    
    var onclone: js.UndefOr[js.Function2[/* document */ Document, /* element */ HTMLElement, Unit]] = js.undefined
  }
  object CloneOptions {
    
    inline def apply(): CloneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloneOptions]
    }
    
    extension [Self <: CloneOptions](x: Self) {
      
      inline def setAllowTaint(value: Boolean): Self = StObject.set(x, "allowTaint", value.asInstanceOf[js.Any])
      
      inline def setAllowTaintUndefined: Self = StObject.set(x, "allowTaint", js.undefined)
      
      inline def setIgnoreElements(value: /* element */ Element => Boolean): Self = StObject.set(x, "ignoreElements", js.Any.fromFunction1(value))
      
      inline def setIgnoreElementsUndefined: Self = StObject.set(x, "ignoreElements", js.undefined)
      
      inline def setOnclone(value: (/* document */ Document, /* element */ HTMLElement) => Unit): Self = StObject.set(x, "onclone", js.Any.fromFunction2(value))
      
      inline def setOncloneUndefined: Self = StObject.set(x, "onclone", js.undefined)
    }
  }
  
  trait WindowOptions extends StObject {
    
    var scrollX: Double
    
    var scrollY: Double
    
    var windowHeight: Double
    
    var windowWidth: Double
  }
  object WindowOptions {
    
    inline def apply(scrollX: Double, scrollY: Double, windowHeight: Double, windowWidth: Double): WindowOptions = {
      val __obj = js.Dynamic.literal(scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowOptions]
    }
    
    extension [Self <: WindowOptions](x: Self) {
      
      inline def setScrollX(value: Double): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
      
      inline def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
      
      inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
    }
  }
}
