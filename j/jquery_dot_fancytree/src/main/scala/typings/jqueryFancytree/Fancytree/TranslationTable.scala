package typings.jqueryFancytree.Fancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslationTable extends js.Object {
  
  /**
    * "Load error!"
    */
  var loadError: js.UndefOr[String] = js.native
  
  /**
    * "Loading..."  // &#8230; would be escaped when escapeTitles is true
    */
  var loading: js.UndefOr[String] = js.native
  
  /**
    * "More..."
    */
  var moreData: js.UndefOr[String] = js.native
  
  /**
    * "No data."
    */
  var noData: js.UndefOr[String] = js.native
}
object TranslationTable {
  
  @scala.inline
  def apply(): TranslationTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslationTable]
  }
  
  @scala.inline
  implicit class TranslationTableOps[Self <: TranslationTable] (val x: Self) extends AnyVal {
    
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
    def setLoadError(value: String): Self = this.set("loadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadError: Self = this.set("loadError", js.undefined)
    
    @scala.inline
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setMoreData(value: String): Self = this.set("moreData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoreData: Self = this.set("moreData", js.undefined)
    
    @scala.inline
    def setNoData(value: String): Self = this.set("noData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoData: Self = this.set("noData", js.undefined)
  }
}
