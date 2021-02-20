package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionOptions extends OptionsBase {
  
  // a map of dot-deliminated paths; for example 'models.owner': kb.ViewModel to either constructors or create functions. Signature: 'some.path': function(object, options)
  var comparator: js.UndefOr[js.Any] = js.native
  
  // (Constructor) — the view model constructor used for models in the collection. Signature: constructor(model, options)
  var create: js.UndefOr[js.Any] = js.native
  
  // a function used to create a view model for models in the collection. Signature: create(model, options)
  var factories: js.UndefOr[js.Any] = js.native
  
  // the name of an attribute. Default: resort on all changes to a model.
  var filters: js.UndefOr[js.Any] = js.native
  
  var models_only: js.UndefOr[Boolean] = js.native
  
  //a function that is used to sort an object. Signature: function(model_a, model_b) returns negative value for ascending, 0 for equal, and positive for descending
  var sort_attribute: js.UndefOr[String] = js.native
  
  // flag for skipping the creation of view models. The collection observable will be populated with (possibly sorted) models.
  var view_model: js.UndefOr[js.Any] = js.native
}
object CollectionOptions {
  
  @scala.inline
  def apply(): CollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionOptions]
  }
  
  @scala.inline
  implicit class CollectionOptionsMutableBuilder[Self <: CollectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: js.Any): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    @scala.inline
    def setCreate(value: js.Any): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setFactories(value: js.Any): Self = StObject.set(x, "factories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactoriesUndefined: Self = StObject.set(x, "factories", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Any): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setModels_only(value: Boolean): Self = StObject.set(x, "models_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModels_onlyUndefined: Self = StObject.set(x, "models_only", js.undefined)
    
    @scala.inline
    def setSort_attribute(value: String): Self = StObject.set(x, "sort_attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort_attributeUndefined: Self = StObject.set(x, "sort_attribute", js.undefined)
    
    @scala.inline
    def setView_model(value: js.Any): Self = StObject.set(x, "view_model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView_modelUndefined: Self = StObject.set(x, "view_model", js.undefined)
  }
}
