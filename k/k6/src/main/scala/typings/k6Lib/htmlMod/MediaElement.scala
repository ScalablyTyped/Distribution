package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "MediaElement")
@js.native
abstract class MediaElement () extends Element {
  /** Contained <track> elements. */
  def textTracks(): js.Array[TrackElement] = js.native
}

