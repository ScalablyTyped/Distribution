package typings.grpcGrpcJs

import typings.grpcGrpcJs.buildSrcCallStreamMod.Call
import typings.grpcGrpcJs.buildSrcChannelMod.Channel
import typings.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.buildSrcFilterMod.BaseFilter
import typings.grpcGrpcJs.buildSrcFilterMod.FilterFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompressionFilterMod {
  
  @JSImport("@grpc/grpc-js/build/src/compression-filter", "CompressionFilter")
  @js.native
  open class CompressionFilter protected () extends BaseFilter {
    def this(channelOptions: ChannelOptions, sharedFilterConfig: SharedCompressionFilterConfig) = this()
    
    /* private */ var currentCompressionAlgorithm: Any = js.native
    
    /* private */ var receiveCompression: Any = js.native
    
    /* private */ var sendCompression: Any = js.native
    
    /* private */ var sharedFilterConfig: Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/compression-filter", "CompressionFilterFactory")
  @js.native
  open class CompressionFilterFactory protected ()
    extends StObject
       with FilterFactory[CompressionFilter] {
    def this(channel: Channel, options: ChannelOptions) = this()
    
    /* private */ val channel: Any = js.native
    
    /* CompleteClass */
    override def createFilter(callStream: Call): CompressionFilter = js.native
    
    /* private */ val options: Any = js.native
    
    /* private */ var sharedFilterConfig: Any = js.native
  }
  
  trait SharedCompressionFilterConfig extends StObject {
    
    var serverSupportedEncodingHeader: js.UndefOr[String] = js.undefined
  }
  object SharedCompressionFilterConfig {
    
    inline def apply(): SharedCompressionFilterConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedCompressionFilterConfig]
    }
    
    extension [Self <: SharedCompressionFilterConfig](x: Self) {
      
      inline def setServerSupportedEncodingHeader(value: String): Self = StObject.set(x, "serverSupportedEncodingHeader", value.asInstanceOf[js.Any])
      
      inline def setServerSupportedEncodingHeaderUndefined: Self = StObject.set(x, "serverSupportedEncodingHeader", js.undefined)
    }
  }
}
