package typings.guacamoleClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client", "Object")
@js.native
class Object protected ()
  extends typings.guacamoleClient.objectMod.Object {
  /**
    * @param client The client owning this object.
    * @param index The index of this object.
    */
  def this(client: typings.guacamoleClient.clientMod.Client, index: Double) = this()
}

/* static members */
@JSImport("guacamole-client", "Object")
@js.native
object Object extends js.Object {
  /**
    * The reserved name denoting the root stream of any object. The contents of
    * the root stream MUST be a JSON map of stream name to mimetype.
    */
  val ROOT_STREAM: String = js.native
  /**
    * The mimetype of a stream containing JSON which maps available stream names
    * to their corresponding mimetype. The root stream of a Guacamole.Object MUST
    * have this mimetype.
    */
  val STREAM_INDEX_MIMETYPE: String = js.native
}

