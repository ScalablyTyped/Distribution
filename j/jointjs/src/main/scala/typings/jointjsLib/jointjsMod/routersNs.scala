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
    var endDirections: js.UndefOr[
        js.Array[
          jointjsLib.jointjsLibStrings.left | jointjsLib.jointjsLibStrings.right | jointjsLib.jointjsLibStrings.top | jointjsLib.jointjsLibStrings.bottom
        ]
      ] = js.undefined
    var excludeEnds: js.UndefOr[jointjsLib.jointjsLibStrings.source | jointjsLib.jointjsLibStrings.target] = js.undefined
    var excludeTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var maximumLoops: js.UndefOr[scala.Double] = js.undefined
    var startDirections: js.UndefOr[
        js.Array[
          jointjsLib.jointjsLibStrings.left | jointjsLib.jointjsLibStrings.right | jointjsLib.jointjsLibStrings.top | jointjsLib.jointjsLibStrings.bottom
        ]
      ] = js.undefined
    var step: js.UndefOr[scala.Double] = js.undefined
  }
  
  
  trait NormalRouterArguments extends js.Object
  
  
  trait OneSideRouterArguments extends js.Object {
    var padding: js.UndefOr[scala.Double] = js.undefined
    var side: js.UndefOr[
        jointjsLib.jointjsLibStrings.bottom | jointjsLib.jointjsLibStrings.top | jointjsLib.jointjsLibStrings.left | jointjsLib.jointjsLibStrings.right
      ] = js.undefined
  }
  
  
  trait OrthogonalRouterArguments extends js.Object {
    var elementPadding: js.UndefOr[scala.Double] = js.undefined
  }
  
  
  trait RouterArgumentsMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ScalablyTyped.runtime.StringDictionary[js.Any]] {
    var manhattan: ManhattanRouterArguments
    var metro: ManhattanRouterArguments
    var normal: NormalRouterArguments
    var oneSide: OneSideRouterArguments
    var orthogonal: OrthogonalRouterArguments
  }
  
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
  type GenericRouterArguments[K /* <: RouterType */] = js.Any
  type Router = GenericRouter[RouterType]
  type RouterArguments = GenericRouterArguments[RouterType]
  type RouterJSON = GenericRouterJSON[RouterType]
  type RouterType = jointjsLib.jointjsLibStrings.normal | jointjsLib.jointjsLibStrings.manhattan | jointjsLib.jointjsLibStrings.metro | jointjsLib.jointjsLibStrings.orthogonal | jointjsLib.jointjsLibStrings.oneSide
}

