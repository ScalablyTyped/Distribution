package typings.makerJs.global.MakerJs

import typings.makerJs.MakerJs.IChain
import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MakerJs.chain")
@js.native
object chain extends js.Object {
  
  /**
    * Shift the links of an endless chain.
    *
    * @param chainContext Chain to cycle through. Must be endless.
    * @param amount Optional number of links to shift. May be negative to cycle backwards.
    * @returns The chainContext for cascading.
    */
  def cycle(chainContext: IChain): IChain = js.native
  def cycle(chainContext: IChain, amount: Double): IChain = js.native
  
  /**
    * Adds a fillet between each link in a chain. Each path will be cropped to fit a fillet, and all fillets will be returned as paths in a returned model object.
    *
    * @param chainToFillet The chain to add fillets to.
    * @param filletRadius Radius of the fillet.
    * @returns Model object containing paths which fillet the joints in the chain.
    */
  def fillet(chainToFillet: IChain, filletRadius: Double): IModel = js.native
  
  /**
    * Reverse the links of a chain.
    *
    * @param chainContext Chain to reverse.
    * @returns The chainContext for cascading.
    */
  def reverse(chainContext: IChain): IChain = js.native
  
  /**
    * Set the beginning of an endless chain to a known routeKey of a path.
    *
    * @param chainContext Chain to cycle through. Must be endless.
    * @param routeKey RouteKey of the desired path to start the chain with.
    * @returns The chainContext for cascading.
    */
  def startAt(chainContext: IChain, routeKey: String): IChain = js.native
  
  /**
    * Get key points (a minimal a number of points) along a chain of paths.
    *
    * @param chainContext Chain of paths to get points from.
    * @param maxArcFacet The maximum length between points on an arc or circle.
    * @returns Array of points which are on the chain.
    */
  def toKeyPoints(chainContext: IChain): js.Array[IPoint] = js.native
  def toKeyPoints(chainContext: IChain, maxArcFacet: Double): js.Array[IPoint] = js.native
  
  /**
    * Get points along a chain of paths.
    *
    * @param chainContext Chain of paths to get points from.
    * @param distance Distance along the chain between points.
    * @param maxPoints Maximum number of points to retrieve.
    * @returns Array of points which are on the chain spread at a uniform interval.
    */
  def toPoints(chainContext: IChain, distance: Double): js.Array[IPoint] = js.native
  def toPoints(chainContext: IChain, distance: Double, maxPoints: Double): js.Array[IPoint] = js.native
}
