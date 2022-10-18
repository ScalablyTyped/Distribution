package typings.jupyterlabHelpExtension

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabHelpExtension.anon.PartialIPackageLicenseInf
import typings.jupyterlabHelpExtension.libLicensesMod.Licenses.Filters
import typings.jupyterlabHelpExtension.libLicensesMod.Licenses.FullText
import typings.jupyterlabHelpExtension.libLicensesMod.Licenses.Grid
import typings.jupyterlabHelpExtension.libLicensesMod.Licenses.IOptions
import typings.jupyterlabHelpExtension.libLicensesMod.Licenses.Model
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.jupyterlabTranslation.libTokensMod.TranslationBundle
import typings.jupyterlabUiComponents.mod.LabIcon
import typings.luminoCoreutils.typesJsonMod.ReadonlyJSONObject
import typings.luminoSignaling.mod.ISignal
import typings.luminoVirtualdom.mod.VirtualElement
import typings.luminoWidgets.mod.Panel
import typings.luminoWidgets.mod.SplitPanel
import typings.luminoWidgets.mod.TabBar
import typings.luminoWidgets.mod.TabBar.Renderer
import typings.luminoWidgets.mod.Widget
import typings.luminoWidgets.typesTabbarMod.TabBar.IRenderData
import typings.react.mod.ChangeEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLicensesMod {
  
  @JSImport("@jupyterlab/help-extension/lib/licenses", "Licenses")
  @js.native
  open class Licenses protected () extends SplitPanel {
    def this(options: IOptions) = this()
    
    /**
      * Tabs reflecting available bundles
      */
    /* protected */ var _bundles: TabBar[Widget] = js.native
    
    /**
      * Filters on visible licenses
      */
    /* protected */ var _filters: Filters = js.native
    
    /**
      * A grid of the current bundle's packages' license metadata
      */
    /* protected */ var _grid: Grid = js.native
    
    /**
      * An area for selecting licenses by bundle and filters
      */
    /* protected */ var _leftPanel: Panel = js.native
    
    /**
      * The currently-selected package's full license text
      */
    /* protected */ var _licenseText: FullText = js.native
    
    /**
      * Update the bundle tabs.
      */
    /* protected */ def _updateBundles(): Unit = js.native
    
    /**
      * Initialize the listing of available bundles
      */
    /* protected */ def initBundles(): Unit = js.native
    
    /**
      * Initialize the filters
      */
    /* protected */ def initFilters(): Unit = js.native
    
    /**
      * Initialize the listing of packages within the current bundle
      */
    /* protected */ def initGrid(): Unit = js.native
    
    /**
      * Initialize the left area for filters and bundles
      */
    /* protected */ def initLeftPanel(): Unit = js.native
    
    /**
      * Initialize the full text of the current package
      */
    /* protected */ def initLicenseText(): Unit = js.native
    
    val model: Model = js.native
    
    /**
      * Event handler for updating the model with the current bundle
      */
    /* protected */ def onBundleSelected(): Unit = js.native
  }
  object Licenses {
    
    /**
      * A fancy bundle renderer with the package count
      */
    @JSImport("@jupyterlab/help-extension/lib/licenses", "Licenses.BundleTabRenderer")
    @js.native
    open class BundleTabRenderer protected () extends Renderer {
      def this(model: Model) = this()
      
      /**
        * A model of the state of license viewing as well as the underlying data
        */
      var model: Model = js.native
      
      /**
        * Render the package count
        */
      def renderCountBadge(data: IRenderData[Widget]): VirtualElement = js.native
    }
    
    /**
      * The default format (most human-readable)
      */
    @JSImport("@jupyterlab/help-extension/lib/licenses", "Licenses.DEFAULT_FORMAT")
    @js.native
    val DEFAULT_FORMAT: /* "markdown" */ String = js.native
    
    /**
      * A filter form for limiting the packages displayed
      */
    @JSImport("@jupyterlab/help-extension/lib/licenses", "Licenses.Filters")
    @js.native
    open class Filters protected () extends VDomRenderer[Model] {
      def this(model: Model) = this()
      
      /**
        * Handle a filter input changing
        */
      /* protected */ def onFilterInput(evt: ChangeEvent[HTMLInputElement]): Unit = js.native
      
      /**
        * Render a filter input
        */
      /* protected */ def renderFilter(key: TFilterKey): Element = js.native
    }
    
    /**
      * A package's full license text
      */
    @JSImport("@jupyterlab/help-extension/lib/licenses", "Licenses.FullText")
    @js.native
    open class FullText protected () extends VDomRenderer[Model] {
      def this(model: Model) = this()
    }
    
    /**
      * A grid of licenses
      */
    @JSImport("@jupyterlab/help-extension/lib/licenses", "Licenses.Grid")
    @js.native
    open class Grid protected () extends VDomRenderer[Model] {
      def this(model: Model) = this()
      
      /**
        * Render a single package's license information
        */
      /* protected */ def renderRow(row: IPackageLicenseInfo, index: Double): Element = js.native
    }
    
    /**
      * A model for license data
      */
    @JSImport("@jupyterlab/help-extension/lib/licenses", "Licenses.Model")
    @js.native
    open class Model protected ()
      extends VDomModel
         with ICreateArgs {
      def this(options: IModelOptions) = this()
      
      /* private */ var _currentBundleName: Any = js.native
      
      /* private */ var _currentPackageIndex: Any = js.native
      
      /* private */ var _licensesReady: Any = js.native
      
      /* private */ var _licensesUrl: Any = js.native
      
      /* private */ var _packageFilter: Any = js.native
      
      /* private */ var _selectedPackageChanged: Any = js.native
      
      /* private */ var _serverResponse: Any = js.native
      
      /* private */ var _serverSettings: Any = js.native
      
      /* private */ var _trackerDataChanged: Any = js.native
      
      /* private */ var _trans: Any = js.native
      
      /**
        * The names of the license bundles available
        */
      def bundleNames: js.Array[String] = js.native
      
      /**
        * All the license bundles, keyed by the distributing packages
        */
      def bundles: Null | StringDictionary[ILicenseBundle] = js.native
      
      /**
        * The current license bundle
        */
      @JSName("currentBundleName")
      def currentBundleName_MModel: String | Null = js.native
      
      /**
        * The license data for the currently-selected package
        */
      def currentPackage: IPackageLicenseInfo | Null = js.native
      
      /**
        * The index of the currently-selected package within its license bundle
        */
      @JSName("currentPackageIndex")
      def currentPackageIndex_MModel: Double | Null = js.native
      
      /**
        * Create a temporary download link, and emulate clicking it to trigger a named
        * file download.
        */
      def download(options: IDownloadOptions): js.Promise[Unit] = js.native
      
      /**
        * Get filtered packages from current bundle where at least one token of each
        * key is present.
        */
      def getFilteredPackages(allRows: js.Array[IPackageLicenseInfo]): js.Array[IPackageLicenseInfo] = js.native
      
      /**
        * Handle the initial request for the licenses from the server.
        */
      def initLicenses(): js.Promise[Unit] = js.native
      
      /**
        * A promise that resolves when the licenses are available from the server
        */
      def licensesReady: js.Promise[Unit] = js.native
      
      /**
        * The current package filter
        */
      @JSName("packageFilter")
      def packageFilter_MModel: PartialIPackageLicenseInf = js.native
      
      /**
        * A promise that resolves when the licenses from the server change
        */
      def selectedPackageChanged: ISignal[Model, Unit] = js.native
      
      def title: String = js.native
      
      /**
        * A promise that resolves when the trackable data changes
        */
      def trackerDataChanged: ISignal[Model, Unit] = js.native
      
      /**
        * A translation bundle
        */
      def trans: TranslationBundle = js.native
    }
    
    /**
      * License report formats understood by the server (once lower-cased)
      */
    @JSImport("@jupyterlab/help-extension/lib/licenses", "Licenses.REPORT_FORMATS")
    @js.native
    val REPORT_FORMATS: Record[String, IReportFormat] = js.native
    
    trait ICreateArgs extends StObject {
      
      var currentBundleName: js.UndefOr[String | Null] = js.undefined
      
      var currentPackageIndex: js.UndefOr[Double | Null] = js.undefined
      
      var packageFilter: js.UndefOr[PartialIPackageLicenseInf | Null] = js.undefined
    }
    object ICreateArgs {
      
      inline def apply(): ICreateArgs = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICreateArgs]
      }
      
      extension [Self <: ICreateArgs](x: Self) {
        
        inline def setCurrentBundleName(value: String): Self = StObject.set(x, "currentBundleName", value.asInstanceOf[js.Any])
        
        inline def setCurrentBundleNameNull: Self = StObject.set(x, "currentBundleName", null)
        
        inline def setCurrentBundleNameUndefined: Self = StObject.set(x, "currentBundleName", js.undefined)
        
        inline def setCurrentPackageIndex(value: Double): Self = StObject.set(x, "currentPackageIndex", value.asInstanceOf[js.Any])
        
        inline def setCurrentPackageIndexNull: Self = StObject.set(x, "currentPackageIndex", null)
        
        inline def setCurrentPackageIndexUndefined: Self = StObject.set(x, "currentPackageIndex", js.undefined)
        
        inline def setPackageFilter(value: PartialIPackageLicenseInf): Self = StObject.set(x, "packageFilter", value.asInstanceOf[js.Any])
        
        inline def setPackageFilterNull: Self = StObject.set(x, "packageFilter", null)
        
        inline def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
      }
    }
    
    /**
      * The format information for a download
      */
    trait IDownloadOptions extends StObject {
      
      var format: String
    }
    object IDownloadOptions {
      
      inline def apply(format: String): IDownloadOptions = {
        val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
        __obj.asInstanceOf[IDownloadOptions]
      }
      
      extension [Self <: IDownloadOptions](x: Self) {
        
        inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A top-level report of the licenses for all code included in a bundle
      *
      * ### Note
      *
      * This is roughly informed by the terms defined in the SPDX spec, though is not
      * an SPDX Document, since there seem to be several (incompatible) specs
      * in that repo.
      *
      * @see https://github.com/spdx/spdx-spec/blob/development/v2.2.1/schemas/spdx-schema.json
      **/
    trait ILicenseBundle
      extends StObject
         with ReadonlyJSONObject {
      
      var packages: js.Array[IPackageLicenseInfo]
    }
    object ILicenseBundle {
      
      inline def apply(packages: js.Array[IPackageLicenseInfo]): ILicenseBundle = {
        val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
        __obj.asInstanceOf[ILicenseBundle]
      }
      
      extension [Self <: ILicenseBundle](x: Self) {
        
        inline def setPackages(value: js.Array[IPackageLicenseInfo]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
        
        inline def setPackagesVarargs(value: IPackageLicenseInfo*): Self = StObject.set(x, "packages", js.Array(value*))
      }
    }
    
    /**
      * The JSON response from the API
      */
    trait ILicenseResponse extends StObject {
      
      var bundles: StringDictionary[ILicenseBundle]
    }
    object ILicenseResponse {
      
      inline def apply(bundles: StringDictionary[ILicenseBundle]): ILicenseResponse = {
        val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any])
        __obj.asInstanceOf[ILicenseResponse]
      }
      
      extension [Self <: ILicenseResponse](x: Self) {
        
        inline def setBundles(value: StringDictionary[ILicenseBundle]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Options for instantiating a license model
      */
    trait IModelOptions
      extends StObject
         with ICreateArgs {
      
      var licensesUrl: String
      
      var serverSettings: js.UndefOr[ISettings] = js.undefined
      
      var trans: TranslationBundle
    }
    object IModelOptions {
      
      inline def apply(licensesUrl: String, trans: TranslationBundle): IModelOptions = {
        val __obj = js.Dynamic.literal(licensesUrl = licensesUrl.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
        __obj.asInstanceOf[IModelOptions]
      }
      
      extension [Self <: IModelOptions](x: Self) {
        
        inline def setLicensesUrl(value: String): Self = StObject.set(x, "licensesUrl", value.asInstanceOf[js.Any])
        
        inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        inline def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
        
        inline def setTrans(value: TranslationBundle): Self = StObject.set(x, "trans", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Options for instantiating a license viewer
      */
    trait IOptions extends StObject {
      
      var model: Model
    }
    object IOptions {
      
      inline def apply(model: Model): IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A best-effort single bundled package's information.
      *
      * ### Note
      *
      * This is roughly informed by SPDX `packages` and `hasExtractedLicenseInfos`,
      * as making it conformant would vastly complicate the structure.
      *
      * @see https://github.com/spdx/spdx-spec/blob/development/v2.2.1/schemas/spdx-schema.json
      **/
    trait IPackageLicenseInfo
      extends StObject
         with ReadonlyJSONObject {
      
      /**
        * the verbatim extracted text of the license, or an empty string if unknown
        */
      var extractedText: String
      
      /**
        * an SPDX license identifier or LicenseRef, or an empty string if unknown
        */
      var licenseId: String
      
      /**
        * the name of the package as it appears in package.json
        */
      var name: String
      
      /**
        * the version of the package, or an empty string if unknown
        */
      var versionInfo: String
    }
    object IPackageLicenseInfo {
      
      inline def apply(extractedText: String, licenseId: String, name: String, versionInfo: String): IPackageLicenseInfo = {
        val __obj = js.Dynamic.literal(extractedText = extractedText.asInstanceOf[js.Any], licenseId = licenseId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], versionInfo = versionInfo.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPackageLicenseInfo]
      }
      
      extension [Self <: IPackageLicenseInfo](x: Self) {
        
        inline def setExtractedText(value: String): Self = StObject.set(x, "extractedText", value.asInstanceOf[js.Any])
        
        inline def setLicenseId(value: String): Self = StObject.set(x, "licenseId", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
      }
    }
    
    /** The information about a license report format  */
    trait IReportFormat extends StObject {
      
      var icon: LabIcon
      
      var id: String
      
      var title: String
    }
    object IReportFormat {
      
      inline def apply(icon: LabIcon, id: String, title: String): IReportFormat = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[IReportFormat]
      }
      
      extension [Self <: IReportFormat](x: Self) {
        
        inline def setIcon(value: LabIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The fields which can be filtered
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabHelpExtension.jupyterlabHelpExtensionStrings.name
      - typings.jupyterlabHelpExtension.jupyterlabHelpExtensionStrings.versionInfo
      - typings.jupyterlabHelpExtension.jupyterlabHelpExtensionStrings.licenseId
    */
    trait TFilterKey extends StObject
    object TFilterKey {
      
      inline def licenseId: typings.jupyterlabHelpExtension.jupyterlabHelpExtensionStrings.licenseId = "licenseId".asInstanceOf[typings.jupyterlabHelpExtension.jupyterlabHelpExtensionStrings.licenseId]
      
      inline def name: typings.jupyterlabHelpExtension.jupyterlabHelpExtensionStrings.name = "name".asInstanceOf[typings.jupyterlabHelpExtension.jupyterlabHelpExtensionStrings.name]
      
      inline def versionInfo: typings.jupyterlabHelpExtension.jupyterlabHelpExtensionStrings.versionInfo = "versionInfo".asInstanceOf[typings.jupyterlabHelpExtension.jupyterlabHelpExtensionStrings.versionInfo]
    }
  }
}
