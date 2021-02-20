package typings.maximMazurokGapiClientBooks

import typings.maximMazurokGapiClientBooks.gapi.client.books.BookshelvesResource
import typings.maximMazurokGapiClientBooks.gapi.client.books.CloudloadingResource
import typings.maximMazurokGapiClientBooks.gapi.client.books.DictionaryResource
import typings.maximMazurokGapiClientBooks.gapi.client.books.FamilysharingResource
import typings.maximMazurokGapiClientBooks.gapi.client.books.LayersResource
import typings.maximMazurokGapiClientBooks.gapi.client.books.MyconfigResource
import typings.maximMazurokGapiClientBooks.gapi.client.books.MylibraryResource
import typings.maximMazurokGapiClientBooks.gapi.client.books.NotificationResource
import typings.maximMazurokGapiClientBooks.gapi.client.books.OnboardingResource
import typings.maximMazurokGapiClientBooks.gapi.client.books.PersonalizedstreamResource
import typings.maximMazurokGapiClientBooks.gapi.client.books.PromoofferResource
import typings.maximMazurokGapiClientBooks.gapi.client.books.SeriesResource
import typings.maximMazurokGapiClientBooks.gapi.client.books.VolumesResource
import typings.maximMazurokGapiClientBooks.maximMazurokGapiClientBooksStrings.books
import typings.maximMazurokGapiClientBooks.maximMazurokGapiClientBooksStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object books {
        
        @JSGlobal("gapi.client.books.bookshelves")
        @js.native
        val bookshelves: BookshelvesResource = js.native
        
        @JSGlobal("gapi.client.books.cloudloading")
        @js.native
        val cloudloading: CloudloadingResource = js.native
        
        @JSGlobal("gapi.client.books.dictionary")
        @js.native
        val dictionary: DictionaryResource = js.native
        
        @JSGlobal("gapi.client.books.familysharing")
        @js.native
        val familysharing: FamilysharingResource = js.native
        
        @JSGlobal("gapi.client.books.layers")
        @js.native
        val layers: LayersResource = js.native
        
        @JSGlobal("gapi.client.books.myconfig")
        @js.native
        val myconfig: MyconfigResource = js.native
        
        @JSGlobal("gapi.client.books.mylibrary")
        @js.native
        val mylibrary: MylibraryResource = js.native
        
        @JSGlobal("gapi.client.books.notification")
        @js.native
        val notification: NotificationResource = js.native
        
        @JSGlobal("gapi.client.books.onboarding")
        @js.native
        val onboarding: OnboardingResource = js.native
        
        @JSGlobal("gapi.client.books.personalizedstream")
        @js.native
        val personalizedstream: PersonalizedstreamResource = js.native
        
        @JSGlobal("gapi.client.books.promooffer")
        @js.native
        val promooffer: PromoofferResource = js.native
        
        @JSGlobal("gapi.client.books.series")
        @js.native
        val series: SeriesResource = js.native
        
        @JSGlobal("gapi.client.books.volumes")
        @js.native
        val volumes: VolumesResource = js.native
      }
      
      /** Load Books API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: books, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: books, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
