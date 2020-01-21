package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to path.intersection()
  */
trait IPathIntersectionOptions extends IPathIntersectionBaseOptions {
  /**
    * Optional boolean to only return deep intersections, i.e. not on an end point or tangent.
    */
  var path1Offset: js.UndefOr[IPoint] = js.undefined
  /**
    * Optional output variable which will be set to true if the paths are overlapped.
    */
  var path2Offset: js.UndefOr[IPoint] = js.undefined
}

object IPathIntersectionOptions {
  @scala.inline
  def apply(
    excludeTangents: js.UndefOr[Boolean] = js.undefined,
    out_AreOverlapped: js.UndefOr[Boolean] = js.undefined,
    path1Offset: IPoint = null,
    path2Offset: IPoint = null
  ): IPathIntersectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeTangents)) __obj.updateDynamic("excludeTangents")(excludeTangents.asInstanceOf[js.Any])
    if (!js.isUndefined(out_AreOverlapped)) __obj.updateDynamic("out_AreOverlapped")(out_AreOverlapped.asInstanceOf[js.Any])
    if (path1Offset != null) __obj.updateDynamic("path1Offset")(path1Offset.asInstanceOf[js.Any])
    if (path2Offset != null) __obj.updateDynamic("path2Offset")(path2Offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathIntersectionOptions]
  }
}

