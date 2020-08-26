package typings.mapboxMapboxSdk.datasetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dataset extends js.Object {
  /**
    * The extent of features in the dataset as an array of west, south, east, north coordinates
    */
  var bounds: js.Array[Double] = js.native
  /*
    * Date and time the dataset was created
    */
  var created: String = js.native
  /**
    * The description of the dataset
    */
  var description: String = js.native
  /**
    * The number of features in the dataset
    */
  var features: Double = js.native
  /**
    * Id for an existing dataset
    */
  var id: String = js.native
  /*
    * Date and time the dataset was last modified
    */
  var modified: String = js.native
  /**
    * The name of the dataset
    */
  var name: String = js.native
  /**
    * The username of the dataset owner
    */
  var owner: String = js.native
  /**
    * The size of the dataset in bytes
    */
  var size: Double = js.native
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
  @scala.inline
  implicit class DatasetOps[Self <: Dataset] (val x: Self) extends AnyVal {
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
    def setBoundsVarargs(value: Double*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: js.Array[Double]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeatures(value: Double): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

