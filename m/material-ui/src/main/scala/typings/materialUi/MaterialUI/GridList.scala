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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridList {
  
  type GridList = Component[GridListProps, js.Object, Any]
  
  trait GridListProps extends StObject {
    
    var cellHeight: js.UndefOr[Double | auto] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object GridListProps {
    
    inline def apply(): GridListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridListProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridListProps] (val x: Self) extends AnyVal {
      
      inline def setCellHeight(value: Double | auto): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type GridTile = Component[GridTileProps, js.Object, Any]
  
  trait GridTileProps extends StObject {
    
    var actionIcon: js.UndefOr[ReactElement] = js.undefined
    
    var actionPosition: js.UndefOr[left | right] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var containerElement: js.UndefOr[String | ReactElement | (ComponentClass[Any, ComponentState])] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var subtitleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var titleBackground: js.UndefOr[String] = js.undefined
    
    var titlePosition: js.UndefOr[top | bottom] = js.undefined
    
    var titleStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object GridTileProps {
    
    inline def apply(): GridTileProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridTileProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridTileProps] (val x: Self) extends AnyVal {
      
      inline def setActionIcon(value: ReactElement): Self = StObject.set(x, "actionIcon", value.asInstanceOf[js.Any])
      
      inline def setActionIconUndefined: Self = StObject.set(x, "actionIcon", js.undefined)
      
      inline def setActionPosition(value: left | right): Self = StObject.set(x, "actionPosition", value.asInstanceOf[js.Any])
      
      inline def setActionPositionUndefined: Self = StObject.set(x, "actionPosition", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setContainerElement(value: String | ReactElement | (ComponentClass[Any, ComponentState])): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
      
      inline def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
      
      inline def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleStyle(value: CSSProperties): Self = StObject.set(x, "subtitleStyle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleStyleUndefined: Self = StObject.set(x, "subtitleStyle", js.undefined)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleBackground(value: String): Self = StObject.set(x, "titleBackground", value.asInstanceOf[js.Any])
      
      inline def setTitleBackgroundUndefined: Self = StObject.set(x, "titleBackground", js.undefined)
      
      inline def setTitlePosition(value: top | bottom): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
      
      inline def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
      
      inline def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
