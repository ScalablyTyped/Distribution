package typings.knockback.Knockback

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
  var models_only: js.UndefOr[Boolean] = js.undefined
             //a function that is used to sort an object. Signature: function(model_a, model_b) returns negative value for ascending, 0 for equal, and positive for descending
  var sort_attribute: js.UndefOr[String] = js.undefined
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
    models_only: js.UndefOr[Boolean] = js.undefined,
    options: js.Any = null,
    path: String = null,
    sort_attribute: String = null,
    store: Store = null,
    view_model: js.Any = null
  ): CollectionOptions = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (factories != null) __obj.updateDynamic("factories")(factories.asInstanceOf[js.Any])
    if (factory != null) __obj.updateDynamic("factory")(factory.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(models_only)) __obj.updateDynamic("models_only")(models_only.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sort_attribute != null) __obj.updateDynamic("sort_attribute")(sort_attribute.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (view_model != null) __obj.updateDynamic("view_model")(view_model.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionOptions]
  }
}

