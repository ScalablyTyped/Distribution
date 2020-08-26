package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A link in a chain, with direction of flow.
  */
@js.native
trait IChainLink extends js.Object {
  /**
    * The endpoints of the path, in absolute coords.
    */
  var endPoints: js.Array[IPoint] = js.native
  /**
    * Length of the path.
    */
  var pathLength: Double = js.native
  /**
    * Path flows forwards or reverse.
    */
  var reversed: Boolean = js.native
  /**
    * Reference to the path.
    */
  var walkedPath: IWalkPath = js.native
}

object IChainLink {
  @scala.inline
  def apply(endPoints: js.Array[IPoint], pathLength: Double, reversed: Boolean, walkedPath: IWalkPath): IChainLink = {
    val __obj = js.Dynamic.literal(endPoints = endPoints.asInstanceOf[js.Any], pathLength = pathLength.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], walkedPath = walkedPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChainLink]
  }
  @scala.inline
  implicit class IChainLinkOps[Self <: IChainLink] (val x: Self) extends AnyVal {
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
    def setEndPointsVarargs(value: IPoint*): Self = this.set("endPoints", js.Array(value :_*))
    @scala.inline
    def setEndPoints(value: js.Array[IPoint]): Self = this.set("endPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathLength(value: Double): Self = this.set("pathLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    @scala.inline
    def setWalkedPath(value: IWalkPath): Self = this.set("walkedPath", value.asInstanceOf[js.Any])
  }
  
}

