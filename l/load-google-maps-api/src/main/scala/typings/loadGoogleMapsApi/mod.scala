package typings.loadGoogleMapsApi

import typings.loadGoogleMapsApi.anon.Typeofmaps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Promise[Typeofmaps] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Typeofmaps]]
  inline def apply(options: Options): js.Promise[Typeofmaps] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Typeofmaps]]
  
  @JSImport("load-google-maps-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * The Google Maps API `script` tag URL
      *
      * Default Value `'https://maps.googleapis.com/maps/api/js'`
      */
    var apiUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Client usage reporting channel
      *
      * https://developers.google.com/maps/premium/reports/usage-reports#channels
      */
    var channel: js.UndefOr[String] = js.undefined
    
    /**
      * Client ID
      *
      * https://developers.google.com/maps/documentation/javascript/get-api-key#specifying-a-client-id-when-loading-the-api
      */
    var client: js.UndefOr[String] = js.undefined
    
    /**
      * Your API key
      *
      * https://developers.google.com/maps/documentation/javascript/get-api-key#step-2-add-the-api-key-to-your-application
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * https://developers.google.com/maps/documentation/javascript/localization#Language
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * Supplemental libraries to load
      *
      * Default Value `[]`
      *
      * https://developers.google.com/maps/documentation/javascript/libraries
      */
    var libraries: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * https://developers.google.com/maps/documentation/javascript/localization#Region
      */
    var region: js.UndefOr[String] = js.undefined
    
    /**
      * Time in milliseconds before rejecting the Promise
      *
      * Default Value `10000`
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * API Version
      *
      * https://developers.google.com/maps/documentation/javascript/versions
      */
    var v: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setApiUrl(value: String): Self = StObject.set(x, "apiUrl", value.asInstanceOf[js.Any])
      
      inline def setApiUrlUndefined: Self = StObject.set(x, "apiUrl", js.undefined)
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLibraries(value: js.Array[String]): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
      
      inline def setLibrariesUndefined: Self = StObject.set(x, "libraries", js.undefined)
      
      inline def setLibrariesVarargs(value: String*): Self = StObject.set(x, "libraries", js.Array(value*))
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    }
  }
}
