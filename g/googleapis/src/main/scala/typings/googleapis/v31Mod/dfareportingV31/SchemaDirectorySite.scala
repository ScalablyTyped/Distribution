package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DirectorySites contains properties of a website from the Site Directory.
  * Sites need to be added to an account via the Sites resource before they can
  * be assigned to a placement.
  */
@js.native
trait SchemaDirectorySite extends js.Object {
  /**
    * Whether this directory site is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Directory site contacts.
    */
  var contactAssignments: js.UndefOr[js.Array[SchemaDirectorySiteContactAssignment]] = js.native
  /**
    * Country ID of this directory site. This is a read-only field.
    */
  var countryId: js.UndefOr[String] = js.native
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
  var currencyId: js.UndefOr[String] = js.native
  /**
    * Description of this directory site. This is a read-only field.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ID of this directory site. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this directory site. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Tag types for regular placements.  Acceptable values are: -
    * &quot;STANDARD&quot; - &quot;IFRAME_JAVASCRIPT_INPAGE&quot; -
    * &quot;INTERNAL_REDIRECT_INPAGE&quot; - &quot;JAVASCRIPT_INPAGE&quot;
    */
  var inpageTagFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tag types for interstitial placements.  Acceptable values are: -
    * &quot;IFRAME_JAVASCRIPT_INTERSTITIAL&quot; -
    * &quot;INTERNAL_REDIRECT_INTERSTITIAL&quot; -
    * &quot;JAVASCRIPT_INTERSTITIAL&quot;
    */
  var interstitialTagFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySite&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this directory site.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Parent directory site ID.
    */
  var parentId: js.UndefOr[String] = js.native
  /**
    * Directory site settings.
    */
  var settings: js.UndefOr[SchemaDirectorySiteSettings] = js.native
  /**
    * URL of this directory site.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaDirectorySite {
  @scala.inline
  def apply(): SchemaDirectorySite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySite]
  }
  @scala.inline
  implicit class SchemaDirectorySiteOps[Self <: SchemaDirectorySite] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setContactAssignmentsVarargs(value: SchemaDirectorySiteContactAssignment*): Self = this.set("contactAssignments", js.Array(value :_*))
    @scala.inline
    def setContactAssignments(value: js.Array[SchemaDirectorySiteContactAssignment]): Self = this.set("contactAssignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactAssignments: Self = this.set("contactAssignments", js.undefined)
    @scala.inline
    def setCountryId(value: String): Self = this.set("countryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryId: Self = this.set("countryId", js.undefined)
    @scala.inline
    def setCurrencyId(value: String): Self = this.set("currencyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyId: Self = this.set("currencyId", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdDimensionValue(value: SchemaDimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    @scala.inline
    def setInpageTagFormatsVarargs(value: String*): Self = this.set("inpageTagFormats", js.Array(value :_*))
    @scala.inline
    def setInpageTagFormats(value: js.Array[String]): Self = this.set("inpageTagFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInpageTagFormats: Self = this.set("inpageTagFormats", js.undefined)
    @scala.inline
    def setInterstitialTagFormatsVarargs(value: String*): Self = this.set("interstitialTagFormats", js.Array(value :_*))
    @scala.inline
    def setInterstitialTagFormats(value: js.Array[String]): Self = this.set("interstitialTagFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterstitialTagFormats: Self = this.set("interstitialTagFormats", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    @scala.inline
    def setSettings(value: SchemaDirectorySiteSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

