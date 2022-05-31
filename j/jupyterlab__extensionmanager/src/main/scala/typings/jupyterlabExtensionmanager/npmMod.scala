package typings.jupyterlabExtensionmanager

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabExtensionmanager.anon.Deprecated
import typings.jupyterlabExtensionmanager.anon.Dictkey
import typings.jupyterlabExtensionmanager.anon.Flags
import typings.jupyterlabExtensionmanager.companionsMod.IJupyterLabPackageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object npmMod {
  
  @JSImport("@jupyterlab/extensionmanager/lib/npm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    def this(repoUri: String, cdnUri: String) = this()
    def this(repoUri: Unit, cdnUri: String) = this()
    
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
    def searchExtensions(query: String, page: Double): js.Promise[ISearchResult] = js.native
    def searchExtensions(query: String, page: Double, pageination: Double): js.Promise[ISearchResult] = js.native
    def searchExtensions(query: String, page: Unit, pageination: Double): js.Promise[ISearchResult] = js.native
  }
  
  inline def isJupyterOrg(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJupyterOrg")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait IPackageMetadata extends StObject {
    
    /**
      * A short description of the package.
      */
    var description: String
    
    /**
      * A mapping of dist tags to the versions they point to.
      */
    var `dist-tags`: Dictkey
    
    /**
      * ISO string of the last time this package was modified.
      */
    var modified: String
    
    /**
      * The package name.
      */
    var name: String
    
    /**
      * A mapping of semver-compliant version numbers to version data.
      */
    var versions: StringDictionary[Deprecated]
  }
  object IPackageMetadata {
    
    inline def apply(
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
    
    extension [Self <: IPackageMetadata](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def `setDist-tags`(value: Dictkey): Self = StObject.set(x, "dist-tags", value.asInstanceOf[js.Any])
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: StringDictionary[Deprecated]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPerson extends StObject {
    
    /**
      * The email of the person.
      */
    var email: String
    
    /**
      * The username of the person.
      */
    var username: String
  }
  object IPerson {
    
    inline def apply(email: String, username: String): IPerson = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPerson]
    }
    
    extension [Self <: IPerson](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISearchResult extends StObject {
    
    /**
      * A collection of search results.
      */
    var objects: js.Array[Flags]
    
    /**
      * Timestamp of the search result creation.
      */
    var time: String
    
    /**
      * The total number of objects found by the search.
      *
      * This can be greater than the number of objects due
      * to pagination of the search results.
      */
    var total: Double
  }
  object ISearchResult {
    
    inline def apply(objects: js.Array[Flags], time: String, total: Double): ISearchResult = {
      val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISearchResult]
    }
    
    extension [Self <: ISearchResult](x: Self) {
      
      inline def setObjects(value: js.Array[Flags]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsVarargs(value: Flags*): Self = StObject.set(x, "objects", js.Array(value :_*))
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
