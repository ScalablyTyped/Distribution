package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object utilsMod {
  
  type A11yTitleType = java.lang.String
  
  type AnimateType = scala.Boolean
  
  type BackgroundType = java.lang.String | typings.grommet.anon.Image
  
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
  type BasisType = typings.grommet.utilsMod._BasisType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.grommet.utilsMod.BoxSideType
    - typings.grommet.anon.Error
    - js.Array[typings.grommet.anon.Error]
  */
  type BorderType = typings.grommet.utilsMod._BorderType | js.Array[typings.grommet.anon.Error] | scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.xsmall
    - typings.grommet.grommetStrings.small
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.large
    - typings.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type BoxSizeType = typings.grommet.utilsMod._BoxSizeType | java.lang.String
  
  type ColorType = js.UndefOr[java.lang.String | typings.grommet.anon.Dark]
  
  type DeepFreeze_ = js.Function1[/* obj */ js.Object, typings.grommet.utilsMod.DeepReadonly[js.Object]]
  
  type DeepReadonly[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof T ]: T[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias grommet.grommet/utils.DeepReadonly<T[K]> * / object : T[K]}
    */ typings.grommet.grommetStrings.DeepReadonly with org.scalablytyped.runtime.TopLevel[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.none
    - typings.grommet.utilsMod.EdgeSizeType
    - typings.grommet.anon.Start
    - java.lang.String
  */
  type EdgeType = typings.grommet.utilsMod._EdgeType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.none
    - typings.grommet.grommetStrings.xsmall
    - typings.grommet.grommetStrings.small
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.large
    - typings.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type ElevationType = typings.grommet.utilsMod._ElevationType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.horizontal
    - typings.grommet.grommetStrings.vertical
    - scala.Boolean
  */
  type FillType = typings.grommet.utilsMod._FillType | scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.none
    - typings.grommet.utilsMod.EdgeSizeType
    - java.lang.String
  */
  type GapType = typings.grommet.utilsMod._GapType | java.lang.String
  
  type GraphColorsType = js.Array[java.lang.String] | typings.grommet.anon.`28`
  
  type GridAreaType = java.lang.String
  
  type KeyboardType = js.Function1[/* event */ typings.react.mod.KeyboardEvent[typings.std.HTMLElement], scala.Unit]
  
  type MarginType = typings.grommet.utilsMod.EdgeType
  
  type NonUndefined[T] = T
  
  type NonUndefinedProps[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? grommet.grommet/utils.NonUndefined<T[K]>}
    */ typings.grommet.grommetStrings.NonUndefinedProps with org.scalablytyped.runtime.TopLevel[T]
  
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.weak
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.strong
    - java.lang.String
    - typings.grommet.grommetBooleans.`true`
    - typings.grommet.grommetBooleans.`false`
    - scala.Double
  */
  type OpacityType = typings.grommet.utilsMod._OpacityType | java.lang.String | scala.Double
  
  type PadType = typings.grommet.utilsMod.EdgeType
  
  type PlaceHolderType = java.lang.String | typings.react.mod.global.JSX.Element | typings.react.mod.ReactNode
  
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
    - typings.react.mod.ComponentType[js.Any]
  */
  type PolymorphicType = typings.grommet.utilsMod._PolymorphicType | typings.react.mod.ComponentType[js.Any]
  
  type PropsOf[TComponent] = js.Any
  
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
  type RoundType = typings.grommet.utilsMod._RoundType | scala.Boolean | java.lang.String
  
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
  type ThicknessType = typings.grommet.utilsMod._ThicknessType | java.lang.String | scala.Double
}
