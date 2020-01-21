package typings.jupyterlabApplication.tokensMod.IRouter

import typings.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parsed location currently being routed.
  */
trait ILocation extends ReadonlyJSONObject {
  /**
    * The location hash.
    */
  var hash: String
  /**
    * The path that matched a routing pattern.
    */
  var path: String
  /**
    * The request being routed with the router `base` omitted.
    *
    * #### Notes
    * This field includes the query string and hash, if they exist.
    */
  var request: String
  /**
    * The search element, including leading question mark (`'?'`), if any,
    * of the path.
    */
  var search: String
}

object ILocation {
  @scala.inline
  def apply(hash: String, path: String, request: String, search: String): ILocation = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILocation]
  }
}

