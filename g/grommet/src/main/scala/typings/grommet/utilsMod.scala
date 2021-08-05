package typings.grommet

import org.scalablytyped.runtime.TopLevel
import typings.grommet.anon.Dark
import typings.grommet.anon.Error
import typings.grommet.anon.Image
import typings.grommet.anon.`28`
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

object utilsMod {
  
  @JSImport("grommet/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("grommet/utils", "deepFreeze")
  @js.native
  val deepFreeze: DeepFreeze_ = js.native
  
  @JSImport("grommet/utils", "deepMerge")
  @js.native
  val deepMerge: DeepMerge_ = js.native
  
  inline def isObject(item: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeColor(color: String, theme: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeColor(color: String, theme: js.Object, required: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeColor(color: Dark, theme: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeColor(color: Dark, theme: js.Object, required: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeUndefined[T /* <: js.Object */](obj: T): NonUndefinedProps[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[NonUndefinedProps[T]]
  
  type A11yTitleType = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.start
    - typings.grommet.grommetStrings.center
    - typings.grommet.grommetStrings.end
    - typings.grommet.grommetStrings.between
    - typings.grommet.grommetStrings.around
    - typings.grommet.grommetStrings.stretch
  */
  trait AlignContentType extends StObject
  object AlignContentType {
    
    inline def around: typings.grommet.grommetStrings.around = "around".asInstanceOf[typings.grommet.grommetStrings.around]
    
    inline def between: typings.grommet.grommetStrings.between = "between".asInstanceOf[typings.grommet.grommetStrings.between]
    
    inline def center: typings.grommet.grommetStrings.center = "center".asInstanceOf[typings.grommet.grommetStrings.center]
    
    inline def end: typings.grommet.grommetStrings.end = "end".asInstanceOf[typings.grommet.grommetStrings.end]
    
    inline def start: typings.grommet.grommetStrings.start = "start".asInstanceOf[typings.grommet.grommetStrings.start]
    
    inline def stretch: typings.grommet.grommetStrings.stretch = "stretch".asInstanceOf[typings.grommet.grommetStrings.stretch]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.start
    - typings.grommet.grommetStrings.center
    - typings.grommet.grommetStrings.end
    - typings.grommet.grommetStrings.stretch
  */
  trait AlignSelfType extends StObject
  object AlignSelfType {
    
    inline def center: typings.grommet.grommetStrings.center = "center".asInstanceOf[typings.grommet.grommetStrings.center]
    
    inline def end: typings.grommet.grommetStrings.end = "end".asInstanceOf[typings.grommet.grommetStrings.end]
    
    inline def start: typings.grommet.grommetStrings.start = "start".asInstanceOf[typings.grommet.grommetStrings.start]
    
    inline def stretch: typings.grommet.grommetStrings.stretch = "stretch".asInstanceOf[typings.grommet.grommetStrings.stretch]
  }
  
  type AnimateType = Boolean
  
  type BackgroundType = String | Image
  
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
    - typings.grommet.anon.Error
    - js.Array[typings.grommet.anon.Error]
  */
  type BorderType = _BorderType | js.Array[Error] | Boolean
  
  // Extracting types for common properties among components
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.top
    - typings.grommet.grommetStrings.left
    - typings.grommet.grommetStrings.bottom
    - typings.grommet.grommetStrings.right
    - typings.grommet.grommetStrings.start
    - typings.grommet.grommetStrings.end
    - typings.grommet.grommetStrings.horizontal
    - typings.grommet.grommetStrings.vertical
    - typings.grommet.grommetStrings.all
    - typings.grommet.grommetStrings.between
  */
  trait BoxSideType
    extends StObject
       with _BorderType
  object BoxSideType {
    
    inline def all: typings.grommet.grommetStrings.all = "all".asInstanceOf[typings.grommet.grommetStrings.all]
    
    inline def between: typings.grommet.grommetStrings.between = "between".asInstanceOf[typings.grommet.grommetStrings.between]
    
    inline def bottom: typings.grommet.grommetStrings.bottom = "bottom".asInstanceOf[typings.grommet.grommetStrings.bottom]
    
    inline def end: typings.grommet.grommetStrings.end = "end".asInstanceOf[typings.grommet.grommetStrings.end]
    
    inline def horizontal: typings.grommet.grommetStrings.horizontal = "horizontal".asInstanceOf[typings.grommet.grommetStrings.horizontal]
    
    inline def left: typings.grommet.grommetStrings.left = "left".asInstanceOf[typings.grommet.grommetStrings.left]
    
    inline def right: typings.grommet.grommetStrings.right = "right".asInstanceOf[typings.grommet.grommetStrings.right]
    
    inline def start: typings.grommet.grommetStrings.start = "start".asInstanceOf[typings.grommet.grommetStrings.start]
    
    inline def top: typings.grommet.grommetStrings.top = "top".asInstanceOf[typings.grommet.grommetStrings.top]
    
    inline def vertical: typings.grommet.grommetStrings.vertical = "vertical".asInstanceOf[typings.grommet.grommetStrings.vertical]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.xsmall
    - typings.grommet.grommetStrings.small
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.large
    - typings.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type BoxSizeType = _BoxSizeType | String
  
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
  trait BoxStyleType extends StObject
  object BoxStyleType {
    
    inline def dashed: typings.grommet.grommetStrings.dashed = "dashed".asInstanceOf[typings.grommet.grommetStrings.dashed]
    
    inline def dotted: typings.grommet.grommetStrings.dotted = "dotted".asInstanceOf[typings.grommet.grommetStrings.dotted]
    
    inline def double: typings.grommet.grommetStrings.double = "double".asInstanceOf[typings.grommet.grommetStrings.double]
    
    inline def groove: typings.grommet.grommetStrings.groove = "groove".asInstanceOf[typings.grommet.grommetStrings.groove]
    
    inline def hidden: typings.grommet.grommetStrings.hidden = "hidden".asInstanceOf[typings.grommet.grommetStrings.hidden]
    
    inline def inset: typings.grommet.grommetStrings.inset = "inset".asInstanceOf[typings.grommet.grommetStrings.inset]
    
    inline def outset: typings.grommet.grommetStrings.outset = "outset".asInstanceOf[typings.grommet.grommetStrings.outset]
    
    inline def ridge: typings.grommet.grommetStrings.ridge = "ridge".asInstanceOf[typings.grommet.grommetStrings.ridge]
    
    inline def solid: typings.grommet.grommetStrings.solid = "solid".asInstanceOf[typings.grommet.grommetStrings.solid]
  }
  
  trait BreakpointBorderSize extends StObject {
    
    var large: js.UndefOr[String] = js.undefined
    
    var medium: js.UndefOr[String] = js.undefined
    
    var small: js.UndefOr[String] = js.undefined
    
    var xlarge: js.UndefOr[String] = js.undefined
    
    var xsmall: js.UndefOr[String] = js.undefined
  }
  object BreakpointBorderSize {
    
    inline def apply(): BreakpointBorderSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreakpointBorderSize]
    }
    
    extension [Self <: BreakpointBorderSize](x: Self) {
      
      inline def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
      
      inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      inline def setXlarge(value: String): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
      
      inline def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
      
      inline def setXsmall(value: String): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
      
      inline def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
    }
  }
  
  trait BreakpointEdgeSize extends StObject {
    
    var hair: js.UndefOr[String] = js.undefined
    
    var large: js.UndefOr[String] = js.undefined
    
    var medium: js.UndefOr[String] = js.undefined
    
    var none: js.UndefOr[String] = js.undefined
    
    var small: js.UndefOr[String] = js.undefined
    
    var xlarge: js.UndefOr[String] = js.undefined
    
    var xsmall: js.UndefOr[String] = js.undefined
    
    var xxsmall: js.UndefOr[String] = js.undefined
  }
  object BreakpointEdgeSize {
    
    inline def apply(): BreakpointEdgeSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreakpointEdgeSize]
    }
    
    extension [Self <: BreakpointEdgeSize](x: Self) {
      
      inline def setHair(value: String): Self = StObject.set(x, "hair", value.asInstanceOf[js.Any])
      
      inline def setHairUndefined: Self = StObject.set(x, "hair", js.undefined)
      
      inline def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
      
      inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
      
      inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      inline def setXlarge(value: String): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
      
      inline def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
      
      inline def setXsmall(value: String): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
      
      inline def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
      
      inline def setXxsmall(value: String): Self = StObject.set(x, "xxsmall", value.asInstanceOf[js.Any])
      
      inline def setXxsmallUndefined: Self = StObject.set(x, "xxsmall", js.undefined)
    }
  }
  
  trait BreakpointSize extends StObject {
    
    var full: js.UndefOr[String] = js.undefined
    
    var large: js.UndefOr[String] = js.undefined
    
    var medium: js.UndefOr[String] = js.undefined
    
    var small: js.UndefOr[String] = js.undefined
    
    var xlarge: js.UndefOr[String] = js.undefined
    
    var xsmall: js.UndefOr[String] = js.undefined
    
    var xxsmall: js.UndefOr[String] = js.undefined
  }
  object BreakpointSize {
    
    inline def apply(): BreakpointSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreakpointSize]
    }
    
    extension [Self <: BreakpointSize](x: Self) {
      
      inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
      
      inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      inline def setXlarge(value: String): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
      
      inline def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
      
      inline def setXsmall(value: String): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
      
      inline def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
      
      inline def setXxsmall(value: String): Self = StObject.set(x, "xxsmall", value.asInstanceOf[js.Any])
      
      inline def setXxsmallUndefined: Self = StObject.set(x, "xxsmall", js.undefined)
    }
  }
  
  type ColorType = js.UndefOr[String | Dark]
  
  type DeepFreeze_ = js.Function1[/* obj */ js.Object, DeepReadonly[js.Object]]
  
  @js.native
  trait DeepMerge_ extends StObject {
    
    def apply[T /* <: js.Object */, S /* <: js.Object */](target: T, source: S): T & S = js.native
  }
  
  type DeepReadonly[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof T ]: T[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias grommet.grommet/utils.DeepReadonly<T[K]> * / object : T[K]}
    */ typings.grommet.grommetStrings.DeepReadonly & TopLevel[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.xxsmall
    - typings.grommet.grommetStrings.xsmall
    - typings.grommet.grommetStrings.small
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.large
    - typings.grommet.grommetStrings.xlarge
  */
  trait EdgeSizeType
    extends StObject
       with _EdgeType
       with _GapType
  object EdgeSizeType {
    
    inline def large: typings.grommet.grommetStrings.large = "large".asInstanceOf[typings.grommet.grommetStrings.large]
    
    inline def medium: typings.grommet.grommetStrings.medium = "medium".asInstanceOf[typings.grommet.grommetStrings.medium]
    
    inline def small: typings.grommet.grommetStrings.small = "small".asInstanceOf[typings.grommet.grommetStrings.small]
    
    inline def xlarge: typings.grommet.grommetStrings.xlarge = "xlarge".asInstanceOf[typings.grommet.grommetStrings.xlarge]
    
    inline def xsmall: typings.grommet.grommetStrings.xsmall = "xsmall".asInstanceOf[typings.grommet.grommetStrings.xsmall]
    
    inline def xxsmall: typings.grommet.grommetStrings.xxsmall = "xxsmall".asInstanceOf[typings.grommet.grommetStrings.xxsmall]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.none
    - typings.grommet.utilsMod.EdgeSizeType
    - typings.grommet.anon.Start
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
  
  type GraphColorsType = js.Array[String] | `28`
  
  type GridAreaType = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.start
    - typings.grommet.grommetStrings.center
    - typings.grommet.grommetStrings.end
    - typings.grommet.grommetStrings.between
    - typings.grommet.grommetStrings.around
    - typings.grommet.grommetStrings.stretch
  */
  trait JustifyContentType extends StObject
  object JustifyContentType {
    
    inline def around: typings.grommet.grommetStrings.around = "around".asInstanceOf[typings.grommet.grommetStrings.around]
    
    inline def between: typings.grommet.grommetStrings.between = "between".asInstanceOf[typings.grommet.grommetStrings.between]
    
    inline def center: typings.grommet.grommetStrings.center = "center".asInstanceOf[typings.grommet.grommetStrings.center]
    
    inline def end: typings.grommet.grommetStrings.end = "end".asInstanceOf[typings.grommet.grommetStrings.end]
    
    inline def start: typings.grommet.grommetStrings.start = "start".asInstanceOf[typings.grommet.grommetStrings.start]
    
    inline def stretch: typings.grommet.grommetStrings.stretch = "stretch".asInstanceOf[typings.grommet.grommetStrings.stretch]
  }
  
  type KeyboardType = js.Function1[/* event */ KeyboardEvent[HTMLElement], Unit]
  
  type MarginType = EdgeType
  
  type NonUndefined[T] = T
  
  type NonUndefinedProps[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? grommet.grommet/utils.NonUndefined<T[K]>}
    */ typings.grommet.grommetStrings.NonUndefinedProps & TopLevel[T]
  
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
    - typings.react.mod.ComponentType[js.Any]
  */
  type PolymorphicType = _PolymorphicType | ComponentType[js.Any]
  
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
  type RoundType = _RoundType | Boolean | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.start
    - typings.grommet.grommetStrings.center
    - typings.grommet.grommetStrings.end
  */
  trait TextAlignType extends StObject
  object TextAlignType {
    
    inline def center: typings.grommet.grommetStrings.center = "center".asInstanceOf[typings.grommet.grommetStrings.center]
    
    inline def end: typings.grommet.grommetStrings.end = "end".asInstanceOf[typings.grommet.grommetStrings.end]
    
    inline def start: typings.grommet.grommetStrings.start = "start".asInstanceOf[typings.grommet.grommetStrings.start]
  }
  
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
  
  trait _BasisType extends StObject
  
  trait _BorderType extends StObject
  
  trait _BoxSizeType extends StObject
  
  trait _EdgeType extends StObject
  
  trait _ElevationType extends StObject
  
  trait _FillType extends StObject
  
  trait _GapType extends StObject
  
  trait _OpacityType extends StObject
  
  trait _PolymorphicType extends StObject
  
  trait _RoundType extends StObject
  
  trait _ThicknessType extends StObject
}
