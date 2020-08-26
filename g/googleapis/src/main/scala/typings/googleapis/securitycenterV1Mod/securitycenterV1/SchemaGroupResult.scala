package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result containing the properties and count of a groupBy request.
  */
@js.native
trait SchemaGroupResult extends js.Object {
  /**
    * Total count of resources for the given properties.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Properties matching the groupBy fields in the request.
    */
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaGroupResult {
  @scala.inline
  def apply(): SchemaGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupResult]
  }
  @scala.inline
  implicit class SchemaGroupResultOps[Self <: SchemaGroupResult] (val x: Self) extends AnyVal {
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[js.Any]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

