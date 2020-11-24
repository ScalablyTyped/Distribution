package typings.googleapis.customsearchV1Mod.customsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaQuery extends js.Object {
  
  var count: js.UndefOr[Double] = js.native
  
  var cr: js.UndefOr[String] = js.native
  
  var cx: js.UndefOr[String] = js.native
  
  var dateRestrict: js.UndefOr[String] = js.native
  
  var disableCnTwTranslation: js.UndefOr[String] = js.native
  
  var exactTerms: js.UndefOr[String] = js.native
  
  var excludeTerms: js.UndefOr[String] = js.native
  
  var fileType: js.UndefOr[String] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var gl: js.UndefOr[String] = js.native
  
  var googleHost: js.UndefOr[String] = js.native
  
  var highRange: js.UndefOr[String] = js.native
  
  var hl: js.UndefOr[String] = js.native
  
  var hq: js.UndefOr[String] = js.native
  
  var imgColorType: js.UndefOr[String] = js.native
  
  var imgDominantColor: js.UndefOr[String] = js.native
  
  var imgSize: js.UndefOr[String] = js.native
  
  var imgType: js.UndefOr[String] = js.native
  
  var inputEncoding: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var linkSite: js.UndefOr[String] = js.native
  
  var lowRange: js.UndefOr[String] = js.native
  
  var orTerms: js.UndefOr[String] = js.native
  
  var outputEncoding: js.UndefOr[String] = js.native
  
  var relatedSite: js.UndefOr[String] = js.native
  
  var rights: js.UndefOr[String] = js.native
  
  var safe: js.UndefOr[String] = js.native
  
  var searchTerms: js.UndefOr[String] = js.native
  
  var searchType: js.UndefOr[String] = js.native
  
  var siteSearch: js.UndefOr[String] = js.native
  
  var siteSearchFilter: js.UndefOr[String] = js.native
  
  var sort: js.UndefOr[String] = js.native
  
  var startIndex: js.UndefOr[Double] = js.native
  
  var startPage: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var totalResults: js.UndefOr[String] = js.native
}
object SchemaQuery {
  
  @scala.inline
  def apply(): SchemaQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuery]
  }
  
  @scala.inline
  implicit class SchemaQueryOps[Self <: SchemaQuery] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setCr(value: String): Self = this.set("cr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCr: Self = this.set("cr", js.undefined)
    
    @scala.inline
    def setCx(value: String): Self = this.set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    
    @scala.inline
    def setDateRestrict(value: String): Self = this.set("dateRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRestrict: Self = this.set("dateRestrict", js.undefined)
    
    @scala.inline
    def setDisableCnTwTranslation(value: String): Self = this.set("disableCnTwTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCnTwTranslation: Self = this.set("disableCnTwTranslation", js.undefined)
    
    @scala.inline
    def setExactTerms(value: String): Self = this.set("exactTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactTerms: Self = this.set("exactTerms", js.undefined)
    
    @scala.inline
    def setExcludeTerms(value: String): Self = this.set("excludeTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeTerms: Self = this.set("excludeTerms", js.undefined)
    
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGl(value: String): Self = this.set("gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGl: Self = this.set("gl", js.undefined)
    
    @scala.inline
    def setGoogleHost(value: String): Self = this.set("googleHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleHost: Self = this.set("googleHost", js.undefined)
    
    @scala.inline
    def setHighRange(value: String): Self = this.set("highRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighRange: Self = this.set("highRange", js.undefined)
    
    @scala.inline
    def setHl(value: String): Self = this.set("hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHl: Self = this.set("hl", js.undefined)
    
    @scala.inline
    def setHq(value: String): Self = this.set("hq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHq: Self = this.set("hq", js.undefined)
    
    @scala.inline
    def setImgColorType(value: String): Self = this.set("imgColorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgColorType: Self = this.set("imgColorType", js.undefined)
    
    @scala.inline
    def setImgDominantColor(value: String): Self = this.set("imgDominantColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgDominantColor: Self = this.set("imgDominantColor", js.undefined)
    
    @scala.inline
    def setImgSize(value: String): Self = this.set("imgSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgSize: Self = this.set("imgSize", js.undefined)
    
    @scala.inline
    def setImgType(value: String): Self = this.set("imgType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgType: Self = this.set("imgType", js.undefined)
    
    @scala.inline
    def setInputEncoding(value: String): Self = this.set("inputEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputEncoding: Self = this.set("inputEncoding", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLinkSite(value: String): Self = this.set("linkSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkSite: Self = this.set("linkSite", js.undefined)
    
    @scala.inline
    def setLowRange(value: String): Self = this.set("lowRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowRange: Self = this.set("lowRange", js.undefined)
    
    @scala.inline
    def setOrTerms(value: String): Self = this.set("orTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrTerms: Self = this.set("orTerms", js.undefined)
    
    @scala.inline
    def setOutputEncoding(value: String): Self = this.set("outputEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputEncoding: Self = this.set("outputEncoding", js.undefined)
    
    @scala.inline
    def setRelatedSite(value: String): Self = this.set("relatedSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedSite: Self = this.set("relatedSite", js.undefined)
    
    @scala.inline
    def setRights(value: String): Self = this.set("rights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRights: Self = this.set("rights", js.undefined)
    
    @scala.inline
    def setSafe(value: String): Self = this.set("safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    
    @scala.inline
    def setSearchTerms(value: String): Self = this.set("searchTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchTerms: Self = this.set("searchTerms", js.undefined)
    
    @scala.inline
    def setSearchType(value: String): Self = this.set("searchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchType: Self = this.set("searchType", js.undefined)
    
    @scala.inline
    def setSiteSearch(value: String): Self = this.set("siteSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteSearch: Self = this.set("siteSearch", js.undefined)
    
    @scala.inline
    def setSiteSearchFilter(value: String): Self = this.set("siteSearchFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteSearchFilter: Self = this.set("siteSearchFilter", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setStartPage(value: Double): Self = this.set("startPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPage: Self = this.set("startPage", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTotalResults(value: String): Self = this.set("totalResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalResults: Self = this.set("totalResults", js.undefined)
  }
}
