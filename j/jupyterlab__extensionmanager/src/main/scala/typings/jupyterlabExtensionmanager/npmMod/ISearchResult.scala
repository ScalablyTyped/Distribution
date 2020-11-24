package typings.jupyterlabExtensionmanager.npmMod

import typings.jupyterlabExtensionmanager.anon.Flags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchResult extends js.Object {
  
  /**
    * A collection of search results.
    */
  var objects: js.Array[Flags] = js.native
  
  /**
    * Timestamp of the search result creation.
    */
  var time: String = js.native
  
  /**
    * The total number of objects found by the search.
    *
    * This can be greater than the number of objects due
    * to pagination of the search results.
    */
  var total: Double = js.native
}
object ISearchResult {
  
  @scala.inline
  def apply(objects: js.Array[Flags], time: String, total: Double): ISearchResult = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchResult]
  }
  
  @scala.inline
  implicit class ISearchResultOps[Self <: ISearchResult] (val x: Self) extends AnyVal {
    
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
    def setObjectsVarargs(value: Flags*): Self = this.set("objects", js.Array(value :_*))
    
    @scala.inline
    def setObjects(value: js.Array[Flags]): Self = this.set("objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
