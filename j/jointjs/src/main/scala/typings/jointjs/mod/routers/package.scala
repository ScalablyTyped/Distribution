package typings.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routers {
  
  type GenericRouter[K /* <: typings.jointjs.mod.routers.RouterType */] = js.Function3[
    /* vertices */ js.Array[typings.jointjs.mod.dia.Point], 
    /* args */ js.UndefOr[typings.jointjs.mod.routers.GenericRouterArguments[K]], 
    /* linkView */ js.UndefOr[typings.jointjs.mod.dia.LinkView], 
    js.Array[typings.jointjs.mod.dia.Point]
  ]
  
  type GenericRouterArguments[K /* <: typings.jointjs.mod.routers.RouterType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.routers.RouterArgumentsMap[K] */ js.Any
  
  type Router = typings.jointjs.mod.routers.GenericRouter[typings.jointjs.mod.routers.RouterType]
  
  type RouterJSON = typings.jointjs.mod.routers.GenericRouterJSON[typings.jointjs.mod.routers.RouterType]
}
