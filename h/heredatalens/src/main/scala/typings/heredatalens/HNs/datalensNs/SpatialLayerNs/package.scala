package typings.heredatalens.HNs.datalensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SpatialLayerNs {
  /**
    * Defines a geometry in the vector tile
    * Each geometry is described by various properties, including a unique identifier which must be used to map the geometry to user data.
    */
  type Feature = js.Any
  /**
    * Defines a slice of data (eg Data Lens query data row) that represents a data point
    * By default each row is an object where property names correspond to data column names. This representation can be changed with the dataToRows callback.
    */
  type Row = js.Any
  /**
    * Defines modification of a data-driven style
    * StyleState appears as a parameter in the rowToStyle callback. By default it is 'DEFAULT_STATE'. To change StyleState, use the SpatialLayer.updateSpatialStyle method.
    */
  type StyleState = js.Any
  /**
    * TODO: missing in documentation: https://developer.here.com/visualization/documentation/datalens/h-datalens-spatiallayer-options.html
    */
  type transformFeature = js.Any
}
