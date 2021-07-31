package typings.ipfsCli.anon

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Publish extends StObject {
  
  def publish(value: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_publish.PublishResult */ js.Any
  ] = js.native
  def publish(
    value: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_publish.PublishSettings */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_publish.PublishResult */ js.Any
  ] = js.native
  
  var pubsub: Cancel = js.native
  
  def resolve(name: String): AsyncIterable[String] = js.native
  def resolve(
    name: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveSettings */ js.Any
  ): AsyncIterable[String] = js.native
}
