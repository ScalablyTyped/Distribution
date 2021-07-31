package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsUpdatePackage extends StObject {
  
  /** The categories that are associated with this update package. */
  var categories: js.UndefOr[js.Array[WindowsUpdateCategory]] = js.undefined
  
  /** The localized description of the update package. */
  var description: js.UndefOr[String] = js.undefined
  
  /** A collection of Microsoft Knowledge Base article IDs that are associated with the update package. */
  var kbArticleIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The last published date of the update, in (UTC) date and time. */
  var lastDeploymentChangeTime: js.UndefOr[String] = js.undefined
  
  /** A collection of URLs that provide more information about the update package. */
  var moreInfoUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The revision number of this update package. */
  var revisionNumber: js.UndefOr[Double] = js.undefined
  
  /** A hyperlink to the language-specific support information for the update. */
  var supportUrl: js.UndefOr[String] = js.undefined
  
  /** The localized title of the update package. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Gets the identifier of an update package. Stays the same across revisions. */
  var updateId: js.UndefOr[String] = js.undefined
}
object WindowsUpdatePackage {
  
  @scala.inline
  def apply(): WindowsUpdatePackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdatePackage]
  }
  
  @scala.inline
  implicit class WindowsUpdatePackageMutableBuilder[Self <: WindowsUpdatePackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[WindowsUpdateCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: WindowsUpdateCategory*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setKbArticleIds(value: js.Array[String]): Self = StObject.set(x, "kbArticleIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKbArticleIdsUndefined: Self = StObject.set(x, "kbArticleIds", js.undefined)
    
    @scala.inline
    def setKbArticleIdsVarargs(value: String*): Self = StObject.set(x, "kbArticleIds", js.Array(value :_*))
    
    @scala.inline
    def setLastDeploymentChangeTime(value: String): Self = StObject.set(x, "lastDeploymentChangeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDeploymentChangeTimeUndefined: Self = StObject.set(x, "lastDeploymentChangeTime", js.undefined)
    
    @scala.inline
    def setMoreInfoUrls(value: js.Array[String]): Self = StObject.set(x, "moreInfoUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreInfoUrlsUndefined: Self = StObject.set(x, "moreInfoUrls", js.undefined)
    
    @scala.inline
    def setMoreInfoUrlsVarargs(value: String*): Self = StObject.set(x, "moreInfoUrls", js.Array(value :_*))
    
    @scala.inline
    def setRevisionNumber(value: Double): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
    
    @scala.inline
    def setSupportUrl(value: String): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportUrlUndefined: Self = StObject.set(x, "supportUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdateId(value: String): Self = StObject.set(x, "updateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateIdUndefined: Self = StObject.set(x, "updateId", js.undefined)
  }
}
