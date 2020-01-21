package typings.makerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MakerJs {
  /**
    * Callback to model.findChains() with resulting array of chains and unchained paths.
    */
  type IChainCallback = js.Function3[
    /* chains */ js.Array[typings.makerJs.MakerJs.IChain], 
    /* loose */ js.Array[typings.makerJs.MakerJs.IWalkPath], 
    /* layer */ java.lang.String, 
    scala.Unit
  ]
  /**
    * Compare keys to see if they are equal.
    */
  type ICollectionKeyComparer[K] = js.Function2[/* a */ K, /* b */ K, scala.Boolean]
  /**
    * A map of measurements.
    */
  type IMeasureMap = org.scalablytyped.runtime.StringDictionary[typings.makerJs.MakerJs.IMeasure]
  /**
    * Model objects by id.
    */
  type IModelMap = org.scalablytyped.runtime.StringDictionary[typings.makerJs.MakerJs.IModel]
  /**
    * Callback signature for model.walkPaths().
    */
  type IModelPathCallback = js.Function3[
    /* modelContext */ typings.makerJs.MakerJs.IModel, 
    /* pathId */ java.lang.String, 
    /* pathContext */ typings.makerJs.MakerJs.IPath, 
    scala.Unit
  ]
  /**
    * A map of functions which accept a path as a parameter.
    */
  type IPathFunctionMap = /**
    * Key is the type of a path, value is a function which accepts a path object as its parameter.
    */
  org.scalablytyped.runtime.StringDictionary[js.Function1[/* pathValue */ typings.makerJs.MakerJs.IPath, scala.Unit]]
  /**
    * Path objects by id.
    */
  type IPathMap = org.scalablytyped.runtime.StringDictionary[typings.makerJs.MakerJs.IPath]
  /**
    * A map of functions which accept a path and an origin point as parameters.
    */
  type IPathOriginFunctionMap = /**
    * Key is the type of a path, value is a function which accepts a path object a point object as its parameters.
    */
  org.scalablytyped.runtime.StringDictionary[
    js.Function4[
      /* id */ java.lang.String, 
      /* pathValue */ typings.makerJs.MakerJs.IPath, 
      /* origin */ typings.makerJs.MakerJs.IPoint, 
      /* layer */ java.lang.String, 
      scala.Unit
    ]
  ]
  /**
    * An x-y point in a two-dimensional space.
    * Implemented as an array with 2 elements. The first element is x, the second element is y.
    *
    * Examples:
    * ```
    * var p: IPoint = [0, 0];   //typescript
    * var p = [0, 0];   //javascript
    * ```
    */
  type IPoint = org.scalablytyped.runtime.NumberDictionary[scala.Double]
  /**
    * Callback signature for model.walk().
    */
  type IWalkModelCallback = js.Function1[/* context */ typings.makerJs.MakerJs.IWalkModel, scala.Unit]
  /**
    * Callback signature for model.walk(), which may return false to halt any further walking.
    */
  type IWalkModelCancellableCallback = js.Function1[/* context */ typings.makerJs.MakerJs.IWalkModel, scala.Boolean]
  /**
    * Callback for returning a boolean from an IWalkPath.
    */
  type IWalkPathBooleanCallback = js.Function1[/* context */ typings.makerJs.MakerJs.IWalkPath, scala.Boolean]
  /**
    * Callback signature for path in model.walk().
    */
  type IWalkPathCallback = js.Function1[/* context */ typings.makerJs.MakerJs.IWalkPath, scala.Unit]
}
