package typings.jupyterlabExtensionmanager

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabExtensionmanager.anon.Deprecated
import typings.jupyterlabExtensionmanager.anon.Dictkey
import typings.jupyterlabExtensionmanager.anon.Flags
import typings.jupyterlabExtensionmanager.companionsMod.IJupyterLabPackageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object npmMod {
  
  @JSImport("@jupyterlab/extensionmanager/lib/npm", "Searcher")
  @js.native
  /**
    * Create a Searcher object.
    *
    * @param repoUri The URI of the NPM registry to use.
    * @param cdnUri The URI of the CDN to use for fetching full package data.
    */
  class Searcher () extends StObject {
    def this(repoUri: String) = this()
    def this(repoUri: js.UndefOr[scala.Nothing], cdnUri: String) = this()
    def this(repoUri: String, cdnUri: String) = this()
    
    /**
      * The URI of the CDN to use for fetching full package data.
      */
    var cdnUri: String = js.native
    
    /**
      * Fetch package.json of a package
      *
      * @param name The package name.
      * @param version The version of the package to fetch.
      */
    def fetchPackageData(name: String, version: String): js.Promise[IJupyterLabPackageData | Null] = js.native
    
    /**
      * The URI of the NPM registry to use.
      */
    var repoUri: String = js.native
    
    /**
      * Search for a jupyterlab extension.
      *
      * @param query The query to send. `keywords:"jupyterlab-extension"` will be appended to the query.
      * @param page The page of results to fetch.
      * @param pageination The pagination size to use. See registry API documentation for acceptable values.
      */
    def searchExtensions(query: String): js.Promise[ISearchResult] = js.native
    def searchExtensions(query: String, page: js.UndefOr[scala.Nothing], pageination: Double): js.Promise[ISearchResult] = js.native
    def searchExtensions(query: String, page: Double): js.Promise[ISearchResult] = js.native
    def searchExtensions(query: String, page: Double, pageination: Double): js.Promise[ISearchResult] = js.native
  }
  
  @JSImport("@jupyterlab/extensionmanager/lib/npm", "isJupyterOrg")
  @js.native
  def isJupyterOrg(name: String): Boolean = js.native
  
  @js.native
  trait IPackageMetadata extends StObject {
    
    /**
      * A short description of the package.
      */
    var description: String = js.native
    
    /**
      * A mapping of dist tags to the versions they point to.
      */
    var `dist-tags`: Dictkey = js.native
    
    /**
      * ISO string of the last time this package was modified.
      */
    var modified: String = js.native
    
    /**
      * The package name.
      */
    var name: String = js.native
    
    /**
      * A mapping of semver-compliant version numbers to version data.
      */
    var versions: StringDictionary[Deprecated] = js.native
  }
  object IPackageMetadata {
    
    @scala.inline
    def apply(
      description: String,
      `dist-tags`: Dictkey,
      modified: String,
      name: String,
      versions: StringDictionary[Deprecated]
    ): IPackageMetadata = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPackageMetadata]
    }
    
    @scala.inline
    implicit class IPackageMetadataMutableBuilder[Self <: IPackageMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDist-tags`(value: Dictkey): Self = StObject.set(x, "dist-tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersions(value: StringDictionary[Deprecated]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPerson extends StObject {
    
    /**
      * The email of the person.
      */
    var email: String = js.native
    
    /**
      * The username of the person.
      */
    var username: String = js.native
  }
  object IPerson {
    
    @scala.inline
    def apply(email: String, username: String): IPerson = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPerson]
    }
    
    @scala.inline
    implicit class IPersonMutableBuilder[Self <: IPerson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISearchResult extends StObject {
    
    /**
      * A collection of search results.
      */
    var objects: js.Array[Flags] = js.native
    
    /**
      * Timestamp of the search result creation.
      */
    var time: String = js.native
    
    /**
      * The total number of objects found by the search.
      *
      * This can be greater than the number of objects due
      * to pagination of the search results.
      */
    var total: Double = js.native
  }
  object ISearchResult {
    
    @scala.inline
    def apply(objects: js.Array[Flags], time: String, total: Double): ISearchResult = {
      val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISearchResult]
    }
    
    @scala.inline
    implicit class ISearchResultMutableBuilder[Self <: ISearchResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjects(value: js.Array[Flags]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectsVarargs(value: Flags*): Self = StObject.set(x, "objects", js.Array(value :_*))
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
