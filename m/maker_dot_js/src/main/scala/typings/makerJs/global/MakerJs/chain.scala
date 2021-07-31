package typings.makerJs.global.MakerJs

import typings.makerJs.MakerJs.IChain
import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPoint
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
  @scala.inline
  def cycle(chainContext: IChain): IChain = ^.asInstanceOf[js.Dynamic].applyDynamic("cycle")(chainContext.asInstanceOf[js.Any]).asInstanceOf[IChain]
  @scala.inline
  def cycle(chainContext: IChain, amount: Double): IChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cycle")(chainContext.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[IChain]
  
  /**
    * Adds a fillet between each link in a chain. Each path will be cropped to fit a fillet, and all fillets will be returned as paths in a returned model object.
    *
    * @param chainToFillet The chain to add fillets to.
    * @param filletRadius Radius of the fillet.
    * @returns Model object containing paths which fillet the joints in the chain.
    */
  @scala.inline
  def fillet(chainToFillet: IChain, filletRadius: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("fillet")(chainToFillet.asInstanceOf[js.Any], filletRadius.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Reverse the links of a chain.
    *
    * @param chainContext Chain to reverse.
    * @returns The chainContext for cascading.
    */
  @scala.inline
  def reverse(chainContext: IChain): IChain = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(chainContext.asInstanceOf[js.Any]).asInstanceOf[IChain]
  
  /**
    * Set the beginning of an endless chain to a known routeKey of a path.
    *
    * @param chainContext Chain to cycle through. Must be endless.
    * @param routeKey RouteKey of the desired path to start the chain with.
    * @returns The chainContext for cascading.
    */
  @scala.inline
  def startAt(chainContext: IChain, routeKey: String): IChain = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(chainContext.asInstanceOf[js.Any], routeKey.asInstanceOf[js.Any])).asInstanceOf[IChain]
  
  /**
    * Get key points (a minimal a number of points) along a chain of paths.
    *
    * @param chainContext Chain of paths to get points from.
    * @param maxArcFacet The maximum length between points on an arc or circle.
    * @returns Array of points which are on the chain.
    */
  @scala.inline
  def toKeyPoints(chainContext: IChain): js.Array[IPoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("toKeyPoints")(chainContext.asInstanceOf[js.Any]).asInstanceOf[js.Array[IPoint]]
  @scala.inline
  def toKeyPoints(chainContext: IChain, maxArcFacet: Double): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("toKeyPoints")(chainContext.asInstanceOf[js.Any], maxArcFacet.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
  
  /**
    * Get points along a chain of paths.
    *
    * @param chainContext Chain of paths to get points from.
    * @param distance Distance along the chain between points.
    * @param maxPoints Maximum number of points to retrieve.
    * @returns Array of points which are on the chain spread at a uniform interval.
    */
  @scala.inline
  def toPoints(chainContext: IChain, distance: Double): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPoints")(chainContext.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
  @scala.inline
  def toPoints(chainContext: IChain, distance: Double, maxPoints: Double): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPoints")(chainContext.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
}
