package typings.jsdom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FILTERACCEPT extends js.Object {
  val FILTER_ACCEPT: Double = js.native
  val FILTER_REJECT: Double = js.native
  val FILTER_SKIP: Double = js.native
  val SHOW_ALL: Double = js.native
  val SHOW_ATTRIBUTE: Double = js.native
  val SHOW_CDATA_SECTION: Double = js.native
  val SHOW_COMMENT: Double = js.native
  val SHOW_DOCUMENT: Double = js.native
  val SHOW_DOCUMENT_FRAGMENT: Double = js.native
  val SHOW_DOCUMENT_TYPE: Double = js.native
  val SHOW_ELEMENT: Double = js.native
  val SHOW_ENTITY: Double = js.native
  val SHOW_ENTITY_REFERENCE: Double = js.native
  val SHOW_NOTATION: Double = js.native
  val SHOW_PROCESSING_INSTRUCTION: Double = js.native
  val SHOW_TEXT: Double = js.native
}

object FILTERACCEPT {
  @scala.inline
  def apply(
    FILTER_ACCEPT: Double,
    FILTER_REJECT: Double,
    FILTER_SKIP: Double,
    SHOW_ALL: Double,
    SHOW_ATTRIBUTE: Double,
    SHOW_CDATA_SECTION: Double,
    SHOW_COMMENT: Double,
    SHOW_DOCUMENT: Double,
    SHOW_DOCUMENT_FRAGMENT: Double,
    SHOW_DOCUMENT_TYPE: Double,
    SHOW_ELEMENT: Double,
    SHOW_ENTITY: Double,
    SHOW_ENTITY_REFERENCE: Double,
    SHOW_NOTATION: Double,
    SHOW_PROCESSING_INSTRUCTION: Double,
    SHOW_TEXT: Double
  ): FILTERACCEPT = {
    val __obj = js.Dynamic.literal(FILTER_ACCEPT = FILTER_ACCEPT.asInstanceOf[js.Any], FILTER_REJECT = FILTER_REJECT.asInstanceOf[js.Any], FILTER_SKIP = FILTER_SKIP.asInstanceOf[js.Any], SHOW_ALL = SHOW_ALL.asInstanceOf[js.Any], SHOW_ATTRIBUTE = SHOW_ATTRIBUTE.asInstanceOf[js.Any], SHOW_CDATA_SECTION = SHOW_CDATA_SECTION.asInstanceOf[js.Any], SHOW_COMMENT = SHOW_COMMENT.asInstanceOf[js.Any], SHOW_DOCUMENT = SHOW_DOCUMENT.asInstanceOf[js.Any], SHOW_DOCUMENT_FRAGMENT = SHOW_DOCUMENT_FRAGMENT.asInstanceOf[js.Any], SHOW_DOCUMENT_TYPE = SHOW_DOCUMENT_TYPE.asInstanceOf[js.Any], SHOW_ELEMENT = SHOW_ELEMENT.asInstanceOf[js.Any], SHOW_ENTITY = SHOW_ENTITY.asInstanceOf[js.Any], SHOW_ENTITY_REFERENCE = SHOW_ENTITY_REFERENCE.asInstanceOf[js.Any], SHOW_NOTATION = SHOW_NOTATION.asInstanceOf[js.Any], SHOW_PROCESSING_INSTRUCTION = SHOW_PROCESSING_INSTRUCTION.asInstanceOf[js.Any], SHOW_TEXT = SHOW_TEXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[FILTERACCEPT]
  }
  @scala.inline
  implicit class FILTERACCEPTOps[Self <: FILTERACCEPT] (val x: Self) extends AnyVal {
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
    def setFILTER_ACCEPT(value: Double): Self = this.set("FILTER_ACCEPT", value.asInstanceOf[js.Any])
    @scala.inline
    def setFILTER_REJECT(value: Double): Self = this.set("FILTER_REJECT", value.asInstanceOf[js.Any])
    @scala.inline
    def setFILTER_SKIP(value: Double): Self = this.set("FILTER_SKIP", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHOW_ALL(value: Double): Self = this.set("SHOW_ALL", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHOW_ATTRIBUTE(value: Double): Self = this.set("SHOW_ATTRIBUTE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHOW_CDATA_SECTION(value: Double): Self = this.set("SHOW_CDATA_SECTION", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHOW_COMMENT(value: Double): Self = this.set("SHOW_COMMENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHOW_DOCUMENT(value: Double): Self = this.set("SHOW_DOCUMENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHOW_DOCUMENT_FRAGMENT(value: Double): Self = this.set("SHOW_DOCUMENT_FRAGMENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHOW_DOCUMENT_TYPE(value: Double): Self = this.set("SHOW_DOCUMENT_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHOW_ELEMENT(value: Double): Self = this.set("SHOW_ELEMENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHOW_ENTITY(value: Double): Self = this.set("SHOW_ENTITY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHOW_ENTITY_REFERENCE(value: Double): Self = this.set("SHOW_ENTITY_REFERENCE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHOW_NOTATION(value: Double): Self = this.set("SHOW_NOTATION", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHOW_PROCESSING_INSTRUCTION(value: Double): Self = this.set("SHOW_PROCESSING_INSTRUCTION", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHOW_TEXT(value: Double): Self = this.set("SHOW_TEXT", value.asInstanceOf[js.Any])
  }
  
}

