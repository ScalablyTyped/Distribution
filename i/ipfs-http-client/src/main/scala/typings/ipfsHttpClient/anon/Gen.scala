package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gen extends StObject {
  
  def `export`(name: String, password: String): js.Promise[String] = js.native
  def `export`(name: String, password: String, options: AbortOptions & HTTPClientExtraOptions): js.Promise[String] = js.native
  
  def gen(name: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Key */ Any
  ] = js.native
  def gen(
    name: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.GenOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Key */ Any
  ] = js.native
  
  def `import`(name: String, pem: String, password: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Key */ Any
  ] = js.native
  def `import`(name: String, pem: String, password: String, options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Key */ Any
  ] = js.native
  
  def info(name: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Key */ Any
  ] = js.native
  def info(name: String, options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Key */ Any
  ] = js.native
  
  def list(): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Key */ Any
    ]
  ] = js.native
  def list(options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Key */ Any
    ]
  ] = js.native
  
  def rename(oldName: String, newName: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RenameKeyResult */ Any
  ] = js.native
  def rename(oldName: String, newName: String, options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RenameKeyResult */ Any
  ] = js.native
  
  def rm(name: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Key */ Any
  ] = js.native
  def rm(name: String, options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Key */ Any
  ] = js.native
}
