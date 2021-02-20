package typings.loadGoogleMapsApi

import typings.loadGoogleMapsApi.anon.Typeofmaps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("load-google-maps-api", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[Typeofmaps] = js.native
  @JSImport("load-google-maps-api", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Promise[Typeofmaps] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The Google Maps API `script` tag URL
      *
      * Default Value `'https://maps.googleapis.com/maps/api/js'`
      */
    var apiUrl: js.UndefOr[String] = js.native
    
    /**
      * Client usage reporting channel
      *
      * https://developers.google.com/maps/premium/reports/usage-reports#channels
      */
    var channel: js.UndefOr[String] = js.native
    
    /**
      * Client ID
      *
      * https://developers.google.com/maps/documentation/javascript/get-api-key#specifying-a-client-id-when-loading-the-api
      */
    var client: js.UndefOr[String] = js.native
    
    /**
      * Your API key
      *
      * https://developers.google.com/maps/documentation/javascript/get-api-key#step-2-add-the-api-key-to-your-application
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * https://developers.google.com/maps/documentation/javascript/localization#Language
      */
    var language: js.UndefOr[String] = js.native
    
    /**
      * Supplemental libraries to load
      *
      * Default Value `[]`
      *
      * https://developers.google.com/maps/documentation/javascript/libraries
      */
    var libraries: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * https://developers.google.com/maps/documentation/javascript/localization#Region
      */
    var region: js.UndefOr[String] = js.native
    
    /**
      * Time in milliseconds before rejecting the Promise
      *
      * Default Value `10000`
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /**
      * API Version
      *
      * https://developers.google.com/maps/documentation/javascript/versions
      */
    var v: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiUrl(value: String): Self = StObject.set(x, "apiUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiUrlUndefined: Self = StObject.set(x, "apiUrl", js.undefined)
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLibraries(value: js.Array[String]): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLibrariesUndefined: Self = StObject.set(x, "libraries", js.undefined)
      
      @scala.inline
      def setLibrariesVarargs(value: String*): Self = StObject.set(x, "libraries", js.Array(value :_*))
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    }
  }
}
