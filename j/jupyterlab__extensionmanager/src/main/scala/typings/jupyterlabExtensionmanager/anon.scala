package typings.jupyterlabExtensionmanager

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabExtensionmanager.companionsMod.IInstallInfo
import typings.jupyterlabExtensionmanager.companionsMod.IKernelInstallInfo
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.black
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.default
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.invalid
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.white
import typings.jupyterlabExtensionmanager.listingsMod.IListEntry
import typings.jupyterlabExtensionmanager.npmMod.IPerson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Date extends StObject {
    
    /**
      * Timestamp of release(?).
      */
    var date: String = js.native
    
    /**
      * Description as listed in package.json.
      */
    var description: String = js.native
    
    /**
      * Package keywords.
      */
    var keywords: js.Array[String] = js.native
    
    /**
      * Various metadata links for the package.
      */
    var links: StringDictionary[String] = js.native
    
    /**
      * Maintainer list per package.json.
      */
    var maintainers: js.Array[IPerson] = js.native
    
    /**
      * The package name.
      */
    var name: String = js.native
    
    /**
      * Metadata about user who published the release.
      */
    var publisher: IPerson = js.native
    
    /**
      * The scope of the package (e.g. jupyterlab for @jupyterlab/services).
      */
    var scope: String = js.native
    
    /**
      * Version number.
      */
    var version: String = js.native
  }
  object Date {
    
    @scala.inline
    def apply(
      date: String,
      description: String,
      keywords: js.Array[String],
      links: StringDictionary[String],
      maintainers: js.Array[IPerson],
      name: String,
      publisher: IPerson,
      scope: String,
      version: String
    ): Date = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setLinks(value: StringDictionary[String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainers(value: js.Array[IPerson]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainersVarargs(value: IPerson*): Self = StObject.set(x, "maintainers", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublisher(value: IPerson): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Deprecated extends StObject {
    
    /**
      * The deprecation warnings message of this version.
      */
    var deprecated: js.UndefOr[String] = js.native
    
    /**
      * A short description of the package.
      */
    var description: String = js.native
    
    /**
      * The package name.
      */
    var name: String = js.native
    
    /**
      * The version string for this version.
      */
    var version: String = js.native
  }
  object Deprecated {
    
    @scala.inline
    def apply(description: String, name: String, version: String): Deprecated = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deprecated]
    }
    
    @scala.inline
    implicit class DeprecatedMutableBuilder[Self <: Deprecated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeprecated(value: String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Detail extends StObject {
    
    /**
      * Break down of the search score.
      */
    var detail: Maintenance = js.native
    
    /**
      * The final normalized search score.
      */
    var `final`: Double = js.native
  }
  object Detail {
    
    @scala.inline
    def apply(detail: Maintenance, `final`: Double): Detail = {
      val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any])
      __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Detail]
    }
    
    @scala.inline
    implicit class DetailMutableBuilder[Self <: Detail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetail(value: Maintenance): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinal(value: Double): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictkey extends /* key */ StringDictionary[String] {
    
    /**
      * The version tagged as 'latest'.
      */
    var latest: String = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(latest: String): Dictkey = {
      val __obj = js.Dynamic.literal(latest = latest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Discovery extends StObject {
    
    var discovery: js.UndefOr[Kernel] = js.native
  }
  object Discovery {
    
    @scala.inline
    def apply(): Discovery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Discovery]
    }
    
    @scala.inline
    implicit class DiscoveryMutableBuilder[Self <: Discovery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiscovery(value: Kernel): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
    }
  }
  
  @js.native
  trait Displayname extends StObject {
    
    /**
      * A regular expression for matching kernel display name.
      */
    var display_name: js.UndefOr[String] = js.native
    
    /**
      * A regular expression for matching kernel language.
      */
    var language: String = js.native
  }
  object Displayname {
    
    @scala.inline
    def apply(language: String): Displayname = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[Displayname]
    }
    
    @scala.inline
    implicit class DisplaynameMutableBuilder[Self <: Displayname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Entries extends StObject {
    
    var entries: js.Array[IListEntry] = js.native
    
    var mode: white | black | default | invalid = js.native
    
    var uris: js.Array[String] = js.native
  }
  object Entries {
    
    @scala.inline
    def apply(entries: js.Array[IListEntry], mode: white | black | default | invalid, uris: js.Array[String]): Entries = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], uris = uris.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entries]
    }
    
    @scala.inline
    implicit class EntriesMutableBuilder[Self <: Entries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntries(value: js.Array[IListEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesVarargs(value: IListEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      @scala.inline
      def setMode(value: white | black | default | invalid): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUris(value: js.Array[String]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrisVarargs(value: String*): Self = StObject.set(x, "uris", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Flags extends StObject {
    
    /**
      * Metadata about the found package.
      */
    @JSName("package")
    var _package: Date = js.native
    
    /**
      * Flags about the package.
      */
    var flags: Insecure = js.native
    
    /**
      * Object detailing the normalized search score.
      */
    var score: Detail = js.native
    
    /**
      * The search score.
      */
    var searchScore: Double = js.native
  }
  object Flags {
    
    @scala.inline
    def apply(_package: Date, flags: Insecure, score: Detail, searchScore: Double): Flags = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], searchScore = searchScore.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flags]
    }
    
    @scala.inline
    implicit class FlagsMutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: Insecure): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScore(value: Detail): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchScore(value: Double): Self = StObject.set(x, "searchScore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_package(value: Date): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Insecure extends StObject {
    
    /**
      * Package is insecure or have vulnerable dependencies (based on the nsp registry).
      */
    var insecure: Double = js.native
    
    /**
      * Package has a version < 1.0.0.
      */
    var unstable: Boolean = js.native
  }
  object Insecure {
    
    @scala.inline
    def apply(insecure: Double, unstable: Boolean): Insecure = {
      val __obj = js.Dynamic.literal(insecure = insecure.asInstanceOf[js.Any], unstable = unstable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Insecure]
    }
    
    @scala.inline
    implicit class InsecureMutableBuilder[Self <: Insecure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsecure(value: Double): Self = StObject.set(x, "insecure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstable(value: Boolean): Self = StObject.set(x, "unstable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Kernel extends StObject {
    
    /**
      * Information about any kernel companions.
      */
    var kernel: js.UndefOr[js.Array[IKernelInstallInfo]] = js.native
    
    /**
      * Information about any server extension companions.
      */
    var server: js.UndefOr[IInstallInfo] = js.native
  }
  object Kernel {
    
    @scala.inline
    def apply(): Kernel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Kernel]
    }
    
    @scala.inline
    implicit class KernelMutableBuilder[Self <: Kernel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKernel(value: js.Array[IKernelInstallInfo]): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelUndefined: Self = StObject.set(x, "kernel", js.undefined)
      
      @scala.inline
      def setKernelVarargs(value: IKernelInstallInfo*): Self = StObject.set(x, "kernel", js.Array(value :_*))
      
      @scala.inline
      def setServer(value: IInstallInfo): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  @js.native
  trait Maintenance extends StObject {
    
    /**
      * The normalized maintenance score.
      */
    var maintenance: Double = js.native
    
    /**
      * The normalized popularity score.
      */
    var popularity: Double = js.native
    
    /**
      * The normalized quality score.
      */
    var quality: Double = js.native
  }
  object Maintenance {
    
    @scala.inline
    def apply(maintenance: Double, popularity: Double, quality: Double): Maintenance = {
      val __obj = js.Dynamic.literal(maintenance = maintenance.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
      __obj.asInstanceOf[Maintenance]
    }
    
    @scala.inline
    implicit class MaintenanceMutableBuilder[Self <: Maintenance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaintenance(value: Double): Self = StObject.set(x, "maintenance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopularity(value: Double): Self = StObject.set(x, "popularity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    }
  }
}
