package typings.jointjs.jointjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsMod.diaNs.LinkEnd
import typings.jointjs.jointjsMod.diaNs.LinkView
import typings.jointjs.jointjsMod.diaNs.OrthogonalDirection
import typings.jointjs.jointjsMod.diaNs.Point
import typings.jointjs.jointjsMod.diaNs.Sides
import typings.jointjs.jointjsMod.routersNs.GenericRouter
import typings.jointjs.jointjsMod.routersNs.GenericRouterArguments
import typings.jointjs.jointjsMod.routersNs.GenericRouterJSON
import typings.jointjs.jointjsMod.routersNs.ManhattanRouterArguments
import typings.jointjs.jointjsMod.routersNs.NormalRouterArguments
import typings.jointjs.jointjsMod.routersNs.OneSideRouterArguments
import typings.jointjs.jointjsMod.routersNs.OrthogonalRouterArguments
import typings.jointjs.jointjsMod.routersNs.RouterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "routers")
@js.native
object routersNs extends js.Object {
  trait GenericRouterJSON[K /* <: RouterType */] extends js.Object {
    var args: js.UndefOr[GenericRouterArguments[K]] = js.undefined
    var name: K
  }
  
  trait ManhattanRouterArguments extends js.Object {
    var endDirections: js.UndefOr[js.Array[OrthogonalDirection]] = js.undefined
    var excludeEnds: js.UndefOr[js.Array[LinkEnd]] = js.undefined
    var excludeTypes: js.UndefOr[js.Array[String]] = js.undefined
    var maxAllowedDirectionChange: js.UndefOr[Double] = js.undefined
    var maximumLoops: js.UndefOr[Double] = js.undefined
    var padding: js.UndefOr[Sides] = js.undefined
    var perpendicular: js.UndefOr[Boolean] = js.undefined
    var startDirections: js.UndefOr[js.Array[OrthogonalDirection]] = js.undefined
    var step: js.UndefOr[Double] = js.undefined
  }
  
  trait NormalRouterArguments extends js.Object
  
  trait OneSideRouterArguments extends js.Object {
    var padding: js.UndefOr[Sides] = js.undefined
    var side: js.UndefOr[OrthogonalDirection] = js.undefined
  }
  
  trait OrthogonalRouterArguments extends js.Object {
    var elementPadding: js.UndefOr[Double] = js.undefined
    var padding: js.UndefOr[Sides] = js.undefined
  }
  
  trait RouterArgumentsMap
    extends /* key */ StringDictionary[StringDictionary[js.Any]] {
    var manhattan: ManhattanRouterArguments
    var metro: ManhattanRouterArguments
    var normal: NormalRouterArguments
    var oneSide: OneSideRouterArguments
    var orthogonal: OrthogonalRouterArguments
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.normal
    - typings.jointjs.jointjsStrings.manhattan
    - typings.jointjs.jointjsStrings.metro
    - typings.jointjs.jointjsStrings.orthogonal
    - typings.jointjs.jointjsStrings.oneSide
  */
  trait RouterType extends js.Object
  
  var manhattan: GenericRouter[typings.jointjs.jointjsStrings.manhattan] = js.native
  var metro: GenericRouter[typings.jointjs.jointjsStrings.metro] = js.native
  var normal: GenericRouter[typings.jointjs.jointjsStrings.normal] = js.native
  var oneSide: GenericRouter[typings.jointjs.jointjsStrings.oneSide] = js.native
  var orthogonal: GenericRouter[typings.jointjs.jointjsStrings.orthogonal] = js.native
  type GenericRouter[K /* <: RouterType */] = js.Function3[
    /* vertices */ js.Array[Point], 
    /* args */ js.UndefOr[GenericRouterArguments[K]], 
    /* linkView */ js.UndefOr[LinkView], 
    js.Array[Point]
  ]
  type GenericRouterArguments[K /* <: RouterType */] = /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.routers.RouterArgumentsMap[K] */ js.Any
  type Router = GenericRouter[RouterType]
  type RouterArguments = GenericRouterArguments[RouterType]
  type RouterJSON = GenericRouterJSON[RouterType]
}

