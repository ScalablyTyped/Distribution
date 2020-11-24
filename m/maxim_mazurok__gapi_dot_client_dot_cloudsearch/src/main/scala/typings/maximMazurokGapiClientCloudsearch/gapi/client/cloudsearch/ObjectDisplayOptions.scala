package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectDisplayOptions extends js.Object {
  
  /**
    * Defines the properties that are displayed in the metalines of the search results. The property values are displayed in the order given here. If a property holds multiple values, all
    * of the values are displayed before the next properties. For this reason, it is a good practice to specify singular properties before repeated properties in this list. All of the
    * properties must set is_returnable to true. The maximum number of metalines is 3.
    */
  var metalines: js.UndefOr[js.Array[Metaline]] = js.native
  
  /**
    * The user friendly label to display in the search result to indicate the type of the item. This is OPTIONAL; if not provided, an object label isn't displayed on the context line of
    * the search results. The maximum length is 64 characters.
    */
  var objectDisplayLabel: js.UndefOr[String] = js.native
}
object ObjectDisplayOptions {
  
  @scala.inline
  def apply(): ObjectDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectDisplayOptions]
  }
  
  @scala.inline
  implicit class ObjectDisplayOptionsOps[Self <: ObjectDisplayOptions] (val x: Self) extends AnyVal {
    
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
    def setMetalinesVarargs(value: Metaline*): Self = this.set("metalines", js.Array(value :_*))
    
    @scala.inline
    def setMetalines(value: js.Array[Metaline]): Self = this.set("metalines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetalines: Self = this.set("metalines", js.undefined)
    
    @scala.inline
    def setObjectDisplayLabel(value: String): Self = this.set("objectDisplayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectDisplayLabel: Self = this.set("objectDisplayLabel", js.undefined)
  }
}
