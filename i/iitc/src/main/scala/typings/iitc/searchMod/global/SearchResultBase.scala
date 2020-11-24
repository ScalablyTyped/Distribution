package typings.iitc.searchMod.global

import typings.leaflet.mod.Layer
import typings.spectrum.JQuery
import typings.std.Element
import typings.std.Text
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResultBase extends js.Object {
  
  /** secondary information for this result.Will be interpreted as HTML, so make sure to escape properly. */
  var description: JQuery | js.Array[_] | Element | Text | String = js.native
  
  /** a URL to a icon to display in the result list. Should be 12x12. */
  var icon: js.UndefOr[String] = js.native
  
  /** a ILayer to be added to the map when the user selects this search result. Will be generated if not set. Set to `null` to prevent the result from being added to the map. */
  var layer: js.UndefOr[Layer] = js.native
  
  /**
    * a handler to be called when the result is removed from the map(because another result has been
    * selected or the search was cancelled by the user).
    */
  var onRemove: js.UndefOr[js.Function1[/* result */ SearchResult, Unit]] = js.native
  
  /**
    * a handler to be called when the result is selected. May return `true` to prevent the map from being repositioned.
    * You may reposition the map yourself or do other work.
    */
  var onSelected: js.UndefOr[
    js.Function2[/* result */ SearchResult, /* event */ UIEvent, js.UndefOr[Boolean]]
  ] = js.native
  
  /** Will be interpreted as HTML, so make sure to escape properly. */
  var title: String = js.native
}
object SearchResultBase {
  
  @scala.inline
  def apply(description: JQuery | js.Array[_] | Element | Text | String, title: String): SearchResultBase = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultBase]
  }
  
  @scala.inline
  implicit class SearchResultBaseOps[Self <: SearchResultBase] (val x: Self) extends AnyVal {
    
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
    def setDescriptionVarargs(value: js.Any*): Self = this.set("description", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: JQuery | js.Array[_] | Element | Text | String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLayer(value: Layer): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    
    @scala.inline
    def setOnRemove(value: /* result */ SearchResult => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    
    @scala.inline
    def setOnSelected(value: (/* result */ SearchResult, /* event */ UIEvent) => js.UndefOr[Boolean]): Self = this.set("onSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSelected: Self = this.set("onSelected", js.undefined)
  }
}
