package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolve extends StObject {
  
  var get: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<(ipfsPath : imported_cids, options : imported_get.GetOptions & imported_utils.AbortOptions | undefined): Promise<imported_get.DagEntry>, imported_src.HttpOptions> */ js.Any
  
  var put: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<(dagNode : any, options : imported_put.PutOptions & imported_utils.AbortOptions | undefined): Promise<imported_cids>, imported_src.HttpOptions> */ js.Any
  
  var resolve: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<(ipfsPath : string | imported_cids, options : imported_resolve.ResolveOptions & imported_utils.AbortOptions | undefined): Promise<imported_resolve.ResolveResult>, imported_src.HttpOptions> */ js.Any
}
object Resolve {
  
  inline def apply(
    get: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<(ipfsPath : imported_cids, options : imported_get.GetOptions & imported_utils.AbortOptions | undefined): Promise<imported_get.DagEntry>, imported_src.HttpOptions> */ js.Any,
    put: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<(dagNode : any, options : imported_put.PutOptions & imported_utils.AbortOptions | undefined): Promise<imported_cids>, imported_src.HttpOptions> */ js.Any,
    resolve: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<(ipfsPath : string | imported_cids, options : imported_resolve.ResolveOptions & imported_utils.AbortOptions | undefined): Promise<imported_resolve.ResolveResult>, imported_src.HttpOptions> */ js.Any
  ): Resolve = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolve]
  }
  
  extension [Self <: Resolve](x: Self) {
    
    inline def setGet(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<(ipfsPath : imported_cids, options : imported_get.GetOptions & imported_utils.AbortOptions | undefined): Promise<imported_get.DagEntry>, imported_src.HttpOptions> */ js.Any
    ): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<(dagNode : any, options : imported_put.PutOptions & imported_utils.AbortOptions | undefined): Promise<imported_cids>, imported_src.HttpOptions> */ js.Any
    ): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    inline def setResolve(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<(ipfsPath : string | imported_cids, options : imported_resolve.ResolveOptions & imported_utils.AbortOptions | undefined): Promise<imported_resolve.ResolveResult>, imported_src.HttpOptions> */ js.Any
    ): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
  }
}
