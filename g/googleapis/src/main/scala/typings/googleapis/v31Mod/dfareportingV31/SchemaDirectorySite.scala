package typings.googleapis.v31Mod.dfareportingV31

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
    * Directory site contacts.
    */
  var contactAssignments: js.UndefOr[js.Array[SchemaDirectorySiteContactAssignment]] = js.undefined
  
  /**
    * Country ID of this directory site. This is a read-only field.
    */
  var countryId: js.UndefOr[String] = js.undefined
  
  /**
    * Currency ID of this directory site. This is a read-only field. Possible
    * values are:  - &quot;1&quot; for USD  - &quot;2&quot; for GBP  -
    * &quot;3&quot; for ESP  - &quot;4&quot; for SEK  - &quot;5&quot; for CAD
    * - &quot;6&quot; for JPY  - &quot;7&quot; for DEM  - &quot;8&quot; for AUD
    * - &quot;9&quot; for FRF  - &quot;10&quot; for ITL  - &quot;11&quot; for
    * DKK  - &quot;12&quot; for NOK  - &quot;13&quot; for FIM  - &quot;14&quot;
    * for ZAR  - &quot;15&quot; for IEP  - &quot;16&quot; for NLG  -
    * &quot;17&quot; for EUR  - &quot;18&quot; for KRW  - &quot;19&quot; for
    * TWD  - &quot;20&quot; for SGD  - &quot;21&quot; for CNY  - &quot;22&quot;
    * for HKD  - &quot;23&quot; for NZD  - &quot;24&quot; for MYR  -
    * &quot;25&quot; for BRL  - &quot;26&quot; for PTE  - &quot;27&quot; for
    * MXP  - &quot;28&quot; for CLP  - &quot;29&quot; for TRY  - &quot;30&quot;
    * for ARS  - &quot;31&quot; for PEN  - &quot;32&quot; for ILS  -
    * &quot;33&quot; for CHF  - &quot;34&quot; for VEF  - &quot;35&quot; for
    * COP  - &quot;36&quot; for GTQ  - &quot;37&quot; for PLN  - &quot;39&quot;
    * for INR  - &quot;40&quot; for THB  - &quot;41&quot; for IDR  -
    * &quot;42&quot; for CZK  - &quot;43&quot; for RON  - &quot;44&quot; for
    * HUF  - &quot;45&quot; for RUB  - &quot;46&quot; for AED  - &quot;47&quot;
    * for BGN  - &quot;48&quot; for HRK  - &quot;49&quot; for MXN  -
    * &quot;50&quot; for NGN
    */
  var currencyId: js.UndefOr[String] = js.undefined
  
  /**
    * Description of this directory site. This is a read-only field.
    */
  var description: js.UndefOr[String] = js.undefined
  
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
    * Parent directory site ID.
    */
  var parentId: js.UndefOr[String] = js.undefined
  
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
  
  inline def apply(): SchemaDirectorySite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySite]
  }
  
  extension [Self <: SchemaDirectorySite](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setContactAssignments(value: js.Array[SchemaDirectorySiteContactAssignment]): Self = StObject.set(x, "contactAssignments", value.asInstanceOf[js.Any])
    
    inline def setContactAssignmentsUndefined: Self = StObject.set(x, "contactAssignments", js.undefined)
    
    inline def setContactAssignmentsVarargs(value: SchemaDirectorySiteContactAssignment*): Self = StObject.set(x, "contactAssignments", js.Array(value :_*))
    
    inline def setCountryId(value: String): Self = StObject.set(x, "countryId", value.asInstanceOf[js.Any])
    
    inline def setCountryIdUndefined: Self = StObject.set(x, "countryId", js.undefined)
    
    inline def setCurrencyId(value: String): Self = StObject.set(x, "currencyId", value.asInstanceOf[js.Any])
    
    inline def setCurrencyIdUndefined: Self = StObject.set(x, "currencyId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInpageTagFormats(value: js.Array[String]): Self = StObject.set(x, "inpageTagFormats", value.asInstanceOf[js.Any])
    
    inline def setInpageTagFormatsUndefined: Self = StObject.set(x, "inpageTagFormats", js.undefined)
    
    inline def setInpageTagFormatsVarargs(value: String*): Self = StObject.set(x, "inpageTagFormats", js.Array(value :_*))
    
    inline def setInterstitialTagFormats(value: js.Array[String]): Self = StObject.set(x, "interstitialTagFormats", value.asInstanceOf[js.Any])
    
    inline def setInterstitialTagFormatsUndefined: Self = StObject.set(x, "interstitialTagFormats", js.undefined)
    
    inline def setInterstitialTagFormatsVarargs(value: String*): Self = StObject.set(x, "interstitialTagFormats", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setSettings(value: SchemaDirectorySiteSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
