package typings.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class CollectionOptionsOps[Self <: CollectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComparator(value: js.Any): Self = this.set("comparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    @scala.inline
    def setCreate(value: js.Any): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setFactories(value: js.Any): Self = this.set("factories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactories: Self = this.set("factories", js.undefined)
    @scala.inline
    def setFilters(value: js.Any): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setModels_only(value: Boolean): Self = this.set("models_only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModels_only: Self = this.set("models_only", js.undefined)
    @scala.inline
    def setSort_attribute(value: String): Self = this.set("sort_attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort_attribute: Self = this.set("sort_attribute", js.undefined)
    @scala.inline
    def setView_model(value: js.Any): Self = this.set("view_model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView_model: Self = this.set("view_model", js.undefined)
  }
  
}

