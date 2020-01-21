package typings.jupyterlabFilebrowser.listingMod.DirListing

import typings.jupyterlabServices.contentsMod.Contents.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A file contents model thunk.
  *
  * Note: The content of the model will be empty.
  * To get the contents, call and await the `withContent`
  * method.
  */
trait IContentsThunk extends js.Object {
  /**
    * The contents model.
    */
  var model: IModel
  /**
    * Fetches the model with contents.
    */
  def withContent(): js.Promise[IModel]
}

object IContentsThunk {
  @scala.inline
  def apply(model: IModel, withContent: () => js.Promise[IModel]): IContentsThunk = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], withContent = js.Any.fromFunction0(withContent))
  
    __obj.asInstanceOf[IContentsThunk]
  }
}

