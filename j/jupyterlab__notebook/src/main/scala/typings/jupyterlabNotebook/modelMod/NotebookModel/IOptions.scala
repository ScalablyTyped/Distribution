package typings.jupyterlabNotebook.modelMod.NotebookModel

import typings.jupyterlabObservables.modeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a notebook model.
  */
trait IOptions extends js.Object {
  /**
    * A factory for creating cell models.
    *
    * The default is a shared factory instance.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.undefined
  /**
    * The language preference for the model.
    */
  var languagePreference: js.UndefOr[String] = js.undefined
  /**
    * A modelDB for storing notebook data.
    */
  var modelDB: js.UndefOr[IModelDB] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    contentFactory: IContentFactory = null,
    languagePreference: String = null,
    modelDB: IModelDB = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory.asInstanceOf[js.Any])
    if (languagePreference != null) __obj.updateDynamic("languagePreference")(languagePreference.asInstanceOf[js.Any])
    if (modelDB != null) __obj.updateDynamic("modelDB")(modelDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

