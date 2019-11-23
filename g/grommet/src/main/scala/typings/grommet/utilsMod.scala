package typings.grommet

import typings.grommet.utilsMod.DeepFreeze
import typings.grommet.utilsMod.DeepMerge
import typings.grommet.utilsMod.DeepReadonly
import typings.grommet.utilsMod.NonUndefinedProps
import typings.grommet.utilsMod._BasisType
import typings.grommet.utilsMod._BorderType
import typings.grommet.utilsMod._BoxSizeType
import typings.grommet.utilsMod._ElevationType
import typings.grommet.utilsMod._FillType
import typings.grommet.utilsMod._GapType
import typings.grommet.utilsMod._MarginType
import typings.grommet.utilsMod._OpacityType
import typings.grommet.utilsMod._PadType
import typings.grommet.utilsMod._PolymorphicType
import typings.react.reactMod.ComponentType
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.start
    - typings.grommet.grommetStrings.center
    - typings.grommet.grommetStrings.end
    - typings.grommet.grommetStrings.between
    - typings.grommet.grommetStrings.around
    - typings.grommet.grommetStrings.stretch
  */
  trait AlignContentType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.start
    - typings.grommet.grommetStrings.center
    - typings.grommet.grommetStrings.end
    - typings.grommet.grommetStrings.stretch
  */
  trait AlignSelfType extends js.Object
  
  // Extracting types for common properties among components
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.top
    - typings.grommet.grommetStrings.left
    - typings.grommet.grommetStrings.bottom
    - typings.grommet.grommetStrings.right
    - typings.grommet.grommetStrings.horizontal
    - typings.grommet.grommetStrings.vertical
    - typings.grommet.grommetStrings.all
  */
  trait BoxSideType extends _BorderType
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.solid
    - typings.grommet.grommetStrings.dashed
    - typings.grommet.grommetStrings.dotted
    - typings.grommet.grommetStrings.double
    - typings.grommet.grommetStrings.groove
    - typings.grommet.grommetStrings.ridge
    - typings.grommet.grommetStrings.inset
    - typings.grommet.grommetStrings.outset
    - typings.grommet.grommetStrings.hidden
  */
  trait BoxStyleType extends js.Object
  
  @js.native
  trait DeepMerge extends js.Object {
    def apply[T /* <: js.Object */, S /* <: js.Array[js.Object] */](
      target: T,
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param sources because its type S is not an array type */ sources: S
    ): T with (/* import warning: ImportType.apply Failed type conversion: S[number] */ js.Any) = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.start
    - typings.grommet.grommetStrings.center
    - typings.grommet.grommetStrings.end
    - typings.grommet.grommetStrings.between
    - typings.grommet.grommetStrings.around
    - typings.grommet.grommetStrings.stretch
  */
  trait JustifyContentType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.start
    - typings.grommet.grommetStrings.center
    - typings.grommet.grommetStrings.end
  */
  trait TextAlignType extends js.Object
  
  trait _BasisType extends js.Object
  
  trait _BorderType extends js.Object
  
  trait _BoxSizeType extends js.Object
  
  trait _ElevationType extends js.Object
  
  trait _FillType extends js.Object
  
  trait _GapType extends js.Object
  
  trait _MarginType extends js.Object
  
  trait _OpacityType extends js.Object
  
  trait _PadType extends js.Object
  
  trait _PolymorphicType extends js.Object
  
  val deepFreeze: DeepFreeze = js.native
  val deepMerge: DeepMerge = js.native
  def isObject(item: js.Any): Boolean = js.native
  def normalizeColor(color: String, theme: js.Object): String = js.native
  def normalizeColor(color: String, theme: js.Object, required: Boolean): String = js.native
  def normalizeColor(color: Anon_Dark, theme: js.Object): String = js.native
  def normalizeColor(color: Anon_Dark, theme: js.Object, required: Boolean): String = js.native
  def removeUndefined[T /* <: js.Object */](obj: T): NonUndefinedProps[T] = js.native
  type A11yTitleType = String
  type AnimateType = Boolean
  type BackgroundType = String | Anon_ColorContain
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.xxsmall
    - typings.grommet.grommetStrings.xsmall
    - typings.grommet.grommetStrings.small
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.large
    - typings.grommet.grommetStrings.xlarge
    - typings.grommet.grommetStrings.xxlarge
    - typings.grommet.grommetStrings.full
    - typings.grommet.grommetStrings.`1/2`
    - typings.grommet.grommetStrings.`1/3`
    - typings.grommet.grommetStrings.`2/3`
    - typings.grommet.grommetStrings.`1/4`
    - typings.grommet.grommetStrings.`2/4`
    - typings.grommet.grommetStrings.`3/4`
    - typings.grommet.grommetStrings.auto
    - java.lang.String
  */
  type BasisType = _BasisType | String
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.grommet.utilsMod.BoxSideType
    - typings.grommet.Anon_ColorSideSizeStyle
    - js.Array[typings.grommet.Anon_ColorSideSizeStyleBoxStyleType]
  */
  type BorderType = _BorderType | js.Array[Anon_ColorSideSizeStyleBoxStyleType] | Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.xsmall
    - typings.grommet.grommetStrings.small
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.large
    - typings.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type BoxSizeType = _BoxSizeType | String
  type ColorType = String | Anon_Dark
  type DeepFreeze = js.Function1[/* obj */ js.Object, DeepReadonly[js.Object]]
  type DeepReadonly[T /* <: js.Object */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ K in keyof T ]: T[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias grommet.grommet/utils.DeepReadonly<T[K]> * / object : T[K]}
    */ typings.grommet.grommetStrings.DeepReadonly with js.Any
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
    - typings.grommet.grommetStrings.xxsmall
    - typings.grommet.grommetStrings.xsmall
    - typings.grommet.grommetStrings.small
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.large
    - typings.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type GapType = _GapType | String
  type GridAreaType = String
  type KeyboardType = js.Function1[/* event */ KeyboardEvent[HTMLElement], Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.none
    - typings.grommet.grommetStrings.xxsmall
    - typings.grommet.grommetStrings.xsmall
    - typings.grommet.grommetStrings.small
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.large
    - typings.grommet.grommetStrings.xlarge
    - typings.grommet.Anon_BottomHorizontal
    - java.lang.String
  */
  type MarginType = _MarginType | String
  type NonUndefined[T] = T
  type NonUndefinedProps[T /* <: js.Object */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? grommet.grommet/utils.NonUndefined<T[K]>}
    */ typings.grommet.grommetStrings.NonUndefinedProps with T
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.weak
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.strong
    - java.lang.String
    - typings.grommet.grommetNumbers.`true`
    - typings.grommet.grommetNumbers.`false`
    - scala.Double
  */
  type OpacityType = _OpacityType | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.none
    - typings.grommet.grommetStrings.xxsmall
    - typings.grommet.grommetStrings.xsmall
    - typings.grommet.grommetStrings.small
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.large
    - typings.grommet.grommetStrings.xlarge
    - typings.grommet.Anon_BottomHorizontal
    - java.lang.String
  */
  type PadType = _PadType | String
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
    - typings.react.reactMod.ComponentType[js.Any]
  */
  type PolymorphicType = _PolymorphicType | ComponentType[js.Any]
}

