package typings.kiiCloudSdk.global.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a KiiObject object
  */
@JSGlobal("KiiCloud.KiiObject")
@js.native
class KiiObject ()
  extends StObject
     with typings.kiiCloudSdk.KiiCloud.KiiObject
object KiiObject {
  
  @JSGlobal("KiiCloud.KiiObject")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if given ID is valid for object ID.
    *  Valid pattern: ^[a-zA-Z0-9-_\\.]{2,100}$
    *
    * @param objectID to be checked.
    *
    * @return true if given ID is valid, false otherwise.
    */
  /* static member */
  inline def isValidObjectID(objectID: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidObjectID")(objectID.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
  /* static member */
  inline def objectWithURI(uri: String): typings.kiiCloudSdk.KiiCloud.KiiObject = ^.asInstanceOf[js.Dynamic].applyDynamic("objectWithURI")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiObject]
}
