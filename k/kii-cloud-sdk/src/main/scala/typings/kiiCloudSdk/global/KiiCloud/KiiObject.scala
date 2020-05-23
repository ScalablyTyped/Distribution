package typings.kiiCloudSdk.global.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a KiiObject object
  */
@JSGlobal("KiiCloud.KiiObject")
@js.native
class KiiObject ()
  extends typings.kiiCloudSdk.KiiCloud.KiiObject

/* static members */
@JSGlobal("KiiCloud.KiiObject")
@js.native
object KiiObject extends js.Object {
  /**
    * Check if given ID is valid for object ID.
    *  Valid pattern: ^[a-zA-Z0-9-_\\.]{2,100}$
    *
    * @param objectID to be checked.
    *
    * @return true if given ID is valid, false otherwise.
    */
  def isValidObjectID(objectID: String): Boolean = js.native
  /**
    * Generate a new KiiObject based on a given URI
    *
    * @param uri The URI of the object to be represented
    *
    * @return A new KiiObject with its parameters filled in from the URI
    *
    * @throws If the URI is not in the proper format
    *
    * @example
    *     var group = new KiiObject.objectWithURI("kiicloud://myuri");
    */
  def objectWithURI(uri: String): typings.kiiCloudSdk.KiiCloud.KiiObject = js.native
}

