package typings
package heremapsLib.HNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * This class represents an area that objects, like a marker, occupies in the screen space, meaning that object can be probed and returned by H.Map@getObjectsAt method.
         */
@JSGlobal("H.map.HitArea")
@js.native
class HitArea protected () extends js.Object {
  /**
               * Constructor
               * @param shapeType {H.map.HitArea.ShapeType} - The shape type of the HitArea
               * @param opt_values {Array<number>=} - The type-dependent values to define the shape of the hit area. The format for the different types are:
               */
  def this(shapeType: heremapsLib.HNs.mapNs.HitAreaNs.ShapeType) = this()
  /**
               * Constructor
               * @param shapeType {H.map.HitArea.ShapeType} - The shape type of the HitArea
               * @param opt_values {Array<number>=} - The type-dependent values to define the shape of the hit area. The format for the different types are:
               */
  def this(shapeType: heremapsLib.HNs.mapNs.HitAreaNs.ShapeType, opt_values: js.Array[scala.Double]) = this()
}

