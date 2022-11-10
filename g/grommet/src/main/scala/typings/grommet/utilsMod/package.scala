package typings.grommet.utilsMod

import typings.grommet.anon.ColorError
import typings.grommet.anon.Dark
import typings.grommet.anon.`38`
import typings.grommet.utilsMod.^
import typings.react.mod.ComponentType
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def deepFreeze: DeepFreeze_ = ^.asInstanceOf[js.Dynamic].selectDynamic("deepFreeze").asInstanceOf[DeepFreeze_]

inline def deepMerge: DeepMerge_ = ^.asInstanceOf[js.Dynamic].selectDynamic("deepMerge").asInstanceOf[DeepMerge_]

inline def isObject(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def normalizeColor(color: String, theme: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[String]
inline def normalizeColor(color: String, theme: js.Object, required: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[String]
inline def normalizeColor(color: Dark, theme: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[String]
inline def normalizeColor(color: Dark, theme: js.Object, required: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[String]

inline def removeUndefined[T /* <: js.Object */](obj: T): NonUndefinedProps[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[NonUndefinedProps[T]]

type A11yTitleType = String

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.around
  - typings.grommet.grommetStrings.baseline
  - typings.grommet.grommetStrings.between
  - typings.grommet.grommetStrings.center
  - typings.grommet.grommetStrings.evenly
  - typings.grommet.grommetStrings.end
  - typings.grommet.grommetStrings.start
  - typings.grommet.grommetStrings.stretch
  - java.lang.String
*/
type AlignContentType = _AlignContentType | String

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.baseline
  - typings.grommet.grommetStrings.center
  - typings.grommet.grommetStrings.end
  - typings.grommet.grommetStrings.start
  - typings.grommet.grommetStrings.stretch
  - java.lang.String
*/
type AlignType = _AlignType | String

type AnimateType = Boolean

type BackgroundType = String | BackgroundObject

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.xxsmall
  - typings.grommet.grommetStrings.xsmall
  - typings.grommet.grommetStrings.small
  - typings.grommet.grommetStrings.medium
  - typings.grommet.grommetStrings.large
  - typings.grommet.grommetStrings.xlarge
  - typings.grommet.grommetStrings.xxlarge
  - typings.grommet.grommetStrings.full
  - typings.grommet.grommetStrings.`1Slash2`
  - typings.grommet.grommetStrings.`1Slash3`
  - typings.grommet.grommetStrings.`2Slash3`
  - typings.grommet.grommetStrings.`1Slash4`
  - typings.grommet.grommetStrings.`2Slash4`
  - typings.grommet.grommetStrings.`3Slash4`
  - typings.grommet.grommetStrings.auto
  - java.lang.String
*/
type BasisType = _BasisType | String

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typings.grommet.utilsMod.BoxSideType
  - typings.grommet.anon.ColorError
  - js.Array[typings.grommet.anon.ColorError]
*/
type BorderType = _BorderType | js.Array[ColorError] | Boolean

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.xsmall
  - typings.grommet.grommetStrings.small
  - typings.grommet.grommetStrings.medium
  - typings.grommet.grommetStrings.large
  - typings.grommet.grommetStrings.xlarge
  - java.lang.String
*/
type BoxSizeType = _BoxSizeType | String

type ColorType = js.UndefOr[String | Dark]

type DeepFreeze_ = js.Function1[/* obj */ js.Object, DeepReadonly[js.Object]]

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.none
  - typings.grommet.utilsMod.EdgeSizeType
  - typings.grommet.anon.Top
  - java.lang.String
*/
type EdgeType = _EdgeType | String

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.none
  - typings.grommet.grommetStrings.xsmall
  - typings.grommet.grommetStrings.small
  - typings.grommet.grommetStrings.medium
  - typings.grommet.grommetStrings.large
  - typings.grommet.grommetStrings.xlarge
  - java.lang.String
*/
type ElevationType = _ElevationType | String

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.horizontal
  - typings.grommet.grommetStrings.vertical
  - scala.Boolean
*/
type FillType = _FillType | Boolean

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.none
  - typings.grommet.utilsMod.EdgeSizeType
  - java.lang.String
*/
type GapType = _GapType | String

type GraphColorsType = js.Array[String] | `38`

type GridAreaType = String

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.xxsmall
  - typings.grommet.grommetStrings.xxlarge
  - typings.grommet.utilsMod.TShirtSizeType
  - typings.grommet.grommetStrings.`100Percentsign`
  - typings.grommet.anon.HeightMax
*/
type HeightType = _HeightType | String

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - java.lang.String
  - typings.grommet.grommetStrings.background
  - typings.grommet.utilsMod.BackgroundType
  - typings.grommet.anon.BackgroundElevation
*/
type HoverIndicatorType = _HoverIndicatorType | Boolean | String | BackgroundType

type KeyboardType = js.Function1[/* event */ KeyboardEvent[HTMLElement], Unit]

type MarginType = EdgeType

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends undefined ? never : T
  }}}
  */
type NonUndefined[T] = T

type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.weak
  - typings.grommet.grommetStrings.medium
  - typings.grommet.grommetStrings.strong
  - java.lang.String
  - typings.grommet.grommetBooleans.`true`
  - typings.grommet.grommetBooleans.`false`
  - scala.Double
*/
type OpacityType = _OpacityType | String | Double

type PadType = EdgeType

type PlaceHolderType = String | Element | ReactNode

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.a
  - typings.grommet.grommetStrings.abbr
  - typings.grommet.grommetStrings.address
  - typings.grommet.grommetStrings.area
  - typings.grommet.grommetStrings.article
  - typings.grommet.grommetStrings.aside
  - typings.grommet.grommetStrings.audio
  - typings.grommet.grommetStrings.b
  - typings.grommet.grommetStrings.base
  - typings.grommet.grommetStrings.bdi
  - typings.grommet.grommetStrings.bdo
  - typings.grommet.grommetStrings.big
  - typings.grommet.grommetStrings.blockquote
  - typings.grommet.grommetStrings.body
  - typings.grommet.grommetStrings.br
  - typings.grommet.grommetStrings.button
  - typings.grommet.grommetStrings.canvas
  - typings.grommet.grommetStrings.caption
  - typings.grommet.grommetStrings.cite
  - typings.grommet.grommetStrings.code
  - typings.grommet.grommetStrings.col
  - typings.grommet.grommetStrings.colgroup
  - typings.grommet.grommetStrings.data
  - typings.grommet.grommetStrings.datalist
  - typings.grommet.grommetStrings.dd
  - typings.grommet.grommetStrings.del
  - typings.grommet.grommetStrings.details
  - typings.grommet.grommetStrings.dfn
  - typings.grommet.grommetStrings.dialog
  - typings.grommet.grommetStrings.div
  - typings.grommet.grommetStrings.dl
  - typings.grommet.grommetStrings.dt
  - typings.grommet.grommetStrings.em
  - typings.grommet.grommetStrings.embed
  - typings.grommet.grommetStrings.fieldset
  - typings.grommet.grommetStrings.figcaption
  - typings.grommet.grommetStrings.figure
  - typings.grommet.grommetStrings.footer
  - typings.grommet.grommetStrings.form
  - typings.grommet.grommetStrings.h1
  - typings.grommet.grommetStrings.h2
  - typings.grommet.grommetStrings.h3
  - typings.grommet.grommetStrings.h4
  - typings.grommet.grommetStrings.h5
  - typings.grommet.grommetStrings.h6
  - typings.grommet.grommetStrings.head
  - typings.grommet.grommetStrings.header
  - typings.grommet.grommetStrings.hgroup
  - typings.grommet.grommetStrings.hr
  - typings.grommet.grommetStrings.html
  - typings.grommet.grommetStrings.i
  - typings.grommet.grommetStrings.iframe
  - typings.grommet.grommetStrings.img
  - typings.grommet.grommetStrings.input
  - typings.grommet.grommetStrings.ins
  - typings.grommet.grommetStrings.kbd
  - typings.grommet.grommetStrings.keygen
  - typings.grommet.grommetStrings.label
  - typings.grommet.grommetStrings.legend
  - typings.grommet.grommetStrings.li
  - typings.grommet.grommetStrings.link
  - typings.grommet.grommetStrings.main
  - typings.grommet.grommetStrings.map
  - typings.grommet.grommetStrings.mark
  - typings.grommet.grommetStrings.menu
  - typings.grommet.grommetStrings.menuitem
  - typings.grommet.grommetStrings.meta
  - typings.grommet.grommetStrings.meter
  - typings.grommet.grommetStrings.nav
  - typings.grommet.grommetStrings.noindex
  - typings.grommet.grommetStrings.noscript
  - typings.grommet.grommetStrings.`object`
  - typings.grommet.grommetStrings.ol
  - typings.grommet.grommetStrings.optgroup
  - typings.grommet.grommetStrings.option
  - typings.grommet.grommetStrings.output
  - typings.grommet.grommetStrings.p
  - typings.grommet.grommetStrings.param
  - typings.grommet.grommetStrings.picture
  - typings.grommet.grommetStrings.pre
  - typings.grommet.grommetStrings.progress
  - typings.grommet.grommetStrings.q
  - typings.grommet.grommetStrings.rp
  - typings.grommet.grommetStrings.rt
  - typings.grommet.grommetStrings.ruby
  - typings.grommet.grommetStrings.s
  - typings.grommet.grommetStrings.samp
  - typings.grommet.grommetStrings.slot
  - typings.grommet.grommetStrings.script
  - typings.grommet.grommetStrings.section
  - typings.grommet.grommetStrings.select
  - typings.grommet.grommetStrings.small
  - typings.grommet.grommetStrings.source
  - typings.grommet.grommetStrings.span
  - typings.grommet.grommetStrings.strong
  - typings.grommet.grommetStrings.style
  - typings.grommet.grommetStrings.sub
  - typings.grommet.grommetStrings.summary
  - typings.grommet.grommetStrings.sup
  - typings.grommet.grommetStrings.table
  - typings.grommet.grommetStrings.template
  - typings.grommet.grommetStrings.tbody
  - typings.grommet.grommetStrings.td
  - typings.grommet.grommetStrings.textarea
  - typings.grommet.grommetStrings.tfoot
  - typings.grommet.grommetStrings.th
  - typings.grommet.grommetStrings.thead
  - typings.grommet.grommetStrings.time
  - typings.grommet.grommetStrings.title
  - typings.grommet.grommetStrings.tr
  - typings.grommet.grommetStrings.track
  - typings.grommet.grommetStrings.u
  - typings.grommet.grommetStrings.ul
  - typings.grommet.grommetStrings.`var`
  - typings.grommet.grommetStrings.video
  - typings.grommet.grommetStrings.wbr
  - typings.grommet.grommetStrings.webview
  - typings.grommet.grommetStrings.svg
  - typings.grommet.grommetStrings.animate
  - typings.grommet.grommetStrings.animateMotion
  - typings.grommet.grommetStrings.animateTransform
  - typings.grommet.grommetStrings.circle
  - typings.grommet.grommetStrings.clipPath
  - typings.grommet.grommetStrings.defs
  - typings.grommet.grommetStrings.desc
  - typings.grommet.grommetStrings.ellipse
  - typings.grommet.grommetStrings.feBlend
  - typings.grommet.grommetStrings.feColorMatrix
  - typings.grommet.grommetStrings.feComponentTransfer
  - typings.grommet.grommetStrings.feComposite
  - typings.grommet.grommetStrings.feConvolveMatrix
  - typings.grommet.grommetStrings.feDiffuseLighting
  - typings.grommet.grommetStrings.feDisplacementMap
  - typings.grommet.grommetStrings.feDistantLight
  - typings.grommet.grommetStrings.feDropShadow
  - typings.grommet.grommetStrings.feFlood
  - typings.grommet.grommetStrings.feFuncA
  - typings.grommet.grommetStrings.feFuncB
  - typings.grommet.grommetStrings.feFuncG
  - typings.grommet.grommetStrings.feFuncR
  - typings.grommet.grommetStrings.feGaussianBlur
  - typings.grommet.grommetStrings.feImage
  - typings.grommet.grommetStrings.feMerge
  - typings.grommet.grommetStrings.feMergeNode
  - typings.grommet.grommetStrings.feMorphology
  - typings.grommet.grommetStrings.feOffset
  - typings.grommet.grommetStrings.fePointLight
  - typings.grommet.grommetStrings.feSpecularLighting
  - typings.grommet.grommetStrings.feSpotLight
  - typings.grommet.grommetStrings.feTile
  - typings.grommet.grommetStrings.feTurbulence
  - typings.grommet.grommetStrings.filter
  - typings.grommet.grommetStrings.foreignObject
  - typings.grommet.grommetStrings.g
  - typings.grommet.grommetStrings.image
  - typings.grommet.grommetStrings.line
  - typings.grommet.grommetStrings.linearGradient
  - typings.grommet.grommetStrings.marker
  - typings.grommet.grommetStrings.mask
  - typings.grommet.grommetStrings.metadata
  - typings.grommet.grommetStrings.mpath
  - typings.grommet.grommetStrings.path
  - typings.grommet.grommetStrings.pattern
  - typings.grommet.grommetStrings.polygon
  - typings.grommet.grommetStrings.polyline
  - typings.grommet.grommetStrings.radialGradient
  - typings.grommet.grommetStrings.rect
  - typings.grommet.grommetStrings.stop
  - typings.grommet.grommetStrings.switch
  - typings.grommet.grommetStrings.symbol
  - typings.grommet.grommetStrings.text
  - typings.grommet.grommetStrings.textPath
  - typings.grommet.grommetStrings.tspan
  - typings.grommet.grommetStrings.use
  - typings.grommet.grommetStrings.view
  - typings.react.mod.ComponentType[scala.Any]
*/
type PolymorphicType = _PolymorphicType | ComponentType[Any]

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typings.grommet.grommetStrings.xsmall
  - typings.grommet.grommetStrings.small
  - typings.grommet.grommetStrings.medium
  - typings.grommet.grommetStrings.large
  - typings.grommet.grommetStrings.xlarge
  - typings.grommet.grommetStrings.full
  - java.lang.String
  - typings.grommet.anon.Corner
*/
type RoundType = _RoundType | Boolean | String

// the basic T-Shirt sizes xsmall through xlarge. Some places add on.
/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.xsmall
  - typings.grommet.grommetStrings.small
  - typings.grommet.grommetStrings.medium
  - typings.grommet.grommetStrings.large
  - typings.grommet.grommetStrings.xlarge
  - java.lang.String
*/
type TShirtSizeType = _TShirtSizeType | String

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.hair
  - typings.grommet.grommetStrings.xsmall
  - typings.grommet.grommetStrings.small
  - typings.grommet.grommetStrings.medium
  - typings.grommet.grommetStrings.large
  - typings.grommet.grommetStrings.xlarge
  - typings.grommet.grommetStrings.none
  - java.lang.String
  - scala.Double
*/
type ThicknessType = _ThicknessType | String | Double

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.xxsmall
  - typings.grommet.grommetStrings.xxlarge
  - typings.grommet.utilsMod.TShirtSizeType
  - typings.grommet.grommetStrings.`100Percentsign`
  - typings.grommet.anon.MaxMin
*/
type WidthType = _WidthType | String
