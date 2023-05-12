package typings.ipfsHttpClient.anon

import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Publish extends StObject {
  
  def publish(value: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PublishResult */ Any
  ] = js.native
  def publish(
    value: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PublishOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PublishResult */ Any
  ] = js.native
  def publish(value: CID[Any, Double, Double, Version]): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PublishResult */ Any
  ] = js.native
  def publish(
    value: CID[Any, Double, Double, Version],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PublishOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PublishResult */ Any
  ] = js.native
  
  var pubsub: Cancel = js.native
  
  def resolve(value: String): AsyncIterable[String] = js.native
  def resolve(
    value: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ResolveOptions */ Any) & HTTPClientExtraOptions
  ): AsyncIterable[String] = js.native
  def resolve(value: PeerId): AsyncIterable[String] = js.native
  def resolve(
    value: PeerId,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ResolveOptions */ Any) & HTTPClientExtraOptions
  ): AsyncIterable[String] = js.native
}
