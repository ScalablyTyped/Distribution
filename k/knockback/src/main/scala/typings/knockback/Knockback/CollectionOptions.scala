package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionOptions
  extends StObject
     with OptionsBase {
  
  // a map of dot-deliminated paths; for example 'models.owner': kb.ViewModel to either constructors or create functions. Signature: 'some.path': function(object, options)
  var comparator: js.UndefOr[Any] = js.undefined
  
  // (Constructor) — the view model constructor used for models in the collection. Signature: constructor(model, options)
  var create: js.UndefOr[Any] = js.undefined
  
  // a function used to create a view model for models in the collection. Signature: create(model, options)
  var factories: js.UndefOr[Any] = js.undefined
  
  // the name of an attribute. Default: resort on all changes to a model.
  var filters: js.UndefOr[Any] = js.undefined
  
  var models_only: js.UndefOr[Boolean] = js.undefined
  
  //a function that is used to sort an object. Signature: function(model_a, model_b) returns negative value for ascending, 0 for equal, and positive for descending
  var sort_attribute: js.UndefOr[String] = js.undefined
  
  // flag for skipping the creation of view models. The collection observable will be populated with (possibly sorted) models.
  var view_model: js.UndefOr[Any] = js.undefined
}
object CollectionOptions {
  
  inline def apply(): CollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionOptions]
  }
  
  extension [Self <: CollectionOptions](x: Self) {
    
    inline def setComparator(value: Any): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setCreate(value: Any): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setFactories(value: Any): Self = StObject.set(x, "factories", value.asInstanceOf[js.Any])
    
    inline def setFactoriesUndefined: Self = StObject.set(x, "factories", js.undefined)
    
    inline def setFilters(value: Any): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setModels_only(value: Boolean): Self = StObject.set(x, "models_only", value.asInstanceOf[js.Any])
    
    inline def setModels_onlyUndefined: Self = StObject.set(x, "models_only", js.undefined)
    
    inline def setSort_attribute(value: String): Self = StObject.set(x, "sort_attribute", value.asInstanceOf[js.Any])
    
    inline def setSort_attributeUndefined: Self = StObject.set(x, "sort_attribute", js.undefined)
    
    inline def setView_model(value: Any): Self = StObject.set(x, "view_model", value.asInstanceOf[js.Any])
    
    inline def setView_modelUndefined: Self = StObject.set(x, "view_model", js.undefined)
  }
}
