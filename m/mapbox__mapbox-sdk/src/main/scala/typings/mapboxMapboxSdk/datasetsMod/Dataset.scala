package typings.mapboxMapboxSdk.datasetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dataset extends js.Object {
  /**
    * The extent of features in the dataset as an array of west, south, east, north coordinates
    */
  var bounds: js.Array[Double]
  /*
    * Date and time the dataset was created
    */
  var created: String
  /**
    * The description of the dataset
    */
  var description: String
  /**
    * The number of features in the dataset
    */
  var features: Double
  /**
    * Id for an existing dataset
    */
  var id: String
  /*
    * Date and time the dataset was last modified
    */
  var modified: String
  /**
    * The name of the dataset
    */
  var name: String
  /**
    * The username of the dataset owner
    */
  var owner: String
  /**
    * The size of the dataset in bytes
    */
  var size: Double
}

object Dataset {
  @scala.inline
  def apply(
    bounds: js.Array[Double],
    created: String,
    description: String,
    features: Double,
    id: String,
    modified: String,
    name: String,
    owner: String,
    size: Double
  ): Dataset = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
}

