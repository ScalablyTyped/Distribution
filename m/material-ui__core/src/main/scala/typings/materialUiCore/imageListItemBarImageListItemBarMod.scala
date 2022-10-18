package typings.materialUiCore

import typings.materialUiCore.anon.PartialClassNameMapImageL
import typings.materialUiCore.materialUiCoreStrings.bottom
import typings.materialUiCore.materialUiCoreStrings.left
import typings.materialUiCore.materialUiCoreStrings.right
import typings.materialUiCore.materialUiCoreStrings.top
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListItemBarImageListItemBarMod {
  
  @JSImport("@material-ui/core/ImageListItemBar/ImageListItemBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ImageListItemBarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.positionBottom
    - typings.materialUiCore.materialUiCoreStrings.positionTop
    - typings.materialUiCore.materialUiCoreStrings.rootSubtitle
    - typings.materialUiCore.materialUiCoreStrings.titleWrap
    - typings.materialUiCore.materialUiCoreStrings.titleWrapActionPosLeft
    - typings.materialUiCore.materialUiCoreStrings.titleWrapActionPosRight
    - typings.materialUiCore.materialUiCoreStrings.title
    - typings.materialUiCore.materialUiCoreStrings.subtitle
    - typings.materialUiCore.materialUiCoreStrings.actionIcon
    - typings.materialUiCore.materialUiCoreStrings.actionIconActionPosLeft
  */
  trait ImageListItemBarClassKey extends StObject
  object ImageListItemBarClassKey {
    
    inline def actionIcon: typings.materialUiCore.materialUiCoreStrings.actionIcon = "actionIcon".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.actionIcon]
    
    inline def actionIconActionPosLeft: typings.materialUiCore.materialUiCoreStrings.actionIconActionPosLeft = "actionIconActionPosLeft".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.actionIconActionPosLeft]
    
    inline def positionBottom: typings.materialUiCore.materialUiCoreStrings.positionBottom = "positionBottom".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.positionBottom]
    
    inline def positionTop: typings.materialUiCore.materialUiCoreStrings.positionTop = "positionTop".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.positionTop]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def rootSubtitle: typings.materialUiCore.materialUiCoreStrings.rootSubtitle = "rootSubtitle".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.rootSubtitle]
    
    inline def subtitle: typings.materialUiCore.materialUiCoreStrings.subtitle = "subtitle".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.subtitle]
    
    inline def title: typings.materialUiCore.materialUiCoreStrings.title = "title".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.title]
    
    inline def titleWrap: typings.materialUiCore.materialUiCoreStrings.titleWrap = "titleWrap".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.titleWrap]
    
    inline def titleWrapActionPosLeft: typings.materialUiCore.materialUiCoreStrings.titleWrapActionPosLeft = "titleWrapActionPosLeft".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.titleWrapActionPosLeft]
    
    inline def titleWrapActionPosRight: typings.materialUiCore.materialUiCoreStrings.titleWrapActionPosRight = "titleWrapActionPosRight".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.titleWrapActionPosRight]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/ImageListItemBar/ImageListItemBar.ImageListItemBarClassKey, never> */
  trait ImageListItemBarProps extends StObject {
    
    /**
      * An IconButton element to be used as secondary action target
      * (primary action target is the item itself).
      */
    var actionIcon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Position of secondary action IconButton.
      */
    var actionPosition: js.UndefOr[left | right] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[PartialClassNameMapImageL] = js.undefined
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    /**
      * Position of the title bar.
      */
    var position: js.UndefOr[top | bottom] = js.undefined
    
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * String or element serving as subtitle (support text).
      */
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Title to be displayed on item.
      */
    var title: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Position of the title bar.
      * @deprecated Use position instead.
      */
    var titlePosition: js.UndefOr[top | bottom] = js.undefined
  }
  object ImageListItemBarProps {
    
    inline def apply(): ImageListItemBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageListItemBarProps]
    }
    
    extension [Self <: ImageListItemBarProps](x: Self) {
      
      inline def setActionIcon(value: ReactNode): Self = StObject.set(x, "actionIcon", value.asInstanceOf[js.Any])
      
      inline def setActionIconUndefined: Self = StObject.set(x, "actionIcon", js.undefined)
      
      inline def setActionPosition(value: left | right): Self = StObject.set(x, "actionPosition", value.asInstanceOf[js.Any])
      
      inline def setActionPositionUndefined: Self = StObject.set(x, "actionPosition", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClasses(value: PartialClassNameMapImageL): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setPosition(value: top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitlePosition(value: top | bottom): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
      
      inline def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
