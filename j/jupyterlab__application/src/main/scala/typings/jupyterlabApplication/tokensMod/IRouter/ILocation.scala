package typings.jupyterlabApplication.tokensMod.IRouter

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The parsed location currently being routed.
  */
@js.native
trait ILocation extends ReadonlyPartialJSONObject {
  
  /**
    * The location hash.
    */
  var hash: String = js.native
  
  /**
    * The path that matched a routing pattern.
    */
  var path: String = js.native
  
  /**
    * The request being routed with the router `base` omitted.
    *
    * #### Notes
    * This field includes the query string and hash, if they exist.
    */
  var request: String = js.native
  
  /**
    * The search element, including leading question mark (`'?'`), if any,
    * of the path.
    */
  var search: js.UndefOr[String] = js.native
}
object ILocation {
  
  @scala.inline
  def apply(hash: String, path: String, request: String): ILocation = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocation]
  }
  
  @scala.inline
  implicit class ILocationOps[Self <: ILocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: String): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
}
