package typings
package knockbackLib.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionOptions extends OptionsBase {
              // a map of dot-deliminated paths; for example 'models.owner': kb.ViewModel to either constructors or create functions. Signature: 'some.path': function(object, options)
  var comparator: js.UndefOr[js.Any] = js.undefined
             // (Constructor) — the view model constructor used for models in the collection. Signature: constructor(model, options)
  var create: js.UndefOr[js.Any] = js.undefined
                 // a function used to create a view model for models in the collection. Signature: create(model, options)
  var factories: js.UndefOr[js.Any] = js.undefined
      // the name of an attribute. Default: resort on all changes to a model.
  var filters: js.UndefOr[js.Any] = js.undefined
  var models_only: js.UndefOr[scala.Boolean] = js.undefined
             //a function that is used to sort an object. Signature: function(model_a, model_b) returns negative value for ascending, 0 for equal, and positive for descending
  var sort_attribute: js.UndefOr[java.lang.String] = js.undefined
           // flag for skipping the creation of view models. The collection observable will be populated with (possibly sorted) models.
  var view_model: js.UndefOr[js.Any] = js.undefined
}

object CollectionOptions {
  @scala.inline
  def apply(
    comparator: js.Any = null,
    create: js.Any = null,
    factories: js.Any = null,
    factory: Factory = null,
    filters: js.Any = null,
    models_only: js.UndefOr[scala.Boolean] = js.undefined,
    options: js.Any = null,
    path: java.lang.String = null,
    sort_attribute: java.lang.String = null,
    store: Store = null,
    view_model: js.Any = null
  ): CollectionOptions = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(comparator)
    if (create != null) __obj.updateDynamic("create")(create)
    if (factories != null) __obj.updateDynamic("factories")(factories)
    if (factory != null) __obj.updateDynamic("factory")(factory)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(models_only)) __obj.updateDynamic("models_only")(models_only)
    if (options != null) __obj.updateDynamic("options")(options)
    if (path != null) __obj.updateDynamic("path")(path)
    if (sort_attribute != null) __obj.updateDynamic("sort_attribute")(sort_attribute)
    if (store != null) __obj.updateDynamic("store")(store)
    if (view_model != null) __obj.updateDynamic("view_model")(view_model)
    __obj.asInstanceOf[CollectionOptions]
  }
}

