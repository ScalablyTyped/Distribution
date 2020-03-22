package typings.materialUiSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BordersProps = typings.materialUiSystem.mod.PropsFor[
    typings.materialUiSystem.mod.SimpleStyleFunction[
      typings.materialUiSystem.materialUiSystemStrings.border | typings.materialUiSystem.materialUiSystemStrings.borderTop | typings.materialUiSystem.materialUiSystemStrings.borderRight | typings.materialUiSystem.materialUiSystemStrings.borderBottom | typings.materialUiSystem.materialUiSystemStrings.borderLeft | typings.materialUiSystem.materialUiSystemStrings.borderColor | typings.materialUiSystem.materialUiSystemStrings.borderRadius
    ]
  ]
  // compose.js
  /**
    * given a list of StyleFunction return the intersection of the props each individual
    * StyleFunction requires.
    *
    * If `firstFn` requires { color: string } and `secondFn` requires { spacing: number }
    * their composed function requires { color: string, spacing: number }
    */
  type ComposedArg[T] = js.Any
  type ComposedStyleFunction[T /* <: js.Array[typings.materialUiSystem.mod.StyleFunction[_]] */] = typings.materialUiSystem.mod.StyleFunction[typings.materialUiSystem.mod.ComposedStyleProps[T]]
  type ComposedStyleProps[T] = typings.materialUiSystem.mod.ComposedArg[T]
  type DisplayProps = typings.materialUiSystem.mod.PropsFor[
    typings.materialUiSystem.mod.SimpleStyleFunction[
      typings.materialUiSystem.materialUiSystemStrings.display | typings.materialUiSystem.materialUiSystemStrings.displayPrint | typings.materialUiSystem.materialUiSystemStrings.overflow | typings.materialUiSystem.materialUiSystemStrings.textOverflow | typings.materialUiSystem.materialUiSystemStrings.visibility | typings.materialUiSystem.materialUiSystemStrings.whiteSpace
    ]
  ]
  type FlexboxProps = typings.materialUiSystem.mod.PropsFor[
    typings.materialUiSystem.mod.SimpleStyleFunction[
      typings.materialUiSystem.materialUiSystemStrings.flexBasis | typings.materialUiSystem.materialUiSystemStrings.flexDirection | typings.materialUiSystem.materialUiSystemStrings.flexWrap | typings.materialUiSystem.materialUiSystemStrings.justifyContent | typings.materialUiSystem.materialUiSystemStrings.alignItems | typings.materialUiSystem.materialUiSystemStrings.alignContent | typings.materialUiSystem.materialUiSystemStrings.order | typings.materialUiSystem.materialUiSystemStrings.flex | typings.materialUiSystem.materialUiSystemStrings.flexGrow | typings.materialUiSystem.materialUiSystemStrings.flexShrink | typings.materialUiSystem.materialUiSystemStrings.alignSelf | typings.materialUiSystem.materialUiSystemStrings.justifyItems | typings.materialUiSystem.materialUiSystemStrings.justifySelf
    ]
  ]
  type GridProps = typings.materialUiSystem.mod.PropsFor[
    typings.materialUiSystem.mod.SimpleStyleFunction[
      typings.materialUiSystem.materialUiSystemStrings.gridGap | typings.materialUiSystem.materialUiSystemStrings.gridColumnGap | typings.materialUiSystem.materialUiSystemStrings.gridRowGap | typings.materialUiSystem.materialUiSystemStrings.gridColumn | typings.materialUiSystem.materialUiSystemStrings.gridRow | typings.materialUiSystem.materialUiSystemStrings.gridAutoFlow | typings.materialUiSystem.materialUiSystemStrings.gridAutoColumns | typings.materialUiSystem.materialUiSystemStrings.gridAutoRows | typings.materialUiSystem.materialUiSystemStrings.gridTemplateColumns | typings.materialUiSystem.materialUiSystemStrings.gridTemplateRows | typings.materialUiSystem.materialUiSystemStrings.gridTemplateAreas | typings.materialUiSystem.materialUiSystemStrings.gridArea
    ]
  ]
  // utils
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type PaletteProps = typings.materialUiSystem.mod.PropsFor[
    typings.materialUiSystem.mod.SimpleStyleFunction[
      typings.materialUiSystem.materialUiSystemStrings.bgcolor | typings.materialUiSystem.materialUiSystemStrings.color
    ]
  ]
  type PositionsProps = typings.materialUiSystem.mod.PropsFor[
    typings.materialUiSystem.mod.SimpleStyleFunction[
      typings.materialUiSystem.materialUiSystemStrings.zIndex | typings.materialUiSystem.materialUiSystemStrings.position | typings.materialUiSystem.materialUiSystemStrings.top | typings.materialUiSystem.materialUiSystemStrings.right | typings.materialUiSystem.materialUiSystemStrings.bottom | typings.materialUiSystem.materialUiSystemStrings.left
    ]
  ]
  type PropsFor[SomeStyleFunction] = js.Any
  type ShadowsProps = typings.materialUiSystem.mod.PropsFor[
    typings.materialUiSystem.mod.SimpleStyleFunction[typings.materialUiSystem.materialUiSystemStrings.boxShadow]
  ]
  type SimpleStyleFunction[PropKey /* <: java.lang.String */] = typings.materialUiSystem.mod.StyleFunction[typings.std.Partial[typings.std.Record[PropKey, js.Any]]]
  type SizingProps = typings.materialUiSystem.mod.PropsFor[
    typings.materialUiSystem.mod.SimpleStyleFunction[
      typings.materialUiSystem.materialUiSystemStrings.width | typings.materialUiSystem.materialUiSystemStrings.maxWidth | typings.materialUiSystem.materialUiSystemStrings.minWidth | typings.materialUiSystem.materialUiSystemStrings.height | typings.materialUiSystem.materialUiSystemStrings.maxHeight | typings.materialUiSystem.materialUiSystemStrings.minHeight | typings.materialUiSystem.materialUiSystemStrings.sizeWidth | typings.materialUiSystem.materialUiSystemStrings.sizeHeight | typings.materialUiSystem.materialUiSystemStrings.boxSizing
    ]
  ]
  type SpacingProps = typings.materialUiSystem.mod.PropsFor[
    typings.materialUiSystem.mod.SimpleStyleFunction[
      typings.materialUiSystem.materialUiSystemStrings.m | typings.materialUiSystem.materialUiSystemStrings.mt | typings.materialUiSystem.materialUiSystemStrings.mr | typings.materialUiSystem.materialUiSystemStrings.mb | typings.materialUiSystem.materialUiSystemStrings.ml | typings.materialUiSystem.materialUiSystemStrings.mx | typings.materialUiSystem.materialUiSystemStrings.my | typings.materialUiSystem.materialUiSystemStrings.p | typings.materialUiSystem.materialUiSystemStrings.pt | typings.materialUiSystem.materialUiSystemStrings.pr | typings.materialUiSystem.materialUiSystemStrings.pb | typings.materialUiSystem.materialUiSystemStrings.pl | typings.materialUiSystem.materialUiSystemStrings.px | typings.materialUiSystem.materialUiSystemStrings.py | typings.materialUiSystem.materialUiSystemStrings.margin | typings.materialUiSystem.materialUiSystemStrings.marginTop | typings.materialUiSystem.materialUiSystemStrings.marginRight | typings.materialUiSystem.materialUiSystemStrings.marginBottom | typings.materialUiSystem.materialUiSystemStrings.marginLeft | typings.materialUiSystem.materialUiSystemStrings.marginX | typings.materialUiSystem.materialUiSystemStrings.marginY | typings.materialUiSystem.materialUiSystemStrings.padding | typings.materialUiSystem.materialUiSystemStrings.paddingTop | typings.materialUiSystem.materialUiSystemStrings.paddingRight | typings.materialUiSystem.materialUiSystemStrings.paddingBottom | typings.materialUiSystem.materialUiSystemStrings.paddingLeft | typings.materialUiSystem.materialUiSystemStrings.paddingX | typings.materialUiSystem.materialUiSystemStrings.paddingY
    ]
  ]
  type StyleFunction[Props] = js.Function1[/* props */ Props, js.Any]
  type TypographyProps = typings.materialUiSystem.mod.PropsFor[
    typings.materialUiSystem.mod.SimpleStyleFunction[
      typings.materialUiSystem.materialUiSystemStrings.fontFamily | typings.materialUiSystem.materialUiSystemStrings.fontSize | typings.materialUiSystem.materialUiSystemStrings.fontStyle | typings.materialUiSystem.materialUiSystemStrings.fontWeight | typings.materialUiSystem.materialUiSystemStrings.letterSpacing | typings.materialUiSystem.materialUiSystemStrings.lineHeight | typings.materialUiSystem.materialUiSystemStrings.textAlign
    ]
  ]
}
