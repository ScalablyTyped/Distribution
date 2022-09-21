package typings.makerjs.global.MakerJs

import typings.makerjs.MakerJs.IChain
import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.IPoint
import typings.makerjs.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chain {
  
  @JSGlobal("MakerJs.chain")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Shift the links of an endless chain.
    *
    * @param chainContext Chain to cycle through. Must be endless.
    * @param amount Optional number of links to shift. May be negative to cycle backwards.
    * @returns The chainContext for cascading.
    */
  inline def cycle(chainContext: IChain): IChain = ^.asInstanceOf[js.Dynamic].applyDynamic("cycle")(chainContext.asInstanceOf[js.Any]).asInstanceOf[IChain]
  inline def cycle(chainContext: IChain, amount: Double): IChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cycle")(chainContext.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[IChain]
  
  /**
    * Adds a dogbone fillet between each link in a chain. Each path will be cropped to fit a fillet, and all fillets will be returned as paths in a returned model object.
    *
    * @param chainToFillet The chain to add fillets to.
    * @param filletRadii Object specifying directional radii.
    * @param filletRadii.left Radius of left turning fillets.
    * @param filletRadii.right Radius of right turning fillets.
    * @returns Model object containing paths which fillet the joints in the chain.
    */
  inline def dogbone(chainToFillet: IChain, filletRadii: Left): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("dogbone")(chainToFillet.asInstanceOf[js.Any], filletRadii.asInstanceOf[js.Any])).asInstanceOf[IModel]
  /**
    * Adds a dogbone fillet between each link in a chain. Each path will be cropped to fit a fillet, and all fillets will be returned as paths in a returned model object.
    *
    * @param chainToFillet The chain to add fillets to.
    * @param filletRadius Radius of the fillet.
    * @returns Model object containing paths which fillet the joints in the chain.
    */
  inline def dogbone(chainToFillet: IChain, filletRadius: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("dogbone")(chainToFillet.asInstanceOf[js.Any], filletRadius.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Adds a fillet between each link in a chain. Each path will be cropped to fit a fillet, and all fillets will be returned as paths in a returned model object.
    *
    * @param chainToFillet The chain to add fillets to.
    * @param filletRadii Object specifying directional radii.
    * @param filletRadii.left Radius of left turning fillets.
    * @param filletRadii.right Radius of right turning fillets.
    * @returns Model object containing paths which fillet the joints in the chain.
    */
  inline def fillet(chainToFillet: IChain, filletRadii: Left): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("fillet")(chainToFillet.asInstanceOf[js.Any], filletRadii.asInstanceOf[js.Any])).asInstanceOf[IModel]
  /**
    * Adds a fillet between each link in a chain. Each path will be cropped to fit a fillet, and all fillets will be returned as paths in a returned model object.
    *
    * @param chainToFillet The chain to add fillets to.
    * @param filletRadius Radius of the fillet.
    * @returns Model object containing paths which fillet the joints in the chain.
    */
  inline def fillet(chainToFillet: IChain, filletRadius: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("fillet")(chainToFillet.asInstanceOf[js.Any], filletRadius.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Reverse the links of a chain.
    *
    * @param chainContext Chain to reverse.
    * @returns The chainContext for cascading.
    */
  inline def reverse(chainContext: IChain): IChain = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(chainContext.asInstanceOf[js.Any]).asInstanceOf[IChain]
  
  /**
    * Set the beginning of an endless chain to a known routeKey of a path.
    *
    * @param chainContext Chain to cycle through. Must be endless.
    * @param routeKey RouteKey of the desired path to start the chain with.
    * @returns The chainContext for cascading.
    */
  inline def startAt(chainContext: IChain, routeKey: String): IChain = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(chainContext.asInstanceOf[js.Any], routeKey.asInstanceOf[js.Any])).asInstanceOf[IChain]
  
  /**
    * Get key points (a minimal a number of points) along a chain of paths.
    *
    * @param chainContext Chain of paths to get points from.
    * @param maxArcFacet The maximum length between points on an arc or circle.
    * @returns Array of points which are on the chain.
    */
  inline def toKeyPoints(chainContext: IChain): js.Array[IPoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("toKeyPoints")(chainContext.asInstanceOf[js.Any]).asInstanceOf[js.Array[IPoint]]
  inline def toKeyPoints(chainContext: IChain, maxArcFacet: Double): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("toKeyPoints")(chainContext.asInstanceOf[js.Any], maxArcFacet.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
  
  /**
    * Convert a chain to a new model, independent of any model from where the chain was found.
    *
    * @param chainContext Chain to convert to a model.
    * @param detachFromOldModel Flag to remove the chain's paths from their current parent model. If false, each path will be cloned. If true, the original path will be re-parented into the resulting new model. Default is false.
    * @returns A new model containing paths from the chain.
    */
  inline def toNewModel(chainContext: IChain): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("toNewModel")(chainContext.asInstanceOf[js.Any]).asInstanceOf[IModel]
  inline def toNewModel(chainContext: IChain, detachFromOldModel: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("toNewModel")(chainContext.asInstanceOf[js.Any], detachFromOldModel.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  inline def toPoints(chainContext: IChain, distanceOrDistances: js.Array[Double]): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPoints")(chainContext.asInstanceOf[js.Any], distanceOrDistances.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
  inline def toPoints(chainContext: IChain, distanceOrDistances: js.Array[Double], maxPoints: Double): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPoints")(chainContext.asInstanceOf[js.Any], distanceOrDistances.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
  /**
    * Get points along a chain of paths.
    *
    * @param chainContext Chain of paths to get points from.
    * @param distance Numeric distance along the chain between points, or numeric array of distances along the chain between each point.
    * @param maxPoints Maximum number of points to retrieve.
    * @returns Array of points which are on the chain spread at a uniform interval.
    */
  inline def toPoints(chainContext: IChain, distanceOrDistances: Double): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPoints")(chainContext.asInstanceOf[js.Any], distanceOrDistances.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
  inline def toPoints(chainContext: IChain, distanceOrDistances: Double, maxPoints: Double): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPoints")(chainContext.asInstanceOf[js.Any], distanceOrDistances.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
}
