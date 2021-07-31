package typings.licenseChecker

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("license-checker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def init(opts: InitOpts, callback: js.Function2[/* err */ Error, /* ret */ ModuleInfos, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait InitOpts extends StObject {
    
    /**
      * Colorize output
      */
    var color: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Output in csv format
      */
    var csv: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prefix column for component in csv format.
      */
    var csvComponentPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Specify the columns for CSV format
      * or add the specified items for JSON format
      */
    var customFormat: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    /**
      * To add a custom Format file in JSON
      */
    var customPath: js.UndefOr[String | ModuleInfo] = js.undefined
    
    /**
      * Only show development dependencies
      */
    var development: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Look for direct dependencies only
      */
    var direct: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Exclude modules which licenses are in the comma-separated list from the output
      */
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Restrict output to the packages (package@version) not in the semicolon-separated list
      */
    var excludePackages: js.UndefOr[String] = js.undefined
    
    /**
      * Restrict output to not include any package marked as private
      */
    var excludePrivatePackages: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Fail (exit with code 1) on the first occurrence of the licenses of the semicolon-separated list
      */
    var failOn: js.UndefOr[String] = js.undefined
    
    /**
      * Output in json format
      */
    var json: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Fail (exit with code 1) on the first occurrence of the licenses not in the semicolon-separated list
      */
    var onlyAllow: js.UndefOr[String] = js.undefined
    
    /**
      * Only list packages with unknown or guessed licenses
      */
    var onlyunknown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Write the data to a specific file.
      */
    var out: js.UndefOr[String] = js.undefined
    
    /**
      * Restrict output to the packages (package@version) in the semicolon-separated list
      */
    var packages: js.UndefOr[String] = js.undefined
    
    /**
      * Only show production dependencies
      */
    var production: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Output the location of the license files as relative paths
      */
    var relativeLicensePath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Path to start checking dependencies from
      */
    var start: String
    
    /**
      * Output a summary of the license usage
      */
    var summary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Report guessed licenses as unknown licenses
      */
    var unknown: js.UndefOr[Boolean] = js.undefined
  }
  object InitOpts {
    
    @scala.inline
    def apply(start: String): InitOpts = {
      val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitOpts]
    }
    
    @scala.inline
    implicit class InitOptsMutableBuilder[Self <: InitOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCsv(value: Boolean): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvComponentPrefix(value: String): Self = StObject.set(x, "csvComponentPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvComponentPrefixUndefined: Self = StObject.set(x, "csvComponentPrefix", js.undefined)
      
      @scala.inline
      def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
      
      @scala.inline
      def setCustomFormat(value: Record[String, js.Any]): Self = StObject.set(x, "customFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFormatUndefined: Self = StObject.set(x, "customFormat", js.undefined)
      
      @scala.inline
      def setCustomPath(value: String | ModuleInfo): Self = StObject.set(x, "customPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomPathUndefined: Self = StObject.set(x, "customPath", js.undefined)
      
      @scala.inline
      def setDevelopment(value: Boolean): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevelopmentUndefined: Self = StObject.set(x, "development", js.undefined)
      
      @scala.inline
      def setDirect(value: Boolean): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectUndefined: Self = StObject.set(x, "direct", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludePackages(value: String): Self = StObject.set(x, "excludePackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludePackagesUndefined: Self = StObject.set(x, "excludePackages", js.undefined)
      
      @scala.inline
      def setExcludePrivatePackages(value: Boolean): Self = StObject.set(x, "excludePrivatePackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludePrivatePackagesUndefined: Self = StObject.set(x, "excludePrivatePackages", js.undefined)
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setFailOn(value: String): Self = StObject.set(x, "failOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOnUndefined: Self = StObject.set(x, "failOn", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setOnlyAllow(value: String): Self = StObject.set(x, "onlyAllow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyAllowUndefined: Self = StObject.set(x, "onlyAllow", js.undefined)
      
      @scala.inline
      def setOnlyunknown(value: Boolean): Self = StObject.set(x, "onlyunknown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyunknownUndefined: Self = StObject.set(x, "onlyunknown", js.undefined)
      
      @scala.inline
      def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      @scala.inline
      def setPackages(value: String): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
      
      @scala.inline
      def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
      
      @scala.inline
      def setRelativeLicensePath(value: Boolean): Self = StObject.set(x, "relativeLicensePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeLicensePathUndefined: Self = StObject.set(x, "relativeLicensePath", js.undefined)
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummary(value: Boolean): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setUnknown(value: Boolean): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  trait ModuleInfo extends StObject {
    
    /**
      * Copyright statements
      */
    var copyright: js.UndefOr[String] = js.undefined
    
    /**
      * Module description
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Publisher e-mail
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * Path to license file, if available
      */
    var licenseFile: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the license is modified
      */
    var licenseModified: js.UndefOr[String] = js.undefined
    
    /**
      * Contents of the license
      */
    var licenseText: js.UndefOr[String] = js.undefined
    
    /**
      * Array of licenses
      */
    var licenses: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Module name
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Path of NOTICE file
      */
    var noticeFile: js.UndefOr[String] = js.undefined
    
    /**
      * Path to module
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Private module
      */
    var `private`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Publisher name
      */
    var publisher: js.UndefOr[String] = js.undefined
    
    /**
      * Repository URL
      */
    var repository: js.UndefOr[String] = js.undefined
    
    /**
      * Publisher URL
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * Module version
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object ModuleInfo {
    
    @scala.inline
    def apply(): ModuleInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModuleInfo]
    }
    
    @scala.inline
    implicit class ModuleInfoMutableBuilder[Self <: ModuleInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setLicenseFile(value: String): Self = StObject.set(x, "licenseFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseFileUndefined: Self = StObject.set(x, "licenseFile", js.undefined)
      
      @scala.inline
      def setLicenseModified(value: String): Self = StObject.set(x, "licenseModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseModifiedUndefined: Self = StObject.set(x, "licenseModified", js.undefined)
      
      @scala.inline
      def setLicenseText(value: String): Self = StObject.set(x, "licenseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseTextUndefined: Self = StObject.set(x, "licenseText", js.undefined)
      
      @scala.inline
      def setLicenses(value: String | js.Array[String]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
      
      @scala.inline
      def setLicensesVarargs(value: String*): Self = StObject.set(x, "licenses", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoticeFile(value: String): Self = StObject.set(x, "noticeFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoticeFileUndefined: Self = StObject.set(x, "noticeFile", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      @scala.inline
      def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
      
      @scala.inline
      def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type ModuleInfos = StringDictionary[ModuleInfo]
}
