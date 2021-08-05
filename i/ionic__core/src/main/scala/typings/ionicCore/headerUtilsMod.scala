package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonTitleElement
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerUtilsMod {
  
  @JSImport("@ionic/core/dist/types/components/header/header.utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneElement(tagName: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(tagName.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createHeaderIndex(): js.UndefOr[HeaderIndex] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHeaderIndex")().asInstanceOf[js.UndefOr[HeaderIndex]]
  inline def createHeaderIndex(headerEl: HTMLElement): js.UndefOr[HeaderIndex] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHeaderIndex")(headerEl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HeaderIndex]]
  
  inline def handleContentScroll(scrollEl: HTMLElement, scrollHeaderIndex: HeaderIndex, contentEl: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleContentScroll")(scrollEl.asInstanceOf[js.Any], scrollHeaderIndex.asInstanceOf[js.Any], contentEl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def handleToolbarIntersection(ev: js.Any, mainHeaderIndex: HeaderIndex, scrollHeaderIndex: HeaderIndex): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleToolbarIntersection")(ev.asInstanceOf[js.Any], mainHeaderIndex.asInstanceOf[js.Any], scrollHeaderIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scaleLargeTitles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleLargeTitles")().asInstanceOf[Unit]
  inline def scaleLargeTitles(toolbars: js.Array[ToolbarIndex]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleLargeTitles")(toolbars.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def scaleLargeTitles(toolbars: js.Array[ToolbarIndex], scale: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleLargeTitles")(toolbars.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scaleLargeTitles(toolbars: js.Array[ToolbarIndex], scale: Double, transition: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleLargeTitles")(toolbars.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scaleLargeTitles(toolbars: js.Array[ToolbarIndex], scale: Unit, transition: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleLargeTitles")(toolbars.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scaleLargeTitles(toolbars: Unit, scale: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleLargeTitles")(toolbars.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scaleLargeTitles(toolbars: Unit, scale: Double, transition: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleLargeTitles")(toolbars.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scaleLargeTitles(toolbars: Unit, scale: Unit, transition: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleLargeTitles")(toolbars.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setHeaderActive(headerIndex: HeaderIndex): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHeaderActive")(headerIndex.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setHeaderActive(headerIndex: HeaderIndex, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setHeaderActive")(headerIndex.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setToolbarBackgroundOpacity(toolbar: ToolbarIndex): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setToolbarBackgroundOpacity")(toolbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setToolbarBackgroundOpacity(toolbar: ToolbarIndex, opacity: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setToolbarBackgroundOpacity")(toolbar.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait HeaderIndex extends StObject {
    
    var el: HTMLElement
    
    var toolbars: js.Array[js.Any | ToolbarIndex]
  }
  object HeaderIndex {
    
    inline def apply(el: HTMLElement, toolbars: js.Array[js.Any | ToolbarIndex]): HeaderIndex = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], toolbars = toolbars.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderIndex]
    }
    
    extension [Self <: HeaderIndex](x: Self) {
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setToolbars(value: js.Array[js.Any | ToolbarIndex]): Self = StObject.set(x, "toolbars", value.asInstanceOf[js.Any])
      
      inline def setToolbarsVarargs(value: (js.Any | ToolbarIndex)*): Self = StObject.set(x, "toolbars", js.Array(value :_*))
    }
  }
  
  trait ToolbarIndex extends StObject {
    
    var background: HTMLElement
    
    var el: HTMLElement
    
    var innerTitleEl: HTMLElement
    
    var ionButtonsEl: js.Array[js.Any | HTMLElement]
    
    var ionTitleEl: js.UndefOr[HTMLIonTitleElement] = js.undefined
  }
  object ToolbarIndex {
    
    inline def apply(
      background: HTMLElement,
      el: HTMLElement,
      innerTitleEl: HTMLElement,
      ionButtonsEl: js.Array[js.Any | HTMLElement]
    ): ToolbarIndex = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], innerTitleEl = innerTitleEl.asInstanceOf[js.Any], ionButtonsEl = ionButtonsEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarIndex]
    }
    
    extension [Self <: ToolbarIndex](x: Self) {
      
      inline def setBackground(value: HTMLElement): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setInnerTitleEl(value: HTMLElement): Self = StObject.set(x, "innerTitleEl", value.asInstanceOf[js.Any])
      
      inline def setIonButtonsEl(value: js.Array[js.Any | HTMLElement]): Self = StObject.set(x, "ionButtonsEl", value.asInstanceOf[js.Any])
      
      inline def setIonButtonsElVarargs(value: (js.Any | HTMLElement)*): Self = StObject.set(x, "ionButtonsEl", js.Array(value :_*))
      
      inline def setIonTitleEl(value: HTMLIonTitleElement): Self = StObject.set(x, "ionTitleEl", value.asInstanceOf[js.Any])
      
      inline def setIonTitleElUndefined: Self = StObject.set(x, "ionTitleEl", js.undefined)
    }
  }
}
