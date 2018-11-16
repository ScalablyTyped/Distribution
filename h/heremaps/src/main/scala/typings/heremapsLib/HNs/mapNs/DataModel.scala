package typings
package heremapsLib.HNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * The class represents data model of the map. It holds list of layers that are rendered by map's RenderEngine.
         * The class listens to 'update' events from layers and dispatches them to the RenderEngine.
         */
@JSGlobal("H.map.DataModel")
@js.native
class DataModel ()
  extends heremapsLib.HNs.utilNs.OList {
  /**
               * Constructor
               * @param opt_layers {Array=} - array of layers to be added to the data model
               */
  def this(opt_layers: js.Array[heremapsLib.HNs.mapNs.layerNs.Layer]) = this()
}

