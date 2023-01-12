package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreBooleans.`false`
import typings.materialUiCore.materialUiCoreStrings.lg
import typings.materialUiCore.materialUiCoreStrings.md
import typings.materialUiCore.materialUiCoreStrings.sm
import typings.materialUiCore.materialUiCoreStrings.xl
import typings.materialUiCore.materialUiCoreStrings.xs
import typings.react.mod.ReactNode
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableGutters extends StObject {
  
  var children: NonNullable[ReactNode]
  
  /**
    * If `true`, the left and right padding is removed.
    */
  var disableGutters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the max-width to match the min-width of the current breakpoint.
    * This is useful if you'd prefer to design for a fixed set of sizes
    * instead of trying to accommodate a fully fluid viewport.
    * It's fluid by default.
    */
  var fixed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determine the max-width of the container.
    * The container width grows with the size of the screen.
    * Set to `false` to disable `maxWidth`.
    */
  var maxWidth: js.UndefOr[xs | sm | md | lg | xl | `false`] = js.undefined
}
object DisableGutters {
  
  inline def apply(): DisableGutters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableGutters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableGutters] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: NonNullable[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisableGutters(value: Boolean): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
    
    inline def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setMaxWidth(value: xs | sm | md | lg | xl | `false`): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
  }
}
