package typings.makerjs.MakerJs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Callback to model.findChains() with resulting array of chains and unchained paths.
  */
type IChainCallback = js.Function4[
/* chains */ js.Array[IChain], 
/* loose */ js.Array[IWalkPath], 
/* layer */ String, 
/* ignored */ js.UndefOr[js.Array[IWalkPath]], 
Unit]

/**
  * A map of chains by layer.
  */
type IChainsMap = StringDictionary[js.Array[IChain]]

/**
  * Compare keys to see if they are equal.
  */
type ICollectionKeyComparer[K] = js.Function2[/* a */ K, /* b */ K, Boolean]

/**
  * A map of measurements.
  */
type IMeasureMap = StringDictionary[IMeasure]

/**
  * Model objects by id.
  */
type IModelMap = StringDictionary[IModel]

/**
  * Callback signature for model.walkPaths().
  */
type IModelPathCallback = js.Function3[/* modelContext */ IModel, /* pathId */ String, /* pathContext */ IPath, Unit]

/**
  * Path objects by id.
  */
type IPathMap = StringDictionary[IPath | IPathArc | IPathCircle | IPathLine]

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
type IPoint = NumberDictionary[Double]

/**
  * Callback signature for model.walk().
  */
type IWalkModelCallback = js.Function1[/* context */ IWalkModel, Unit]

/**
  * Callback signature for model.walk(), which may return false to halt any further walking.
  */
type IWalkModelCancellableCallback = js.Function1[/* context */ IWalkModel, Boolean]

/**
  * Callback for returning a boolean from an IWalkPath.
  */
type IWalkPathBooleanCallback = js.Function1[/* context */ IWalkPath, Boolean]

/**
  * Callback signature for path in model.walk().
  */
type IWalkPathCallback = js.Function1[/* context */ IWalkPath, Unit]
