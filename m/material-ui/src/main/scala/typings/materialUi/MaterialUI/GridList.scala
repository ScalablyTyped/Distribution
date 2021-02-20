package typings.materialUi.MaterialUI

import typings.materialUi.materialUiStrings.auto
import typings.materialUi.materialUiStrings.bottom
import typings.materialUi.materialUiStrings.left
import typings.materialUi.materialUiStrings.right
import typings.materialUi.materialUiStrings.top
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridList {
  
  type GridList = Component[GridListProps, js.Object, js.Any]
  
  @js.native
  trait GridListProps extends StObject {
    
    var cellHeight: js.UndefOr[Double | auto] = js.native
    
    var cols: js.UndefOr[Double] = js.native
    
    var padding: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object GridListProps {
    
    @scala.inline
    def apply(): GridListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridListProps]
    }
    
    @scala.inline
    implicit class GridListPropsMutableBuilder[Self <: GridListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellHeight(value: Double | auto): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type GridTile = Component[GridTileProps, js.Object, js.Any]
  
  @js.native
  trait GridTileProps extends StObject {
    
    var actionIcon: js.UndefOr[ReactElement] = js.native
    
    var actionPosition: js.UndefOr[left | right] = js.native
    
    var cols: js.UndefOr[Double] = js.native
    
    var containerElement: js.UndefOr[String | ReactElement | (ComponentClass[_, ComponentState])] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var subtitle: js.UndefOr[ReactNode] = js.native
    
    var subtitleStyle: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
    
    var titleBackground: js.UndefOr[String] = js.native
    
    var titlePosition: js.UndefOr[top | bottom] = js.native
    
    var titleStyle: js.UndefOr[CSSProperties] = js.native
  }
  object GridTileProps {
    
    @scala.inline
    def apply(): GridTileProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridTileProps]
    }
    
    @scala.inline
    implicit class GridTilePropsMutableBuilder[Self <: GridTileProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionIcon(value: ReactElement): Self = StObject.set(x, "actionIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionIconUndefined: Self = StObject.set(x, "actionIcon", js.undefined)
      
      @scala.inline
      def setActionPosition(value: left | right): Self = StObject.set(x, "actionPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionPositionUndefined: Self = StObject.set(x, "actionPosition", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setContainerElement(value: String | ReactElement | (ComponentClass[_, ComponentState])): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleStyle(value: CSSProperties): Self = StObject.set(x, "subtitleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleStyleUndefined: Self = StObject.set(x, "subtitleStyle", js.undefined)
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBackground(value: String): Self = StObject.set(x, "titleBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBackgroundUndefined: Self = StObject.set(x, "titleBackground", js.undefined)
      
      @scala.inline
      def setTitlePosition(value: top | bottom): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
      
      @scala.inline
      def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
