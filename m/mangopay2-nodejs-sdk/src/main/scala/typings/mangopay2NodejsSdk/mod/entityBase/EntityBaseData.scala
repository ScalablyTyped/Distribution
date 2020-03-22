package typings.mangopay2NodejsSdk.mod.entityBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityBaseData extends js.Object {
  var CreationDate: Double
  var Id: String
  var Tag: String
}

object EntityBaseData {
  @scala.inline
  def apply(CreationDate: Double, Id: String, Tag: String): EntityBaseData = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntityBaseData]
  }
}

