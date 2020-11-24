package typings.heremaps.H.clustering

import typings.heremaps.H.geo.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface represents the result item of a clustering operation.
  */
@js.native
trait IResult extends js.Object {
  
  /**
    * Returns the minimum zoom level where this item is not part of another cluster
    * @returns {number}
    */
  def getMinZoom(): Double = js.native
  
  /**
    * Returns the geographical position of this cluster result.
    * @returns {H.geo.Point}
    */
  def getPosition(): Point = js.native
  
  /**
    * Returns the weight of this cluster result.
    * @returns {number}
    */
  def getWeight(): Double = js.native
  
  /**
    * To indicate whether this cluster result is a cluster or noise point
    * @returns {boolean}
    */
  def isCluster(): Boolean = js.native
}
object IResult {
  
  @scala.inline
  def apply(
    getMinZoom: () => Double,
    getPosition: () => Point,
    getWeight: () => Double,
    isCluster: () => Boolean
  ): IResult = {
    val __obj = js.Dynamic.literal(getMinZoom = js.Any.fromFunction0(getMinZoom), getPosition = js.Any.fromFunction0(getPosition), getWeight = js.Any.fromFunction0(getWeight), isCluster = js.Any.fromFunction0(isCluster))
    __obj.asInstanceOf[IResult]
  }
  
  @scala.inline
  implicit class IResultOps[Self <: IResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetMinZoom(value: () => Double): Self = this.set("getMinZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosition(value: () => Point): Self = this.set("getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWeight(value: () => Double): Self = this.set("getWeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCluster(value: () => Boolean): Self = this.set("isCluster", js.Any.fromFunction0(value))
  }
}
