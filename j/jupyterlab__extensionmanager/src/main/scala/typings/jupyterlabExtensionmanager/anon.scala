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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Date extends StObject {
    
    /**
      * Timestamp of release(?).
      */
    var date: String
    
    /**
      * Description as listed in package.json.
      */
    var description: String
    
    /**
      * Package keywords.
      */
    var keywords: js.Array[String]
    
    /**
      * Various metadata links for the package.
      */
    var links: StringDictionary[String]
    
    /**
      * Maintainer list per package.json.
      */
    var maintainers: js.Array[IPerson]
    
    /**
      * The package name.
      */
    var name: String
    
    /**
      * Metadata about user who published the release.
      */
    var publisher: IPerson
    
    /**
      * The scope of the package (e.g. jupyterlab for @jupyterlab/services).
      */
    var scope: String
    
    /**
      * Version number.
      */
    var version: String
  }
  object Date {
    
    inline def apply(
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
    
    extension [Self <: Date](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      inline def setLinks(value: StringDictionary[String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMaintainers(value: js.Array[IPerson]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      inline def setMaintainersVarargs(value: IPerson*): Self = StObject.set(x, "maintainers", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPublisher(value: IPerson): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Deprecated extends StObject {
    
    /**
      * The deprecation warnings message of this version.
      */
    var deprecated: js.UndefOr[String] = js.undefined
    
    /**
      * A short description of the package.
      */
    var description: String
    
    /**
      * The package name.
      */
    var name: String
    
    /**
      * The version string for this version.
      */
    var version: String
  }
  object Deprecated {
    
    inline def apply(description: String, name: String, version: String): Deprecated = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deprecated]
    }
    
    extension [Self <: Deprecated](x: Self) {
      
      inline def setDeprecated(value: String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Detail extends StObject {
    
    /**
      * Break down of the search score.
      */
    var detail: Maintenance
    
    /**
      * The final normalized search score.
      */
    var `final`: Double
  }
  object Detail {
    
    inline def apply(detail: Maintenance, `final`: Double): Detail = {
      val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any])
      __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Detail]
    }
    
    extension [Self <: Detail](x: Self) {
      
      inline def setDetail(value: Maintenance): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setFinal(value: Double): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[String] {
    
    /**
      * The version tagged as 'latest'.
      */
    var latest: String
  }
  object Dictkey {
    
    inline def apply(latest: String): Dictkey = {
      val __obj = js.Dynamic.literal(latest = latest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    }
  }
  
  trait Discovery extends StObject {
    
    var discovery: js.UndefOr[Kernel] = js.undefined
  }
  object Discovery {
    
    inline def apply(): Discovery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Discovery]
    }
    
    extension [Self <: Discovery](x: Self) {
      
      inline def setDiscovery(value: Kernel): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
      
      inline def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
    }
  }
  
  trait Displayname extends StObject {
    
    /**
      * A regular expression for matching kernel display name.
      */
    var display_name: js.UndefOr[String] = js.undefined
    
    /**
      * A regular expression for matching kernel language.
      */
    var language: String
  }
  object Displayname {
    
    inline def apply(language: String): Displayname = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[Displayname]
    }
    
    extension [Self <: Displayname](x: Self) {
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    }
  }
  
  trait Entries extends StObject {
    
    var entries: js.Array[IListEntry]
    
    var mode: white | black | default | invalid
    
    var uris: js.Array[String]
  }
  object Entries {
    
    inline def apply(entries: js.Array[IListEntry], mode: white | black | default | invalid, uris: js.Array[String]): Entries = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], uris = uris.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entries]
    }
    
    extension [Self <: Entries](x: Self) {
      
      inline def setEntries(value: js.Array[IListEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: IListEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      inline def setMode(value: white | black | default | invalid): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setUris(value: js.Array[String]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
      
      inline def setUrisVarargs(value: String*): Self = StObject.set(x, "uris", js.Array(value :_*))
    }
  }
  
  trait Flags extends StObject {
    
    /**
      * Metadata about the found package.
      */
    @JSName("package")
    var _package: Date
    
    /**
      * Flags about the package.
      */
    var flags: Insecure
    
    /**
      * Object detailing the normalized search score.
      */
    var score: Detail
    
    /**
      * The search score.
      */
    var searchScore: Double
  }
  object Flags {
    
    inline def apply(_package: Date, flags: Insecure, score: Detail, searchScore: Double): Flags = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], searchScore = searchScore.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flags]
    }
    
    extension [Self <: Flags](x: Self) {
      
      inline def setFlags(value: Insecure): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Detail): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setSearchScore(value: Double): Self = StObject.set(x, "searchScore", value.asInstanceOf[js.Any])
      
      inline def set_package(value: Date): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  trait Insecure extends StObject {
    
    /**
      * Package is insecure or have vulnerable dependencies (based on the nsp registry).
      */
    var insecure: Double
    
    /**
      * Package has a version < 1.0.0.
      */
    var unstable: Boolean
  }
  object Insecure {
    
    inline def apply(insecure: Double, unstable: Boolean): Insecure = {
      val __obj = js.Dynamic.literal(insecure = insecure.asInstanceOf[js.Any], unstable = unstable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Insecure]
    }
    
    extension [Self <: Insecure](x: Self) {
      
      inline def setInsecure(value: Double): Self = StObject.set(x, "insecure", value.asInstanceOf[js.Any])
      
      inline def setUnstable(value: Boolean): Self = StObject.set(x, "unstable", value.asInstanceOf[js.Any])
    }
  }
  
  trait Kernel extends StObject {
    
    /**
      * Information about any kernel companions.
      */
    var kernel: js.UndefOr[js.Array[IKernelInstallInfo]] = js.undefined
    
    /**
      * Information about any server extension companions.
      */
    var server: js.UndefOr[IInstallInfo] = js.undefined
  }
  object Kernel {
    
    inline def apply(): Kernel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Kernel]
    }
    
    extension [Self <: Kernel](x: Self) {
      
      inline def setKernel(value: js.Array[IKernelInstallInfo]): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
      
      inline def setKernelUndefined: Self = StObject.set(x, "kernel", js.undefined)
      
      inline def setKernelVarargs(value: IKernelInstallInfo*): Self = StObject.set(x, "kernel", js.Array(value :_*))
      
      inline def setServer(value: IInstallInfo): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  trait Maintenance extends StObject {
    
    /**
      * The normalized maintenance score.
      */
    var maintenance: Double
    
    /**
      * The normalized popularity score.
      */
    var popularity: Double
    
    /**
      * The normalized quality score.
      */
    var quality: Double
  }
  object Maintenance {
    
    inline def apply(maintenance: Double, popularity: Double, quality: Double): Maintenance = {
      val __obj = js.Dynamic.literal(maintenance = maintenance.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
      __obj.asInstanceOf[Maintenance]
    }
    
    extension [Self <: Maintenance](x: Self) {
      
      inline def setMaintenance(value: Double): Self = StObject.set(x, "maintenance", value.asInstanceOf[js.Any])
      
      inline def setPopularity(value: Double): Self = StObject.set(x, "popularity", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    }
  }
}
