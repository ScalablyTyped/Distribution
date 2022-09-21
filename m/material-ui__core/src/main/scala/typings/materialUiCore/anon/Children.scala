package typings.materialUiCore.anon

import typings.materialUiCore.iconButtonIconButtonMod.IconButtonProps
import typings.react.mod.ReactNode
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  /**
    * Props applied to the `IconButton` element wrapping the expand icon.
    */
  var IconButtonProps: js.UndefOr[
    Partial[
      typings.materialUiCore.iconButtonIconButtonMod.IconButtonProps[
        /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.anon.ClassKey['defaultComponent'] */ js.Any, 
        js.Object
      ]
    ]
  ] = js.undefined
  
  /**
    * The content of the expansion panel summary.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * The icon to display as the expand indicator.
    */
  var expandIcon: js.UndefOr[ReactNode] = js.undefined
}
object Children {
  
  inline def apply(): Children = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setExpandIcon(value: ReactNode): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
    
    inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    inline def setIconButtonProps(
      value: Partial[
          IconButtonProps[
            /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.anon.ClassKey['defaultComponent'] */ js.Any, 
            js.Object
          ]
        ]
    ): Self = StObject.set(x, "IconButtonProps", value.asInstanceOf[js.Any])
    
    inline def setIconButtonPropsUndefined: Self = StObject.set(x, "IconButtonProps", js.undefined)
  }
}
