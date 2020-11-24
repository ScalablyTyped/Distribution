package typings.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object util {
  
  type Collection = js.Object | js.Array[js.Any]
  
  type CustomizerFunction = js.Function6[
    /* objValue */ js.Any, 
    /* srcValue */ js.Any, 
    /* key */ java.lang.String, 
    /* object */ js.Any, 
    /* source */ js.Any, 
    /* stack */ js.Any, 
    typings.jointjs.mod.util.NotVoid
  ]
  
  type Iteratee = typings.jointjs.mod.util.IterateeFunction | typings.jointjs.mod.util.IterateeShorthand
  
  type IterateeFunction = js.Function1[/* value */ js.Any, typings.jointjs.mod.util.NotVoid]
  
  type IterateeShorthand = typings.jointjs.mod.util.PropertyPath
  
  // LODASH FUNCTIONS:
  type NotVoid = js.UndefOr[js.Object | scala.Null]
  
  type PropertyPath = java.lang.String | js.Array[java.lang.String]
  
  type SourceObjectsOptionalFinalCustomizer = js.Array[js.Object | typings.jointjs.mod.util.CustomizerFunction]
}
