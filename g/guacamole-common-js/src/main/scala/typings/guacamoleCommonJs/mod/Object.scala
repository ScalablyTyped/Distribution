package typings.guacamoleCommonJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-common-js", "Object")
@js.native
open class Object protected ()
  extends typings.guacamoleCommonJs.objectMod.Object {
  /**
    * @param client The client owning this object.
    * @param index The index of this object.
    */
  def this(client: typings.guacamoleCommonJs.clientMod.Client, index: Double) = this()
}
/* static members */
object Object {
  
  /**
    * The reserved name denoting the root stream of any object. The contents of
    * the root stream MUST be a JSON map of stream name to mimetype.
    */
  @JSImport("guacamole-common-js", "Object.ROOT_STREAM")
  @js.native
  val ROOT_STREAM: String = js.native
  
  /**
    * The mimetype of a stream containing JSON which maps available stream names
    * to their corresponding mimetype. The root stream of a Guacamole.Object MUST
    * have this mimetype.
    */
  @JSImport("guacamole-common-js", "Object.STREAM_INDEX_MIMETYPE")
  @js.native
  val STREAM_INDEX_MIMETYPE: String = js.native
}
