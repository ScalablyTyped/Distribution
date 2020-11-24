package typings.heremaps.H.clustering

import typings.heremaps.H.geo.Point
import typings.heremaps.H.geo.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface describes a cluster of data points, which fulfill the clustering specification (i.e. data points are within the epsilon and there are enough points to form a cluster).
  */
@js.native
trait ICluster extends js.Object {
  
  /**
    * Invokes the specified callback for each data point which is part of this cluster, even indirectly.
    * @param callback {function(H.clustering.INoisePoint)} - The callback gets the currently traversed noise point as argument.
    */
  def forEachDataPoint(callback: js.Function1[/* noise */ INoisePoint, Unit]): Unit = js.native
  
  /**
    * Invokes the specified callback for each "entry" of the cluster.
    * That "entry" can be either a cluster which implements H.clustering.ICluster interface or a noise point which implements H.clustering.INoisePoint interface.
    * @param callback {function(H.clustering.IResult)} - The callback gets the currently traversed entry as an argument, which is cluster or noise point.
    */
  def forEachEntry(callback: js.Function1[/* result */ IResult, Unit]): Unit = js.native
  
  /**
    * Returns the bounding rectangle of this cluster.
    * @returns {H.geo.Rect}
    */
  def getBounds(): Rect = js.native
  
  /**
    * Returns the maximum zoom level where this cluster doesn't fall apart into sub clusters and/or noise poinst
    * @returns {number}
    */
  def getMaxZoom(): Double = js.native
  
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
object ICluster {
  
  @scala.inline
  def apply(
    forEachDataPoint: js.Function1[/* noise */ INoisePoint, Unit] => Unit,
    forEachEntry: js.Function1[/* result */ IResult, Unit] => Unit,
    getBounds: () => Rect,
    getMaxZoom: () => Double,
    getMinZoom: () => Double,
    getPosition: () => Point,
    getWeight: () => Double,
    isCluster: () => Boolean
  ): ICluster = {
    val __obj = js.Dynamic.literal(forEachDataPoint = js.Any.fromFunction1(forEachDataPoint), forEachEntry = js.Any.fromFunction1(forEachEntry), getBounds = js.Any.fromFunction0(getBounds), getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinZoom = js.Any.fromFunction0(getMinZoom), getPosition = js.Any.fromFunction0(getPosition), getWeight = js.Any.fromFunction0(getWeight), isCluster = js.Any.fromFunction0(isCluster))
    __obj.asInstanceOf[ICluster]
  }
  
  @scala.inline
  implicit class IClusterOps[Self <: ICluster] (val x: Self) extends AnyVal {
    
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
    def setForEachDataPoint(value: js.Function1[/* noise */ INoisePoint, Unit] => Unit): Self = this.set("forEachDataPoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForEachEntry(value: js.Function1[/* result */ IResult, Unit] => Unit): Self = this.set("forEachEntry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBounds(value: () => Rect): Self = this.set("getBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxZoom(value: () => Double): Self = this.set("getMaxZoom", js.Any.fromFunction0(value))
    
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
