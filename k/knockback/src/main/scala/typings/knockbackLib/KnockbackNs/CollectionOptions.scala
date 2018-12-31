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

