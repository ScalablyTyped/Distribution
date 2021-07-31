package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DirectorySites contains properties of a website from the Site Directory.
  * Sites need to be added to an account via the Sites resource before they can
  * be assigned to a placement.
  */
trait SchemaDirectorySite extends StObject {
  
  /**
    * Whether this directory site is active.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ID of this directory site. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Dimension value for the ID of this directory site. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Tag types for regular placements.  Acceptable values are: -
    * &quot;STANDARD&quot; - &quot;IFRAME_JAVASCRIPT_INPAGE&quot; -
    * &quot;INTERNAL_REDIRECT_INPAGE&quot; - &quot;JAVASCRIPT_INPAGE&quot;
    */
  var inpageTagFormats: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Tag types for interstitial placements.  Acceptable values are: -
    * &quot;IFRAME_JAVASCRIPT_INTERSTITIAL&quot; -
    * &quot;INTERNAL_REDIRECT_INTERSTITIAL&quot; -
    * &quot;JAVASCRIPT_INTERSTITIAL&quot;
    */
  var interstitialTagFormats: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySite&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this directory site.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Directory site settings.
    */
  var settings: js.UndefOr[SchemaDirectorySiteSettings] = js.undefined
  
  /**
    * URL of this directory site.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaDirectorySite {
  
  @scala.inline
  def apply(): SchemaDirectorySite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySite]
  }
  
  @scala.inline
  implicit class SchemaDirectorySiteMutableBuilder[Self <: SchemaDirectorySite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
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
    def setSettings(value: SchemaDirectorySiteSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
