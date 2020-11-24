package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object baseMod {
  
  /**
    * ExtendFn represents a function passed to `extend`. These functions receive
    * props and produce an ExtendValue.
    */
  type ExtendFn[TProps] = js.Function1[
    /* props */ typings.grommet.baseMod.ExtendProps[TProps], 
    typings.grommet.baseMod.ExtendValue[TProps]
  ]
  
  /**
    * ExtendProps represents the props that will be provided to an ExtendType.
    */
  type ExtendProps[TProps] = typings.styledComponents.styledComponentsMod.ThemedStyledProps[TProps, typings.grommet.baseMod.ThemeType]
  
  /**
    * ExtendType represents the type for `extend` values in the theme.
    *
    * Acceptable values for `extend` are one of:
    *
    * * A string containing css
    * * An array of styled-components interpolations (usually returned by the styled-components `css` helper function)
    * * A function taking props and returning one of the above values
    */
  type ExtendType[TProps] = typings.grommet.baseMod.ExtendValue[TProps] | typings.grommet.baseMod.ExtendFn[TProps]
  
  /**
    * ExtendValue represents a valid `extend` value, which can be a CSS string or a
    * styled-components interpolation. In the theme an ExtendValue can be provided
    * directly to `extend` or it can be computed as the result of an ExtendFn.
    */
  type ExtendValue[TProps] = java.lang.String | typings.styledComponents.styledComponentsMod.FlattenSimpleInterpolation | typings.styledComponents.styledComponentsMod.FlattenInterpolation[typings.grommet.baseMod.ExtendProps[TProps]]
}
