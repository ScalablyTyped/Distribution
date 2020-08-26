package typings.guacamoleClient.mod

import typings.guacamoleClient.guacCommonMod.Mimetype
import typings.std.MimeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client", "VideoPlayer")
@js.native
class VideoPlayer ()
  extends typings.guacamoleClient.videoPlayerMod.VideoPlayer

/* static members */
@JSImport("guacamole-client", "VideoPlayer")
@js.native
object VideoPlayer extends js.Object {
  /**
    * Returns an instance of Guacamole.VideoPlayer providing support for the given
    * video format. If support for the given video format is not available, null
    * is returned.
    *
    * @param stream The Guacamole.InputStream to read video data from.
    * @param layer The destination layer in which this Guacamole.VideoPlayer should play
    * the received video data.
    * @param mimetype The mimetype of the video data in the provided stream.
    * @return
    * A Guacamole.VideoPlayer instance supporting the given mimetype and
    * reading from the given stream, or null if support for the given mimetype
    * is absent.
    */
  def getInstance(
    stream: typings.guacamoleClient.inputStreamMod.InputStream,
    layer: typings.guacamoleClient.visibleLayerMod.VisibleLayer,
    mimetype: MimeType
  ): typings.guacamoleClient.videoPlayerMod.VideoPlayer | Null = js.native
  /**
    * Returns a list of all mimetypes supported by any built-in
    * Guacamole.VideoPlayer, in rough order of priority. Beware that only the core
    * mimetypes themselves will be listed. Any mimetype parameters, even required
    * ones, will not be included in the list.
    *
    * @returns A list of all mimetypes supported by any built-in Guacamole.VideoPlayer,
    * excluding any parameters.
    */
  def getSupportedTypes(): js.Array[Mimetype] = js.native
  /**
    * Determines whether the given mimetype is supported by any built-in
    * implementation of Guacamole.VideoPlayer, and thus will be properly handled
    * by Guacamole.VideoPlayer.getInstance().
    * @param mimetype The mimetype to check.
    * @returns true if the given mimetype is supported by any built-in Guacamole.VideoPlayer, false otherwise.
    */
  def isSupportedType(mimetype: MimeType): Boolean = js.native
}

