package typings.grpcGrpcJs

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.serviceConfigMod.ServiceConfig
import typings.grpcGrpcJs.subchannelMod.SubchannelAddress
import typings.grpcGrpcJs.uriParserMod.GrpcUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverMod {
  
  @JSImport("@grpc/grpc-js/build/src/resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createResolver(target: GrpcUri, listener: ResolverListener, options: ChannelOptions): Resolver = (^.asInstanceOf[js.Dynamic].applyDynamic("createResolver")(target.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Resolver]
  
  inline def getDefaultAuthority(target: GrpcUri): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAuthority")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mapUriDefaultScheme(target: GrpcUri): GrpcUri | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("mapUriDefaultScheme")(target.asInstanceOf[js.Any]).asInstanceOf[GrpcUri | Null]
  
  inline def registerAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAll")().asInstanceOf[Unit]
  
  inline def registerDefaultScheme(scheme: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDefaultScheme")(scheme.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerResolver(scheme: String, resolverClass: ResolverConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResolver")(scheme.asInstanceOf[js.Any], resolverClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Resolver extends StObject {
    
    /**
      * Indicates that the caller wants new name resolution data. Calling this
      * function may eventually result in calling one of the `ResolverListener`
      * functions, but that is not guaranteed. Those functions will never be
      * called synchronously with the constructor or updateResolution.
      */
    def updateResolution(): Unit
  }
  object Resolver {
    
    inline def apply(updateResolution: () => Unit): Resolver = {
      val __obj = js.Dynamic.literal(updateResolution = js.Any.fromFunction0(updateResolution))
      __obj.asInstanceOf[Resolver]
    }
    
    extension [Self <: Resolver](x: Self) {
      
      inline def setUpdateResolution(value: () => Unit): Self = StObject.set(x, "updateResolution", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ResolverConstructor
    extends StObject
       with Instantiable3[
          /* target */ GrpcUri, 
          /* listener */ ResolverListener, 
          /* channelOptions */ ChannelOptions, 
          Resolver
        ] {
    
    /**
      * Get the default authority for a target. This loosely corresponds to that
      * target's hostname. Throws an error if this resolver class cannot parse the
      * `target`.
      * @param target
      */
    def getDefaultAuthority(target: GrpcUri): String = js.native
  }
  
  @js.native
  trait ResolverListener extends StObject {
    
    /**
      * Called whenever a name resolution attempt fails.
      * @param error Describes how resolution failed
      */
    def onError(error: StatusObject): Unit = js.native
    
    def onSuccessfulResolution(
      addressList: js.Array[SubchannelAddress],
      serviceConfig: Null,
      serviceConfigError: Null,
      attributes: StringDictionary[js.Any]
    ): Unit = js.native
    def onSuccessfulResolution(
      addressList: js.Array[SubchannelAddress],
      serviceConfig: Null,
      serviceConfigError: StatusObject,
      attributes: StringDictionary[js.Any]
    ): Unit = js.native
    def onSuccessfulResolution(
      addressList: js.Array[SubchannelAddress],
      serviceConfig: ServiceConfig,
      serviceConfigError: Null,
      attributes: StringDictionary[js.Any]
    ): Unit = js.native
    /**
      * Called whenever the resolver has new name resolution results to report
      * @param addressList The new list of backend addresses
      * @param serviceConfig The new service configuration corresponding to the
      *     `addressList`. Will be `null` if no service configuration was
      *     retrieved or if the service configuration was invalid
      * @param serviceConfigError If non-`null`, indicates that the retrieved
      *     service configuration was invalid
      */
    def onSuccessfulResolution(
      addressList: js.Array[SubchannelAddress],
      serviceConfig: ServiceConfig,
      serviceConfigError: StatusObject,
      attributes: StringDictionary[js.Any]
    ): Unit = js.native
  }
}
