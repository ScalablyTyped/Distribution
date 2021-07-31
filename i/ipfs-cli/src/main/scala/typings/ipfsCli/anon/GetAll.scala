package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAll extends StObject {
  
  var get: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<imported_config.Get, imported_src.HttpOptions> */ js.Any
  
  var getAll: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<imported_config.GetAll, imported_src.HttpOptions> */ js.Any
  
  var profiles: Apply
  
  var replace: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<imported_config.Replace, imported_src.HttpOptions> */ js.Any
  
  var set: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<imported_config.Set, imported_src.HttpOptions> */ js.Any
}
object GetAll {
  
  @scala.inline
  def apply(
    get: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<imported_config.Get, imported_src.HttpOptions> */ js.Any,
    getAll: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<imported_config.GetAll, imported_src.HttpOptions> */ js.Any,
    profiles: Apply,
    replace: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<imported_config.Replace, imported_src.HttpOptions> */ js.Any,
    set: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<imported_config.Set, imported_src.HttpOptions> */ js.Any
  ): GetAll = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getAll = getAll.asInstanceOf[js.Any], profiles = profiles.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAll]
  }
  
  @scala.inline
  implicit class GetAllMutableBuilder[Self <: GetAll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<imported_config.Get, imported_src.HttpOptions> */ js.Any
    ): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAll(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<imported_config.GetAll, imported_src.HttpOptions> */ js.Any
    ): Self = StObject.set(x, "getAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfiles(value: Apply): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<imported_config.Replace, imported_src.HttpOptions> */ js.Any
    ): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<imported_config.Set, imported_src.HttpOptions> */ js.Any
    ): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
