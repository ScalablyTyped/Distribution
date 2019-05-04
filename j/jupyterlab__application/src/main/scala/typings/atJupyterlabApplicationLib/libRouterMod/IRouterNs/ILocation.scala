package typings
package atJupyterlabApplicationLib.libRouterMod.IRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parsed location currently being routed.
  */
trait ILocation
  extends atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject {
  /**
    * The location hash.
    */
  var hash: java.lang.String
  /**
    * The path that matched a routing pattern.
    */
  var path: java.lang.String
  /**
    * The request being routed with the router `base` omitted.
    *
    * #### Notes
    * This field includes the query string and hash, if they exist.
    */
  var request: java.lang.String
  /**
    * The search element, including leading question mark (`'?'`), if any,
    * of the path.
    */
  var search: java.lang.String
}

object ILocation {
  @scala.inline
  def apply(
    hash: java.lang.String,
    path: java.lang.String,
    request: java.lang.String,
    search: java.lang.String
  ): ILocation = {
    val __obj = js.Dynamic.literal(hash = hash, path = path, request = request, search = search)
  
    __obj.asInstanceOf[ILocation]
  }
}

