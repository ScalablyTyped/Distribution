package typings.libnpmpublish

import typings.node.bufferMod.global.Buffer
import typings.nodeFetch.mod.Response
import typings.npmRegistryFetch.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("libnpmpublish", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def publish(
    manifest: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageJson */ Any,
    tarballData: Buffer
  ): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(manifest.asInstanceOf[js.Any], tarballData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  inline def publish(
    manifest: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageJson */ Any,
    tarballData: Buffer,
    options: Options
  ): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(manifest.asInstanceOf[js.Any], tarballData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  inline def unpublish(spec: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpublish")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def unpublish(spec: String, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpublish")(spec.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def unpublish(spec: js.Object): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpublish")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def unpublish(spec: js.Object, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpublish")(spec.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
