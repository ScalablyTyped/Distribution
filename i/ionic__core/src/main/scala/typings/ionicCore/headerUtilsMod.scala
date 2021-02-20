package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonTitleElement
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerUtilsMod {
  
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "cloneElement")
  @js.native
  def cloneElement(tagName: String): Element = js.native
  
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "createHeaderIndex")
  @js.native
  def createHeaderIndex(): js.UndefOr[HeaderIndex] = js.native
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "createHeaderIndex")
  @js.native
  def createHeaderIndex(headerEl: HTMLElement): js.UndefOr[HeaderIndex] = js.native
  
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "handleContentScroll")
  @js.native
  def handleContentScroll(scrollEl: HTMLElement, scrollHeaderIndex: HeaderIndex, contentEl: HTMLElement): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "handleToolbarIntersection")
  @js.native
  def handleToolbarIntersection(ev: js.Any, mainHeaderIndex: HeaderIndex, scrollHeaderIndex: HeaderIndex): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "scaleLargeTitles")
  @js.native
  def scaleLargeTitles(): Unit = js.native
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "scaleLargeTitles")
  @js.native
  def scaleLargeTitles(toolbars: js.UndefOr[scala.Nothing], scale: js.UndefOr[scala.Nothing], transition: Boolean): Unit = js.native
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "scaleLargeTitles")
  @js.native
  def scaleLargeTitles(toolbars: js.UndefOr[scala.Nothing], scale: Double): Unit = js.native
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "scaleLargeTitles")
  @js.native
  def scaleLargeTitles(toolbars: js.UndefOr[scala.Nothing], scale: Double, transition: Boolean): Unit = js.native
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "scaleLargeTitles")
  @js.native
  def scaleLargeTitles(toolbars: js.Array[ToolbarIndex]): Unit = js.native
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "scaleLargeTitles")
  @js.native
  def scaleLargeTitles(toolbars: js.Array[ToolbarIndex], scale: js.UndefOr[scala.Nothing], transition: Boolean): Unit = js.native
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "scaleLargeTitles")
  @js.native
  def scaleLargeTitles(toolbars: js.Array[ToolbarIndex], scale: Double): Unit = js.native
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "scaleLargeTitles")
  @js.native
  def scaleLargeTitles(toolbars: js.Array[ToolbarIndex], scale: Double, transition: Boolean): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "setHeaderActive")
  @js.native
  def setHeaderActive(headerIndex: HeaderIndex): Unit = js.native
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "setHeaderActive")
  @js.native
  def setHeaderActive(headerIndex: HeaderIndex, active: Boolean): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "setToolbarBackgroundOpacity")
  @js.native
  def setToolbarBackgroundOpacity(toolbar: ToolbarIndex): Unit = js.native
  @JSImport("@ionic/core/dist/types/components/header/header.utils", "setToolbarBackgroundOpacity")
  @js.native
  def setToolbarBackgroundOpacity(toolbar: ToolbarIndex, opacity: Double): Unit = js.native
  
  @js.native
  trait HeaderIndex extends StObject {
    
    var el: HTMLElement = js.native
    
    var toolbars: js.Array[js.Any | ToolbarIndex] = js.native
  }
  object HeaderIndex {
    
    @scala.inline
    def apply(el: HTMLElement, toolbars: js.Array[js.Any | ToolbarIndex]): HeaderIndex = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], toolbars = toolbars.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderIndex]
    }
    
    @scala.inline
    implicit class HeaderIndexMutableBuilder[Self <: HeaderIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbars(value: js.Array[js.Any | ToolbarIndex]): Self = StObject.set(x, "toolbars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarsVarargs(value: (js.Any | ToolbarIndex)*): Self = StObject.set(x, "toolbars", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ToolbarIndex extends StObject {
    
    var background: HTMLElement = js.native
    
    var el: HTMLElement = js.native
    
    var innerTitleEl: HTMLElement = js.native
    
    var ionButtonsEl: js.Array[js.Any | HTMLElement] = js.native
    
    var ionTitleEl: js.UndefOr[HTMLIonTitleElement] = js.native
  }
  object ToolbarIndex {
    
    @scala.inline
    def apply(
      background: HTMLElement,
      el: HTMLElement,
      innerTitleEl: HTMLElement,
      ionButtonsEl: js.Array[js.Any | HTMLElement]
    ): ToolbarIndex = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], innerTitleEl = innerTitleEl.asInstanceOf[js.Any], ionButtonsEl = ionButtonsEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarIndex]
    }
    
    @scala.inline
    implicit class ToolbarIndexMutableBuilder[Self <: ToolbarIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: HTMLElement): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerTitleEl(value: HTMLElement): Self = StObject.set(x, "innerTitleEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIonButtonsEl(value: js.Array[js.Any | HTMLElement]): Self = StObject.set(x, "ionButtonsEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIonButtonsElVarargs(value: (js.Any | HTMLElement)*): Self = StObject.set(x, "ionButtonsEl", js.Array(value :_*))
      
      @scala.inline
      def setIonTitleEl(value: HTMLIonTitleElement): Self = StObject.set(x, "ionTitleEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIonTitleElUndefined: Self = StObject.set(x, "ionTitleEl", js.undefined)
    }
  }
}
