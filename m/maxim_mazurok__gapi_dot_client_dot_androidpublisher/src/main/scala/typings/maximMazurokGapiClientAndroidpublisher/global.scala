package typings.maximMazurokGapiClientAndroidpublisher

import typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.EditsResource
import typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.InappproductsResource
import typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.InternalappsharingartifactsResource
import typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.OrdersResource
import typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.PurchasesResource
import typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.ReviewsResource
import typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.SystemapksResource
import typings.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.androidpublisher
import typings.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object androidpublisher {
        
        @JSGlobal("gapi.client.androidpublisher.edits")
        @js.native
        val edits: EditsResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.inappproducts")
        @js.native
        val inappproducts: InappproductsResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.internalappsharingartifacts")
        @js.native
        val internalappsharingartifacts: InternalappsharingartifactsResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.orders")
        @js.native
        val orders: OrdersResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.purchases")
        @js.native
        val purchases: PurchasesResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.reviews")
        @js.native
        val reviews: ReviewsResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.systemapks")
        @js.native
        val systemapks: SystemapksResource = js.native
      }
      
      /** Load Google Play Android Developer API v3 */
      @scala.inline
      def load(name: androidpublisher, version: v3): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: androidpublisher, version: v3, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
