package typings.atMaterialDashUiSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atMaterialDashUiSystemMod {
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.alignContent
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.alignItems
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.alignSelf
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.bottom
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.boxShadow
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.displayPrint
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.flex
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.flexBasis
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.flexDirection
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.flexGrow
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.flexShrink
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.flexWrap
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.justifyContent
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.justifyItems
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.justifySelf
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.left
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.m
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.margin
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.marginBottom
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.marginLeft
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.marginRight
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.marginTop
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.marginX
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.marginY
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.mb
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.ml
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.mr
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.mt
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.mx
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.my
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.order
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.overflow
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.p
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.padding
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.paddingBottom
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.paddingLeft
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.paddingRight
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.paddingTop
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.paddingX
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.paddingY
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.pb
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.pl
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.position
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.pr
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.pt
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.px
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.py
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.right
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.textOverflow
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.top
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.visibility
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.whiteSpace
  import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.zIndex
  import typings.std.Exclude
  import typings.std.Partial
  import typings.std.Pick
  import typings.std.Record

  type BordersProps = PropsFor[
    SimpleStyleFunction[
      typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.border | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.borderTop | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.borderRight | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.borderBottom | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.borderLeft | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.borderColor | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.borderRadius
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
  type ComposedStyleFunction[T /* <: js.Array[StyleFunction[_]] */] = StyleFunction[ComposedStyleProps[T]]
  type ComposedStyleProps[T] = ComposedArg[T]
  type DisplayProps = PropsFor[
    SimpleStyleFunction[
      typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.display | displayPrint | overflow | textOverflow | visibility | whiteSpace
    ]
  ]
  type FlexboxProps = PropsFor[
    SimpleStyleFunction[
      flexBasis | flexDirection | flexWrap | justifyContent | alignItems | alignContent | order | flex | flexGrow | flexShrink | alignSelf | justifyItems | justifySelf
    ]
  ]
  // utils
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type PaletteProps = PropsFor[
    SimpleStyleFunction[
      typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.bgcolor | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.color
    ]
  ]
  type PositionsProps = PropsFor[SimpleStyleFunction[zIndex | position | top | right | bottom | left]]
  type PropsFor[SomeStyleFunction] = js.Any
  type ShadowsProps = PropsFor[SimpleStyleFunction[boxShadow]]
  type SimpleStyleFunction[PropKey /* <: String */] = StyleFunction[Partial[Record[PropKey, js.Any]]]
  type SizingProps = PropsFor[
    SimpleStyleFunction[
      typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.width | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.maxWidth | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.minWidth | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.height | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.maxHeight | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.minHeight | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.sizeWidth | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.sizeHeight
    ]
  ]
  type SpacingProps = PropsFor[
    SimpleStyleFunction[
      m | mt | mr | mb | ml | mx | my | p | pt | pr | pb | pl | px | py | margin | marginTop | marginRight | marginBottom | marginLeft | marginX | marginY | padding | paddingTop | paddingRight | paddingBottom | paddingLeft | paddingX | paddingY
    ]
  ]
  type StyleFunction[Props] = js.Function1[/* props */ Props, js.Any]
  type TypographyProps = PropsFor[
    SimpleStyleFunction[
      typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.fontFamily | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.fontSize | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.fontStyle | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.fontWeight | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.letterSpacing | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.lineHeight | typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.textAlign
    ]
  ]
}
