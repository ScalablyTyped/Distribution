package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booksV1 {
  
  /**
    * Books API
    *
    * Searches for books and manages your Google Books library.
    *
    * @example
    * const {google} = require('googleapis');
    * const books = google.books('v1');
    *
    * @namespace books
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Books
    */
  @JSImport("googleapis", "books_v1.Books")
  @js.native
  class Books protected ()
    extends typings.googleapis.booksV1Mod.booksV1.Books {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Bookshelves")
  @js.native
  class ResourceBookshelves protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceBookshelves {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Bookshelves$Volumes")
  @js.native
  class ResourceBookshelvesVolumes protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceBookshelvesVolumes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Cloudloading")
  @js.native
  class ResourceCloudloading protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceCloudloading {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Dictionary")
  @js.native
  class ResourceDictionary protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceDictionary {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Familysharing")
  @js.native
  class ResourceFamilysharing protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceFamilysharing {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Layers")
  @js.native
  class ResourceLayers protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceLayers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Layers$Annotationdata")
  @js.native
  class ResourceLayersAnnotationdata protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceLayersAnnotationdata {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Layers$Volumeannotations")
  @js.native
  class ResourceLayersVolumeannotations protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceLayersVolumeannotations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Myconfig")
  @js.native
  class ResourceMyconfig protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceMyconfig {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Mylibrary")
  @js.native
  class ResourceMylibrary protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceMylibrary {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Mylibrary$Annotations")
  @js.native
  class ResourceMylibraryAnnotations protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceMylibraryAnnotations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Mylibrary$Bookshelves")
  @js.native
  class ResourceMylibraryBookshelves protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceMylibraryBookshelves {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Mylibrary$Bookshelves$Volumes")
  @js.native
  class ResourceMylibraryBookshelvesVolumes protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceMylibraryBookshelvesVolumes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Mylibrary$Readingpositions")
  @js.native
  class ResourceMylibraryReadingpositions protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceMylibraryReadingpositions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Notification")
  @js.native
  class ResourceNotification protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceNotification {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Onboarding")
  @js.native
  class ResourceOnboarding protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceOnboarding {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Personalizedstream")
  @js.native
  class ResourcePersonalizedstream protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourcePersonalizedstream {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Promooffer")
  @js.native
  class ResourcePromooffer protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourcePromooffer {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Series")
  @js.native
  class ResourceSeries protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceSeries {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Series$Membership")
  @js.native
  class ResourceSeriesMembership protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceSeriesMembership {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Volumes")
  @js.native
  class ResourceVolumes protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceVolumes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Volumes$Associated")
  @js.native
  class ResourceVolumesAssociated protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceVolumesAssociated {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Volumes$Mybooks")
  @js.native
  class ResourceVolumesMybooks protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceVolumesMybooks {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Volumes$Recommended")
  @js.native
  class ResourceVolumesRecommended protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceVolumesRecommended {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "books_v1.Resource$Volumes$Useruploaded")
  @js.native
  class ResourceVolumesUseruploaded protected ()
    extends typings.googleapis.booksV1Mod.booksV1.ResourceVolumesUseruploaded {
    def this(context: APIRequestContext) = this()
  }
}
