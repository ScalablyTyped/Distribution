package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaQueryInterpretation extends js.Object {
  var interpretationType: js.UndefOr[String] = js.native
  /**
    * The interpretation of the query used in search. For example, query
    * &quot;email from john&quot; will be interpreted as &quot;from:john
    * source:mail&quot;
    */
  var interpretedQuery: js.UndefOr[String] = js.native
}

object SchemaQueryInterpretation {
  @scala.inline
  def apply(): SchemaQueryInterpretation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryInterpretation]
  }
  @scala.inline
  implicit class SchemaQueryInterpretationOps[Self <: SchemaQueryInterpretation] (val x: Self) extends AnyVal {
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
    def setInterpretationType(value: String): Self = this.set("interpretationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpretationType: Self = this.set("interpretationType", js.undefined)
    @scala.inline
    def setInterpretedQuery(value: String): Self = this.set("interpretedQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpretedQuery: Self = this.set("interpretedQuery", js.undefined)
  }
  
}

