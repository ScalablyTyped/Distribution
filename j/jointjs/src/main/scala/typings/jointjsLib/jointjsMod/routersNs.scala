package typings
package jointjsLib.jointjsMod

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
    var endDirections: js.UndefOr[js.Array[jointjsLib.jointjsMod.diaNs.OrthogonalDirection]] = js.undefined
    var excludeEnds: js.UndefOr[js.Array[jointjsLib.jointjsMod.diaNs.LinkEnd]] = js.undefined
    var excludeTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var maxAllowedDirectionChange: js.UndefOr[scala.Double] = js.undefined
    var maximumLoops: js.UndefOr[scala.Double] = js.undefined
    var padding: js.UndefOr[jointjsLib.jointjsMod.diaNs.Sides] = js.undefined
    var perpendicular: js.UndefOr[scala.Boolean] = js.undefined
    var startDirections: js.UndefOr[js.Array[jointjsLib.jointjsMod.diaNs.OrthogonalDirection]] = js.undefined
    var step: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait NormalRouterArguments extends js.Object
  
  trait OneSideRouterArguments extends js.Object {
    var padding: js.UndefOr[jointjsLib.jointjsMod.diaNs.Sides] = js.undefined
    var side: js.UndefOr[jointjsLib.jointjsMod.diaNs.OrthogonalDirection] = js.undefined
  }
  
  trait OrthogonalRouterArguments extends js.Object {
    var elementPadding: js.UndefOr[scala.Double] = js.undefined
    var padding: js.UndefOr[jointjsLib.jointjsMod.diaNs.Sides] = js.undefined
  }
  
  trait RouterArgumentsMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]] {
    var manhattan: ManhattanRouterArguments
    var metro: ManhattanRouterArguments
    var normal: NormalRouterArguments
    var oneSide: OneSideRouterArguments
    var orthogonal: OrthogonalRouterArguments
  }
  
  /* Rewritten from type alias, can be one of: 
    - jointjsLib.jointjsLibStrings.normal
    - jointjsLib.jointjsLibStrings.manhattan
    - jointjsLib.jointjsLibStrings.metro
    - jointjsLib.jointjsLibStrings.orthogonal
    - jointjsLib.jointjsLibStrings.oneSide
  */
  trait RouterType extends js.Object
  
  var manhattan: GenericRouter[jointjsLib.jointjsLibStrings.manhattan] = js.native
  var metro: GenericRouter[jointjsLib.jointjsLibStrings.metro] = js.native
  var normal: GenericRouter[jointjsLib.jointjsLibStrings.normal] = js.native
  var oneSide: GenericRouter[jointjsLib.jointjsLibStrings.oneSide] = js.native
  var orthogonal: GenericRouter[jointjsLib.jointjsLibStrings.orthogonal] = js.native
  type GenericRouter[K /* <: RouterType */] = js.Function3[
    /* vertices */ js.Array[jointjsLib.jointjsMod.diaNs.Point], 
    /* args */ js.UndefOr[GenericRouterArguments[K]], 
    /* linkView */ js.UndefOr[jointjsLib.jointjsMod.diaNs.LinkView], 
    js.Array[jointjsLib.jointjsMod.diaNs.Point]
  ]
  type GenericRouterArguments[K /* <: RouterType */] = /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.routers.RouterArgumentsMap[K] */ js.Any
  type Router = GenericRouter[RouterType]
  type RouterArguments = GenericRouterArguments[RouterType]
  type RouterJSON = GenericRouterJSON[RouterType]
}

