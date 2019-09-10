package typings.kafkaDashNode.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var configNames: js.Array[String]
  var resourceName: String
  var resourceType: String
}

object Resource {
  @scala.inline
  def apply(configNames: js.Array[String], resourceName: String, resourceType: String): Resource = {
    val __obj = js.Dynamic.literal(configNames = configNames, resourceName = resourceName, resourceType = resourceType)
  
    __obj.asInstanceOf[Resource]
  }
}

