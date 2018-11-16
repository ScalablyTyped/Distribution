package typings
package heremapsLib.HNs.mapNs.providerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * A Provider defines an object which works as a database for the map. Providers can exists in different forms they can implement client side object storage or they can request data from
             * the remote service.
             * @property uri {string} - This provider's unique resource identifier, if not provided at construction time it defaults to provider's uid
             * @property min {number} - Minimum zoom level at which provider can serve data, set at construction time
             * @property max {number} - Maximum zoom level at which provider can server data, set at construction time
             * @property uid {string} - Provider instance unique identifier, generated at construction time
             */
@JSGlobal("H.map.provider.Provider")
@js.native
class Provider ()
  extends heremapsLib.HNs.utilNs.EventTarget {
  /**
                   * Constructor
                   * @param opt_options {H.map.provider.Provider.Options=}
                   */
  def this(opt_options: heremapsLib.HNs.mapNs.providerNs.ProviderNs.Options) = this()
  var max: scala.Double = js.native
  var min: scala.Double = js.native
  var uid: java.lang.String = js.native
  var uri: java.lang.String = js.native
  /**
                   * This method adds callback which is triggered when the object is being disposed
                   * @param callback {Function} - The callback function.
                   * @param opt_scope {Object=} - An optional scope to call the callback in.
                   */
  def addOnDisposeCallback(callback: js.Function0[scala.Unit], opt_scope: js.Object): scala.Unit = js.native
  /**
                   * This method returns the copyrights of the provided content for a certain geographical area at a specified zoom level.
                   * @param bounds {H.geo.Rect} - The bounding area for which to retrieve the copyright information
                   * @param level {number} - The zoom level for which to retrieve the copyright information
                   * @returns {?Array<H.map.ICopyright>} - a list of copyright information objects for the provided area and zoom level
                   */
  def getCopyrights(bounds: heremapsLib.HNs.geoNs.Rect, level: scala.Double): js.Array[heremapsLib.HNs.mapNs.ICopyright] = js.native
}

