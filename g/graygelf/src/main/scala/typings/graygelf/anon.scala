package typings.graygelf

import org.scalablytyped.runtime.StringDictionary
import typings.graygelf.graygelfStrings.deflate
import typings.graygelf.graygelfStrings.gzip
import typings.graygelf.mod.GelfMessage
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait A extends StObject {
    
    def a(short_message: String): GelfMessage = js.native
    def a(short_message: String, full_message: String): GelfMessage = js.native
    def a(short_message: String, full_message: String, customFields: GelfMessage): GelfMessage = js.native
    def a(short_message: String, full_message: Unit, customFields: GelfMessage): GelfMessage = js.native
    def a(short_message: Error): GelfMessage = js.native
    def a(short_message: Error, full_message: String): GelfMessage = js.native
    def a(short_message: Error, full_message: String, customFields: GelfMessage): GelfMessage = js.native
    def a(short_message: Error, full_message: Unit, customFields: GelfMessage): GelfMessage = js.native
  }
  
  trait AlwaysCompress extends StObject {
    
    /**
      * whether to always compress or go by chunkSize
      *
      * @default false
      */
    var alwaysCompress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * size of chunked messages in bytes
      *
      * @default 1240
      */
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    /**
      * compression 'gzip' or 'deflate'
      *
      * @default "deflate"
      */
    var compressType: js.UndefOr[gzip | deflate] = js.undefined
    
    /**
      * graylog host
      *
      * @default "localhost"
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * don't send messages to GrayLog2
      *
      * @default false
      */
    var mock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * graylog port
      *
      * @default 12201
      */
    var port: js.UndefOr[Double] = js.undefined
  }
  object AlwaysCompress {
    
    @scala.inline
    def apply(): AlwaysCompress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlwaysCompress]
    }
    
    @scala.inline
    implicit class AlwaysCompressMutableBuilder[Self <: AlwaysCompress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysCompress(value: Boolean): Self = StObject.set(x, "alwaysCompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysCompressUndefined: Self = StObject.set(x, "alwaysCompress", js.undefined)
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      @scala.inline
      def setCompressType(value: gzip | deflate): Self = StObject.set(x, "compressType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressTypeUndefined: Self = StObject.set(x, "compressType", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setMock(value: Boolean): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMockUndefined: Self = StObject.set(x, "mock", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /**
    * any other
    */
  /* key */ StringDictionary[js.UndefOr[String]] {
    
    /**
      * Suggested property - facility can be the app name.
      */
    var facility: js.UndefOr[String] = js.undefined
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFacility(value: String): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
    }
  }
  
  trait Facility
    extends StObject
       with /**
    * any other
    */
  /* key */ StringDictionary[js.UndefOr[String]] {
    
    /**
      * Suggested property - facility can be the app name.
      */
    var facility: js.UndefOr[String] = js.undefined
  }
  object Facility {
    
    @scala.inline
    def apply(): Facility = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Facility]
    }
    
    @scala.inline
    implicit class FacilityMutableBuilder[Self <: Facility] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFacility(value: String): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
    }
  }
}
