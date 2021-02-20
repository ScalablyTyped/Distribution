package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectorySite extends StObject {
  
  /** ID of this directory site. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  
  /** Dimension value for the ID of this directory site. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  /** Tag types for regular placements. Acceptable values are: - "STANDARD" - "IFRAME_JAVASCRIPT_INPAGE" - "INTERNAL_REDIRECT_INPAGE" - "JAVASCRIPT_INPAGE" */
  var inpageTagFormats: js.UndefOr[js.Array[String]] = js.native
  
  /** Tag types for interstitial placements. Acceptable values are: - "IFRAME_JAVASCRIPT_INTERSTITIAL" - "INTERNAL_REDIRECT_INTERSTITIAL" - "JAVASCRIPT_INTERSTITIAL" */
  var interstitialTagFormats: js.UndefOr[js.Array[String]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#directorySite". */
  var kind: js.UndefOr[String] = js.native
  
  /** Name of this directory site. */
  var name: js.UndefOr[String] = js.native
  
  /** Directory site settings. */
  var settings: js.UndefOr[DirectorySiteSettings] = js.native
  
  /** URL of this directory site. */
  var url: js.UndefOr[String] = js.native
}
object DirectorySite {
  
  @scala.inline
  def apply(): DirectorySite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectorySite]
  }
  
  @scala.inline
  implicit class DirectorySiteMutableBuilder[Self <: DirectorySite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInpageTagFormats(value: js.Array[String]): Self = StObject.set(x, "inpageTagFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInpageTagFormatsUndefined: Self = StObject.set(x, "inpageTagFormats", js.undefined)
    
    @scala.inline
    def setInpageTagFormatsVarargs(value: String*): Self = StObject.set(x, "inpageTagFormats", js.Array(value :_*))
    
    @scala.inline
    def setInterstitialTagFormats(value: js.Array[String]): Self = StObject.set(x, "interstitialTagFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterstitialTagFormatsUndefined: Self = StObject.set(x, "interstitialTagFormats", js.undefined)
    
    @scala.inline
    def setInterstitialTagFormatsVarargs(value: String*): Self = StObject.set(x, "interstitialTagFormats", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSettings(value: DirectorySiteSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
