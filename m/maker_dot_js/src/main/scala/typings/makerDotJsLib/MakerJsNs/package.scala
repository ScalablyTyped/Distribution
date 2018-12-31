package typings
package makerDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MakerJsNs {
  /**
    * Callback to model.findChains() with resulting array of chains and unchained paths.
    */
  type IChainCallback = js.Function3[
    /* chains */ js.Array[IChain], 
    /* loose */ js.Array[IWalkPath], 
    /* layer */ java.lang.String, 
    scala.Unit
  ]
  /**
    * Compare keys to see if they are equal.
    */
  type ICollectionKeyComparer[K] = js.Function2[/* a */ K, /* b */ K, scala.Boolean]
  /**
    * Callback signature for model.walkPaths().
    */
  type IModelPathCallback = js.Function3[
    /* modelContext */ IModel, 
    /* pathId */ java.lang.String, 
    /* pathContext */ IPath, 
    scala.Unit
  ]
  /**
    * Callback signature for model.walk().
    */
  type IWalkModelCallback = js.Function1[/* context */ IWalkModel, scala.Unit]
  /**
    * Callback signature for model.walk(), which may return false to halt any further walking.
    */
  type IWalkModelCancellableCallback = js.Function1[/* context */ IWalkModel, scala.Boolean]
  /**
    * Callback for returning a boolean from an IWalkPath.
    */
  type IWalkPathBooleanCallback = js.Function1[/* context */ IWalkPath, scala.Boolean]
  /**
    * Callback signature for path in model.walk().
    */
  type IWalkPathCallback = js.Function1[/* context */ IWalkPath, scala.Unit]
}
