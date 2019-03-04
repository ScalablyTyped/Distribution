package typings
package atMapboxSphericalmercatorLib.atMapboxSphericalmercatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SphericalMercator extends js.Object {
  def bbox(
    x: scala.Double,
    y: scala.Double,
    zoom: scala.Double,
    tms_style: scala.Boolean,
    srs: atMapboxSphericalmercatorLib.Projection
  ): atMapboxSphericalmercatorLib.BoundingBox
  def convert(bbox: atMapboxSphericalmercatorLib.BoundingBox, to: atMapboxSphericalmercatorLib.Projection): atMapboxSphericalmercatorLib.BoundingBox
  def forward(ll: atMapboxSphericalmercatorLib.LatLngPoint): atMapboxSphericalmercatorLib.XYPoint
  def inverse(xy: atMapboxSphericalmercatorLib.XYPoint): atMapboxSphericalmercatorLib.LatLngPoint
  def ll(px: atMapboxSphericalmercatorLib.XYPoint, zoom: scala.Double): atMapboxSphericalmercatorLib.LatLngPoint
  def px(ll: atMapboxSphericalmercatorLib.LatLngPoint, zoom: scala.Double): atMapboxSphericalmercatorLib.XYPoint
  def xyz(
    bbox: atMapboxSphericalmercatorLib.BoundingBox,
    zoom: scala.Double,
    tms_style: scala.Boolean,
    srs: atMapboxSphericalmercatorLib.Projection
  ): XYBounds
}

object SphericalMercator {
  @scala.inline
  def apply(
    bbox: js.Function5[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Boolean, 
      atMapboxSphericalmercatorLib.Projection, 
      atMapboxSphericalmercatorLib.BoundingBox
    ],
    convert: js.Function2[
      atMapboxSphericalmercatorLib.BoundingBox, 
      atMapboxSphericalmercatorLib.Projection, 
      atMapboxSphericalmercatorLib.BoundingBox
    ],
    forward: js.Function1[atMapboxSphericalmercatorLib.LatLngPoint, atMapboxSphericalmercatorLib.XYPoint],
    inverse: js.Function1[atMapboxSphericalmercatorLib.XYPoint, atMapboxSphericalmercatorLib.LatLngPoint],
    ll: js.Function2[
      atMapboxSphericalmercatorLib.XYPoint, 
      scala.Double, 
      atMapboxSphericalmercatorLib.LatLngPoint
    ],
    px: js.Function2[
      atMapboxSphericalmercatorLib.LatLngPoint, 
      scala.Double, 
      atMapboxSphericalmercatorLib.XYPoint
    ],
    xyz: js.Function4[
      atMapboxSphericalmercatorLib.BoundingBox, 
      scala.Double, 
      scala.Boolean, 
      atMapboxSphericalmercatorLib.Projection, 
      XYBounds
    ]
  ): SphericalMercator = {
    val __obj = js.Dynamic.literal(bbox = bbox, convert = convert, forward = forward, inverse = inverse, ll = ll, px = px, xyz = xyz)
  
    __obj.asInstanceOf[SphericalMercator]
  }
}

