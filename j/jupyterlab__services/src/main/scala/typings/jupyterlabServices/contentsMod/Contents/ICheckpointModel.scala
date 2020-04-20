package typings.jupyterlabServices.contentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Checkpoint model.
  */
trait ICheckpointModel extends js.Object {
  /**
    * The unique identifier for the checkpoint.
    */
  val id: String
  /**
    * Last modified timestamp.
    */
  val last_modified: String
}

object ICheckpointModel {
  @scala.inline
  def apply(id: String, last_modified: String): ICheckpointModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], last_modified = last_modified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckpointModel]
  }
}

